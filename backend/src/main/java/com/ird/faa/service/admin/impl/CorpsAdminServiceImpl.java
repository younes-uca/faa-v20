package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Corps;
import com.ird.faa.dao.CorpsDao;
import com.ird.faa.service.admin.facade.CorpsAdminService;

import com.ird.faa.ws.rest.provided.vo.CorpsVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CorpsAdminServiceImpl extends AbstractServiceImpl<Corps> implements CorpsAdminService {

@Autowired
private CorpsDao corpsDao;

@Autowired
private ArchivableService<Corps> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Corps> findAll(){
        String query = "SELECT o FROM Corps o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public Corps findByCode(String code){
    if( code==null) return null;
    return corpsDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return corpsDao.deleteByCode(code);
    }
    @Override
    public Corps findByIdOrCode(Corps corps){
        Corps resultat=null;
        if(corps != null){
            if(StringUtil.isNotEmpty(corps.getId())){
            resultat= corpsDao.getOne(corps.getId());
            }else if(StringUtil.isNotEmpty(corps.getCode())) {
            resultat= corpsDao.findByCode(corps.getCode());
            }
        }
    return resultat;
    }

@Override
public Corps findById(Long id){
if(id==null) return null;
return corpsDao.getOne(id);
}

@Override
public Corps findByIdWithAssociatedList(Long id){
return findById(id);
}
     @Override
    public Corps archiver(Corps corps) {
        if (corps.getArchive() == null) {
        corps.setArchive(false);
        }
        corps.setArchive(true);
        corps.setDateArchivage(new Date());
        corpsDao.save(corps);
        return corps;

    }

    @Override
    public Corps desarchiver(Corps corps) {
    if (corps.getArchive() == null) {
    corps.setArchive(false);
    }
    corps.setArchive(false);
    corps.setDateArchivage(null);
    corpsDao.save(corps);
    return corps;
    }



@Transactional
public int deleteById(Long id){
int res=0;
if(corpsDao.findById(id).isPresent())  {
corpsDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Corps update(Corps corps){
Corps foundedCorps = findById(corps.getId());
if(foundedCorps==null) return null;
else{
    archivableService.prepare(corps);
return  corpsDao.save(corps);
}
}
private void prepareSave(Corps corps){
corps.setDateCreation(new Date());
if(corps.getArchive() == null)
  corps.setArchive(false);
if(corps.getAdmin() == null)
  corps.setAdmin(false);
if(corps.getVisible() == null)
  corps.setVisible(false);



}

@Override
public Corps save (Corps corps){
prepareSave(corps);

Corps result =null;
    Corps foundedCorps = findByCode(corps.getCode());
   if(foundedCorps == null){



Corps savedCorps = corpsDao.save(corps);

result = savedCorps;
   }

return result;
}

@Override
public List<Corps> save(List<Corps> corpss){
List<Corps> list = new ArrayList<>();
for(Corps corps: corpss){
list.add(save(corps));
}
return list;
}



@Override
@Transactional
public int delete(Corps corps){
    if(corps.getCode()==null) return -1;

    Corps foundedCorps = findByCode(corps.getCode());
    if(foundedCorps==null) return -1;
corpsDao.delete(foundedCorps);
return 1;
}


public List<Corps> findByCriteria(CorpsVo corpsVo){

String query = "SELECT o FROM Corps o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",corpsVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",corpsVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",corpsVo.getCode());
            query += SearchUtil.addConstraint( "o", "description","LIKE",corpsVo.getDescription());
            query += SearchUtil.addConstraint( "o", "archive","=",corpsVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",corpsVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",corpsVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",corpsVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",corpsVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",corpsVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",corpsVo.getDateArchivageMin(),corpsVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",corpsVo.getDateCreationMin(),corpsVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Corps> corpss){
        if(ListUtil.isNotEmpty(corpss)){
        corpss.forEach(e->corpsDao.delete(e));
        }
}
@Override
public void update(List<Corps> corpss){
if(ListUtil.isNotEmpty(corpss)){
corpss.forEach(e->corpsDao.save(e));
}
}



}
