package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EtatReclamation;
import com.ird.faa.dao.EtatReclamationDao;
import com.ird.faa.service.admin.facade.EtatReclamationAdminService;

import com.ird.faa.ws.rest.provided.vo.EtatReclamationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtatReclamationAdminServiceImpl extends AbstractServiceImpl<EtatReclamation> implements EtatReclamationAdminService {

@Autowired
private EtatReclamationDao etatReclamationDao;



@Autowired
private EntityManager entityManager;


@Override
public List<EtatReclamation> findAll(){
        String query = "SELECT o FROM EtatReclamation o where 1=1 ";
        query+= " ORDER BY o.ordre";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public EtatReclamation findByCode(String code){
    if( code==null) return null;
    return etatReclamationDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return etatReclamationDao.deleteByCode(code);
    }
    @Override
    public EtatReclamation findByIdOrCode(EtatReclamation etatReclamation){
        EtatReclamation resultat=null;
        if(etatReclamation != null){
            if(StringUtil.isNotEmpty(etatReclamation.getId())){
            resultat= etatReclamationDao.getOne(etatReclamation.getId());
            }else if(StringUtil.isNotEmpty(etatReclamation.getCode())) {
            resultat= etatReclamationDao.findByCode(etatReclamation.getCode());
            }
        }
    return resultat;
    }

@Override
public EtatReclamation findById(Long id){
if(id==null) return null;
return etatReclamationDao.getOne(id);
}

@Override
public EtatReclamation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etatReclamationDao.findById(id).isPresent())  {
etatReclamationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtatReclamation update(EtatReclamation etatReclamation){
EtatReclamation foundedEtatReclamation = findById(etatReclamation.getId());
if(foundedEtatReclamation==null) return null;
else{
return  etatReclamationDao.save(etatReclamation);
}
}

@Override
public EtatReclamation save (EtatReclamation etatReclamation){

EtatReclamation result =null;
    EtatReclamation foundedEtatReclamation = findByCode(etatReclamation.getCode());
   if(foundedEtatReclamation == null){



EtatReclamation savedEtatReclamation = etatReclamationDao.save(etatReclamation);

result = savedEtatReclamation;
   }

return result;
}

@Override
public List<EtatReclamation> save(List<EtatReclamation> etatReclamations){
List<EtatReclamation> list = new ArrayList<>();
for(EtatReclamation etatReclamation: etatReclamations){
list.add(save(etatReclamation));
}
return list;
}



@Override
@Transactional
public int delete(EtatReclamation etatReclamation){
    if(etatReclamation.getCode()==null) return -1;

    EtatReclamation foundedEtatReclamation = findByCode(etatReclamation.getCode());
    if(foundedEtatReclamation==null) return -1;
etatReclamationDao.delete(foundedEtatReclamation);
return 1;
}


public List<EtatReclamation> findByCriteria(EtatReclamationVo etatReclamationVo){

String query = "SELECT o FROM EtatReclamation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etatReclamationVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",etatReclamationVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",etatReclamationVo.getCode());
            query += SearchUtil.addConstraint( "o", "ordre","=",etatReclamationVo.getOrdre());
            query += SearchUtil.addConstraintMinMax("o","ordre",etatReclamationVo.getOrdreMin(),etatReclamationVo.getOrdreMax());
query+= " ORDER BY o.ordre";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<EtatReclamation> etatReclamations){
        if(ListUtil.isNotEmpty(etatReclamations)){
        etatReclamations.forEach(e->etatReclamationDao.delete(e));
        }
}
@Override
public void update(List<EtatReclamation> etatReclamations){
if(ListUtil.isNotEmpty(etatReclamations)){
etatReclamations.forEach(e->etatReclamationDao.save(e));
}
}



}
