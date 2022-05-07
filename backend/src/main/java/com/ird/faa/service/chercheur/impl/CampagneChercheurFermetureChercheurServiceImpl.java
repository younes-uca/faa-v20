package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CampagneChercheurFermeture;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.Campagne;
import com.ird.faa.dao.CampagneChercheurFermetureDao;
import com.ird.faa.service.chercheur.facade.CampagneChercheurFermetureChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.CampagneChercheurFermetureVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneChercheurFermetureChercheurServiceImpl extends AbstractServiceImpl<CampagneChercheurFermeture> implements CampagneChercheurFermetureChercheurService {

@Autowired
private CampagneChercheurFermetureDao campagneChercheurFermetureDao;

        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CampagneChercheurFermeture> findAll(){
        return campagneChercheurFermetureDao.findAll();
}

        @Override
        public List<CampagneChercheurFermeture> findByChercheurNumeroMatricule(String numeroMatricule){
        return campagneChercheurFermetureDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return campagneChercheurFermetureDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<CampagneChercheurFermeture> findByChercheurId(Long id){
        return campagneChercheurFermetureDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return campagneChercheurFermetureDao.deleteByChercheurId(id);
        }


        @Override
        public List<CampagneChercheurFermeture> findByCampagneCode(String code){
        return campagneChercheurFermetureDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return campagneChercheurFermetureDao.deleteByCampagneCode(code);
        }

        @Override
        public List<CampagneChercheurFermeture> findByCampagneId(Long id){
        return campagneChercheurFermetureDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return campagneChercheurFermetureDao.deleteByCampagneId(id);
        }


@Override
public CampagneChercheurFermeture findById(Long id){
if(id==null) return null;
return campagneChercheurFermetureDao.getOne(id);
}

@Override
public CampagneChercheurFermeture findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(campagneChercheurFermetureDao.findById(id).isPresent())  {
campagneChercheurFermetureDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CampagneChercheurFermeture update(CampagneChercheurFermeture campagneChercheurFermeture){
CampagneChercheurFermeture foundedCampagneChercheurFermeture = findById(campagneChercheurFermeture.getId());
if(foundedCampagneChercheurFermeture==null) return null;
else{
return  campagneChercheurFermetureDao.save(campagneChercheurFermeture);
}
}
private void prepareSave(CampagneChercheurFermeture campagneChercheurFermeture){
if(campagneChercheurFermeture.getEnvoye() == null)
  campagneChercheurFermeture.setEnvoye(false);



}

@Override
public CampagneChercheurFermeture save (CampagneChercheurFermeture campagneChercheurFermeture){
prepareSave(campagneChercheurFermeture);



    findChercheur(campagneChercheurFermeture);
    findCampagne(campagneChercheurFermeture);

return campagneChercheurFermetureDao.save(campagneChercheurFermeture);


}

@Override
public List<CampagneChercheurFermeture> save(List<CampagneChercheurFermeture> campagneChercheurFermetures){
List<CampagneChercheurFermeture> list = new ArrayList<>();
for(CampagneChercheurFermeture campagneChercheurFermeture: campagneChercheurFermetures){
list.add(save(campagneChercheurFermeture));
}
return list;
}



@Override
@Transactional
public int delete(CampagneChercheurFermeture campagneChercheurFermeture){
    if(campagneChercheurFermeture.getId()==null) return -1;
    CampagneChercheurFermeture foundedCampagneChercheurFermeture = findById(campagneChercheurFermeture.getId());
    if(foundedCampagneChercheurFermeture==null) return -1;
campagneChercheurFermetureDao.delete(foundedCampagneChercheurFermeture);
return 1;
}


public List<CampagneChercheurFermeture> findByCriteria(CampagneChercheurFermetureVo campagneChercheurFermetureVo){

String query = "SELECT o FROM CampagneChercheurFermeture o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneChercheurFermetureVo.getId());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",campagneChercheurFermetureVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",campagneChercheurFermetureVo.getMessage());
            query += SearchUtil.addConstraint( "o", "envoye","=",campagneChercheurFermetureVo.getEnvoye());
        query += SearchUtil.addConstraintDate( "o", "dateEnvoi","=",campagneChercheurFermetureVo.getDateEnvoi());
            query += SearchUtil.addConstraintMinMaxDate("o","dateEnvoi",campagneChercheurFermetureVo.getDateEnvoiMin(),campagneChercheurFermetureVo.getDateEnvoiMax());
    if(campagneChercheurFermetureVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",campagneChercheurFermetureVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",campagneChercheurFermetureVo.getChercheurVo().getNumeroMatricule());
    }

    if(campagneChercheurFermetureVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",campagneChercheurFermetureVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",campagneChercheurFermetureVo.getCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findChercheur(CampagneChercheurFermeture campagneChercheurFermeture){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(campagneChercheurFermeture.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    campagneChercheurFermeture.setChercheur(loadedChercheur);
    }
    private void findCampagne(CampagneChercheurFermeture campagneChercheurFermeture){
        Campagne loadedCampagne =campagneService.findByIdOrCode(campagneChercheurFermeture.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    campagneChercheurFermeture.setCampagne(loadedCampagne);
    }

@Override
@Transactional
public void delete(List<CampagneChercheurFermeture> campagneChercheurFermetures){
        if(ListUtil.isNotEmpty(campagneChercheurFermetures)){
        campagneChercheurFermetures.forEach(e->campagneChercheurFermetureDao.delete(e));
        }
}
@Override
public void update(List<CampagneChercheurFermeture> campagneChercheurFermetures){
if(ListUtil.isNotEmpty(campagneChercheurFermetures)){
campagneChercheurFermetures.forEach(e->campagneChercheurFermetureDao.save(e));
}
}



}
