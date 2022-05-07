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
import com.ird.faa.bean.ModaliteIntervention;
import com.ird.faa.dao.ModaliteInterventionDao;
import com.ird.faa.service.chercheur.facade.ModaliteInterventionChercheurService;

import com.ird.faa.ws.rest.provided.vo.ModaliteInterventionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ModaliteInterventionChercheurServiceImpl extends AbstractServiceImpl<ModaliteIntervention> implements ModaliteInterventionChercheurService {

@Autowired
private ModaliteInterventionDao modaliteInterventionDao;

@Autowired
private ArchivableService<ModaliteIntervention> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<ModaliteIntervention> findAll(){
    String query = "SELECT o FROM ModaliteIntervention o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public ModaliteIntervention findByCode(String code){
    if( code==null) return null;
    return modaliteInterventionDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return modaliteInterventionDao.deleteByCode(code);
    }
    @Override
    public ModaliteIntervention findByIdOrCode(ModaliteIntervention modaliteIntervention){
        ModaliteIntervention resultat=null;
        if(modaliteIntervention != null){
            if(StringUtil.isNotEmpty(modaliteIntervention.getId())){
            resultat= modaliteInterventionDao.getOne(modaliteIntervention.getId());
            }else if(StringUtil.isNotEmpty(modaliteIntervention.getCode())) {
            resultat= modaliteInterventionDao.findByCode(modaliteIntervention.getCode());
            }
        }
    return resultat;
    }

@Override
public ModaliteIntervention findById(Long id){
if(id==null) return null;
return modaliteInterventionDao.getOne(id);
}

@Override
public ModaliteIntervention findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(modaliteInterventionDao.findById(id).isPresent())  {
modaliteInterventionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ModaliteIntervention update(ModaliteIntervention modaliteIntervention){
ModaliteIntervention foundedModaliteIntervention = findById(modaliteIntervention.getId());
if(foundedModaliteIntervention==null) return null;
else{
    archivableService.prepare(modaliteIntervention);
return  modaliteInterventionDao.save(modaliteIntervention);
}
}
private void prepareSave(ModaliteIntervention modaliteIntervention){
modaliteIntervention.setDateCreation(new Date());
if(modaliteIntervention.getArchive() == null)
  modaliteIntervention.setArchive(false);
if(modaliteIntervention.getAdmin() == null)
  modaliteIntervention.setAdmin(false);
if(modaliteIntervention.getVisible() == null)
  modaliteIntervention.setVisible(false);



}

@Override
public ModaliteIntervention save (ModaliteIntervention modaliteIntervention){
prepareSave(modaliteIntervention);

ModaliteIntervention result =null;
    ModaliteIntervention foundedModaliteIntervention = findByCode(modaliteIntervention.getCode());
   if(foundedModaliteIntervention == null){



ModaliteIntervention savedModaliteIntervention = modaliteInterventionDao.save(modaliteIntervention);

result = savedModaliteIntervention;
   }

return result;
}

@Override
public List<ModaliteIntervention> save(List<ModaliteIntervention> modaliteInterventions){
List<ModaliteIntervention> list = new ArrayList<>();
for(ModaliteIntervention modaliteIntervention: modaliteInterventions){
list.add(save(modaliteIntervention));
}
return list;
}



@Override
@Transactional
public int delete(ModaliteIntervention modaliteIntervention){
    if(modaliteIntervention.getCode()==null) return -1;

    ModaliteIntervention foundedModaliteIntervention = findByCode(modaliteIntervention.getCode());
    if(foundedModaliteIntervention==null) return -1;
modaliteInterventionDao.delete(foundedModaliteIntervention);
return 1;
}


public List<ModaliteIntervention> findByCriteria(ModaliteInterventionVo modaliteInterventionVo){

String query = "SELECT o FROM ModaliteIntervention o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",modaliteInterventionVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",modaliteInterventionVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",modaliteInterventionVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",modaliteInterventionVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",modaliteInterventionVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",modaliteInterventionVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",modaliteInterventionVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",modaliteInterventionVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",modaliteInterventionVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",modaliteInterventionVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",modaliteInterventionVo.getDateArchivageMin(),modaliteInterventionVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",modaliteInterventionVo.getDateCreationMin(),modaliteInterventionVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<ModaliteIntervention> modaliteInterventions){
        if(ListUtil.isNotEmpty(modaliteInterventions)){
        modaliteInterventions.forEach(e->modaliteInterventionDao.delete(e));
        }
}
@Override
public void update(List<ModaliteIntervention> modaliteInterventions){
if(ListUtil.isNotEmpty(modaliteInterventions)){
modaliteInterventions.forEach(e->modaliteInterventionDao.save(e));
}
}



}
