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
import com.ird.faa.bean.StatusCursus;
import com.ird.faa.dao.StatusCursusDao;
import com.ird.faa.service.chercheur.facade.StatusCursusChercheurService;

import com.ird.faa.ws.rest.provided.vo.StatusCursusVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class StatusCursusChercheurServiceImpl extends AbstractServiceImpl<StatusCursus> implements StatusCursusChercheurService {

@Autowired
private StatusCursusDao statusCursusDao;

@Autowired
private ArchivableService<StatusCursus> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<StatusCursus> findAll(){
    String query = "SELECT o FROM StatusCursus o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public StatusCursus findByCode(String code){
    if( code==null) return null;
    return statusCursusDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return statusCursusDao.deleteByCode(code);
    }
    @Override
    public StatusCursus findByIdOrCode(StatusCursus statusCursus){
        StatusCursus resultat=null;
        if(statusCursus != null){
            if(StringUtil.isNotEmpty(statusCursus.getId())){
            resultat= statusCursusDao.getOne(statusCursus.getId());
            }else if(StringUtil.isNotEmpty(statusCursus.getCode())) {
            resultat= statusCursusDao.findByCode(statusCursus.getCode());
            }
        }
    return resultat;
    }

@Override
public StatusCursus findById(Long id){
if(id==null) return null;
return statusCursusDao.getOne(id);
}

@Override
public StatusCursus findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(statusCursusDao.findById(id).isPresent())  {
statusCursusDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public StatusCursus update(StatusCursus statusCursus){
StatusCursus foundedStatusCursus = findById(statusCursus.getId());
if(foundedStatusCursus==null) return null;
else{
    archivableService.prepare(statusCursus);
return  statusCursusDao.save(statusCursus);
}
}
private void prepareSave(StatusCursus statusCursus){
statusCursus.setDateCreation(new Date());
if(statusCursus.getArchive() == null)
  statusCursus.setArchive(false);
if(statusCursus.getAdmin() == null)
  statusCursus.setAdmin(false);
if(statusCursus.getVisible() == null)
  statusCursus.setVisible(false);



}

@Override
public StatusCursus save (StatusCursus statusCursus){
prepareSave(statusCursus);

StatusCursus result =null;
    StatusCursus foundedStatusCursus = findByCode(statusCursus.getCode());
   if(foundedStatusCursus == null){



StatusCursus savedStatusCursus = statusCursusDao.save(statusCursus);

result = savedStatusCursus;
   }

return result;
}

@Override
public List<StatusCursus> save(List<StatusCursus> statusCursuss){
List<StatusCursus> list = new ArrayList<>();
for(StatusCursus statusCursus: statusCursuss){
list.add(save(statusCursus));
}
return list;
}



@Override
@Transactional
public int delete(StatusCursus statusCursus){
    if(statusCursus.getCode()==null) return -1;

    StatusCursus foundedStatusCursus = findByCode(statusCursus.getCode());
    if(foundedStatusCursus==null) return -1;
statusCursusDao.delete(foundedStatusCursus);
return 1;
}


public List<StatusCursus> findByCriteria(StatusCursusVo statusCursusVo){

String query = "SELECT o FROM StatusCursus o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",statusCursusVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",statusCursusVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",statusCursusVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",statusCursusVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",statusCursusVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",statusCursusVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",statusCursusVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",statusCursusVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",statusCursusVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",statusCursusVo.getDateArchivageMin(),statusCursusVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",statusCursusVo.getDateCreationMin(),statusCursusVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<StatusCursus> statusCursuss){
        if(ListUtil.isNotEmpty(statusCursuss)){
        statusCursuss.forEach(e->statusCursusDao.delete(e));
        }
}
@Override
public void update(List<StatusCursus> statusCursuss){
if(ListUtil.isNotEmpty(statusCursuss)){
statusCursuss.forEach(e->statusCursusDao.save(e));
}
}



}
