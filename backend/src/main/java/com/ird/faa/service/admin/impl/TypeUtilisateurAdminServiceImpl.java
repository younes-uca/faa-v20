package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeUtilisateur;
import com.ird.faa.dao.TypeUtilisateurDao;
import com.ird.faa.service.admin.facade.TypeUtilisateurAdminService;

import com.ird.faa.ws.rest.provided.vo.TypeUtilisateurVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeUtilisateurAdminServiceImpl extends AbstractServiceImpl<TypeUtilisateur> implements TypeUtilisateurAdminService {

@Autowired
private TypeUtilisateurDao typeUtilisateurDao;

@Autowired
private ArchivableService<TypeUtilisateur> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeUtilisateur> findAll(){
        String query = "SELECT o FROM TypeUtilisateur o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public TypeUtilisateur findByCode(String code){
    if( code==null) return null;
    return typeUtilisateurDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return typeUtilisateurDao.deleteByCode(code);
    }
    @Override
    public TypeUtilisateur findByIdOrCode(TypeUtilisateur typeUtilisateur){
        TypeUtilisateur resultat=null;
        if(typeUtilisateur != null){
            if(StringUtil.isNotEmpty(typeUtilisateur.getId())){
            resultat= typeUtilisateurDao.getOne(typeUtilisateur.getId());
            }else if(StringUtil.isNotEmpty(typeUtilisateur.getCode())) {
            resultat= typeUtilisateurDao.findByCode(typeUtilisateur.getCode());
            }
        }
    return resultat;
    }

@Override
public TypeUtilisateur findById(Long id){
if(id==null) return null;
return typeUtilisateurDao.getOne(id);
}

@Override
public TypeUtilisateur findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public TypeUtilisateur archiver(TypeUtilisateur typeUtilisateur) {
        if (typeUtilisateur.getArchive() == null) {
        typeUtilisateur.setArchive(false);
        }
        typeUtilisateur.setArchive(true);
        typeUtilisateur.setDateArchivage(new Date());
        typeUtilisateurDao.save(typeUtilisateur);
        return typeUtilisateur;

    }

    @Override
    public TypeUtilisateur desarchiver(TypeUtilisateur typeUtilisateur) {
    if (typeUtilisateur.getArchive() == null) {
    typeUtilisateur.setArchive(false);
    }
    typeUtilisateur.setArchive(false);
    typeUtilisateur.setDateArchivage(null);
    typeUtilisateurDao.save(typeUtilisateur);
    return typeUtilisateur;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(typeUtilisateurDao.findById(id).isPresent())  {
typeUtilisateurDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeUtilisateur update(TypeUtilisateur typeUtilisateur){
TypeUtilisateur foundedTypeUtilisateur = findById(typeUtilisateur.getId());
if(foundedTypeUtilisateur==null) return null;
else{
    archivableService.prepare(typeUtilisateur);
return  typeUtilisateurDao.save(typeUtilisateur);
}
}
private void prepareSave(TypeUtilisateur typeUtilisateur){
typeUtilisateur.setDateCreation(new Date());
if(typeUtilisateur.getArchive() == null)
  typeUtilisateur.setArchive(false);
if(typeUtilisateur.getAdmin() == null)
  typeUtilisateur.setAdmin(false);
if(typeUtilisateur.getVisible() == null)
  typeUtilisateur.setVisible(false);



}

@Override
public TypeUtilisateur save (TypeUtilisateur typeUtilisateur){
prepareSave(typeUtilisateur);

TypeUtilisateur result =null;
    TypeUtilisateur foundedTypeUtilisateur = findByCode(typeUtilisateur.getCode());
   if(foundedTypeUtilisateur == null){



TypeUtilisateur savedTypeUtilisateur = typeUtilisateurDao.save(typeUtilisateur);

result = savedTypeUtilisateur;
   }

return result;
}

@Override
public List<TypeUtilisateur> save(List<TypeUtilisateur> typeUtilisateurs){
List<TypeUtilisateur> list = new ArrayList<>();
for(TypeUtilisateur typeUtilisateur: typeUtilisateurs){
list.add(save(typeUtilisateur));
}
return list;
}



@Override
@Transactional
public int delete(TypeUtilisateur typeUtilisateur){
    if(typeUtilisateur.getCode()==null) return -1;

    TypeUtilisateur foundedTypeUtilisateur = findByCode(typeUtilisateur.getCode());
    if(foundedTypeUtilisateur==null) return -1;
typeUtilisateurDao.delete(foundedTypeUtilisateur);
return 1;
}


public List<TypeUtilisateur> findByCriteria(TypeUtilisateurVo typeUtilisateurVo){

String query = "SELECT o FROM TypeUtilisateur o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeUtilisateurVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",typeUtilisateurVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",typeUtilisateurVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",typeUtilisateurVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",typeUtilisateurVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",typeUtilisateurVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",typeUtilisateurVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",typeUtilisateurVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",typeUtilisateurVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",typeUtilisateurVo.getDateArchivageMin(),typeUtilisateurVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",typeUtilisateurVo.getDateCreationMin(),typeUtilisateurVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<TypeUtilisateur> typeUtilisateurs){
        if(ListUtil.isNotEmpty(typeUtilisateurs)){
        typeUtilisateurs.forEach(e->typeUtilisateurDao.delete(e));
        }
}
@Override
public void update(List<TypeUtilisateur> typeUtilisateurs){
if(ListUtil.isNotEmpty(typeUtilisateurs)){
typeUtilisateurs.forEach(e->typeUtilisateurDao.save(e));
}
}



}
