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
import com.ird.faa.bean.NiveauFormation;
import com.ird.faa.dao.NiveauFormationDao;
import com.ird.faa.service.chercheur.facade.NiveauFormationChercheurService;

import com.ird.faa.ws.rest.provided.vo.NiveauFormationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NiveauFormationChercheurServiceImpl extends AbstractServiceImpl<NiveauFormation> implements NiveauFormationChercheurService {

@Autowired
private NiveauFormationDao niveauFormationDao;

@Autowired
private ArchivableService<NiveauFormation> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NiveauFormation> findAll(){
    String query = "SELECT o FROM NiveauFormation o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public NiveauFormation findByCode(String code){
    if( code==null) return null;
    return niveauFormationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return niveauFormationDao.deleteByCode(code);
    }
    @Override
    public NiveauFormation findByIdOrCode(NiveauFormation niveauFormation){
        NiveauFormation resultat=null;
        if(niveauFormation != null){
            if(StringUtil.isNotEmpty(niveauFormation.getId())){
            resultat= niveauFormationDao.getOne(niveauFormation.getId());
            }else if(StringUtil.isNotEmpty(niveauFormation.getCode())) {
            resultat= niveauFormationDao.findByCode(niveauFormation.getCode());
            }
        }
    return resultat;
    }

@Override
public NiveauFormation findById(Long id){
if(id==null) return null;
return niveauFormationDao.getOne(id);
}

@Override
public NiveauFormation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(niveauFormationDao.findById(id).isPresent())  {
niveauFormationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NiveauFormation update(NiveauFormation niveauFormation){
NiveauFormation foundedNiveauFormation = findById(niveauFormation.getId());
if(foundedNiveauFormation==null) return null;
else{
    archivableService.prepare(niveauFormation);
return  niveauFormationDao.save(niveauFormation);
}
}
private void prepareSave(NiveauFormation niveauFormation){
niveauFormation.setDateCreation(new Date());
if(niveauFormation.getArchive() == null)
  niveauFormation.setArchive(false);
if(niveauFormation.getAdmin() == null)
  niveauFormation.setAdmin(false);
if(niveauFormation.getVisible() == null)
  niveauFormation.setVisible(false);



}

@Override
public NiveauFormation save (NiveauFormation niveauFormation){
prepareSave(niveauFormation);

NiveauFormation result =null;
    NiveauFormation foundedNiveauFormation = findByCode(niveauFormation.getCode());
   if(foundedNiveauFormation == null){



NiveauFormation savedNiveauFormation = niveauFormationDao.save(niveauFormation);

result = savedNiveauFormation;
   }

return result;
}

@Override
public List<NiveauFormation> save(List<NiveauFormation> niveauFormations){
List<NiveauFormation> list = new ArrayList<>();
for(NiveauFormation niveauFormation: niveauFormations){
list.add(save(niveauFormation));
}
return list;
}



@Override
@Transactional
public int delete(NiveauFormation niveauFormation){
    if(niveauFormation.getCode()==null) return -1;

    NiveauFormation foundedNiveauFormation = findByCode(niveauFormation.getCode());
    if(foundedNiveauFormation==null) return -1;
niveauFormationDao.delete(foundedNiveauFormation);
return 1;
}


public List<NiveauFormation> findByCriteria(NiveauFormationVo niveauFormationVo){

String query = "SELECT o FROM NiveauFormation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",niveauFormationVo.getId());
            query += SearchUtil.addConstraint( "o", "libelleMicro","LIKE",niveauFormationVo.getLibelleMicro());
            query += SearchUtil.addConstraint( "o", "libelleMacro","LIKE",niveauFormationVo.getLibelleMacro());
            query += SearchUtil.addConstraint( "o", "code","LIKE",niveauFormationVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",niveauFormationVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",niveauFormationVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",niveauFormationVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",niveauFormationVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",niveauFormationVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",niveauFormationVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",niveauFormationVo.getDateArchivageMin(),niveauFormationVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",niveauFormationVo.getDateCreationMin(),niveauFormationVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NiveauFormation> niveauFormations){
        if(ListUtil.isNotEmpty(niveauFormations)){
        niveauFormations.forEach(e->niveauFormationDao.delete(e));
        }
}
@Override
public void update(List<NiveauFormation> niveauFormations){
if(ListUtil.isNotEmpty(niveauFormations)){
niveauFormations.forEach(e->niveauFormationDao.save(e));
}
}



}
