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
import com.ird.faa.bean.TypeExpert;
import com.ird.faa.dao.TypeExpertDao;
import com.ird.faa.service.chercheur.facade.TypeExpertChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypeExpertVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeExpertChercheurServiceImpl extends AbstractServiceImpl<TypeExpert> implements TypeExpertChercheurService {

@Autowired
private TypeExpertDao typeExpertDao;

@Autowired
private ArchivableService<TypeExpert> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeExpert> findAll(){
    String query = "SELECT o FROM TypeExpert o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeExpert findByCode(String code){
    if( code==null) return null;
    return typeExpertDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeExpertDao.deleteByCode(code);
    }
    @Override
    public TypeExpert findByIdOrCode(TypeExpert typeExpert){
        TypeExpert resultat=null;
        if(typeExpert != null){
            if(StringUtil.isNotEmpty(typeExpert.getId())){
            resultat= typeExpertDao.getOne(typeExpert.getId());
            }else if(StringUtil.isNotEmpty(typeExpert.getCode())) {
            resultat= typeExpertDao.findByCode(typeExpert.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeExpert findById(Long id){
if(id==null) return null;
return typeExpertDao.getOne(id);
}

@Override
public TypeExpert findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeExpertDao.findById(id).isPresent())  {
typeExpertDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeExpert update(TypeExpert typeExpert){
TypeExpert foundedTypeExpert = findById(typeExpert.getId());
if(foundedTypeExpert==null) return null;
else{
    archivableService.prepare(typeExpert);
return  typeExpertDao.save(typeExpert);
}
}
private void prepareSave(TypeExpert typeExpert){
typeExpert.setDateCreation(new Date());
if(typeExpert.getArchive() == null)
  typeExpert.setArchive(false);
if(typeExpert.getAdmin() == null)
  typeExpert.setAdmin(false);
if(typeExpert.getVisible() == null)
  typeExpert.setVisible(false);



}

@Override
public TypeExpert save (TypeExpert typeExpert){
prepareSave(typeExpert);

TypeExpert result =null;
    TypeExpert foundedTypeExpert = findByCode(typeExpert.getCode());
   if(foundedTypeExpert == null){



TypeExpert savedTypeExpert = typeExpertDao.save(typeExpert);

result = savedTypeExpert;
   }

return result;
}

@Override
public List<TypeExpert> save(List<TypeExpert> typeExperts){
List<TypeExpert> list = new ArrayList<>();
for(TypeExpert typeExpert: typeExperts){
list.add(save(typeExpert));
}
return list;
}



@Override
@Transactional
public int delete(TypeExpert typeExpert){
    if(typeExpert.getCode()==null) return -1;

    TypeExpert foundedTypeExpert = findByCode(typeExpert.getCode());
    if(foundedTypeExpert==null) return -1;
typeExpertDao.delete(foundedTypeExpert);
return 1;
}


public List<TypeExpert> findByCriteria(TypeExpertVo typeExpertVo){

String query = "SELECT o FROM TypeExpert o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeExpertVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeExpertVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeExpertVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeExpertVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeExpertVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeExpertVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeExpertVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeExpertVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeExpertVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeExpertVo.getDateArchivageMin(),typeExpertVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeExpertVo.getDateCreationMin(),typeExpertVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeExpert> typeExperts){
        if(ListUtil.isNotEmpty(typeExperts)){
        typeExperts.forEach(e->typeExpertDao.delete(e));
        }
}
@Override
public void update(List<TypeExpert> typeExperts){
if(ListUtil.isNotEmpty(typeExperts)){
typeExperts.forEach(e->typeExpertDao.save(e));
}
}



}
