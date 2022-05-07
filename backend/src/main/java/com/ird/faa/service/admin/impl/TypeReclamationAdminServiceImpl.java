package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeReclamation;
import com.ird.faa.dao.TypeReclamationDao;
import com.ird.faa.service.admin.facade.TypeReclamationAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeReclamationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeReclamationAdminServiceImpl extends AbstractServiceImpl<TypeReclamation> implements TypeReclamationAdminService {

@Autowired
private TypeReclamationDao typeReclamationDao;

@Autowired
private ArchivableService<TypeReclamation> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeReclamation> findAll(){
        String query = "SELECT o FROM TypeReclamation o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeReclamation findByCode(String code){
    if( code==null) return null;
    return typeReclamationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeReclamationDao.deleteByCode(code);
    }
    @Override
    public TypeReclamation findByIdOrCode(TypeReclamation typeReclamation){
        TypeReclamation resultat=null;
        if(typeReclamation != null){
            if(StringUtil.isNotEmpty(typeReclamation.getId())){
            resultat= typeReclamationDao.getOne(typeReclamation.getId());
            }else if(StringUtil.isNotEmpty(typeReclamation.getCode())) {
            resultat= typeReclamationDao.findByCode(typeReclamation.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeReclamation findById(Long id){
if(id==null) return null;
return typeReclamationDao.getOne(id);
}

@Override
public TypeReclamation findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypeReclamation archiver(TypeReclamation typeReclamation) {
        if (typeReclamation.getArchive() == null) {
        typeReclamation.setArchive(false);
        }
        typeReclamation.setArchive(true);
        typeReclamation.setDateArchivage(new Date());
        typeReclamationDao.save(typeReclamation);
        return typeReclamation;

    }

    @Override
    public TypeReclamation desarchiver(TypeReclamation typeReclamation) {
    if (typeReclamation.getArchive() == null) {
    typeReclamation.setArchive(false);
    }
    typeReclamation.setArchive(false);
    typeReclamation.setDateArchivage(null);
    typeReclamationDao.save(typeReclamation);
    return typeReclamation;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typeReclamationDao.findById(id).isPresent())  {
typeReclamationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeReclamation update(TypeReclamation typeReclamation){
TypeReclamation foundedTypeReclamation = findById(typeReclamation.getId());
if(foundedTypeReclamation==null) return null;
else{
    archivableService.prepare(typeReclamation);
return  typeReclamationDao.save(typeReclamation);
}
}
private void prepareSave(TypeReclamation typeReclamation){
typeReclamation.setDateCreation(new Date());
if(typeReclamation.getArchive() == null)
  typeReclamation.setArchive(false);
if(typeReclamation.getAdmin() == null)
  typeReclamation.setAdmin(false);
if(typeReclamation.getVisible() == null)
  typeReclamation.setVisible(false);



}

@Override
public TypeReclamation save (TypeReclamation typeReclamation){
prepareSave(typeReclamation);

TypeReclamation result =null;
    TypeReclamation foundedTypeReclamation = findByCode(typeReclamation.getCode());
   if(foundedTypeReclamation == null){



TypeReclamation savedTypeReclamation = typeReclamationDao.save(typeReclamation);

result = savedTypeReclamation;
   }

return result;
}

@Override
public List<TypeReclamation> save(List<TypeReclamation> typeReclamations){
List<TypeReclamation> list = new ArrayList<>();
for(TypeReclamation typeReclamation: typeReclamations){
list.add(save(typeReclamation));
}
return list;
}



@Override
@Transactional
public int delete(TypeReclamation typeReclamation){
    if(typeReclamation.getCode()==null) return -1;

    TypeReclamation foundedTypeReclamation = findByCode(typeReclamation.getCode());
    if(foundedTypeReclamation==null) return -1;
typeReclamationDao.delete(foundedTypeReclamation);
return 1;
}


public List<TypeReclamation> findByCriteria(TypeReclamationVo typeReclamationVo){

String query = "SELECT o FROM TypeReclamation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeReclamationVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeReclamationVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeReclamationVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeReclamationVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeReclamationVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeReclamationVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeReclamationVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeReclamationVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeReclamationVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeReclamationVo.getDateArchivageMin(),typeReclamationVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeReclamationVo.getDateCreationMin(),typeReclamationVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeReclamation> typeReclamations){
        if(ListUtil.isNotEmpty(typeReclamations)){
        typeReclamations.forEach(e->typeReclamationDao.delete(e));
        }
}
@Override
public void update(List<TypeReclamation> typeReclamations){
if(ListUtil.isNotEmpty(typeReclamations)){
typeReclamations.forEach(e->typeReclamationDao.save(e));
}
}



}
