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
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.PaysDao;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.PaysVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PaysChercheurServiceImpl extends AbstractServiceImpl<Pays> implements PaysChercheurService {

@Autowired
private PaysDao paysDao;

@Autowired
private ArchivableService<Pays> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<Pays> findAll(){
    String query = "SELECT o FROM Pays o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public Pays findByCode(String code){
    if( code==null) return null;
    return paysDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return paysDao.deleteByCode(code);
    }
    @Override
    public Pays findByIdOrCode(Pays pays){
        Pays resultat=null;
        if(pays != null){
            if(StringUtil.isNotEmpty(pays.getId())){
            resultat= paysDao.getOne(pays.getId());
            }else if(StringUtil.isNotEmpty(pays.getCode())) {
            resultat= paysDao.findByCode(pays.getCode());
            }
        }
    return resultat;
    }

@Override
public Pays findById(Long id){
if(id==null) return null;
return paysDao.getOne(id);
}

@Override
public Pays findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(paysDao.findById(id).isPresent())  {
paysDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Pays update(Pays pays){
Pays foundedPays = findById(pays.getId());
if(foundedPays==null) return null;
else{
    archivableService.prepare(pays);
return  paysDao.save(pays);
}
}
private void prepareSave(Pays pays){
pays.setDateCreation(new Date());
if(pays.getArchive() == null)
  pays.setArchive(false);
if(pays.getAdmin() == null)
  pays.setAdmin(false);
if(pays.getVisible() == null)
  pays.setVisible(false);



}

@Override
public Pays save (Pays pays){
prepareSave(pays);

Pays result =null;
    Pays foundedPays = findByCode(pays.getCode());
   if(foundedPays == null){



Pays savedPays = paysDao.save(pays);

result = savedPays;
   }

return result;
}

@Override
public List<Pays> save(List<Pays> payss){
List<Pays> list = new ArrayList<>();
for(Pays pays: payss){
list.add(save(pays));
}
return list;
}



@Override
@Transactional
public int delete(Pays pays){
    if(pays.getCode()==null) return -1;

    Pays foundedPays = findByCode(pays.getCode());
    if(foundedPays==null) return -1;
paysDao.delete(foundedPays);
return 1;
}


public List<Pays> findByCriteria(PaysVo paysVo){

String query = "SELECT o FROM Pays o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",paysVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",paysVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",paysVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",paysVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",paysVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",paysVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",paysVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",paysVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",paysVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",paysVo.getDateArchivageMin(),paysVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",paysVo.getDateCreationMin(),paysVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<Pays> payss){
        if(ListUtil.isNotEmpty(payss)){
        payss.forEach(e->paysDao.delete(e));
        }
}
@Override
public void update(List<Pays> payss){
if(ListUtil.isNotEmpty(payss)){
payss.forEach(e->paysDao.save(e));
}
}



}
