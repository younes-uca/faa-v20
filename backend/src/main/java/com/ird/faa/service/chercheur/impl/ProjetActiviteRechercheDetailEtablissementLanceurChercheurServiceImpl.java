package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ProjetActiviteRechercheDetailEtablissementLanceur;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.dao.ProjetActiviteRechercheDetailEtablissementLanceurDao;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailEtablissementLanceurChercheurService;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;

import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailEtablissementLanceurVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ProjetActiviteRechercheDetailEtablissementLanceurChercheurServiceImpl extends AbstractServiceImpl<ProjetActiviteRechercheDetailEtablissementLanceur> implements ProjetActiviteRechercheDetailEtablissementLanceurChercheurService {

@Autowired
private ProjetActiviteRechercheDetailEtablissementLanceurDao projetActiviteRechercheDetailEtablissementLanceurDao;

        @Autowired
        private ProjetActiviteRechercheDetailChercheurService projetActiviteRechercheDetailService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ProjetActiviteRechercheDetailEtablissementLanceur> findAll(){
        return projetActiviteRechercheDetailEtablissementLanceurDao.findAll();
}

        @Override
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementCode(String code){
        return projetActiviteRechercheDetailEtablissementLanceurDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return projetActiviteRechercheDetailEtablissementLanceurDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementId(Long id){
        return projetActiviteRechercheDetailEtablissementLanceurDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return projetActiviteRechercheDetailEtablissementLanceurDao.deleteByEtablissementId(id);
        }

        @Override
        public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailEtablissementLanceurDao.findByProjetActiviteRechercheDetailId(id);
        }

        @Override
        @Transactional
        public int deleteByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailEtablissementLanceurDao.deleteByProjetActiviteRechercheDetailId(id);
        }


@Override
public ProjetActiviteRechercheDetailEtablissementLanceur findById(Long id){
if(id==null) return null;
return projetActiviteRechercheDetailEtablissementLanceurDao.getOne(id);
}

@Override
public ProjetActiviteRechercheDetailEtablissementLanceur findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(projetActiviteRechercheDetailEtablissementLanceurDao.findById(id).isPresent())  {
projetActiviteRechercheDetailEtablissementLanceurDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ProjetActiviteRechercheDetailEtablissementLanceur update(ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur){
ProjetActiviteRechercheDetailEtablissementLanceur foundedProjetActiviteRechercheDetailEtablissementLanceur = findById(projetActiviteRechercheDetailEtablissementLanceur.getId());
if(foundedProjetActiviteRechercheDetailEtablissementLanceur==null) return null;
else{
return  projetActiviteRechercheDetailEtablissementLanceurDao.save(projetActiviteRechercheDetailEtablissementLanceur);
}
}

@Override
public ProjetActiviteRechercheDetailEtablissementLanceur save (ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur){



    findEtablissement(projetActiviteRechercheDetailEtablissementLanceur);
    findProjetActiviteRechercheDetail(projetActiviteRechercheDetailEtablissementLanceur);

return projetActiviteRechercheDetailEtablissementLanceurDao.save(projetActiviteRechercheDetailEtablissementLanceur);


}

@Override
public List<ProjetActiviteRechercheDetailEtablissementLanceur> save(List<ProjetActiviteRechercheDetailEtablissementLanceur> projetActiviteRechercheDetailEtablissementLanceurs){
List<ProjetActiviteRechercheDetailEtablissementLanceur> list = new ArrayList<>();
for(ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur: projetActiviteRechercheDetailEtablissementLanceurs){
list.add(save(projetActiviteRechercheDetailEtablissementLanceur));
}
return list;
}



@Override
@Transactional
public int delete(ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur){
    if(projetActiviteRechercheDetailEtablissementLanceur.getId()==null) return -1;
    ProjetActiviteRechercheDetailEtablissementLanceur foundedProjetActiviteRechercheDetailEtablissementLanceur = findById(projetActiviteRechercheDetailEtablissementLanceur.getId());
    if(foundedProjetActiviteRechercheDetailEtablissementLanceur==null) return -1;
projetActiviteRechercheDetailEtablissementLanceurDao.delete(foundedProjetActiviteRechercheDetailEtablissementLanceur);
return 1;
}


public List<ProjetActiviteRechercheDetailEtablissementLanceur> findByCriteria(ProjetActiviteRechercheDetailEtablissementLanceurVo projetActiviteRechercheDetailEtablissementLanceurVo){

String query = "SELECT o FROM ProjetActiviteRechercheDetailEtablissementLanceur o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",projetActiviteRechercheDetailEtablissementLanceurVo.getId());
    if(projetActiviteRechercheDetailEtablissementLanceurVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",projetActiviteRechercheDetailEtablissementLanceurVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",projetActiviteRechercheDetailEtablissementLanceurVo.getEtablissementVo().getCode());
    }

    if(projetActiviteRechercheDetailEtablissementLanceurVo.getProjetActiviteRechercheDetailVo()!=null){
        query += SearchUtil.addConstraint( "o", "projetActiviteRechercheDetail.id","=",projetActiviteRechercheDetailEtablissementLanceurVo.getProjetActiviteRechercheDetailVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEtablissement(ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(projetActiviteRechercheDetailEtablissementLanceur.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    projetActiviteRechercheDetailEtablissementLanceur.setEtablissement(loadedEtablissement);
    }
    private void findProjetActiviteRechercheDetail(ProjetActiviteRechercheDetailEtablissementLanceur projetActiviteRechercheDetailEtablissementLanceur){
        ProjetActiviteRechercheDetail loadedProjetActiviteRechercheDetail = null;
        if(projetActiviteRechercheDetailEtablissementLanceur.getProjetActiviteRechercheDetail() != null && projetActiviteRechercheDetailEtablissementLanceur.getProjetActiviteRechercheDetail().getId() !=null)
        loadedProjetActiviteRechercheDetail =projetActiviteRechercheDetailService.findById(projetActiviteRechercheDetailEtablissementLanceur.getProjetActiviteRechercheDetail().getId());

    if(loadedProjetActiviteRechercheDetail==null ) {
        return;
    }
    projetActiviteRechercheDetailEtablissementLanceur.setProjetActiviteRechercheDetail(loadedProjetActiviteRechercheDetail);
    }

@Override
@Transactional
public void delete(List<ProjetActiviteRechercheDetailEtablissementLanceur> projetActiviteRechercheDetailEtablissementLanceurs){
        if(ListUtil.isNotEmpty(projetActiviteRechercheDetailEtablissementLanceurs)){
        projetActiviteRechercheDetailEtablissementLanceurs.forEach(e->projetActiviteRechercheDetailEtablissementLanceurDao.delete(e));
        }
}
@Override
public void update(List<ProjetActiviteRechercheDetailEtablissementLanceur> projetActiviteRechercheDetailEtablissementLanceurs){
if(ListUtil.isNotEmpty(projetActiviteRechercheDetailEtablissementLanceurs)){
projetActiviteRechercheDetailEtablissementLanceurs.forEach(e->projetActiviteRechercheDetailEtablissementLanceurDao.save(e));
}
}



}
