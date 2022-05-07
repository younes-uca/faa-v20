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
import com.ird.faa.bean.ModaliteFormationContinue;
import com.ird.faa.dao.ModaliteFormationContinueDao;
import com.ird.faa.service.chercheur.facade.ModaliteFormationContinueChercheurService;

import com.ird.faa.ws.rest.provided.vo.ModaliteFormationContinueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ModaliteFormationContinueChercheurServiceImpl extends AbstractServiceImpl<ModaliteFormationContinue> implements ModaliteFormationContinueChercheurService {

@Autowired
private ModaliteFormationContinueDao modaliteFormationContinueDao;

@Autowired
private ArchivableService<ModaliteFormationContinue> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<ModaliteFormationContinue> findAll(){
    String query = "SELECT o FROM ModaliteFormationContinue o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public ModaliteFormationContinue findByCode(String code){
    if( code==null) return null;
    return modaliteFormationContinueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return modaliteFormationContinueDao.deleteByCode(code);
    }
    @Override
    public ModaliteFormationContinue findByIdOrCode(ModaliteFormationContinue modaliteFormationContinue){
        ModaliteFormationContinue resultat=null;
        if(modaliteFormationContinue != null){
            if(StringUtil.isNotEmpty(modaliteFormationContinue.getId())){
            resultat= modaliteFormationContinueDao.getOne(modaliteFormationContinue.getId());
            }else if(StringUtil.isNotEmpty(modaliteFormationContinue.getCode())) {
            resultat= modaliteFormationContinueDao.findByCode(modaliteFormationContinue.getCode());
            }
        }
    return resultat;
    }

@Override
public ModaliteFormationContinue findById(Long id){
if(id==null) return null;
return modaliteFormationContinueDao.getOne(id);
}

@Override
public ModaliteFormationContinue findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(modaliteFormationContinueDao.findById(id).isPresent())  {
modaliteFormationContinueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ModaliteFormationContinue update(ModaliteFormationContinue modaliteFormationContinue){
ModaliteFormationContinue foundedModaliteFormationContinue = findById(modaliteFormationContinue.getId());
if(foundedModaliteFormationContinue==null) return null;
else{
    archivableService.prepare(modaliteFormationContinue);
return  modaliteFormationContinueDao.save(modaliteFormationContinue);
}
}
private void prepareSave(ModaliteFormationContinue modaliteFormationContinue){
modaliteFormationContinue.setDateCreation(new Date());
if(modaliteFormationContinue.getArchive() == null)
  modaliteFormationContinue.setArchive(false);
if(modaliteFormationContinue.getAdmin() == null)
  modaliteFormationContinue.setAdmin(false);
if(modaliteFormationContinue.getVisible() == null)
  modaliteFormationContinue.setVisible(false);



}

@Override
public ModaliteFormationContinue save (ModaliteFormationContinue modaliteFormationContinue){
prepareSave(modaliteFormationContinue);

ModaliteFormationContinue result =null;
    ModaliteFormationContinue foundedModaliteFormationContinue = findByCode(modaliteFormationContinue.getCode());
   if(foundedModaliteFormationContinue == null){



ModaliteFormationContinue savedModaliteFormationContinue = modaliteFormationContinueDao.save(modaliteFormationContinue);

result = savedModaliteFormationContinue;
   }

return result;
}

@Override
public List<ModaliteFormationContinue> save(List<ModaliteFormationContinue> modaliteFormationContinues){
List<ModaliteFormationContinue> list = new ArrayList<>();
for(ModaliteFormationContinue modaliteFormationContinue: modaliteFormationContinues){
list.add(save(modaliteFormationContinue));
}
return list;
}



@Override
@Transactional
public int delete(ModaliteFormationContinue modaliteFormationContinue){
    if(modaliteFormationContinue.getCode()==null) return -1;

    ModaliteFormationContinue foundedModaliteFormationContinue = findByCode(modaliteFormationContinue.getCode());
    if(foundedModaliteFormationContinue==null) return -1;
modaliteFormationContinueDao.delete(foundedModaliteFormationContinue);
return 1;
}


public List<ModaliteFormationContinue> findByCriteria(ModaliteFormationContinueVo modaliteFormationContinueVo){

String query = "SELECT o FROM ModaliteFormationContinue o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",modaliteFormationContinueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",modaliteFormationContinueVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",modaliteFormationContinueVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",modaliteFormationContinueVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",modaliteFormationContinueVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",modaliteFormationContinueVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",modaliteFormationContinueVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",modaliteFormationContinueVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",modaliteFormationContinueVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",modaliteFormationContinueVo.getDateArchivageMin(),modaliteFormationContinueVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",modaliteFormationContinueVo.getDateCreationMin(),modaliteFormationContinueVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<ModaliteFormationContinue> modaliteFormationContinues){
        if(ListUtil.isNotEmpty(modaliteFormationContinues)){
        modaliteFormationContinues.forEach(e->modaliteFormationContinueDao.delete(e));
        }
}
@Override
public void update(List<ModaliteFormationContinue> modaliteFormationContinues){
if(ListUtil.isNotEmpty(modaliteFormationContinues)){
modaliteFormationContinues.forEach(e->modaliteFormationContinueDao.save(e));
}
}



}
