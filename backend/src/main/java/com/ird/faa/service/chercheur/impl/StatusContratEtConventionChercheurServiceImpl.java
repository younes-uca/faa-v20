package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.StatusContratEtConvention;
import com.ird.faa.dao.StatusContratEtConventionDao;
import com.ird.faa.service.chercheur.facade.StatusContratEtConventionChercheurService;

import com.ird.faa.ws.rest.provided.vo.StatusContratEtConventionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class StatusContratEtConventionChercheurServiceImpl extends AbstractServiceImpl<StatusContratEtConvention> implements StatusContratEtConventionChercheurService {

@Autowired
private StatusContratEtConventionDao statusContratEtConventionDao;



@Autowired
private EntityManager entityManager;


@Override
public List<StatusContratEtConvention> findAll(){
        String query = "SELECT o FROM StatusContratEtConvention o where 1=1 ";
        query+= " ORDER BY o.code";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public StatusContratEtConvention findByCode(String code){
    if( code==null) return null;
    return statusContratEtConventionDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return statusContratEtConventionDao.deleteByCode(code);
    }
    @Override
    public StatusContratEtConvention findByIdOrCode(StatusContratEtConvention statusContratEtConvention){
        StatusContratEtConvention resultat=null;
        if(statusContratEtConvention != null){
            if(StringUtil.isNotEmpty(statusContratEtConvention.getId())){
            resultat= statusContratEtConventionDao.getOne(statusContratEtConvention.getId());
            }else if(StringUtil.isNotEmpty(statusContratEtConvention.getCode())) {
            resultat= statusContratEtConventionDao.findByCode(statusContratEtConvention.getCode());
            }
        }
    return resultat;
    }

@Override
public StatusContratEtConvention findById(Long id){
if(id==null) return null;
return statusContratEtConventionDao.getOne(id);
}

@Override
public StatusContratEtConvention findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(statusContratEtConventionDao.findById(id).isPresent())  {
statusContratEtConventionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public StatusContratEtConvention update(StatusContratEtConvention statusContratEtConvention){
StatusContratEtConvention foundedStatusContratEtConvention = findById(statusContratEtConvention.getId());
if(foundedStatusContratEtConvention==null) return null;
else{
return  statusContratEtConventionDao.save(statusContratEtConvention);
}
}

@Override
public StatusContratEtConvention save (StatusContratEtConvention statusContratEtConvention){

StatusContratEtConvention result =null;
    StatusContratEtConvention foundedStatusContratEtConvention = findByCode(statusContratEtConvention.getCode());
   if(foundedStatusContratEtConvention == null){



StatusContratEtConvention savedStatusContratEtConvention = statusContratEtConventionDao.save(statusContratEtConvention);

result = savedStatusContratEtConvention;
   }

return result;
}

@Override
public List<StatusContratEtConvention> save(List<StatusContratEtConvention> statusContratEtConventions){
List<StatusContratEtConvention> list = new ArrayList<>();
for(StatusContratEtConvention statusContratEtConvention: statusContratEtConventions){
list.add(save(statusContratEtConvention));
}
return list;
}



@Override
@Transactional
public int delete(StatusContratEtConvention statusContratEtConvention){
    if(statusContratEtConvention.getCode()==null) return -1;

    StatusContratEtConvention foundedStatusContratEtConvention = findByCode(statusContratEtConvention.getCode());
    if(foundedStatusContratEtConvention==null) return -1;
statusContratEtConventionDao.delete(foundedStatusContratEtConvention);
return 1;
}


public List<StatusContratEtConvention> findByCriteria(StatusContratEtConventionVo statusContratEtConventionVo){

String query = "SELECT o FROM StatusContratEtConvention o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",statusContratEtConventionVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",statusContratEtConventionVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",statusContratEtConventionVo.getCode());
query+= " ORDER BY o.code";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<StatusContratEtConvention> statusContratEtConventions){
        if(ListUtil.isNotEmpty(statusContratEtConventions)){
        statusContratEtConventions.forEach(e->statusContratEtConventionDao.delete(e));
        }
}
@Override
public void update(List<StatusContratEtConvention> statusContratEtConventions){
if(ListUtil.isNotEmpty(statusContratEtConventions)){
statusContratEtConventions.forEach(e->statusContratEtConventionDao.save(e));
}
}



}
