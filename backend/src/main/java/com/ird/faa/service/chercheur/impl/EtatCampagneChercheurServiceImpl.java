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
import com.ird.faa.bean.EtatCampagne;
import com.ird.faa.dao.EtatCampagneDao;
import com.ird.faa.service.chercheur.facade.EtatCampagneChercheurService;

import com.ird.faa.ws.rest.provided.vo.EtatCampagneVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtatCampagneChercheurServiceImpl extends AbstractServiceImpl<EtatCampagne> implements EtatCampagneChercheurService {

@Autowired
private EtatCampagneDao etatCampagneDao;

@Autowired
private ArchivableService<EtatCampagne> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<EtatCampagne> findAll(){
    String query = "SELECT o FROM EtatCampagne o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.ordre";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public EtatCampagne findByCode(String code){
    if( code==null) return null;
    return etatCampagneDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return etatCampagneDao.deleteByCode(code);
    }
    @Override
    public EtatCampagne findByIdOrCode(EtatCampagne etatCampagne){
        EtatCampagne resultat=null;
        if(etatCampagne != null){
            if(StringUtil.isNotEmpty(etatCampagne.getId())){
            resultat= etatCampagneDao.getOne(etatCampagne.getId());
            }else if(StringUtil.isNotEmpty(etatCampagne.getCode())) {
            resultat= etatCampagneDao.findByCode(etatCampagne.getCode());
            }
        }
    return resultat;
    }

@Override
public EtatCampagne findById(Long id){
if(id==null) return null;
return etatCampagneDao.getOne(id);
}

@Override
public EtatCampagne findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etatCampagneDao.findById(id).isPresent())  {
etatCampagneDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtatCampagne update(EtatCampagne etatCampagne){
EtatCampagne foundedEtatCampagne = findById(etatCampagne.getId());
if(foundedEtatCampagne==null) return null;
else{
    archivableService.prepare(etatCampagne);
return  etatCampagneDao.save(etatCampagne);
}
}
private void prepareSave(EtatCampagne etatCampagne){
etatCampagne.setDateCreation(new Date());
if(etatCampagne.getArchive() == null)
  etatCampagne.setArchive(false);
if(etatCampagne.getAdmin() == null)
  etatCampagne.setAdmin(false);
if(etatCampagne.getVisible() == null)
  etatCampagne.setVisible(false);

    etatCampagne.setAdmin(false);
    etatCampagne.setVisible(false);
    User currentUser = SecurityUtil.getCurrentUser();
    if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
        etatCampagne.setChercheur(currentUser);
    }


}

@Override
public EtatCampagne save (EtatCampagne etatCampagne){
prepareSave(etatCampagne);

EtatCampagne result =null;
    EtatCampagne foundedEtatCampagne = findByCode(etatCampagne.getCode());
   if(foundedEtatCampagne == null){



EtatCampagne savedEtatCampagne = etatCampagneDao.save(etatCampagne);

result = savedEtatCampagne;
   }

return result;
}

@Override
public List<EtatCampagne> save(List<EtatCampagne> etatCampagnes){
List<EtatCampagne> list = new ArrayList<>();
for(EtatCampagne etatCampagne: etatCampagnes){
list.add(save(etatCampagne));
}
return list;
}



@Override
@Transactional
public int delete(EtatCampagne etatCampagne){
    if(etatCampagne.getCode()==null) return -1;

    EtatCampagne foundedEtatCampagne = findByCode(etatCampagne.getCode());
    if(foundedEtatCampagne==null) return -1;
etatCampagneDao.delete(foundedEtatCampagne);
return 1;
}


public List<EtatCampagne> findByCriteria(EtatCampagneVo etatCampagneVo){

String query = "SELECT o FROM EtatCampagne o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etatCampagneVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",etatCampagneVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",etatCampagneVo.getCode());
            query += SearchUtil.addConstraint( "o", "ordre","=",etatCampagneVo.getOrdre());
            query += SearchUtil.addConstraint( "o", "archive","=",etatCampagneVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",etatCampagneVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",etatCampagneVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",etatCampagneVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",etatCampagneVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",etatCampagneVo.getUsername());
            query += SearchUtil.addConstraintMinMax("o","ordre",etatCampagneVo.getOrdreMin(),etatCampagneVo.getOrdreMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",etatCampagneVo.getDateArchivageMin(),etatCampagneVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",etatCampagneVo.getDateCreationMin(),etatCampagneVo.getDateCreationMax());
query+= " ORDER BY o.ordre";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<EtatCampagne> etatCampagnes){
        if(ListUtil.isNotEmpty(etatCampagnes)){
        etatCampagnes.forEach(e->etatCampagneDao.delete(e));
        }
}
@Override
public void update(List<EtatCampagne> etatCampagnes){
if(ListUtil.isNotEmpty(etatCampagnes)){
etatCampagnes.forEach(e->etatCampagneDao.save(e));
}
}



}
