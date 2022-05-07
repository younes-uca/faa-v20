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
import com.ird.faa.bean.TypeOutil;
import com.ird.faa.dao.TypeOutilDao;
import com.ird.faa.service.chercheur.facade.TypeOutilChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypeOutilVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeOutilChercheurServiceImpl extends AbstractServiceImpl<TypeOutil> implements TypeOutilChercheurService {

@Autowired
private TypeOutilDao typeOutilDao;

@Autowired
private ArchivableService<TypeOutil> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeOutil> findAll(){
    String query = "SELECT o FROM TypeOutil o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeOutil findByCode(String code){
    if( code==null) return null;
    return typeOutilDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeOutilDao.deleteByCode(code);
    }
    @Override
    public TypeOutil findByIdOrCode(TypeOutil typeOutil){
        TypeOutil resultat=null;
        if(typeOutil != null){
            if(StringUtil.isNotEmpty(typeOutil.getId())){
            resultat= typeOutilDao.getOne(typeOutil.getId());
            }else if(StringUtil.isNotEmpty(typeOutil.getCode())) {
            resultat= typeOutilDao.findByCode(typeOutil.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeOutil findById(Long id){
if(id==null) return null;
return typeOutilDao.getOne(id);
}

@Override
public TypeOutil findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeOutilDao.findById(id).isPresent())  {
typeOutilDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeOutil update(TypeOutil typeOutil){
TypeOutil foundedTypeOutil = findById(typeOutil.getId());
if(foundedTypeOutil==null) return null;
else{
    archivableService.prepare(typeOutil);
return  typeOutilDao.save(typeOutil);
}
}
private void prepareSave(TypeOutil typeOutil){
typeOutil.setDateCreation(new Date());
if(typeOutil.getNumerique() == null)
  typeOutil.setNumerique(false);
if(typeOutil.getArchive() == null)
  typeOutil.setArchive(false);
if(typeOutil.getAdmin() == null)
  typeOutil.setAdmin(false);
if(typeOutil.getVisible() == null)
  typeOutil.setVisible(false);



}

@Override
public TypeOutil save (TypeOutil typeOutil){
prepareSave(typeOutil);

TypeOutil result =null;
    TypeOutil foundedTypeOutil = findByCode(typeOutil.getCode());
   if(foundedTypeOutil == null){



TypeOutil savedTypeOutil = typeOutilDao.save(typeOutil);

result = savedTypeOutil;
   }

return result;
}

@Override
public List<TypeOutil> save(List<TypeOutil> typeOutils){
List<TypeOutil> list = new ArrayList<>();
for(TypeOutil typeOutil: typeOutils){
list.add(save(typeOutil));
}
return list;
}



@Override
@Transactional
public int delete(TypeOutil typeOutil){
    if(typeOutil.getCode()==null) return -1;

    TypeOutil foundedTypeOutil = findByCode(typeOutil.getCode());
    if(foundedTypeOutil==null) return -1;
typeOutilDao.delete(foundedTypeOutil);
return 1;
}


public List<TypeOutil> findByCriteria(TypeOutilVo typeOutilVo){

String query = "SELECT o FROM TypeOutil o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeOutilVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeOutilVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeOutilVo.getCode());
            query += SearchUtil.addConstraint( "o", "numerique","=",typeOutilVo.getNumerique());
            query += SearchUtil.addConstraint( "o", "archive","=",typeOutilVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeOutilVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeOutilVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeOutilVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeOutilVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeOutilVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeOutilVo.getDateArchivageMin(),typeOutilVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeOutilVo.getDateCreationMin(),typeOutilVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeOutil> typeOutils){
        if(ListUtil.isNotEmpty(typeOutils)){
        typeOutils.forEach(e->typeOutilDao.delete(e));
        }
}
@Override
public void update(List<TypeOutil> typeOutils){
if(ListUtil.isNotEmpty(typeOutils)){
typeOutils.forEach(e->typeOutilDao.save(e));
}
}



}
