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
import com.ird.faa.bean.NatureEtude;
import com.ird.faa.dao.NatureEtudeDao;
import com.ird.faa.service.chercheur.facade.NatureEtudeChercheurService;

import com.ird.faa.ws.rest.provided.vo.NatureEtudeVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NatureEtudeChercheurServiceImpl extends AbstractServiceImpl<NatureEtude> implements NatureEtudeChercheurService {

@Autowired
private NatureEtudeDao natureEtudeDao;

@Autowired
private ArchivableService<NatureEtude> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NatureEtude> findAll(){
    String query = "SELECT o FROM NatureEtude o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public NatureEtude findByCode(String code){
    if( code==null) return null;
    return natureEtudeDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return natureEtudeDao.deleteByCode(code);
    }
    @Override
    public NatureEtude findByIdOrCode(NatureEtude natureEtude){
        NatureEtude resultat=null;
        if(natureEtude != null){
            if(StringUtil.isNotEmpty(natureEtude.getId())){
            resultat= natureEtudeDao.getOne(natureEtude.getId());
            }else if(StringUtil.isNotEmpty(natureEtude.getCode())) {
            resultat= natureEtudeDao.findByCode(natureEtude.getCode());
            }
        }
    return resultat;
    }

@Override
public NatureEtude findById(Long id){
if(id==null) return null;
return natureEtudeDao.getOne(id);
}

@Override
public NatureEtude findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(natureEtudeDao.findById(id).isPresent())  {
natureEtudeDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NatureEtude update(NatureEtude natureEtude){
NatureEtude foundedNatureEtude = findById(natureEtude.getId());
if(foundedNatureEtude==null) return null;
else{
    archivableService.prepare(natureEtude);
return  natureEtudeDao.save(natureEtude);
}
}
private void prepareSave(NatureEtude natureEtude){
natureEtude.setDateCreation(new Date());
if(natureEtude.getArchive() == null)
  natureEtude.setArchive(false);
if(natureEtude.getAdmin() == null)
  natureEtude.setAdmin(false);
if(natureEtude.getVisible() == null)
  natureEtude.setVisible(false);



}

@Override
public NatureEtude save (NatureEtude natureEtude){
prepareSave(natureEtude);

NatureEtude result =null;
    NatureEtude foundedNatureEtude = findByCode(natureEtude.getCode());
   if(foundedNatureEtude == null){



NatureEtude savedNatureEtude = natureEtudeDao.save(natureEtude);

result = savedNatureEtude;
   }

return result;
}

@Override
public List<NatureEtude> save(List<NatureEtude> natureEtudes){
List<NatureEtude> list = new ArrayList<>();
for(NatureEtude natureEtude: natureEtudes){
list.add(save(natureEtude));
}
return list;
}



@Override
@Transactional
public int delete(NatureEtude natureEtude){
    if(natureEtude.getCode()==null) return -1;

    NatureEtude foundedNatureEtude = findByCode(natureEtude.getCode());
    if(foundedNatureEtude==null) return -1;
natureEtudeDao.delete(foundedNatureEtude);
return 1;
}


public List<NatureEtude> findByCriteria(NatureEtudeVo natureEtudeVo){

String query = "SELECT o FROM NatureEtude o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",natureEtudeVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",natureEtudeVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",natureEtudeVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",natureEtudeVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",natureEtudeVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",natureEtudeVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",natureEtudeVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",natureEtudeVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",natureEtudeVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",natureEtudeVo.getDateArchivageMin(),natureEtudeVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",natureEtudeVo.getDateCreationMin(),natureEtudeVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NatureEtude> natureEtudes){
        if(ListUtil.isNotEmpty(natureEtudes)){
        natureEtudes.forEach(e->natureEtudeDao.delete(e));
        }
}
@Override
public void update(List<NatureEtude> natureEtudes){
if(ListUtil.isNotEmpty(natureEtudes)){
natureEtudes.forEach(e->natureEtudeDao.save(e));
}
}



}
