package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CampagneChercheurOuverture;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.EtatCampagneChercheur;
import com.ird.faa.dao.CampagneChercheurOuvertureDao;
import com.ird.faa.service.chercheur.facade.CampagneChercheurOuvertureChercheurService;
import com.ird.faa.service.chercheur.facade.EtatCampagneChercheurChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.CampagneChercheurOuvertureVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneChercheurOuvertureChercheurServiceImpl extends AbstractServiceImpl<CampagneChercheurOuverture> implements CampagneChercheurOuvertureChercheurService {

@Autowired
private CampagneChercheurOuvertureDao campagneChercheurOuvertureDao;

        @Autowired
        private EtatCampagneChercheurChercheurService etatCampagneChercheurService ;
        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CampagneChercheurOuverture> findAll(){
        return campagneChercheurOuvertureDao.findAll();
}

        @Override
        public List<CampagneChercheurOuverture> findByChercheurNumeroMatricule(String numeroMatricule){
        return campagneChercheurOuvertureDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return campagneChercheurOuvertureDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<CampagneChercheurOuverture> findByChercheurId(Long id){
        return campagneChercheurOuvertureDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return campagneChercheurOuvertureDao.deleteByChercheurId(id);
        }


        @Override
        public List<CampagneChercheurOuverture> findByCampagneCode(String code){
        return campagneChercheurOuvertureDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return campagneChercheurOuvertureDao.deleteByCampagneCode(code);
        }

        @Override
        public List<CampagneChercheurOuverture> findByCampagneId(Long id){
        return campagneChercheurOuvertureDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return campagneChercheurOuvertureDao.deleteByCampagneId(id);
        }


        @Override
        public List<CampagneChercheurOuverture> findByEtatCampagneChercheurCode(String code){
        return campagneChercheurOuvertureDao.findByEtatCampagneChercheurCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatCampagneChercheurCode(String code){
        return campagneChercheurOuvertureDao.deleteByEtatCampagneChercheurCode(code);
        }

        @Override
        public List<CampagneChercheurOuverture> findByEtatCampagneChercheurId(Long id){
        return campagneChercheurOuvertureDao.findByEtatCampagneChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatCampagneChercheurId(Long id){
        return campagneChercheurOuvertureDao.deleteByEtatCampagneChercheurId(id);
        }


@Override
public CampagneChercheurOuverture findById(Long id){
if(id==null) return null;
return campagneChercheurOuvertureDao.getOne(id);
}

@Override
public CampagneChercheurOuverture findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(campagneChercheurOuvertureDao.findById(id).isPresent())  {
campagneChercheurOuvertureDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CampagneChercheurOuverture update(CampagneChercheurOuverture campagneChercheurOuverture){
CampagneChercheurOuverture foundedCampagneChercheurOuverture = findById(campagneChercheurOuverture.getId());
if(foundedCampagneChercheurOuverture==null) return null;
else{
return  campagneChercheurOuvertureDao.save(campagneChercheurOuverture);
}
}
private void prepareSave(CampagneChercheurOuverture campagneChercheurOuverture){
if(campagneChercheurOuverture.getEnvoye() == null)
  campagneChercheurOuverture.setEnvoye(false);



}

@Override
public CampagneChercheurOuverture save (CampagneChercheurOuverture campagneChercheurOuverture){
prepareSave(campagneChercheurOuverture);



    findChercheur(campagneChercheurOuverture);
    findCampagne(campagneChercheurOuverture);
    findEtatCampagneChercheur(campagneChercheurOuverture);

return campagneChercheurOuvertureDao.save(campagneChercheurOuverture);


}

@Override
public List<CampagneChercheurOuverture> save(List<CampagneChercheurOuverture> campagneChercheurOuvertures){
List<CampagneChercheurOuverture> list = new ArrayList<>();
for(CampagneChercheurOuverture campagneChercheurOuverture: campagneChercheurOuvertures){
list.add(save(campagneChercheurOuverture));
}
return list;
}



@Override
@Transactional
public int delete(CampagneChercheurOuverture campagneChercheurOuverture){
    if(campagneChercheurOuverture.getId()==null) return -1;
    CampagneChercheurOuverture foundedCampagneChercheurOuverture = findById(campagneChercheurOuverture.getId());
    if(foundedCampagneChercheurOuverture==null) return -1;
campagneChercheurOuvertureDao.delete(foundedCampagneChercheurOuverture);
return 1;
}


public List<CampagneChercheurOuverture> findByCriteria(CampagneChercheurOuvertureVo campagneChercheurOuvertureVo){

String query = "SELECT o FROM CampagneChercheurOuverture o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneChercheurOuvertureVo.getId());
            query += SearchUtil.addConstraint( "o", "objet","LIKE",campagneChercheurOuvertureVo.getObjet());
            query += SearchUtil.addConstraint( "o", "message","LIKE",campagneChercheurOuvertureVo.getMessage());
            query += SearchUtil.addConstraint( "o", "envoye","=",campagneChercheurOuvertureVo.getEnvoye());
        query += SearchUtil.addConstraintDate( "o", "dateEnvoi","=",campagneChercheurOuvertureVo.getDateEnvoi());
            query += SearchUtil.addConstraint( "o", "avancement","=",campagneChercheurOuvertureVo.getAvancement());
            query += SearchUtil.addConstraintMinMaxDate("o","dateEnvoi",campagneChercheurOuvertureVo.getDateEnvoiMin(),campagneChercheurOuvertureVo.getDateEnvoiMax());
            query += SearchUtil.addConstraintMinMax("o","avancement",campagneChercheurOuvertureVo.getAvancementMin(),campagneChercheurOuvertureVo.getAvancementMax());
    if(campagneChercheurOuvertureVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",campagneChercheurOuvertureVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",campagneChercheurOuvertureVo.getChercheurVo().getNumeroMatricule());
    }

    if(campagneChercheurOuvertureVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",campagneChercheurOuvertureVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",campagneChercheurOuvertureVo.getCampagneVo().getCode());
    }

    if(campagneChercheurOuvertureVo.getEtatCampagneChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatCampagneChercheur.id","=",campagneChercheurOuvertureVo.getEtatCampagneChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "etatCampagneChercheur.code","LIKE",campagneChercheurOuvertureVo.getEtatCampagneChercheurVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findChercheur(CampagneChercheurOuverture campagneChercheurOuverture){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(campagneChercheurOuverture.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    campagneChercheurOuverture.setChercheur(loadedChercheur);
    }
    private void findCampagne(CampagneChercheurOuverture campagneChercheurOuverture){
        Campagne loadedCampagne =campagneService.findByIdOrCode(campagneChercheurOuverture.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    campagneChercheurOuverture.setCampagne(loadedCampagne);
    }
    private void findEtatCampagneChercheur(CampagneChercheurOuverture campagneChercheurOuverture){
        EtatCampagneChercheur loadedEtatCampagneChercheur =etatCampagneChercheurService.findByIdOrCode(campagneChercheurOuverture.getEtatCampagneChercheur());

    if(loadedEtatCampagneChercheur==null ) {
        return;
    }
    campagneChercheurOuverture.setEtatCampagneChercheur(loadedEtatCampagneChercheur);
    }

@Override
@Transactional
public void delete(List<CampagneChercheurOuverture> campagneChercheurOuvertures){
        if(ListUtil.isNotEmpty(campagneChercheurOuvertures)){
        campagneChercheurOuvertures.forEach(e->campagneChercheurOuvertureDao.delete(e));
        }
}
@Override
public void update(List<CampagneChercheurOuverture> campagneChercheurOuvertures){
if(ListUtil.isNotEmpty(campagneChercheurOuvertures)){
campagneChercheurOuvertures.forEach(e->campagneChercheurOuvertureDao.save(e));
}
}



}
