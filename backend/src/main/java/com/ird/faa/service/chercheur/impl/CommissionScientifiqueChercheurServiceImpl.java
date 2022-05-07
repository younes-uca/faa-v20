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
import com.ird.faa.bean.CommissionScientifique;
import com.ird.faa.dao.CommissionScientifiqueDao;
import com.ird.faa.service.chercheur.facade.CommissionScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.CommissionScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.facade.ArchivableService;
import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CommissionScientifiqueChercheurServiceImpl extends AbstractServiceImpl<CommissionScientifique> implements CommissionScientifiqueChercheurService {

@Autowired
private CommissionScientifiqueDao commissionScientifiqueDao;

@Autowired
private ArchivableService<CommissionScientifique> archivableService;


@Autowired
private EntityManager entityManager;


@Override
public List<CommissionScientifique> findAll(){
    String query = "SELECT o FROM CommissionScientifique o ";
    query+= " WHERE (o.archive != true AND o.visible = true)";
    query+= " ORDER BY o.code";
    return entityManager.createQuery(query).getResultList();
}
    @Override
    public CommissionScientifique findByCode(String code){
    if( code==null) return null;
    return commissionScientifiqueDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return commissionScientifiqueDao.deleteByCode(code);
    }
    @Override
    public CommissionScientifique findByIdOrCode(CommissionScientifique commissionScientifique){
        CommissionScientifique resultat=null;
        if(commissionScientifique != null){
            if(StringUtil.isNotEmpty(commissionScientifique.getId())){
            resultat= commissionScientifiqueDao.getOne(commissionScientifique.getId());
            }else if(StringUtil.isNotEmpty(commissionScientifique.getCode())) {
            resultat= commissionScientifiqueDao.findByCode(commissionScientifique.getCode());
            }
        }
    return resultat;
    }

@Override
public CommissionScientifique findById(Long id){
if(id==null) return null;
return commissionScientifiqueDao.getOne(id);
}

@Override
public CommissionScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(commissionScientifiqueDao.findById(id).isPresent())  {
commissionScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CommissionScientifique update(CommissionScientifique commissionScientifique){
CommissionScientifique foundedCommissionScientifique = findById(commissionScientifique.getId());
if(foundedCommissionScientifique==null) return null;
else{
    archivableService.prepare(commissionScientifique);
return  commissionScientifiqueDao.save(commissionScientifique);
}
}
private void prepareSave(CommissionScientifique commissionScientifique){
commissionScientifique.setDateCreation(new Date());
if(commissionScientifique.getArchive() == null)
  commissionScientifique.setArchive(false);
if(commissionScientifique.getAdmin() == null)
  commissionScientifique.setAdmin(false);
if(commissionScientifique.getVisible() == null)
  commissionScientifique.setVisible(false);



}

@Override
public CommissionScientifique save (CommissionScientifique commissionScientifique){
prepareSave(commissionScientifique);

CommissionScientifique result =null;
    CommissionScientifique foundedCommissionScientifique = findByCode(commissionScientifique.getCode());
   if(foundedCommissionScientifique == null){



CommissionScientifique savedCommissionScientifique = commissionScientifiqueDao.save(commissionScientifique);

result = savedCommissionScientifique;
   }

return result;
}

@Override
public List<CommissionScientifique> save(List<CommissionScientifique> commissionScientifiques){
List<CommissionScientifique> list = new ArrayList<>();
for(CommissionScientifique commissionScientifique: commissionScientifiques){
list.add(save(commissionScientifique));
}
return list;
}



@Override
@Transactional
public int delete(CommissionScientifique commissionScientifique){
    if(commissionScientifique.getCode()==null) return -1;

    CommissionScientifique foundedCommissionScientifique = findByCode(commissionScientifique.getCode());
    if(foundedCommissionScientifique==null) return -1;
commissionScientifiqueDao.delete(foundedCommissionScientifique);
return 1;
}


public List<CommissionScientifique> findByCriteria(CommissionScientifiqueVo commissionScientifiqueVo){

String query = "SELECT o FROM CommissionScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",commissionScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "libelleCourt","LIKE",commissionScientifiqueVo.getLibelleCourt());
            query += SearchUtil.addConstraint( "o", "libelleLong","LIKE",commissionScientifiqueVo.getLibelleLong());
            query += SearchUtil.addConstraint( "o", "code","LIKE",commissionScientifiqueVo.getCode());
            query += SearchUtil.addConstraint( "o", "archive","=",commissionScientifiqueVo.getArchive());
        query += SearchUtil.addConstraintDate( "o", "dateArchivage","=",commissionScientifiqueVo.getDateArchivage());
        query += SearchUtil.addConstraintDate( "o", "dateCreation","=",commissionScientifiqueVo.getDateCreation());
            query += SearchUtil.addConstraint( "o", "admin","=",commissionScientifiqueVo.getAdmin());
            query += SearchUtil.addConstraint( "o", "visible","=",commissionScientifiqueVo.getVisible());
            query += SearchUtil.addConstraint( "o", "username","LIKE",commissionScientifiqueVo.getUsername());
            query += SearchUtil.addConstraintMinMaxDate("o","dateArchivage",commissionScientifiqueVo.getDateArchivageMin(),commissionScientifiqueVo.getDateArchivageMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateCreation",commissionScientifiqueVo.getDateCreationMin(),commissionScientifiqueVo.getDateCreationMax());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<CommissionScientifique> commissionScientifiques){
        if(ListUtil.isNotEmpty(commissionScientifiques)){
        commissionScientifiques.forEach(e->commissionScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<CommissionScientifique> commissionScientifiques){
if(ListUtil.isNotEmpty(commissionScientifiques)){
commissionScientifiques.forEach(e->commissionScientifiqueDao.save(e));
}
}



}
