package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeExpertise;
import com.ird.faa.dao.TypeExpertiseDao;
import com.ird.faa.service.admin.facade.TypeExpertiseAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeExpertiseVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeExpertiseAdminServiceImpl extends AbstractServiceImpl<TypeExpertise> implements TypeExpertiseAdminService {

@Autowired
private TypeExpertiseDao typeExpertiseDao;

@Autowired
private ArchivableService<TypeExpertise> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeExpertise> findAll(){
        String query = "SELECT o FROM TypeExpertise o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeExpertise findByCode(String code){
    if( code==null) return null;
    return typeExpertiseDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeExpertiseDao.deleteByCode(code);
    }
    @Override
    public TypeExpertise findByIdOrCode(TypeExpertise typeExpertise){
        TypeExpertise resultat=null;
        if(typeExpertise != null){
            if(StringUtil.isNotEmpty(typeExpertise.getId())){
            resultat= typeExpertiseDao.getOne(typeExpertise.getId());
            }else if(StringUtil.isNotEmpty(typeExpertise.getCode())) {
            resultat= typeExpertiseDao.findByCode(typeExpertise.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeExpertise findById(Long id){
if(id==null) return null;
return typeExpertiseDao.getOne(id);
}

@Override
public TypeExpertise findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypeExpertise archiver(TypeExpertise typeExpertise) {
        if (typeExpertise.getArchive() == null) {
        typeExpertise.setArchive(false);
        }
        typeExpertise.setArchive(true);
        typeExpertise.setDateArchivage(new Date());
        typeExpertiseDao.save(typeExpertise);
        return typeExpertise;

    }

    @Override
    public TypeExpertise desarchiver(TypeExpertise typeExpertise) {
    if (typeExpertise.getArchive() == null) {
    typeExpertise.setArchive(false);
    }
    typeExpertise.setArchive(false);
    typeExpertise.setDateArchivage(null);
    typeExpertiseDao.save(typeExpertise);
    return typeExpertise;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typeExpertiseDao.findById(id).isPresent())  {
typeExpertiseDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeExpertise update(TypeExpertise typeExpertise){
TypeExpertise foundedTypeExpertise = findById(typeExpertise.getId());
if(foundedTypeExpertise==null) return null;
else{
    archivableService.prepare(typeExpertise);
return  typeExpertiseDao.save(typeExpertise);
}
}
private void prepareSave(TypeExpertise typeExpertise){
typeExpertise.setDateCreation(new Date());
if(typeExpertise.getArchive() == null)
  typeExpertise.setArchive(false);
if(typeExpertise.getAdmin() == null)
  typeExpertise.setAdmin(false);
if(typeExpertise.getVisible() == null)
  typeExpertise.setVisible(false);



}

@Override
public TypeExpertise save (TypeExpertise typeExpertise){
prepareSave(typeExpertise);

TypeExpertise result =null;
    TypeExpertise foundedTypeExpertise = findByCode(typeExpertise.getCode());
   if(foundedTypeExpertise == null){



TypeExpertise savedTypeExpertise = typeExpertiseDao.save(typeExpertise);

result = savedTypeExpertise;
   }

return result;
}

@Override
public List<TypeExpertise> save(List<TypeExpertise> typeExpertises){
List<TypeExpertise> list = new ArrayList<>();
for(TypeExpertise typeExpertise: typeExpertises){
list.add(save(typeExpertise));
}
return list;
}



@Override
@Transactional
public int delete(TypeExpertise typeExpertise){
    if(typeExpertise.getCode()==null) return -1;

    TypeExpertise foundedTypeExpertise = findByCode(typeExpertise.getCode());
    if(foundedTypeExpertise==null) return -1;
typeExpertiseDao.delete(foundedTypeExpertise);
return 1;
}


public List<TypeExpertise> findByCriteria(TypeExpertiseVo typeExpertiseVo){

String query = "SELECT o FROM TypeExpertise o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeExpertiseVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeExpertiseVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeExpertiseVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeExpertiseVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeExpertiseVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeExpertiseVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeExpertiseVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeExpertiseVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeExpertiseVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeExpertiseVo.getDateArchivageMin(),typeExpertiseVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeExpertiseVo.getDateCreationMin(),typeExpertiseVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeExpertise> typeExpertises){
        if(ListUtil.isNotEmpty(typeExpertises)){
        typeExpertises.forEach(e->typeExpertiseDao.delete(e));
        }
}
@Override
public void update(List<TypeExpertise> typeExpertises){
if(ListUtil.isNotEmpty(typeExpertises)){
typeExpertises.forEach(e->typeExpertiseDao.save(e));
}
}



}
