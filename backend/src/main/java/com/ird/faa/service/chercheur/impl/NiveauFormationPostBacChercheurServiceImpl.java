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
import com.ird.faa.bean.NiveauFormationPostBac;
import com.ird.faa.dao.NiveauFormationPostBacDao;
import com.ird.faa.service.chercheur.facade.NiveauFormationPostBacChercheurService;

import com.ird.faa.ws.rest.provided.vo.NiveauFormationPostBacVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NiveauFormationPostBacChercheurServiceImpl extends AbstractServiceImpl<NiveauFormationPostBac> implements NiveauFormationPostBacChercheurService {

@Autowired
private NiveauFormationPostBacDao niveauFormationPostBacDao;

@Autowired
private ArchivableService<NiveauFormationPostBac> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NiveauFormationPostBac> findAll(){
    String query = "SELECT o FROM NiveauFormationPostBac o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public NiveauFormationPostBac findByCode(String code){
    if( code==null) return null;
    return niveauFormationPostBacDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return niveauFormationPostBacDao.deleteByCode(code);
    }
    @Override
    public NiveauFormationPostBac findByIdOrCode(NiveauFormationPostBac niveauFormationPostBac){
        NiveauFormationPostBac resultat=null;
        if(niveauFormationPostBac != null){
            if(StringUtil.isNotEmpty(niveauFormationPostBac.getId())){
            resultat= niveauFormationPostBacDao.getOne(niveauFormationPostBac.getId());
            }else if(StringUtil.isNotEmpty(niveauFormationPostBac.getCode())) {
            resultat= niveauFormationPostBacDao.findByCode(niveauFormationPostBac.getCode());
            }
        }
    return resultat;
    }

@Override
public NiveauFormationPostBac findById(Long id){
if(id==null) return null;
return niveauFormationPostBacDao.getOne(id);
}

@Override
public NiveauFormationPostBac findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(niveauFormationPostBacDao.findById(id).isPresent())  {
niveauFormationPostBacDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NiveauFormationPostBac update(NiveauFormationPostBac niveauFormationPostBac){
NiveauFormationPostBac foundedNiveauFormationPostBac = findById(niveauFormationPostBac.getId());
if(foundedNiveauFormationPostBac==null) return null;
else{
    archivableService.prepare(niveauFormationPostBac);
return  niveauFormationPostBacDao.save(niveauFormationPostBac);
}
}
private void prepareSave(NiveauFormationPostBac niveauFormationPostBac){
niveauFormationPostBac.setDateCreation(new Date());
if(niveauFormationPostBac.getArchive() == null)
  niveauFormationPostBac.setArchive(false);
if(niveauFormationPostBac.getAdmin() == null)
  niveauFormationPostBac.setAdmin(false);
if(niveauFormationPostBac.getVisible() == null)
  niveauFormationPostBac.setVisible(false);



}

@Override
public NiveauFormationPostBac save (NiveauFormationPostBac niveauFormationPostBac){
prepareSave(niveauFormationPostBac);

NiveauFormationPostBac result =null;
    NiveauFormationPostBac foundedNiveauFormationPostBac = findByCode(niveauFormationPostBac.getCode());
   if(foundedNiveauFormationPostBac == null){



NiveauFormationPostBac savedNiveauFormationPostBac = niveauFormationPostBacDao.save(niveauFormationPostBac);

result = savedNiveauFormationPostBac;
   }

return result;
}

@Override
public List<NiveauFormationPostBac> save(List<NiveauFormationPostBac> niveauFormationPostBacs){
List<NiveauFormationPostBac> list = new ArrayList<>();
for(NiveauFormationPostBac niveauFormationPostBac: niveauFormationPostBacs){
list.add(save(niveauFormationPostBac));
}
return list;
}



@Override
@Transactional
public int delete(NiveauFormationPostBac niveauFormationPostBac){
    if(niveauFormationPostBac.getCode()==null) return -1;

    NiveauFormationPostBac foundedNiveauFormationPostBac = findByCode(niveauFormationPostBac.getCode());
    if(foundedNiveauFormationPostBac==null) return -1;
niveauFormationPostBacDao.delete(foundedNiveauFormationPostBac);
return 1;
}


public List<NiveauFormationPostBac> findByCriteria(NiveauFormationPostBacVo niveauFormationPostBacVo){

String query = "SELECT o FROM NiveauFormationPostBac o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",niveauFormationPostBacVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",niveauFormationPostBacVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",niveauFormationPostBacVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "archive","=",niveauFormationPostBacVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",niveauFormationPostBacVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",niveauFormationPostBacVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",niveauFormationPostBacVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",niveauFormationPostBacVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",niveauFormationPostBacVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",niveauFormationPostBacVo.getDateArchivageMin(),niveauFormationPostBacVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",niveauFormationPostBacVo.getDateCreationMin(),niveauFormationPostBacVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NiveauFormationPostBac> niveauFormationPostBacs){
        if(ListUtil.isNotEmpty(niveauFormationPostBacs)){
        niveauFormationPostBacs.forEach(e->niveauFormationPostBacDao.delete(e));
        }
}
@Override
public void update(List<NiveauFormationPostBac> niveauFormationPostBacs){
if(ListUtil.isNotEmpty(niveauFormationPostBacs)){
niveauFormationPostBacs.forEach(e->niveauFormationPostBacDao.save(e));
}
}



}
