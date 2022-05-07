package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypePubliqueCultureScientifique;
import com.ird.faa.dao.TypePubliqueCultureScientifiqueDao;
import com.ird.faa.service.admin.facade.TypePubliqueCultureScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.TypePubliqueCultureScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypePubliqueCultureScientifiqueAdminServiceImpl extends AbstractServiceImpl<TypePubliqueCultureScientifique> implements TypePubliqueCultureScientifiqueAdminService {

@Autowired
private TypePubliqueCultureScientifiqueDao typePubliqueCultureScientifiqueDao;

@Autowired
private ArchivableService<TypePubliqueCultureScientifique> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypePubliqueCultureScientifique> findAll(){
        String query = "SELECT o FROM TypePubliqueCultureScientifique o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypePubliqueCultureScientifique findByCode(String code){
    if( code==null) return null;
    return typePubliqueCultureScientifiqueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typePubliqueCultureScientifiqueDao.deleteByCode(code);
    }
    @Override
    public TypePubliqueCultureScientifique findByIdOrCode(TypePubliqueCultureScientifique typePubliqueCultureScientifique){
        TypePubliqueCultureScientifique resultat=null;
        if(typePubliqueCultureScientifique != null){
            if(StringUtil.isNotEmpty(typePubliqueCultureScientifique.getId())){
            resultat= typePubliqueCultureScientifiqueDao.getOne(typePubliqueCultureScientifique.getId());
            }else if(StringUtil.isNotEmpty(typePubliqueCultureScientifique.getCode())) {
            resultat= typePubliqueCultureScientifiqueDao.findByCode(typePubliqueCultureScientifique.getCode());
            }
        }
    return resultat;
    }

@Override
public TypePubliqueCultureScientifique findById(Long id){
if(id==null) return null;
return typePubliqueCultureScientifiqueDao.getOne(id);
}

@Override
public TypePubliqueCultureScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypePubliqueCultureScientifique archiver(TypePubliqueCultureScientifique typePubliqueCultureScientifique) {
        if (typePubliqueCultureScientifique.getArchive() == null) {
        typePubliqueCultureScientifique.setArchive(false);
        }
        typePubliqueCultureScientifique.setArchive(true);
        typePubliqueCultureScientifique.setDateArchivage(new Date());
        typePubliqueCultureScientifiqueDao.save(typePubliqueCultureScientifique);
        return typePubliqueCultureScientifique;

    }

    @Override
    public TypePubliqueCultureScientifique desarchiver(TypePubliqueCultureScientifique typePubliqueCultureScientifique) {
    if (typePubliqueCultureScientifique.getArchive() == null) {
    typePubliqueCultureScientifique.setArchive(false);
    }
    typePubliqueCultureScientifique.setArchive(false);
    typePubliqueCultureScientifique.setDateArchivage(null);
    typePubliqueCultureScientifiqueDao.save(typePubliqueCultureScientifique);
    return typePubliqueCultureScientifique;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typePubliqueCultureScientifiqueDao.findById(id).isPresent())  {
typePubliqueCultureScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypePubliqueCultureScientifique update(TypePubliqueCultureScientifique typePubliqueCultureScientifique){
TypePubliqueCultureScientifique foundedTypePubliqueCultureScientifique = findById(typePubliqueCultureScientifique.getId());
if(foundedTypePubliqueCultureScientifique==null) return null;
else{
    archivableService.prepare(typePubliqueCultureScientifique);
return  typePubliqueCultureScientifiqueDao.save(typePubliqueCultureScientifique);
}
}
private void prepareSave(TypePubliqueCultureScientifique typePubliqueCultureScientifique){
typePubliqueCultureScientifique.setDateCreation(new Date());
if(typePubliqueCultureScientifique.getArchive() == null)
  typePubliqueCultureScientifique.setArchive(false);
if(typePubliqueCultureScientifique.getAdmin() == null)
  typePubliqueCultureScientifique.setAdmin(false);
if(typePubliqueCultureScientifique.getVisible() == null)
  typePubliqueCultureScientifique.setVisible(false);



}

@Override
public TypePubliqueCultureScientifique save (TypePubliqueCultureScientifique typePubliqueCultureScientifique){
prepareSave(typePubliqueCultureScientifique);

TypePubliqueCultureScientifique result =null;
    TypePubliqueCultureScientifique foundedTypePubliqueCultureScientifique = findByCode(typePubliqueCultureScientifique.getCode());
   if(foundedTypePubliqueCultureScientifique == null){



TypePubliqueCultureScientifique savedTypePubliqueCultureScientifique = typePubliqueCultureScientifiqueDao.save(typePubliqueCultureScientifique);

result = savedTypePubliqueCultureScientifique;
   }

return result;
}

@Override
public List<TypePubliqueCultureScientifique> save(List<TypePubliqueCultureScientifique> typePubliqueCultureScientifiques){
List<TypePubliqueCultureScientifique> list = new ArrayList<>();
for(TypePubliqueCultureScientifique typePubliqueCultureScientifique: typePubliqueCultureScientifiques){
list.add(save(typePubliqueCultureScientifique));
}
return list;
}



@Override
@Transactional
public int delete(TypePubliqueCultureScientifique typePubliqueCultureScientifique){
    if(typePubliqueCultureScientifique.getCode()==null) return -1;

    TypePubliqueCultureScientifique foundedTypePubliqueCultureScientifique = findByCode(typePubliqueCultureScientifique.getCode());
    if(foundedTypePubliqueCultureScientifique==null) return -1;
typePubliqueCultureScientifiqueDao.delete(foundedTypePubliqueCultureScientifique);
return 1;
}


public List<TypePubliqueCultureScientifique> findByCriteria(TypePubliqueCultureScientifiqueVo typePubliqueCultureScientifiqueVo){

String query = "SELECT o FROM TypePubliqueCultureScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typePubliqueCultureScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typePubliqueCultureScientifiqueVo.getCode());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typePubliqueCultureScientifiqueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "archive","=",typePubliqueCultureScientifiqueVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typePubliqueCultureScientifiqueVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typePubliqueCultureScientifiqueVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typePubliqueCultureScientifiqueVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typePubliqueCultureScientifiqueVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typePubliqueCultureScientifiqueVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typePubliqueCultureScientifiqueVo.getDateArchivageMin(),typePubliqueCultureScientifiqueVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typePubliqueCultureScientifiqueVo.getDateCreationMin(),typePubliqueCultureScientifiqueVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypePubliqueCultureScientifique> typePubliqueCultureScientifiques){
        if(ListUtil.isNotEmpty(typePubliqueCultureScientifiques)){
        typePubliqueCultureScientifiques.forEach(e->typePubliqueCultureScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<TypePubliqueCultureScientifique> typePubliqueCultureScientifiques){
if(ListUtil.isNotEmpty(typePubliqueCultureScientifiques)){
typePubliqueCultureScientifiques.forEach(e->typePubliqueCultureScientifiqueDao.save(e));
}
}



}
