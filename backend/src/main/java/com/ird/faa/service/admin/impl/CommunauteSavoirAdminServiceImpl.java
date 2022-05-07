package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.dao.CommunauteSavoirDao;
import com.ird.faa.service.admin.facade.CommunauteSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CommunauteSavoirAdminServiceImpl extends AbstractServiceImpl<CommunauteSavoir> implements CommunauteSavoirAdminService {

@Autowired
private CommunauteSavoirDao communauteSavoirDao;

@Autowired
private ArchivableService<CommunauteSavoir> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<CommunauteSavoir> findAll(){
        String query = "SELECT o FROM CommunauteSavoir o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public CommunauteSavoir findByCode(String code){
    if( code==null) return null;
    return communauteSavoirDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return communauteSavoirDao.deleteByCode(code);
    }
    @Override
    public CommunauteSavoir findByIdOrCode(CommunauteSavoir communauteSavoir){
        CommunauteSavoir resultat=null;
        if(communauteSavoir != null){
            if(StringUtil.isNotEmpty(communauteSavoir.getId())){
            resultat= communauteSavoirDao.getOne(communauteSavoir.getId());
            }else if(StringUtil.isNotEmpty(communauteSavoir.getCode())) {
            resultat= communauteSavoirDao.findByCode(communauteSavoir.getCode());
            }
        }
    return resultat;
    }

@Override
public CommunauteSavoir findById(Long id){
if(id==null) return null;
return communauteSavoirDao.getOne(id);
}

@Override
public CommunauteSavoir findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public CommunauteSavoir archiver(CommunauteSavoir communauteSavoir) {
        if (communauteSavoir.getArchive() == null) {
        communauteSavoir.setArchive(false);
        }
        communauteSavoir.setArchive(true);
        communauteSavoir.setDateArchivage(new Date());
        communauteSavoirDao.save(communauteSavoir);
        return communauteSavoir;

    }

    @Override
    public CommunauteSavoir desarchiver(CommunauteSavoir communauteSavoir) {
    if (communauteSavoir.getArchive() == null) {
    communauteSavoir.setArchive(false);
    }
    communauteSavoir.setArchive(false);
    communauteSavoir.setDateArchivage(null);
    communauteSavoirDao.save(communauteSavoir);
    return communauteSavoir;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(communauteSavoirDao.findById(id).isPresent())  {
communauteSavoirDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CommunauteSavoir update(CommunauteSavoir communauteSavoir){
CommunauteSavoir foundedCommunauteSavoir = findById(communauteSavoir.getId());
if(foundedCommunauteSavoir==null) return null;
else{
    archivableService.prepare(communauteSavoir);
return  communauteSavoirDao.save(communauteSavoir);
}
}
private void prepareSave(CommunauteSavoir communauteSavoir){
communauteSavoir.setDateCreation(new Date());
if(communauteSavoir.getArchive() == null)
  communauteSavoir.setArchive(false);
if(communauteSavoir.getAdmin() == null)
  communauteSavoir.setAdmin(false);
if(communauteSavoir.getVisible() == null)
  communauteSavoir.setVisible(false);



}

@Override
public CommunauteSavoir save (CommunauteSavoir communauteSavoir){
prepareSave(communauteSavoir);

CommunauteSavoir result =null;
    CommunauteSavoir foundedCommunauteSavoir = findByCode(communauteSavoir.getCode());
   if(foundedCommunauteSavoir == null){



CommunauteSavoir savedCommunauteSavoir = communauteSavoirDao.save(communauteSavoir);

result = savedCommunauteSavoir;
   }

return result;
}

@Override
public List<CommunauteSavoir> save(List<CommunauteSavoir> communauteSavoirs){
List<CommunauteSavoir> list = new ArrayList<>();
for(CommunauteSavoir communauteSavoir: communauteSavoirs){
list.add(save(communauteSavoir));
}
return list;
}



@Override
@Transactional
public int delete(CommunauteSavoir communauteSavoir){
    if(communauteSavoir.getCode()==null) return -1;

    CommunauteSavoir foundedCommunauteSavoir = findByCode(communauteSavoir.getCode());
    if(foundedCommunauteSavoir==null) return -1;
communauteSavoirDao.delete(foundedCommunauteSavoir);
return 1;
}


public List<CommunauteSavoir> findByCriteria(CommunauteSavoirVo communauteSavoirVo){

String query = "SELECT o FROM CommunauteSavoir o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",communauteSavoirVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",communauteSavoirVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",communauteSavoirVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",communauteSavoirVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",communauteSavoirVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",communauteSavoirVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",communauteSavoirVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",communauteSavoirVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",communauteSavoirVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",communauteSavoirVo.getDateArchivageMin(),communauteSavoirVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",communauteSavoirVo.getDateCreationMin(),communauteSavoirVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<CommunauteSavoir> communauteSavoirs){
        if(ListUtil.isNotEmpty(communauteSavoirs)){
        communauteSavoirs.forEach(e->communauteSavoirDao.delete(e));
        }
}
@Override
public void update(List<CommunauteSavoir> communauteSavoirs){
if(ListUtil.isNotEmpty(communauteSavoirs)){
communauteSavoirs.forEach(e->communauteSavoirDao.save(e));
}
}



}
