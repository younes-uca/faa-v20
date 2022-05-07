package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CampagneRelanceChercheur;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.dao.CampagneRelanceChercheurDao;
import com.ird.faa.service.chercheur.facade.CampagneRelanceChercheurChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneRelanceChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.CampagneRelanceChercheurVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneRelanceChercheurChercheurServiceImpl extends AbstractServiceImpl<CampagneRelanceChercheur> implements CampagneRelanceChercheurChercheurService {

@Autowired
private CampagneRelanceChercheurDao campagneRelanceChercheurDao;

        @Autowired
        private CampagneRelanceChercheurService campagneRelanceService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CampagneRelanceChercheur> findAll(){
        return campagneRelanceChercheurDao.findAll();
}

        @Override
        public List<CampagneRelanceChercheur> findByChercheurNumeroMatricule(String numeroMatricule){
        return campagneRelanceChercheurDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return campagneRelanceChercheurDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<CampagneRelanceChercheur> findByChercheurId(Long id){
        return campagneRelanceChercheurDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return campagneRelanceChercheurDao.deleteByChercheurId(id);
        }

        @Override
        public List<CampagneRelanceChercheur> findByCampagneRelanceId(Long id){
        return campagneRelanceChercheurDao.findByCampagneRelanceId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneRelanceId(Long id){
        return campagneRelanceChercheurDao.deleteByCampagneRelanceId(id);
        }


@Override
public CampagneRelanceChercheur findById(Long id){
if(id==null) return null;
return campagneRelanceChercheurDao.getOne(id);
}

@Override
public CampagneRelanceChercheur findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(campagneRelanceChercheurDao.findById(id).isPresent())  {
campagneRelanceChercheurDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CampagneRelanceChercheur update(CampagneRelanceChercheur campagneRelanceChercheur){
CampagneRelanceChercheur foundedCampagneRelanceChercheur = findById(campagneRelanceChercheur.getId());
if(foundedCampagneRelanceChercheur==null) return null;
else{
return  campagneRelanceChercheurDao.save(campagneRelanceChercheur);
}
}
private void prepareSave(CampagneRelanceChercheur campagneRelanceChercheur){
if(campagneRelanceChercheur.getEnvoye() == null)
  campagneRelanceChercheur.setEnvoye(false);



}

@Override
public CampagneRelanceChercheur save (CampagneRelanceChercheur campagneRelanceChercheur){
prepareSave(campagneRelanceChercheur);



    findChercheur(campagneRelanceChercheur);
    findCampagneRelance(campagneRelanceChercheur);

return campagneRelanceChercheurDao.save(campagneRelanceChercheur);


}

@Override
public List<CampagneRelanceChercheur> save(List<CampagneRelanceChercheur> campagneRelanceChercheurs){
List<CampagneRelanceChercheur> list = new ArrayList<>();
for(CampagneRelanceChercheur campagneRelanceChercheur: campagneRelanceChercheurs){
list.add(save(campagneRelanceChercheur));
}
return list;
}



@Override
@Transactional
public int delete(CampagneRelanceChercheur campagneRelanceChercheur){
    if(campagneRelanceChercheur.getId()==null) return -1;
    CampagneRelanceChercheur foundedCampagneRelanceChercheur = findById(campagneRelanceChercheur.getId());
    if(foundedCampagneRelanceChercheur==null) return -1;
campagneRelanceChercheurDao.delete(foundedCampagneRelanceChercheur);
return 1;
}


public List<CampagneRelanceChercheur> findByCriteria(CampagneRelanceChercheurVo campagneRelanceChercheurVo){

String query = "SELECT o FROM CampagneRelanceChercheur o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneRelanceChercheurVo.getId());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",campagneRelanceChercheurVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",campagneRelanceChercheurVo.getMessage());
            query += SearchUtil.addConstraint( "o", "envoye","=",campagneRelanceChercheurVo.getEnvoye());
        query += SearchUtil.addConstraintDate( "o", "dateEnvoi","=",campagneRelanceChercheurVo.getDateEnvoi());
            query += SearchUtil.addConstraintMinMaxDate("o","dateEnvoi",campagneRelanceChercheurVo.getDateEnvoiMin(),campagneRelanceChercheurVo.getDateEnvoiMax());
    if(campagneRelanceChercheurVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",campagneRelanceChercheurVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",campagneRelanceChercheurVo.getChercheurVo().getNumeroMatricule());
    }

    if(campagneRelanceChercheurVo.getCampagneRelanceVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagneRelance.id","=",campagneRelanceChercheurVo.getCampagneRelanceVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findChercheur(CampagneRelanceChercheur campagneRelanceChercheur){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(campagneRelanceChercheur.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    campagneRelanceChercheur.setChercheur(loadedChercheur);
    }
    private void findCampagneRelance(CampagneRelanceChercheur campagneRelanceChercheur){
        CampagneRelance loadedCampagneRelance = null;
        if(campagneRelanceChercheur.getCampagneRelance() != null && campagneRelanceChercheur.getCampagneRelance().getId() !=null)
        loadedCampagneRelance =campagneRelanceService.findById(campagneRelanceChercheur.getCampagneRelance().getId());

    if(loadedCampagneRelance==null ) {
        return;
    }
    campagneRelanceChercheur.setCampagneRelance(loadedCampagneRelance);
    }

@Override
@Transactional
public void delete(List<CampagneRelanceChercheur> campagneRelanceChercheurs){
        if(ListUtil.isNotEmpty(campagneRelanceChercheurs)){
        campagneRelanceChercheurs.forEach(e->campagneRelanceChercheurDao.delete(e));
        }
}
@Override
public void update(List<CampagneRelanceChercheur> campagneRelanceChercheurs){
if(ListUtil.isNotEmpty(campagneRelanceChercheurs)){
campagneRelanceChercheurs.forEach(e->campagneRelanceChercheurDao.save(e));
}
}



}
