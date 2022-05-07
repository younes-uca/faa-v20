package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.dao.TypeInstrumentIrdDao;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeInstrumentIrdAdminServiceImpl extends AbstractServiceImpl<TypeInstrumentIrd> implements TypeInstrumentIrdAdminService {

@Autowired
private TypeInstrumentIrdDao typeInstrumentIrdDao;

@Autowired
private ArchivableService<TypeInstrumentIrd> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeInstrumentIrd> findAll(){
        String query = "SELECT o FROM TypeInstrumentIrd o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeInstrumentIrd findByCode(String code){
    if( code==null) return null;
    return typeInstrumentIrdDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeInstrumentIrdDao.deleteByCode(code);
    }
    @Override
    public TypeInstrumentIrd findByIdOrCode(TypeInstrumentIrd typeInstrumentIrd){
        TypeInstrumentIrd resultat=null;
        if(typeInstrumentIrd != null){
            if(StringUtil.isNotEmpty(typeInstrumentIrd.getId())){
            resultat= typeInstrumentIrdDao.getOne(typeInstrumentIrd.getId());
            }else if(StringUtil.isNotEmpty(typeInstrumentIrd.getCode())) {
            resultat= typeInstrumentIrdDao.findByCode(typeInstrumentIrd.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeInstrumentIrd findById(Long id){
if(id==null) return null;
return typeInstrumentIrdDao.getOne(id);
}

@Override
public TypeInstrumentIrd findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypeInstrumentIrd archiver(TypeInstrumentIrd typeInstrumentIrd) {
        if (typeInstrumentIrd.getArchive() == null) {
        typeInstrumentIrd.setArchive(false);
        }
        typeInstrumentIrd.setArchive(true);
        typeInstrumentIrd.setDateArchivage(new Date());
        typeInstrumentIrdDao.save(typeInstrumentIrd);
        return typeInstrumentIrd;

    }

    @Override
    public TypeInstrumentIrd desarchiver(TypeInstrumentIrd typeInstrumentIrd) {
    if (typeInstrumentIrd.getArchive() == null) {
    typeInstrumentIrd.setArchive(false);
    }
    typeInstrumentIrd.setArchive(false);
    typeInstrumentIrd.setDateArchivage(null);
    typeInstrumentIrdDao.save(typeInstrumentIrd);
    return typeInstrumentIrd;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typeInstrumentIrdDao.findById(id).isPresent())  {
typeInstrumentIrdDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeInstrumentIrd update(TypeInstrumentIrd typeInstrumentIrd){
TypeInstrumentIrd foundedTypeInstrumentIrd = findById(typeInstrumentIrd.getId());
if(foundedTypeInstrumentIrd==null) return null;
else{
    archivableService.prepare(typeInstrumentIrd);
return  typeInstrumentIrdDao.save(typeInstrumentIrd);
}
}
private void prepareSave(TypeInstrumentIrd typeInstrumentIrd){
typeInstrumentIrd.setDateCreation(new Date());
if(typeInstrumentIrd.getArchive() == null)
  typeInstrumentIrd.setArchive(false);
if(typeInstrumentIrd.getAdmin() == null)
  typeInstrumentIrd.setAdmin(false);
if(typeInstrumentIrd.getVisible() == null)
  typeInstrumentIrd.setVisible(false);



}

@Override
public TypeInstrumentIrd save (TypeInstrumentIrd typeInstrumentIrd){
prepareSave(typeInstrumentIrd);

TypeInstrumentIrd result =null;
    TypeInstrumentIrd foundedTypeInstrumentIrd = findByCode(typeInstrumentIrd.getCode());
   if(foundedTypeInstrumentIrd == null){



TypeInstrumentIrd savedTypeInstrumentIrd = typeInstrumentIrdDao.save(typeInstrumentIrd);

result = savedTypeInstrumentIrd;
   }

return result;
}

@Override
public List<TypeInstrumentIrd> save(List<TypeInstrumentIrd> typeInstrumentIrds){
List<TypeInstrumentIrd> list = new ArrayList<>();
for(TypeInstrumentIrd typeInstrumentIrd: typeInstrumentIrds){
list.add(save(typeInstrumentIrd));
}
return list;
}



@Override
@Transactional
public int delete(TypeInstrumentIrd typeInstrumentIrd){
    if(typeInstrumentIrd.getCode()==null) return -1;

    TypeInstrumentIrd foundedTypeInstrumentIrd = findByCode(typeInstrumentIrd.getCode());
    if(foundedTypeInstrumentIrd==null) return -1;
typeInstrumentIrdDao.delete(foundedTypeInstrumentIrd);
return 1;
}


public List<TypeInstrumentIrd> findByCriteria(TypeInstrumentIrdVo typeInstrumentIrdVo){

String query = "SELECT o FROM TypeInstrumentIrd o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeInstrumentIrdVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeInstrumentIrdVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeInstrumentIrdVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "archive","=",typeInstrumentIrdVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeInstrumentIrdVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeInstrumentIrdVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeInstrumentIrdVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeInstrumentIrdVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeInstrumentIrdVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeInstrumentIrdVo.getDateArchivageMin(),typeInstrumentIrdVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeInstrumentIrdVo.getDateCreationMin(),typeInstrumentIrdVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeInstrumentIrd> typeInstrumentIrds){
        if(ListUtil.isNotEmpty(typeInstrumentIrds)){
        typeInstrumentIrds.forEach(e->typeInstrumentIrdDao.delete(e));
        }
}
@Override
public void update(List<TypeInstrumentIrd> typeInstrumentIrds){
if(ListUtil.isNotEmpty(typeInstrumentIrds)){
typeInstrumentIrds.forEach(e->typeInstrumentIrdDao.save(e));
}
}



}
