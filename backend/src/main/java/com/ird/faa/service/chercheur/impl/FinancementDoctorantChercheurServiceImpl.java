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
import com.ird.faa.bean.FinancementDoctorant;
import com.ird.faa.dao.FinancementDoctorantDao;
import com.ird.faa.service.chercheur.facade.FinancementDoctorantChercheurService;

import com.ird.faa.ws.rest.provided.vo.FinancementDoctorantVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class FinancementDoctorantChercheurServiceImpl extends AbstractServiceImpl<FinancementDoctorant> implements FinancementDoctorantChercheurService {

@Autowired
private FinancementDoctorantDao financementDoctorantDao;

@Autowired
private ArchivableService<FinancementDoctorant> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<FinancementDoctorant> findAll(){
    String query = "SELECT o FROM FinancementDoctorant o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public FinancementDoctorant findByCode(String code){
    if( code==null) return null;
    return financementDoctorantDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return financementDoctorantDao.deleteByCode(code);
    }
    @Override
    public FinancementDoctorant findByIdOrCode(FinancementDoctorant financementDoctorant){
        FinancementDoctorant resultat=null;
        if(financementDoctorant != null){
            if(StringUtil.isNotEmpty(financementDoctorant.getId())){
            resultat= financementDoctorantDao.getOne(financementDoctorant.getId());
            }else if(StringUtil.isNotEmpty(financementDoctorant.getCode())) {
            resultat= financementDoctorantDao.findByCode(financementDoctorant.getCode());
            }
        }
    return resultat;
    }

@Override
public FinancementDoctorant findById(Long id){
if(id==null) return null;
return financementDoctorantDao.getOne(id);
}

@Override
public FinancementDoctorant findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(financementDoctorantDao.findById(id).isPresent())  {
financementDoctorantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public FinancementDoctorant update(FinancementDoctorant financementDoctorant){
FinancementDoctorant foundedFinancementDoctorant = findById(financementDoctorant.getId());
if(foundedFinancementDoctorant==null) return null;
else{
    archivableService.prepare(financementDoctorant);
return  financementDoctorantDao.save(financementDoctorant);
}
}
private void prepareSave(FinancementDoctorant financementDoctorant){
financementDoctorant.setDateCreation(new Date());
if(financementDoctorant.getArchive() == null)
  financementDoctorant.setArchive(false);
if(financementDoctorant.getAdmin() == null)
  financementDoctorant.setAdmin(false);
if(financementDoctorant.getVisible() == null)
  financementDoctorant.setVisible(false);



}

@Override
public FinancementDoctorant save (FinancementDoctorant financementDoctorant){
prepareSave(financementDoctorant);

FinancementDoctorant result =null;
    FinancementDoctorant foundedFinancementDoctorant = findByCode(financementDoctorant.getCode());
   if(foundedFinancementDoctorant == null){



FinancementDoctorant savedFinancementDoctorant = financementDoctorantDao.save(financementDoctorant);

result = savedFinancementDoctorant;
   }

return result;
}

@Override
public List<FinancementDoctorant> save(List<FinancementDoctorant> financementDoctorants){
List<FinancementDoctorant> list = new ArrayList<>();
for(FinancementDoctorant financementDoctorant: financementDoctorants){
list.add(save(financementDoctorant));
}
return list;
}



@Override
@Transactional
public int delete(FinancementDoctorant financementDoctorant){
    if(financementDoctorant.getCode()==null) return -1;

    FinancementDoctorant foundedFinancementDoctorant = findByCode(financementDoctorant.getCode());
    if(foundedFinancementDoctorant==null) return -1;
financementDoctorantDao.delete(foundedFinancementDoctorant);
return 1;
}


public List<FinancementDoctorant> findByCriteria(FinancementDoctorantVo financementDoctorantVo){

String query = "SELECT o FROM FinancementDoctorant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",financementDoctorantVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",financementDoctorantVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",financementDoctorantVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",financementDoctorantVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",financementDoctorantVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",financementDoctorantVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",financementDoctorantVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",financementDoctorantVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",financementDoctorantVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",financementDoctorantVo.getDateArchivageMin(),financementDoctorantVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",financementDoctorantVo.getDateCreationMin(),financementDoctorantVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<FinancementDoctorant> financementDoctorants){
        if(ListUtil.isNotEmpty(financementDoctorants)){
        financementDoctorants.forEach(e->financementDoctorantDao.delete(e));
        }
}
@Override
public void update(List<FinancementDoctorant> financementDoctorants){
if(ListUtil.isNotEmpty(financementDoctorants)){
financementDoctorants.forEach(e->financementDoctorantDao.save(e));
}
}



}
