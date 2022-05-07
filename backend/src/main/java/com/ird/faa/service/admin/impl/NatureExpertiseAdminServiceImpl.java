package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.NatureExpertise;
import com.ird.faa.dao.NatureExpertiseDao;
import com.ird.faa.service.admin.facade.NatureExpertiseAdminService;

import com.ird.faa.ws.rest.provided.vo.NatureExpertiseVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NatureExpertiseAdminServiceImpl extends AbstractServiceImpl<NatureExpertise> implements NatureExpertiseAdminService {

@Autowired
private NatureExpertiseDao natureExpertiseDao;

@Autowired
private ArchivableService<NatureExpertise> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NatureExpertise> findAll(){
        String query = "SELECT o FROM NatureExpertise o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public NatureExpertise findByCode(String code){
    if( code==null) return null;
    return natureExpertiseDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return natureExpertiseDao.deleteByCode(code);
    }
    @Override
    public NatureExpertise findByIdOrCode(NatureExpertise natureExpertise){
        NatureExpertise resultat=null;
        if(natureExpertise != null){
            if(StringUtil.isNotEmpty(natureExpertise.getId())){
            resultat= natureExpertiseDao.getOne(natureExpertise.getId());
            }else if(StringUtil.isNotEmpty(natureExpertise.getCode())) {
            resultat= natureExpertiseDao.findByCode(natureExpertise.getCode());
            }
        }
    return resultat;
    }

@Override
public NatureExpertise findById(Long id){
if(id==null) return null;
return natureExpertiseDao.getOne(id);
}

@Override
public NatureExpertise findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public NatureExpertise archiver(NatureExpertise natureExpertise) {
        if (natureExpertise.getArchive() == null) {
        natureExpertise.setArchive(false);
        }
        natureExpertise.setArchive(true);
        natureExpertise.setDateArchivage(new Date());
        natureExpertiseDao.save(natureExpertise);
        return natureExpertise;

    }

    @Override
    public NatureExpertise desarchiver(NatureExpertise natureExpertise) {
    if (natureExpertise.getArchive() == null) {
    natureExpertise.setArchive(false);
    }
    natureExpertise.setArchive(false);
    natureExpertise.setDateArchivage(null);
    natureExpertiseDao.save(natureExpertise);
    return natureExpertise;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(natureExpertiseDao.findById(id).isPresent())  {
natureExpertiseDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NatureExpertise update(NatureExpertise natureExpertise){
NatureExpertise foundedNatureExpertise = findById(natureExpertise.getId());
if(foundedNatureExpertise==null) return null;
else{
    archivableService.prepare(natureExpertise);
return  natureExpertiseDao.save(natureExpertise);
}
}
private void prepareSave(NatureExpertise natureExpertise){
natureExpertise.setDateCreation(new Date());
if(natureExpertise.getArchive() == null)
  natureExpertise.setArchive(false);
if(natureExpertise.getAdmin() == null)
  natureExpertise.setAdmin(false);
if(natureExpertise.getVisible() == null)
  natureExpertise.setVisible(false);



}

@Override
public NatureExpertise save (NatureExpertise natureExpertise){
prepareSave(natureExpertise);

NatureExpertise result =null;
    NatureExpertise foundedNatureExpertise = findByCode(natureExpertise.getCode());
   if(foundedNatureExpertise == null){



NatureExpertise savedNatureExpertise = natureExpertiseDao.save(natureExpertise);

result = savedNatureExpertise;
   }

return result;
}

@Override
public List<NatureExpertise> save(List<NatureExpertise> natureExpertises){
List<NatureExpertise> list = new ArrayList<>();
for(NatureExpertise natureExpertise: natureExpertises){
list.add(save(natureExpertise));
}
return list;
}



@Override
@Transactional
public int delete(NatureExpertise natureExpertise){
    if(natureExpertise.getCode()==null) return -1;

    NatureExpertise foundedNatureExpertise = findByCode(natureExpertise.getCode());
    if(foundedNatureExpertise==null) return -1;
natureExpertiseDao.delete(foundedNatureExpertise);
return 1;
}


public List<NatureExpertise> findByCriteria(NatureExpertiseVo natureExpertiseVo){

String query = "SELECT o FROM NatureExpertise o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",natureExpertiseVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",natureExpertiseVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",natureExpertiseVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",natureExpertiseVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",natureExpertiseVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",natureExpertiseVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",natureExpertiseVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",natureExpertiseVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",natureExpertiseVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",natureExpertiseVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",natureExpertiseVo.getDateArchivageMin(),natureExpertiseVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",natureExpertiseVo.getDateCreationMin(),natureExpertiseVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NatureExpertise> natureExpertises){
        if(ListUtil.isNotEmpty(natureExpertises)){
        natureExpertises.forEach(e->natureExpertiseDao.delete(e));
        }
}
@Override
public void update(List<NatureExpertise> natureExpertises){
if(ListUtil.isNotEmpty(natureExpertises)){
natureExpertises.forEach(e->natureExpertiseDao.save(e));
}
}



}
