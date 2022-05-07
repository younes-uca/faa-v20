package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ResponsabiliteEncadrementDoctorant;
import com.ird.faa.dao.ResponsabiliteEncadrementDoctorantDao;
import com.ird.faa.service.admin.facade.ResponsabiliteEncadrementDoctorantAdminService;

import com.ird.faa.ws.rest.provided.vo.ResponsabiliteEncadrementDoctorantVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ResponsabiliteEncadrementDoctorantAdminServiceImpl extends AbstractServiceImpl<ResponsabiliteEncadrementDoctorant> implements ResponsabiliteEncadrementDoctorantAdminService {

@Autowired
private ResponsabiliteEncadrementDoctorantDao responsabiliteEncadrementDoctorantDao;

@Autowired
private ArchivableService<ResponsabiliteEncadrementDoctorant> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<ResponsabiliteEncadrementDoctorant> findAll(){
        String query = "SELECT o FROM ResponsabiliteEncadrementDoctorant o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public ResponsabiliteEncadrementDoctorant findByCode(String code){
    if( code==null) return null;
    return responsabiliteEncadrementDoctorantDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return responsabiliteEncadrementDoctorantDao.deleteByCode(code);
    }
    @Override
    public ResponsabiliteEncadrementDoctorant findByIdOrCode(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
        ResponsabiliteEncadrementDoctorant resultat=null;
        if(responsabiliteEncadrementDoctorant != null){
            if(StringUtil.isNotEmpty(responsabiliteEncadrementDoctorant.getId())){
            resultat= responsabiliteEncadrementDoctorantDao.getOne(responsabiliteEncadrementDoctorant.getId());
            }else if(StringUtil.isNotEmpty(responsabiliteEncadrementDoctorant.getCode())) {
            resultat= responsabiliteEncadrementDoctorantDao.findByCode(responsabiliteEncadrementDoctorant.getCode());
            }
        }
    return resultat;
    }

@Override
public ResponsabiliteEncadrementDoctorant findById(Long id){
if(id==null) return null;
return responsabiliteEncadrementDoctorantDao.getOne(id);
}

@Override
public ResponsabiliteEncadrementDoctorant findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public ResponsabiliteEncadrementDoctorant archiver(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant) {
        if (responsabiliteEncadrementDoctorant.getArchive() == null) {
        responsabiliteEncadrementDoctorant.setArchive(false);
        }
        responsabiliteEncadrementDoctorant.setArchive(true);
        responsabiliteEncadrementDoctorant.setDateArchivage(new Date());
        responsabiliteEncadrementDoctorantDao.save(responsabiliteEncadrementDoctorant);
        return responsabiliteEncadrementDoctorant;

    }

    @Override
    public ResponsabiliteEncadrementDoctorant desarchiver(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant) {
    if (responsabiliteEncadrementDoctorant.getArchive() == null) {
    responsabiliteEncadrementDoctorant.setArchive(false);
    }
    responsabiliteEncadrementDoctorant.setArchive(false);
    responsabiliteEncadrementDoctorant.setDateArchivage(null);
    responsabiliteEncadrementDoctorantDao.save(responsabiliteEncadrementDoctorant);
    return responsabiliteEncadrementDoctorant;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(responsabiliteEncadrementDoctorantDao.findById(id).isPresent())  {
responsabiliteEncadrementDoctorantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ResponsabiliteEncadrementDoctorant update(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
ResponsabiliteEncadrementDoctorant foundedResponsabiliteEncadrementDoctorant = findById(responsabiliteEncadrementDoctorant.getId());
if(foundedResponsabiliteEncadrementDoctorant==null) return null;
else{
    archivableService.prepare(responsabiliteEncadrementDoctorant);
return  responsabiliteEncadrementDoctorantDao.save(responsabiliteEncadrementDoctorant);
}
}
private void prepareSave(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
responsabiliteEncadrementDoctorant.setDateCreation(new Date());
if(responsabiliteEncadrementDoctorant.getArchive() == null)
  responsabiliteEncadrementDoctorant.setArchive(false);
if(responsabiliteEncadrementDoctorant.getAdmin() == null)
  responsabiliteEncadrementDoctorant.setAdmin(false);
if(responsabiliteEncadrementDoctorant.getVisible() == null)
  responsabiliteEncadrementDoctorant.setVisible(false);



}

@Override
public ResponsabiliteEncadrementDoctorant save (ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
prepareSave(responsabiliteEncadrementDoctorant);

ResponsabiliteEncadrementDoctorant result =null;
    ResponsabiliteEncadrementDoctorant foundedResponsabiliteEncadrementDoctorant = findByCode(responsabiliteEncadrementDoctorant.getCode());
   if(foundedResponsabiliteEncadrementDoctorant == null){



ResponsabiliteEncadrementDoctorant savedResponsabiliteEncadrementDoctorant = responsabiliteEncadrementDoctorantDao.save(responsabiliteEncadrementDoctorant);

result = savedResponsabiliteEncadrementDoctorant;
   }

return result;
}

@Override
public List<ResponsabiliteEncadrementDoctorant> save(List<ResponsabiliteEncadrementDoctorant> responsabiliteEncadrementDoctorants){
List<ResponsabiliteEncadrementDoctorant> list = new ArrayList<>();
for(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant: responsabiliteEncadrementDoctorants){
list.add(save(responsabiliteEncadrementDoctorant));
}
return list;
}



@Override
@Transactional
public int delete(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant){
    if(responsabiliteEncadrementDoctorant.getCode()==null) return -1;

    ResponsabiliteEncadrementDoctorant foundedResponsabiliteEncadrementDoctorant = findByCode(responsabiliteEncadrementDoctorant.getCode());
    if(foundedResponsabiliteEncadrementDoctorant==null) return -1;
responsabiliteEncadrementDoctorantDao.delete(foundedResponsabiliteEncadrementDoctorant);
return 1;
}


public List<ResponsabiliteEncadrementDoctorant> findByCriteria(ResponsabiliteEncadrementDoctorantVo responsabiliteEncadrementDoctorantVo){

String query = "SELECT o FROM ResponsabiliteEncadrementDoctorant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",responsabiliteEncadrementDoctorantVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",responsabiliteEncadrementDoctorantVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",responsabiliteEncadrementDoctorantVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",responsabiliteEncadrementDoctorantVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",responsabiliteEncadrementDoctorantVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",responsabiliteEncadrementDoctorantVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",responsabiliteEncadrementDoctorantVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",responsabiliteEncadrementDoctorantVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",responsabiliteEncadrementDoctorantVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",responsabiliteEncadrementDoctorantVo.getDateArchivageMin(),responsabiliteEncadrementDoctorantVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",responsabiliteEncadrementDoctorantVo.getDateCreationMin(),responsabiliteEncadrementDoctorantVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<ResponsabiliteEncadrementDoctorant> responsabiliteEncadrementDoctorants){
        if(ListUtil.isNotEmpty(responsabiliteEncadrementDoctorants)){
        responsabiliteEncadrementDoctorants.forEach(e->responsabiliteEncadrementDoctorantDao.delete(e));
        }
}
@Override
public void update(List<ResponsabiliteEncadrementDoctorant> responsabiliteEncadrementDoctorants){
if(ListUtil.isNotEmpty(responsabiliteEncadrementDoctorants)){
responsabiliteEncadrementDoctorants.forEach(e->responsabiliteEncadrementDoctorantDao.save(e));
}
}



}
