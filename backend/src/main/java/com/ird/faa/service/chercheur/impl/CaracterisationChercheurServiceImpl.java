package com.ird.faa.service.chercheur.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ird.faa.service.util.StringUtil;
import com.ird.faa.security.common.SecurityUtil;
import com.ird.faa.security.bean.User;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Caracterisation;
import com.ird.faa.dao.CaracterisationDao;
import com.ird.faa.service.chercheur.facade.CaracterisationChercheurService;

import com.ird.faa.ws.rest.provided.vo.CaracterisationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CaracterisationChercheurServiceImpl extends AbstractServiceImpl<Caracterisation> implements CaracterisationChercheurService {

@Autowired
private CaracterisationDao caracterisationDao;

@Autowired
private ArchivableService<Caracterisation> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Caracterisation> findAll(){
    String query = "SELECT o FROM Caracterisation o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public Caracterisation findByCode(String code){
    if( code==null) return null;
    return caracterisationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return caracterisationDao.deleteByCode(code);
    }
    @Override
    public Caracterisation findByIdOrCode(Caracterisation caracterisation){
        Caracterisation resultat=null;
        if(caracterisation != null){
            if(StringUtil.isNotEmpty(caracterisation.getId())){
            resultat= caracterisationDao.getOne(caracterisation.getId());
            }else if(StringUtil.isNotEmpty(caracterisation.getCode())) {
            resultat= caracterisationDao.findByCode(caracterisation.getCode());
            }
        }
    return resultat;
    }

@Override
public Caracterisation findById(Long id){
if(id==null) return null;
return caracterisationDao.getOne(id);
}

@Override
public Caracterisation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(caracterisationDao.findById(id).isPresent())  {
caracterisationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Caracterisation update(Caracterisation caracterisation){
Caracterisation foundedCaracterisation = findById(caracterisation.getId());
if(foundedCaracterisation==null) return null;
else{
    archivableService.prepare(caracterisation);
return  caracterisationDao.save(caracterisation);
}
}
private void prepareSave(Caracterisation caracterisation){
caracterisation.setDateCreation(new Date());
if(caracterisation.getArchive() == null)
  caracterisation.setArchive(false);
if(caracterisation.getAdmin() == null)
  caracterisation.setAdmin(false);
if(caracterisation.getVisible() == null)
  caracterisation.setVisible(false);



}

@Override
public Caracterisation save (Caracterisation caracterisation){
prepareSave(caracterisation);

Caracterisation result =null;
    Caracterisation foundedCaracterisation = findByCode(caracterisation.getCode());
   if(foundedCaracterisation == null){



Caracterisation savedCaracterisation = caracterisationDao.save(caracterisation);

result = savedCaracterisation;
   }

return result;
}

@Override
public List<Caracterisation> save(List<Caracterisation> caracterisations){
List<Caracterisation> list = new ArrayList<>();
for(Caracterisation caracterisation: caracterisations){
list.add(save(caracterisation));
}
return list;
}



@Override
@Transactional
public int delete(Caracterisation caracterisation){
    if(caracterisation.getCode()==null) return -1;

    Caracterisation foundedCaracterisation = findByCode(caracterisation.getCode());
    if(foundedCaracterisation==null) return -1;
caracterisationDao.delete(foundedCaracterisation);
return 1;
}


public List<Caracterisation> findByCriteria(CaracterisationVo caracterisationVo){

String query = "SELECT o FROM Caracterisation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",caracterisationVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",caracterisationVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",caracterisationVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",caracterisationVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",caracterisationVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",caracterisationVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",caracterisationVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",caracterisationVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",caracterisationVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",caracterisationVo.getDateArchivageMin(),caracterisationVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",caracterisationVo.getDateCreationMin(),caracterisationVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Caracterisation> caracterisations){
        if(ListUtil.isNotEmpty(caracterisations)){
        caracterisations.forEach(e->caracterisationDao.delete(e));
        }
}
@Override
public void update(List<Caracterisation> caracterisations){
if(ListUtil.isNotEmpty(caracterisations)){
caracterisations.forEach(e->caracterisationDao.save(e));
}
}



}
