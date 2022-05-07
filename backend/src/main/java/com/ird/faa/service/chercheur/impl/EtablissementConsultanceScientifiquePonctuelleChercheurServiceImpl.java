package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.dao.EtablissementConsultanceScientifiquePonctuelleDao;
import com.ird.faa.service.chercheur.facade.EtablissementConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.ConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;

import com.ird.faa.ws.rest.provided.vo.EtablissementConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtablissementConsultanceScientifiquePonctuelleChercheurServiceImpl extends AbstractServiceImpl<EtablissementConsultanceScientifiquePonctuelle> implements EtablissementConsultanceScientifiquePonctuelleChercheurService {

@Autowired
private EtablissementConsultanceScientifiquePonctuelleDao etablissementConsultanceScientifiquePonctuelleDao;

        @Autowired
        private ConsultanceScientifiquePonctuelleChercheurService consultanceScientifiquePonctuelleService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EtablissementConsultanceScientifiquePonctuelle> findAll(){
        return etablissementConsultanceScientifiquePonctuelleDao.findAll();
}
        @Override
        public List<EtablissementConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id){
        return etablissementConsultanceScientifiquePonctuelleDao.findByConsultanceScientifiquePonctuelleId(id);
        }

        @Override
        @Transactional
        public int deleteByConsultanceScientifiquePonctuelleId(Long id){
        return etablissementConsultanceScientifiquePonctuelleDao.deleteByConsultanceScientifiquePonctuelleId(id);
        }


        @Override
        public List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementCode(String code){
        return etablissementConsultanceScientifiquePonctuelleDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return etablissementConsultanceScientifiquePonctuelleDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementId(Long id){
        return etablissementConsultanceScientifiquePonctuelleDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return etablissementConsultanceScientifiquePonctuelleDao.deleteByEtablissementId(id);
        }


@Override
public EtablissementConsultanceScientifiquePonctuelle findById(Long id){
if(id==null) return null;
return etablissementConsultanceScientifiquePonctuelleDao.getOne(id);
}

@Override
public EtablissementConsultanceScientifiquePonctuelle findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etablissementConsultanceScientifiquePonctuelleDao.findById(id).isPresent())  {
etablissementConsultanceScientifiquePonctuelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtablissementConsultanceScientifiquePonctuelle update(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle){
EtablissementConsultanceScientifiquePonctuelle foundedEtablissementConsultanceScientifiquePonctuelle = findById(etablissementConsultanceScientifiquePonctuelle.getId());
if(foundedEtablissementConsultanceScientifiquePonctuelle==null) return null;
else{
return  etablissementConsultanceScientifiquePonctuelleDao.save(etablissementConsultanceScientifiquePonctuelle);
}
}

@Override
public EtablissementConsultanceScientifiquePonctuelle save (EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle){



    findConsultanceScientifiquePonctuelle(etablissementConsultanceScientifiquePonctuelle);
    findEtablissement(etablissementConsultanceScientifiquePonctuelle);

return etablissementConsultanceScientifiquePonctuelleDao.save(etablissementConsultanceScientifiquePonctuelle);


}

@Override
public List<EtablissementConsultanceScientifiquePonctuelle> save(List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){
List<EtablissementConsultanceScientifiquePonctuelle> list = new ArrayList<>();
for(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle: etablissementConsultanceScientifiquePonctuelles){
list.add(save(etablissementConsultanceScientifiquePonctuelle));
}
return list;
}



@Override
@Transactional
public int delete(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle){
    if(etablissementConsultanceScientifiquePonctuelle.getId()==null) return -1;
    EtablissementConsultanceScientifiquePonctuelle foundedEtablissementConsultanceScientifiquePonctuelle = findById(etablissementConsultanceScientifiquePonctuelle.getId());
    if(foundedEtablissementConsultanceScientifiquePonctuelle==null) return -1;
etablissementConsultanceScientifiquePonctuelleDao.delete(foundedEtablissementConsultanceScientifiquePonctuelle);
return 1;
}


public List<EtablissementConsultanceScientifiquePonctuelle> findByCriteria(EtablissementConsultanceScientifiquePonctuelleVo etablissementConsultanceScientifiquePonctuelleVo){

String query = "SELECT o FROM EtablissementConsultanceScientifiquePonctuelle o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etablissementConsultanceScientifiquePonctuelleVo.getId());
    if(etablissementConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "consultanceScientifiquePonctuelle.id","=",etablissementConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo().getId());
    }

    if(etablissementConsultanceScientifiquePonctuelleVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",etablissementConsultanceScientifiquePonctuelleVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",etablissementConsultanceScientifiquePonctuelleVo.getEtablissementVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findConsultanceScientifiquePonctuelle(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle){
        ConsultanceScientifiquePonctuelle loadedConsultanceScientifiquePonctuelle = null;
        if(etablissementConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle() != null && etablissementConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId() !=null)
        loadedConsultanceScientifiquePonctuelle =consultanceScientifiquePonctuelleService.findById(etablissementConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId());

    if(loadedConsultanceScientifiquePonctuelle==null ) {
        return;
    }
    etablissementConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(loadedConsultanceScientifiquePonctuelle);
    }
    private void findEtablissement(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(etablissementConsultanceScientifiquePonctuelle.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    etablissementConsultanceScientifiquePonctuelle.setEtablissement(loadedEtablissement);
    }

@Override
@Transactional
public void delete(List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){
        if(ListUtil.isNotEmpty(etablissementConsultanceScientifiquePonctuelles)){
        etablissementConsultanceScientifiquePonctuelles.forEach(e->etablissementConsultanceScientifiquePonctuelleDao.delete(e));
        }
}
@Override
public void update(List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){
if(ListUtil.isNotEmpty(etablissementConsultanceScientifiquePonctuelles)){
etablissementConsultanceScientifiquePonctuelles.forEach(e->etablissementConsultanceScientifiquePonctuelleDao.save(e));
}
}



}
