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
import com.ird.faa.bean.Nationalite;
import com.ird.faa.dao.NationaliteDao;
import com.ird.faa.service.chercheur.facade.NationaliteChercheurService;

import com.ird.faa.ws.rest.provided.vo.NationaliteVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NationaliteChercheurServiceImpl extends AbstractServiceImpl<Nationalite> implements NationaliteChercheurService {

@Autowired
private NationaliteDao nationaliteDao;

@Autowired
private ArchivableService<Nationalite> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Nationalite> findAll(){
    String query = "SELECT o FROM Nationalite o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public Nationalite findByCode(String code){
    if( code==null) return null;
    return nationaliteDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return nationaliteDao.deleteByCode(code);
    }
    @Override
    public Nationalite findByIdOrCode(Nationalite nationalite){
        Nationalite resultat=null;
        if(nationalite != null){
            if(StringUtil.isNotEmpty(nationalite.getId())){
            resultat= nationaliteDao.getOne(nationalite.getId());
            }else if(StringUtil.isNotEmpty(nationalite.getCode())) {
            resultat= nationaliteDao.findByCode(nationalite.getCode());
            }
        }
    return resultat;
    }

@Override
public Nationalite findById(Long id){
if(id==null) return null;
return nationaliteDao.getOne(id);
}

@Override
public Nationalite findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(nationaliteDao.findById(id).isPresent())  {
nationaliteDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Nationalite update(Nationalite nationalite){
Nationalite foundedNationalite = findById(nationalite.getId());
if(foundedNationalite==null) return null;
else{
    archivableService.prepare(nationalite);
return  nationaliteDao.save(nationalite);
}
}
private void prepareSave(Nationalite nationalite){
nationalite.setDateCreation(new Date());
if(nationalite.getArchive() == null)
  nationalite.setArchive(false);
if(nationalite.getAdmin() == null)
  nationalite.setAdmin(false);
if(nationalite.getVisible() == null)
  nationalite.setVisible(false);



}

@Override
public Nationalite save (Nationalite nationalite){
prepareSave(nationalite);

Nationalite result =null;
    Nationalite foundedNationalite = findByCode(nationalite.getCode());
   if(foundedNationalite == null){



Nationalite savedNationalite = nationaliteDao.save(nationalite);

result = savedNationalite;
   }

return result;
}

@Override
public List<Nationalite> save(List<Nationalite> nationalites){
List<Nationalite> list = new ArrayList<>();
for(Nationalite nationalite: nationalites){
list.add(save(nationalite));
}
return list;
}



@Override
@Transactional
public int delete(Nationalite nationalite){
    if(nationalite.getCode()==null) return -1;

    Nationalite foundedNationalite = findByCode(nationalite.getCode());
    if(foundedNationalite==null) return -1;
nationaliteDao.delete(foundedNationalite);
return 1;
}


public List<Nationalite> findByCriteria(NationaliteVo nationaliteVo){

String query = "SELECT o FROM Nationalite o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",nationaliteVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",nationaliteVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",nationaliteVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",nationaliteVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",nationaliteVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",nationaliteVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",nationaliteVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",nationaliteVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",nationaliteVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",nationaliteVo.getDateArchivageMin(),nationaliteVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",nationaliteVo.getDateCreationMin(),nationaliteVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Nationalite> nationalites){
        if(ListUtil.isNotEmpty(nationalites)){
        nationalites.forEach(e->nationaliteDao.delete(e));
        }
}
@Override
public void update(List<Nationalite> nationalites){
if(ListUtil.isNotEmpty(nationalites)){
nationalites.forEach(e->nationaliteDao.save(e));
}
}



}
