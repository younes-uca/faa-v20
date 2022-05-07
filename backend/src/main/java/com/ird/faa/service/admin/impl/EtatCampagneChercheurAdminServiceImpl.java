package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EtatCampagneChercheur;
import com.ird.faa.dao.EtatCampagneChercheurDao;
import com.ird.faa.service.admin.facade.EtatCampagneChercheurAdminService;

import com.ird.faa.ws.rest.provided.vo.EtatCampagneChercheurVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtatCampagneChercheurAdminServiceImpl extends AbstractServiceImpl<EtatCampagneChercheur> implements EtatCampagneChercheurAdminService {

@Autowired
private EtatCampagneChercheurDao etatCampagneChercheurDao;



@Autowired
private EntityManager entityManager;


@Override
public List<EtatCampagneChercheur> findAll(){
        String query = "SELECT o FROM EtatCampagneChercheur o where 1=1 ";
        query+= " ORDER BY o.ordre";
        return entityManager.createQuery(query).getResultList();
}
    @Override
    public EtatCampagneChercheur findByCode(String code){
    if( code==null) return null;
    return etatCampagneChercheurDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return etatCampagneChercheurDao.deleteByCode(code);
    }
    @Override
    public EtatCampagneChercheur findByIdOrCode(EtatCampagneChercheur etatCampagneChercheur){
        EtatCampagneChercheur resultat=null;
        if(etatCampagneChercheur != null){
            if(StringUtil.isNotEmpty(etatCampagneChercheur.getId())){
            resultat= etatCampagneChercheurDao.getOne(etatCampagneChercheur.getId());
            }else if(StringUtil.isNotEmpty(etatCampagneChercheur.getCode())) {
            resultat= etatCampagneChercheurDao.findByCode(etatCampagneChercheur.getCode());
            }
        }
    return resultat;
    }

@Override
public EtatCampagneChercheur findById(Long id){
if(id==null) return null;
return etatCampagneChercheurDao.getOne(id);
}

@Override
public EtatCampagneChercheur findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etatCampagneChercheurDao.findById(id).isPresent())  {
etatCampagneChercheurDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtatCampagneChercheur update(EtatCampagneChercheur etatCampagneChercheur){
EtatCampagneChercheur foundedEtatCampagneChercheur = findById(etatCampagneChercheur.getId());
if(foundedEtatCampagneChercheur==null) return null;
else{
return  etatCampagneChercheurDao.save(etatCampagneChercheur);
}
}

@Override
public EtatCampagneChercheur save (EtatCampagneChercheur etatCampagneChercheur){

EtatCampagneChercheur result =null;
    EtatCampagneChercheur foundedEtatCampagneChercheur = findByCode(etatCampagneChercheur.getCode());
   if(foundedEtatCampagneChercheur == null){



EtatCampagneChercheur savedEtatCampagneChercheur = etatCampagneChercheurDao.save(etatCampagneChercheur);

result = savedEtatCampagneChercheur;
   }

return result;
}

@Override
public List<EtatCampagneChercheur> save(List<EtatCampagneChercheur> etatCampagneChercheurs){
List<EtatCampagneChercheur> list = new ArrayList<>();
for(EtatCampagneChercheur etatCampagneChercheur: etatCampagneChercheurs){
list.add(save(etatCampagneChercheur));
}
return list;
}



@Override
@Transactional
public int delete(EtatCampagneChercheur etatCampagneChercheur){
    if(etatCampagneChercheur.getCode()==null) return -1;

    EtatCampagneChercheur foundedEtatCampagneChercheur = findByCode(etatCampagneChercheur.getCode());
    if(foundedEtatCampagneChercheur==null) return -1;
etatCampagneChercheurDao.delete(foundedEtatCampagneChercheur);
return 1;
}


public List<EtatCampagneChercheur> findByCriteria(EtatCampagneChercheurVo etatCampagneChercheurVo){

String query = "SELECT o FROM EtatCampagneChercheur o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etatCampagneChercheurVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",etatCampagneChercheurVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",etatCampagneChercheurVo.getCode());
            query += SearchUtil.addConstraint( "o", "ordre","=",etatCampagneChercheurVo.getOrdre());
            query += SearchUtil.addConstraintMinMax("o","ordre",etatCampagneChercheurVo.getOrdreMin(),etatCampagneChercheurVo.getOrdreMax());
query+= " ORDER BY o.ordre";
return entityManager.createQuery(query).getResultList();
}


@Override
@Transactional
public void delete(List<EtatCampagneChercheur> etatCampagneChercheurs){
        if(ListUtil.isNotEmpty(etatCampagneChercheurs)){
        etatCampagneChercheurs.forEach(e->etatCampagneChercheurDao.delete(e));
        }
}
@Override
public void update(List<EtatCampagneChercheur> etatCampagneChercheurs){
if(ListUtil.isNotEmpty(etatCampagneChercheurs)){
etatCampagneChercheurs.forEach(e->etatCampagneChercheurDao.save(e));
}
}



}
