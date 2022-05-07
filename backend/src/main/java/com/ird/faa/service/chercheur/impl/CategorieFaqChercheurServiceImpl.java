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
import com.ird.faa.bean.CategorieFaq;
import com.ird.faa.dao.CategorieFaqDao;
import com.ird.faa.service.chercheur.facade.CategorieFaqChercheurService;

import com.ird.faa.ws.rest.provided.vo.CategorieFaqVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CategorieFaqChercheurServiceImpl extends AbstractServiceImpl<CategorieFaq> implements CategorieFaqChercheurService {

@Autowired
private CategorieFaqDao categorieFaqDao;

@Autowired
private ArchivableService<CategorieFaq> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<CategorieFaq> findAll(){
    String query = "SELECT o FROM CategorieFaq o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public CategorieFaq findByOrdre(Integer ordre){
    if( ordre==null) return null;
    return categorieFaqDao.findByOrdre(ordre);
    }

    @Override
    @Transactional
    public int deleteByOrdre(Integer  ordre) {
    return categorieFaqDao.deleteByOrdre(ordre);
    }
    @Override
    public CategorieFaq findByIdOrOrdre(CategorieFaq categorieFaq){
        CategorieFaq resultat=null;
        if(categorieFaq != null){
            if(StringUtil.isNotEmpty(categorieFaq.getId())){
            resultat= categorieFaqDao.getOne(categorieFaq.getId());
            }else if(StringUtil.isNotEmpty(categorieFaq.getOrdre())) {
            resultat= categorieFaqDao.findByOrdre(categorieFaq.getOrdre());
            }
        }
    return resultat;
    }

@Override
public CategorieFaq findById(Long id){
if(id==null) return null;
return categorieFaqDao.getOne(id);
}

@Override
public CategorieFaq findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(categorieFaqDao.findById(id).isPresent())  {
categorieFaqDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CategorieFaq update(CategorieFaq categorieFaq){
CategorieFaq foundedCategorieFaq = findById(categorieFaq.getId());
if(foundedCategorieFaq==null) return null;
else{
    archivableService.prepare(categorieFaq);
return  categorieFaqDao.save(categorieFaq);
}
}
private void prepareSave(CategorieFaq categorieFaq){
categorieFaq.setDateCreation(new Date());
if(categorieFaq.getArchive() == null)
  categorieFaq.setArchive(false);
if(categorieFaq.getAdmin() == null)
  categorieFaq.setAdmin(false);
if(categorieFaq.getVisible() == null)
  categorieFaq.setVisible(false);



}

@Override
public CategorieFaq save (CategorieFaq categorieFaq){
prepareSave(categorieFaq);

CategorieFaq result =null;
    CategorieFaq foundedCategorieFaq = findByOrdre(categorieFaq.getOrdre());
   if(foundedCategorieFaq == null){



CategorieFaq savedCategorieFaq = categorieFaqDao.save(categorieFaq);

result = savedCategorieFaq;
   }

return result;
}

@Override
public List<CategorieFaq> save(List<CategorieFaq> categorieFaqs){
List<CategorieFaq> list = new ArrayList<>();
for(CategorieFaq categorieFaq: categorieFaqs){
list.add(save(categorieFaq));
}
return list;
}



@Override
@Transactional
public int delete(CategorieFaq categorieFaq){
    if(categorieFaq.getOrdre()==null) return -1;

    CategorieFaq foundedCategorieFaq = findByOrdre(categorieFaq.getOrdre());
    if(foundedCategorieFaq==null) return -1;
categorieFaqDao.delete(foundedCategorieFaq);
return 1;
}


public List<CategorieFaq> findByCriteria(CategorieFaqVo categorieFaqVo){

String query = "SELECT o FROM CategorieFaq o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",categorieFaqVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",categorieFaqVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "ordre","=",categorieFaqVo.getOrdre());
            query += SearchUtil.addConstraint( "o", "archive","=",categorieFaqVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",categorieFaqVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",categorieFaqVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",categorieFaqVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",categorieFaqVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",categorieFaqVo.getUsername());
            query += SearchUtil.addConstraintMinMax("o","ordre",categorieFaqVo.getOrdreMin(),categorieFaqVo.getOrdreMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",categorieFaqVo.getDateArchivageMin(),categorieFaqVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",categorieFaqVo.getDateCreationMin(),categorieFaqVo.getDateCreationMax());
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<CategorieFaq> categorieFaqs){
        if(ListUtil.isNotEmpty(categorieFaqs)){
        categorieFaqs.forEach(e->categorieFaqDao.delete(e));
        }
}
@Override
public void update(List<CategorieFaq> categorieFaqs){
if(ListUtil.isNotEmpty(categorieFaqs)){
categorieFaqs.forEach(e->categorieFaqDao.save(e));
}
}



}
