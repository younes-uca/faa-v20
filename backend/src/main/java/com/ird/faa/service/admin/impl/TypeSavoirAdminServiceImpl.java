package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeSavoir;
import com.ird.faa.dao.TypeSavoirDao;
import com.ird.faa.service.admin.facade.TypeSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeSavoirVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeSavoirAdminServiceImpl extends AbstractServiceImpl<TypeSavoir> implements TypeSavoirAdminService {

@Autowired
private TypeSavoirDao typeSavoirDao;

@Autowired
private ArchivableService<TypeSavoir> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeSavoir> findAll(){
        String query = "SELECT o FROM TypeSavoir o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeSavoir findByCode(String code){
    if( code==null) return null;
    return typeSavoirDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeSavoirDao.deleteByCode(code);
    }
    @Override
    public TypeSavoir findByIdOrCode(TypeSavoir typeSavoir){
        TypeSavoir resultat=null;
        if(typeSavoir != null){
            if(StringUtil.isNotEmpty(typeSavoir.getId())){
            resultat= typeSavoirDao.getOne(typeSavoir.getId());
            }else if(StringUtil.isNotEmpty(typeSavoir.getCode())) {
            resultat= typeSavoirDao.findByCode(typeSavoir.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeSavoir findById(Long id){
if(id==null) return null;
return typeSavoirDao.getOne(id);
}

@Override
public TypeSavoir findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypeSavoir archiver(TypeSavoir typeSavoir) {
        if (typeSavoir.getArchive() == null) {
        typeSavoir.setArchive(false);
        }
        typeSavoir.setArchive(true);
        typeSavoir.setDateArchivage(new Date());
        typeSavoirDao.save(typeSavoir);
        return typeSavoir;

    }

    @Override
    public TypeSavoir desarchiver(TypeSavoir typeSavoir) {
    if (typeSavoir.getArchive() == null) {
    typeSavoir.setArchive(false);
    }
    typeSavoir.setArchive(false);
    typeSavoir.setDateArchivage(null);
    typeSavoirDao.save(typeSavoir);
    return typeSavoir;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typeSavoirDao.findById(id).isPresent())  {
typeSavoirDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeSavoir update(TypeSavoir typeSavoir){
TypeSavoir foundedTypeSavoir = findById(typeSavoir.getId());
if(foundedTypeSavoir==null) return null;
else{
    archivableService.prepare(typeSavoir);
return  typeSavoirDao.save(typeSavoir);
}
}
private void prepareSave(TypeSavoir typeSavoir){
typeSavoir.setDateCreation(new Date());
if(typeSavoir.getArchive() == null)
  typeSavoir.setArchive(false);
if(typeSavoir.getAdmin() == null)
  typeSavoir.setAdmin(false);
if(typeSavoir.getVisible() == null)
  typeSavoir.setVisible(false);



}

@Override
public TypeSavoir save (TypeSavoir typeSavoir){
prepareSave(typeSavoir);

TypeSavoir result =null;
    TypeSavoir foundedTypeSavoir = findByCode(typeSavoir.getCode());
   if(foundedTypeSavoir == null){



TypeSavoir savedTypeSavoir = typeSavoirDao.save(typeSavoir);

result = savedTypeSavoir;
   }

return result;
}

@Override
public List<TypeSavoir> save(List<TypeSavoir> typeSavoirs){
List<TypeSavoir> list = new ArrayList<>();
for(TypeSavoir typeSavoir: typeSavoirs){
list.add(save(typeSavoir));
}
return list;
}



@Override
@Transactional
public int delete(TypeSavoir typeSavoir){
    if(typeSavoir.getCode()==null) return -1;

    TypeSavoir foundedTypeSavoir = findByCode(typeSavoir.getCode());
    if(foundedTypeSavoir==null) return -1;
typeSavoirDao.delete(foundedTypeSavoir);
return 1;
}


public List<TypeSavoir> findByCriteria(TypeSavoirVo typeSavoirVo){

String query = "SELECT o FROM TypeSavoir o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeSavoirVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeSavoirVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeSavoirVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeSavoirVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeSavoirVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeSavoirVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeSavoirVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeSavoirVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeSavoirVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeSavoirVo.getDateArchivageMin(),typeSavoirVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeSavoirVo.getDateCreationMin(),typeSavoirVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeSavoir> typeSavoirs){
        if(ListUtil.isNotEmpty(typeSavoirs)){
        typeSavoirs.forEach(e->typeSavoirDao.delete(e));
        }
}
@Override
public void update(List<TypeSavoir> typeSavoirs){
if(ListUtil.isNotEmpty(typeSavoirs)){
typeSavoirs.forEach(e->typeSavoirDao.save(e));
}
}



}
