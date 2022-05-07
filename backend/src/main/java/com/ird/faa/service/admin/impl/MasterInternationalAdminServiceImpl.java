package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.MasterInternational;
import com.ird.faa.dao.MasterInternationalDao;
import com.ird.faa.service.admin.facade.MasterInternationalAdminService;

import com.ird.faa.ws.rest.provided.vo.MasterInternationalVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class MasterInternationalAdminServiceImpl extends AbstractServiceImpl<MasterInternational> implements MasterInternationalAdminService {

@Autowired
private MasterInternationalDao masterInternationalDao;

@Autowired
private ArchivableService<MasterInternational> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<MasterInternational> findAll(){
        String query = "SELECT o FROM MasterInternational o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public MasterInternational findByCode(String code){
    if( code==null) return null;
    return masterInternationalDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return masterInternationalDao.deleteByCode(code);
    }
    @Override
    public MasterInternational findByIdOrCode(MasterInternational masterInternational){
        MasterInternational resultat=null;
        if(masterInternational != null){
            if(StringUtil.isNotEmpty(masterInternational.getId())){
            resultat= masterInternationalDao.getOne(masterInternational.getId());
            }else if(StringUtil.isNotEmpty(masterInternational.getCode())) {
            resultat= masterInternationalDao.findByCode(masterInternational.getCode());
            }
        }
    return resultat;
    }

@Override
public MasterInternational findById(Long id){
if(id==null) return null;
return masterInternationalDao.getOne(id);
}

@Override
public MasterInternational findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public MasterInternational archiver(MasterInternational masterInternational) {
        if (masterInternational.getArchive() == null) {
        masterInternational.setArchive(false);
        }
        masterInternational.setArchive(true);
        masterInternational.setDateArchivage(new Date());
        masterInternationalDao.save(masterInternational);
        return masterInternational;

    }

    @Override
    public MasterInternational desarchiver(MasterInternational masterInternational) {
    if (masterInternational.getArchive() == null) {
    masterInternational.setArchive(false);
    }
    masterInternational.setArchive(false);
    masterInternational.setDateArchivage(null);
    masterInternationalDao.save(masterInternational);
    return masterInternational;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(masterInternationalDao.findById(id).isPresent())  {
masterInternationalDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public MasterInternational update(MasterInternational masterInternational){
MasterInternational foundedMasterInternational = findById(masterInternational.getId());
if(foundedMasterInternational==null) return null;
else{
    archivableService.prepare(masterInternational);
return  masterInternationalDao.save(masterInternational);
}
}
private void prepareSave(MasterInternational masterInternational){
masterInternational.setDateCreation(new Date());
if(masterInternational.getArchive() == null)
  masterInternational.setArchive(false);
if(masterInternational.getAdmin() == null)
  masterInternational.setAdmin(false);
if(masterInternational.getVisible() == null)
  masterInternational.setVisible(false);



}

@Override
public MasterInternational save (MasterInternational masterInternational){
prepareSave(masterInternational);

MasterInternational result =null;
    MasterInternational foundedMasterInternational = findByCode(masterInternational.getCode());
   if(foundedMasterInternational == null){



MasterInternational savedMasterInternational = masterInternationalDao.save(masterInternational);

result = savedMasterInternational;
   }

return result;
}

@Override
public List<MasterInternational> save(List<MasterInternational> masterInternationals){
List<MasterInternational> list = new ArrayList<>();
for(MasterInternational masterInternational: masterInternationals){
list.add(save(masterInternational));
}
return list;
}



@Override
@Transactional
public int delete(MasterInternational masterInternational){
    if(masterInternational.getCode()==null) return -1;

    MasterInternational foundedMasterInternational = findByCode(masterInternational.getCode());
    if(foundedMasterInternational==null) return -1;
masterInternationalDao.delete(foundedMasterInternational);
return 1;
}


public List<MasterInternational> findByCriteria(MasterInternationalVo masterInternationalVo){

String query = "SELECT o FROM MasterInternational o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",masterInternationalVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",masterInternationalVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",masterInternationalVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",masterInternationalVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",masterInternationalVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",masterInternationalVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",masterInternationalVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",masterInternationalVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",masterInternationalVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",masterInternationalVo.getDateArchivageMin(),masterInternationalVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",masterInternationalVo.getDateCreationMin(),masterInternationalVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<MasterInternational> masterInternationals){
        if(ListUtil.isNotEmpty(masterInternationals)){
        masterInternationals.forEach(e->masterInternationalDao.delete(e));
        }
}
@Override
public void update(List<MasterInternational> masterInternationals){
if(ListUtil.isNotEmpty(masterInternationals)){
masterInternationals.forEach(e->masterInternationalDao.save(e));
}
}



}
