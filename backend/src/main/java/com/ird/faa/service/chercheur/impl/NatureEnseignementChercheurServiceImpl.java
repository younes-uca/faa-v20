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
import com.ird.faa.bean.NatureEnseignement;
import com.ird.faa.dao.NatureEnseignementDao;
import com.ird.faa.service.chercheur.facade.NatureEnseignementChercheurService;

import com.ird.faa.ws.rest.provided.vo.NatureEnseignementVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NatureEnseignementChercheurServiceImpl extends AbstractServiceImpl<NatureEnseignement> implements NatureEnseignementChercheurService {

@Autowired
private NatureEnseignementDao natureEnseignementDao;

@Autowired
private ArchivableService<NatureEnseignement> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<NatureEnseignement> findAll(){
    String query = "SELECT o FROM NatureEnseignement o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public NatureEnseignement findByCode(String code){
    if( code==null) return null;
    return natureEnseignementDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return natureEnseignementDao.deleteByCode(code);
    }
    @Override
    public NatureEnseignement findByIdOrCode(NatureEnseignement natureEnseignement){
        NatureEnseignement resultat=null;
        if(natureEnseignement != null){
            if(StringUtil.isNotEmpty(natureEnseignement.getId())){
            resultat= natureEnseignementDao.getOne(natureEnseignement.getId());
            }else if(StringUtil.isNotEmpty(natureEnseignement.getCode())) {
            resultat= natureEnseignementDao.findByCode(natureEnseignement.getCode());
            }
        }
    return resultat;
    }

@Override
public NatureEnseignement findById(Long id){
if(id==null) return null;
return natureEnseignementDao.getOne(id);
}

@Override
public NatureEnseignement findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(natureEnseignementDao.findById(id).isPresent())  {
natureEnseignementDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public NatureEnseignement update(NatureEnseignement natureEnseignement){
NatureEnseignement foundedNatureEnseignement = findById(natureEnseignement.getId());
if(foundedNatureEnseignement==null) return null;
else{
    archivableService.prepare(natureEnseignement);
return  natureEnseignementDao.save(natureEnseignement);
}
}
private void prepareSave(NatureEnseignement natureEnseignement){
natureEnseignement.setDateCreation(new Date());
if(natureEnseignement.getArchive() == null)
  natureEnseignement.setArchive(false);
if(natureEnseignement.getAdmin() == null)
  natureEnseignement.setAdmin(false);
if(natureEnseignement.getVisible() == null)
  natureEnseignement.setVisible(false);



}

@Override
public NatureEnseignement save (NatureEnseignement natureEnseignement){
prepareSave(natureEnseignement);

NatureEnseignement result =null;
    NatureEnseignement foundedNatureEnseignement = findByCode(natureEnseignement.getCode());
   if(foundedNatureEnseignement == null){



NatureEnseignement savedNatureEnseignement = natureEnseignementDao.save(natureEnseignement);

result = savedNatureEnseignement;
   }

return result;
}

@Override
public List<NatureEnseignement> save(List<NatureEnseignement> natureEnseignements){
List<NatureEnseignement> list = new ArrayList<>();
for(NatureEnseignement natureEnseignement: natureEnseignements){
list.add(save(natureEnseignement));
}
return list;
}



@Override
@Transactional
public int delete(NatureEnseignement natureEnseignement){
    if(natureEnseignement.getCode()==null) return -1;

    NatureEnseignement foundedNatureEnseignement = findByCode(natureEnseignement.getCode());
    if(foundedNatureEnseignement==null) return -1;
natureEnseignementDao.delete(foundedNatureEnseignement);
return 1;
}


public List<NatureEnseignement> findByCriteria(NatureEnseignementVo natureEnseignementVo){

String query = "SELECT o FROM NatureEnseignement o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",natureEnseignementVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",natureEnseignementVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",natureEnseignementVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",natureEnseignementVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",natureEnseignementVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",natureEnseignementVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",natureEnseignementVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",natureEnseignementVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",natureEnseignementVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",natureEnseignementVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",natureEnseignementVo.getDateArchivageMin(),natureEnseignementVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",natureEnseignementVo.getDateCreationMin(),natureEnseignementVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<NatureEnseignement> natureEnseignements){
        if(ListUtil.isNotEmpty(natureEnseignements)){
        natureEnseignements.forEach(e->natureEnseignementDao.delete(e));
        }
}
@Override
public void update(List<NatureEnseignement> natureEnseignements){
if(ListUtil.isNotEmpty(natureEnseignements)){
natureEnseignements.forEach(e->natureEnseignementDao.save(e));
}
}



}
