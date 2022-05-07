package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EtablissementEnseignement;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.Enseignement;
import com.ird.faa.dao.EtablissementEnseignementDao;
import com.ird.faa.service.chercheur.facade.EtablissementEnseignementChercheurService;
import com.ird.faa.service.chercheur.facade.EnseignementChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;

import com.ird.faa.ws.rest.provided.vo.EtablissementEnseignementVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EtablissementEnseignementChercheurServiceImpl extends AbstractServiceImpl<EtablissementEnseignement> implements EtablissementEnseignementChercheurService {

@Autowired
private EtablissementEnseignementDao etablissementEnseignementDao;

        @Autowired
        private EnseignementChercheurService enseignementService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EtablissementEnseignement> findAll(){
        return etablissementEnseignementDao.findAll();
}

        @Override
        public List<EtablissementEnseignement> findByEtablissementCode(String code){
        return etablissementEnseignementDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return etablissementEnseignementDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<EtablissementEnseignement> findByEtablissementId(Long id){
        return etablissementEnseignementDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return etablissementEnseignementDao.deleteByEtablissementId(id);
        }

        @Override
        public List<EtablissementEnseignement> findByEnseignementId(Long id){
        return etablissementEnseignementDao.findByEnseignementId(id);
        }

        @Override
        @Transactional
        public int deleteByEnseignementId(Long id){
        return etablissementEnseignementDao.deleteByEnseignementId(id);
        }


@Override
public EtablissementEnseignement findById(Long id){
if(id==null) return null;
return etablissementEnseignementDao.getOne(id);
}

@Override
public EtablissementEnseignement findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(etablissementEnseignementDao.findById(id).isPresent())  {
etablissementEnseignementDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EtablissementEnseignement update(EtablissementEnseignement etablissementEnseignement){
EtablissementEnseignement foundedEtablissementEnseignement = findById(etablissementEnseignement.getId());
if(foundedEtablissementEnseignement==null) return null;
else{
return  etablissementEnseignementDao.save(etablissementEnseignement);
}
}

@Override
public EtablissementEnseignement save (EtablissementEnseignement etablissementEnseignement){



    findEtablissement(etablissementEnseignement);
    findEnseignement(etablissementEnseignement);

return etablissementEnseignementDao.save(etablissementEnseignement);


}

@Override
public List<EtablissementEnseignement> save(List<EtablissementEnseignement> etablissementEnseignements){
List<EtablissementEnseignement> list = new ArrayList<>();
for(EtablissementEnseignement etablissementEnseignement: etablissementEnseignements){
list.add(save(etablissementEnseignement));
}
return list;
}



@Override
@Transactional
public int delete(EtablissementEnseignement etablissementEnseignement){
    if(etablissementEnseignement.getId()==null) return -1;
    EtablissementEnseignement foundedEtablissementEnseignement = findById(etablissementEnseignement.getId());
    if(foundedEtablissementEnseignement==null) return -1;
etablissementEnseignementDao.delete(foundedEtablissementEnseignement);
return 1;
}


public List<EtablissementEnseignement> findByCriteria(EtablissementEnseignementVo etablissementEnseignementVo){

String query = "SELECT o FROM EtablissementEnseignement o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",etablissementEnseignementVo.getId());
    if(etablissementEnseignementVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",etablissementEnseignementVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",etablissementEnseignementVo.getEtablissementVo().getCode());
    }

    if(etablissementEnseignementVo.getEnseignementVo()!=null){
        query += SearchUtil.addConstraint( "o", "enseignement.id","=",etablissementEnseignementVo.getEnseignementVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEtablissement(EtablissementEnseignement etablissementEnseignement){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(etablissementEnseignement.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    etablissementEnseignement.setEtablissement(loadedEtablissement);
    }
    private void findEnseignement(EtablissementEnseignement etablissementEnseignement){
        Enseignement loadedEnseignement = null;
        if(etablissementEnseignement.getEnseignement() != null && etablissementEnseignement.getEnseignement().getId() !=null)
        loadedEnseignement =enseignementService.findById(etablissementEnseignement.getEnseignement().getId());

    if(loadedEnseignement==null ) {
        return;
    }
    etablissementEnseignement.setEnseignement(loadedEnseignement);
    }

@Override
@Transactional
public void delete(List<EtablissementEnseignement> etablissementEnseignements){
        if(ListUtil.isNotEmpty(etablissementEnseignements)){
        etablissementEnseignements.forEach(e->etablissementEnseignementDao.delete(e));
        }
}
@Override
public void update(List<EtablissementEnseignement> etablissementEnseignements){
if(ListUtil.isNotEmpty(etablissementEnseignements)){
etablissementEnseignements.forEach(e->etablissementEnseignementDao.save(e));
}
}



}
