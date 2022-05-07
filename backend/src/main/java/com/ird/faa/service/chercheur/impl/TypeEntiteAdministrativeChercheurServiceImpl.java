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
import com.ird.faa.bean.TypeEntiteAdministrative;
import com.ird.faa.dao.TypeEntiteAdministrativeDao;
import com.ird.faa.service.chercheur.facade.TypeEntiteAdministrativeChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypeEntiteAdministrativeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeEntiteAdministrativeChercheurServiceImpl extends AbstractServiceImpl<TypeEntiteAdministrative> implements TypeEntiteAdministrativeChercheurService {

@Autowired
private TypeEntiteAdministrativeDao typeEntiteAdministrativeDao;

@Autowired
private ArchivableService<TypeEntiteAdministrative> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeEntiteAdministrative> findAll(){
    String query = "SELECT o FROM TypeEntiteAdministrative o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeEntiteAdministrative findByCode(String code){
    if( code==null) return null;
    return typeEntiteAdministrativeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeEntiteAdministrativeDao.deleteByCode(code);
    }
    @Override
    public TypeEntiteAdministrative findByIdOrCode(TypeEntiteAdministrative typeEntiteAdministrative){
        TypeEntiteAdministrative resultat=null;
        if(typeEntiteAdministrative != null){
            if(StringUtil.isNotEmpty(typeEntiteAdministrative.getId())){
            resultat= typeEntiteAdministrativeDao.getOne(typeEntiteAdministrative.getId());
            }else if(StringUtil.isNotEmpty(typeEntiteAdministrative.getCode())) {
            resultat= typeEntiteAdministrativeDao.findByCode(typeEntiteAdministrative.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeEntiteAdministrative findById(Long id){
if(id==null) return null;
return typeEntiteAdministrativeDao.getOne(id);
}

@Override
public TypeEntiteAdministrative findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeEntiteAdministrativeDao.findById(id).isPresent())  {
typeEntiteAdministrativeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeEntiteAdministrative update(TypeEntiteAdministrative typeEntiteAdministrative){
TypeEntiteAdministrative foundedTypeEntiteAdministrative = findById(typeEntiteAdministrative.getId());
if(foundedTypeEntiteAdministrative==null) return null;
else{
    archivableService.prepare(typeEntiteAdministrative);
return  typeEntiteAdministrativeDao.save(typeEntiteAdministrative);
}
}
private void prepareSave(TypeEntiteAdministrative typeEntiteAdministrative){
typeEntiteAdministrative.setDateCreation(new Date());
if(typeEntiteAdministrative.getArchive() == null)
  typeEntiteAdministrative.setArchive(false);
if(typeEntiteAdministrative.getAdmin() == null)
  typeEntiteAdministrative.setAdmin(false);
if(typeEntiteAdministrative.getVisible() == null)
  typeEntiteAdministrative.setVisible(false);



}

@Override
public TypeEntiteAdministrative save (TypeEntiteAdministrative typeEntiteAdministrative){
prepareSave(typeEntiteAdministrative);

TypeEntiteAdministrative result =null;
    TypeEntiteAdministrative foundedTypeEntiteAdministrative = findByCode(typeEntiteAdministrative.getCode());
   if(foundedTypeEntiteAdministrative == null){



TypeEntiteAdministrative savedTypeEntiteAdministrative = typeEntiteAdministrativeDao.save(typeEntiteAdministrative);

result = savedTypeEntiteAdministrative;
   }

return result;
}

@Override
public List<TypeEntiteAdministrative> save(List<TypeEntiteAdministrative> typeEntiteAdministratives){
List<TypeEntiteAdministrative> list = new ArrayList<>();
for(TypeEntiteAdministrative typeEntiteAdministrative: typeEntiteAdministratives){
list.add(save(typeEntiteAdministrative));
}
return list;
}



@Override
@Transactional
public int delete(TypeEntiteAdministrative typeEntiteAdministrative){
    if(typeEntiteAdministrative.getCode()==null) return -1;

    TypeEntiteAdministrative foundedTypeEntiteAdministrative = findByCode(typeEntiteAdministrative.getCode());
    if(foundedTypeEntiteAdministrative==null) return -1;
typeEntiteAdministrativeDao.delete(foundedTypeEntiteAdministrative);
return 1;
}


public List<TypeEntiteAdministrative> findByCriteria(TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){

String query = "SELECT o FROM TypeEntiteAdministrative o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeEntiteAdministrativeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeEntiteAdministrativeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeEntiteAdministrativeVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeEntiteAdministrativeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeEntiteAdministrativeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeEntiteAdministrativeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeEntiteAdministrativeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeEntiteAdministrativeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeEntiteAdministrativeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeEntiteAdministrativeVo.getDateArchivageMin(),typeEntiteAdministrativeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeEntiteAdministrativeVo.getDateCreationMin(),typeEntiteAdministrativeVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeEntiteAdministrative> typeEntiteAdministratives){
        if(ListUtil.isNotEmpty(typeEntiteAdministratives)){
        typeEntiteAdministratives.forEach(e->typeEntiteAdministrativeDao.delete(e));
        }
}
@Override
public void update(List<TypeEntiteAdministrative> typeEntiteAdministratives){
if(ListUtil.isNotEmpty(typeEntiteAdministratives)){
typeEntiteAdministratives.forEach(e->typeEntiteAdministrativeDao.save(e));
}
}



}
