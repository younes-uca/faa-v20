package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.StatusProjet;
import com.ird.faa.dao.StatusProjetDao;
import com.ird.faa.service.admin.facade.StatusProjetAdminService;

import com.ird.faa.ws.rest.provided.vo.StatusProjetVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class StatusProjetAdminServiceImpl extends AbstractServiceImpl<StatusProjet> implements StatusProjetAdminService {

@Autowired
private StatusProjetDao statusProjetDao;

@Autowired
private ArchivableService<StatusProjet> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<StatusProjet> findAll(){
        String query = "SELECT o FROM StatusProjet o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public StatusProjet findByCode(String code){
    if( code==null) return null;
    return statusProjetDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return statusProjetDao.deleteByCode(code);
    }
    @Override
    public StatusProjet findByIdOrCode(StatusProjet statusProjet){
        StatusProjet resultat=null;
        if(statusProjet != null){
            if(StringUtil.isNotEmpty(statusProjet.getId())){
            resultat= statusProjetDao.getOne(statusProjet.getId());
            }else if(StringUtil.isNotEmpty(statusProjet.getCode())) {
            resultat= statusProjetDao.findByCode(statusProjet.getCode());
            }
        }
    return resultat;
    }

@Override
public StatusProjet findById(Long id){
if(id==null) return null;
return statusProjetDao.getOne(id);
}

@Override
public StatusProjet findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public StatusProjet archiver(StatusProjet statusProjet) {
        if (statusProjet.getArchive() == null) {
        statusProjet.setArchive(false);
        }
        statusProjet.setArchive(true);
        statusProjet.setDateArchivage(new Date());
        statusProjetDao.save(statusProjet);
        return statusProjet;

    }

    @Override
    public StatusProjet desarchiver(StatusProjet statusProjet) {
    if (statusProjet.getArchive() == null) {
    statusProjet.setArchive(false);
    }
    statusProjet.setArchive(false);
    statusProjet.setDateArchivage(null);
    statusProjetDao.save(statusProjet);
    return statusProjet;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(statusProjetDao.findById(id).isPresent())  {
statusProjetDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public StatusProjet update(StatusProjet statusProjet){
StatusProjet foundedStatusProjet = findById(statusProjet.getId());
if(foundedStatusProjet==null) return null;
else{
    archivableService.prepare(statusProjet);
return  statusProjetDao.save(statusProjet);
}
}
private void prepareSave(StatusProjet statusProjet){
statusProjet.setDateCreation(new Date());
if(statusProjet.getArchive() == null)
  statusProjet.setArchive(false);
if(statusProjet.getAdmin() == null)
  statusProjet.setAdmin(false);
if(statusProjet.getVisible() == null)
  statusProjet.setVisible(false);



}

@Override
public StatusProjet save (StatusProjet statusProjet){
prepareSave(statusProjet);

StatusProjet result =null;
    StatusProjet foundedStatusProjet = findByCode(statusProjet.getCode());
   if(foundedStatusProjet == null){



StatusProjet savedStatusProjet = statusProjetDao.save(statusProjet);

result = savedStatusProjet;
   }

return result;
}

@Override
public List<StatusProjet> save(List<StatusProjet> statusProjets){
List<StatusProjet> list = new ArrayList<>();
for(StatusProjet statusProjet: statusProjets){
list.add(save(statusProjet));
}
return list;
}



@Override
@Transactional
public int delete(StatusProjet statusProjet){
    if(statusProjet.getCode()==null) return -1;

    StatusProjet foundedStatusProjet = findByCode(statusProjet.getCode());
    if(foundedStatusProjet==null) return -1;
statusProjetDao.delete(foundedStatusProjet);
return 1;
}


public List<StatusProjet> findByCriteria(StatusProjetVo statusProjetVo){

String query = "SELECT o FROM StatusProjet o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",statusProjetVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",statusProjetVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",statusProjetVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",statusProjetVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",statusProjetVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",statusProjetVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",statusProjetVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",statusProjetVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",statusProjetVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",statusProjetVo.getDateArchivageMin(),statusProjetVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",statusProjetVo.getDateCreationMin(),statusProjetVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<StatusProjet> statusProjets){
        if(ListUtil.isNotEmpty(statusProjets)){
        statusProjets.forEach(e->statusProjetDao.delete(e));
        }
}
@Override
public void update(List<StatusProjet> statusProjets){
if(ListUtil.isNotEmpty(statusProjets)){
statusProjets.forEach(e->statusProjetDao.save(e));
}
}



}
