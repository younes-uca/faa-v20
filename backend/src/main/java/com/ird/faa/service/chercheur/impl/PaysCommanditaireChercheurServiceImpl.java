package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.PaysCommanditaire;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.Pays;
import com.ird.faa.dao.PaysCommanditaireDao;
import com.ird.faa.service.chercheur.facade.PaysCommanditaireChercheurService;
import com.ird.faa.service.chercheur.facade.ConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.PaysCommanditaireVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class PaysCommanditaireChercheurServiceImpl extends AbstractServiceImpl<PaysCommanditaire> implements PaysCommanditaireChercheurService {

@Autowired
private PaysCommanditaireDao paysCommanditaireDao;

        @Autowired
        private ConsultanceScientifiquePonctuelleChercheurService consultanceScientifiquePonctuelleService ;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<PaysCommanditaire> findAll(){
        return paysCommanditaireDao.findAll();
}
        @Override
        public List<PaysCommanditaire> findByConsultanceScientifiquePonctuelleId(Long id){
        return paysCommanditaireDao.findByConsultanceScientifiquePonctuelleId(id);
        }

        @Override
        @Transactional
        public int deleteByConsultanceScientifiquePonctuelleId(Long id){
        return paysCommanditaireDao.deleteByConsultanceScientifiquePonctuelleId(id);
        }


        @Override
        public List<PaysCommanditaire> findByPaysCode(String code){
        return paysCommanditaireDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return paysCommanditaireDao.deleteByPaysCode(code);
        }

        @Override
        public List<PaysCommanditaire> findByPaysId(Long id){
        return paysCommanditaireDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return paysCommanditaireDao.deleteByPaysId(id);
        }


@Override
public PaysCommanditaire findById(Long id){
if(id==null) return null;
return paysCommanditaireDao.getOne(id);
}

@Override
public PaysCommanditaire findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(paysCommanditaireDao.findById(id).isPresent())  {
paysCommanditaireDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public PaysCommanditaire update(PaysCommanditaire paysCommanditaire){
PaysCommanditaire foundedPaysCommanditaire = findById(paysCommanditaire.getId());
if(foundedPaysCommanditaire==null) return null;
else{
return  paysCommanditaireDao.save(paysCommanditaire);
}
}

@Override
public PaysCommanditaire save (PaysCommanditaire paysCommanditaire){



    findConsultanceScientifiquePonctuelle(paysCommanditaire);
    findPays(paysCommanditaire);

return paysCommanditaireDao.save(paysCommanditaire);


}

@Override
public List<PaysCommanditaire> save(List<PaysCommanditaire> paysCommanditaires){
List<PaysCommanditaire> list = new ArrayList<>();
for(PaysCommanditaire paysCommanditaire: paysCommanditaires){
list.add(save(paysCommanditaire));
}
return list;
}



@Override
@Transactional
public int delete(PaysCommanditaire paysCommanditaire){
    if(paysCommanditaire.getId()==null) return -1;
    PaysCommanditaire foundedPaysCommanditaire = findById(paysCommanditaire.getId());
    if(foundedPaysCommanditaire==null) return -1;
paysCommanditaireDao.delete(foundedPaysCommanditaire);
return 1;
}


public List<PaysCommanditaire> findByCriteria(PaysCommanditaireVo paysCommanditaireVo){

String query = "SELECT o FROM PaysCommanditaire o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",paysCommanditaireVo.getId());
    if(paysCommanditaireVo.getConsultanceScientifiquePonctuelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "consultanceScientifiquePonctuelle.id","=",paysCommanditaireVo.getConsultanceScientifiquePonctuelleVo().getId());
    }

    if(paysCommanditaireVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",paysCommanditaireVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",paysCommanditaireVo.getPaysVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findConsultanceScientifiquePonctuelle(PaysCommanditaire paysCommanditaire){
        ConsultanceScientifiquePonctuelle loadedConsultanceScientifiquePonctuelle = null;
        if(paysCommanditaire.getConsultanceScientifiquePonctuelle() != null && paysCommanditaire.getConsultanceScientifiquePonctuelle().getId() !=null)
        loadedConsultanceScientifiquePonctuelle =consultanceScientifiquePonctuelleService.findById(paysCommanditaire.getConsultanceScientifiquePonctuelle().getId());

    if(loadedConsultanceScientifiquePonctuelle==null ) {
        return;
    }
    paysCommanditaire.setConsultanceScientifiquePonctuelle(loadedConsultanceScientifiquePonctuelle);
    }
    private void findPays(PaysCommanditaire paysCommanditaire){
        Pays loadedPays =paysService.findByIdOrCode(paysCommanditaire.getPays());

    if(loadedPays==null ) {
        return;
    }
    paysCommanditaire.setPays(loadedPays);
    }

@Override
@Transactional
public void delete(List<PaysCommanditaire> paysCommanditaires){
        if(ListUtil.isNotEmpty(paysCommanditaires)){
        paysCommanditaires.forEach(e->paysCommanditaireDao.delete(e));
        }
}
@Override
public void update(List<PaysCommanditaire> paysCommanditaires){
if(ListUtil.isNotEmpty(paysCommanditaires)){
paysCommanditaires.forEach(e->paysCommanditaireDao.save(e));
}
}



}
