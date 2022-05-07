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
import com.ird.faa.bean.TypeInstance;
import com.ird.faa.dao.TypeInstanceDao;
import com.ird.faa.service.chercheur.facade.TypeInstanceChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypeInstanceVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeInstanceChercheurServiceImpl extends AbstractServiceImpl<TypeInstance> implements TypeInstanceChercheurService {

@Autowired
private TypeInstanceDao typeInstanceDao;

@Autowired
private ArchivableService<TypeInstance> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeInstance> findAll(){
    String query = "SELECT o FROM TypeInstance o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeInstance findByCode(String code){
    if( code==null) return null;
    return typeInstanceDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeInstanceDao.deleteByCode(code);
    }
    @Override
    public TypeInstance findByIdOrCode(TypeInstance typeInstance){
        TypeInstance resultat=null;
        if(typeInstance != null){
            if(StringUtil.isNotEmpty(typeInstance.getId())){
            resultat= typeInstanceDao.getOne(typeInstance.getId());
            }else if(StringUtil.isNotEmpty(typeInstance.getCode())) {
            resultat= typeInstanceDao.findByCode(typeInstance.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeInstance findById(Long id){
if(id==null) return null;
return typeInstanceDao.getOne(id);
}

@Override
public TypeInstance findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeInstanceDao.findById(id).isPresent())  {
typeInstanceDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeInstance update(TypeInstance typeInstance){
TypeInstance foundedTypeInstance = findById(typeInstance.getId());
if(foundedTypeInstance==null) return null;
else{
    archivableService.prepare(typeInstance);
return  typeInstanceDao.save(typeInstance);
}
}
private void prepareSave(TypeInstance typeInstance){
typeInstance.setDateCreation(new Date());
if(typeInstance.getArchive() == null)
  typeInstance.setArchive(false);
if(typeInstance.getAdmin() == null)
  typeInstance.setAdmin(false);
if(typeInstance.getVisible() == null)
  typeInstance.setVisible(false);



}

@Override
public TypeInstance save (TypeInstance typeInstance){
prepareSave(typeInstance);

TypeInstance result =null;
    TypeInstance foundedTypeInstance = findByCode(typeInstance.getCode());
   if(foundedTypeInstance == null){



TypeInstance savedTypeInstance = typeInstanceDao.save(typeInstance);

result = savedTypeInstance;
   }

return result;
}

@Override
public List<TypeInstance> save(List<TypeInstance> typeInstances){
List<TypeInstance> list = new ArrayList<>();
for(TypeInstance typeInstance: typeInstances){
list.add(save(typeInstance));
}
return list;
}



@Override
@Transactional
public int delete(TypeInstance typeInstance){
    if(typeInstance.getCode()==null) return -1;

    TypeInstance foundedTypeInstance = findByCode(typeInstance.getCode());
    if(foundedTypeInstance==null) return -1;
typeInstanceDao.delete(foundedTypeInstance);
return 1;
}


public List<TypeInstance> findByCriteria(TypeInstanceVo typeInstanceVo){

String query = "SELECT o FROM TypeInstance o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeInstanceVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeInstanceVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeInstanceVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "archive","=",typeInstanceVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeInstanceVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeInstanceVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeInstanceVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeInstanceVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeInstanceVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeInstanceVo.getDateArchivageMin(),typeInstanceVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeInstanceVo.getDateCreationMin(),typeInstanceVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeInstance> typeInstances){
        if(ListUtil.isNotEmpty(typeInstances)){
        typeInstances.forEach(e->typeInstanceDao.delete(e));
        }
}
@Override
public void update(List<TypeInstance> typeInstances){
if(ListUtil.isNotEmpty(typeInstances)){
typeInstances.forEach(e->typeInstanceDao.save(e));
}
}



}
