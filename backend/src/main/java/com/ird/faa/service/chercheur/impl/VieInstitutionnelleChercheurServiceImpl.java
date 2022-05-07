package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.ird.faa.service.util.StringUtil;
import com.ird.faa.security.common.SecurityUtil;
import com.ird.faa.security.bean.User;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.VieInstitutionnelle;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.dao.VieInstitutionnelleDao;
import com.ird.faa.service.chercheur.facade.VieInstitutionnelleChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class VieInstitutionnelleChercheurServiceImpl extends AbstractServiceImpl<VieInstitutionnelle> implements VieInstitutionnelleChercheurService {

@Autowired
private VieInstitutionnelleDao vieInstitutionnelleDao;

        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private VieInstitutionnelleDetailChercheurService vieInstitutionnelleDetailService ;
        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<VieInstitutionnelle> findAll(){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
    return vieInstitutionnelleDao.findByChercheurUsername(currentUser.getUsername());
    }
    return new ArrayList<>();
}

        @Override
        public List<VieInstitutionnelle> findByCampagneCode(String code){
        return vieInstitutionnelleDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return vieInstitutionnelleDao.deleteByCampagneCode(code);
        }

        @Override
        public List<VieInstitutionnelle> findByCampagneId(Long id){
        return vieInstitutionnelleDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return vieInstitutionnelleDao.deleteByCampagneId(id);
        }


        @Override
        public List<VieInstitutionnelle> findByChercheurNumeroMatricule(String numeroMatricule){
        return vieInstitutionnelleDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return vieInstitutionnelleDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<VieInstitutionnelle> findByChercheurId(Long id){
        return vieInstitutionnelleDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return vieInstitutionnelleDao.deleteByChercheurId(id);
        }


        @Override
        public List<VieInstitutionnelle> findByEtatEtapeCampagneCode(String code){
        return vieInstitutionnelleDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return vieInstitutionnelleDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<VieInstitutionnelle> findByEtatEtapeCampagneId(Long id){
        return vieInstitutionnelleDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return vieInstitutionnelleDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public VieInstitutionnelle findById(Long id){
if(id==null) return null;
return vieInstitutionnelleDao.getOne(id);
}

@Override
public VieInstitutionnelle findByIdWithAssociatedList(Long id){
VieInstitutionnelle vieInstitutionnelle  = findById(id);
findAssociatedLists(vieInstitutionnelle);
return vieInstitutionnelle;
}
private void findAssociatedLists(VieInstitutionnelle vieInstitutionnelle){
if(vieInstitutionnelle!=null && vieInstitutionnelle.getId() != null) {
        List<VieInstitutionnelleDetail> vieInstitutionnelleDetails = vieInstitutionnelleDetailService.findByVieInstitutionnelleId(vieInstitutionnelle.getId());
        vieInstitutionnelle.setVieInstitutionnelleDetails(vieInstitutionnelleDetails);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        vieInstitutionnelleDetailService.deleteByVieInstitutionnelleId(id);
}
}

    private void updateAssociatedLists(VieInstitutionnelle vieInstitutionnelle){
    if(vieInstitutionnelle !=null && vieInstitutionnelle.getId() != null){
            List<List<VieInstitutionnelleDetail>> resultVieInstitutionnelleDetails= vieInstitutionnelleDetailService.getToBeSavedAndToBeDeleted(vieInstitutionnelleDetailService.findByVieInstitutionnelleId(vieInstitutionnelle.getId()),vieInstitutionnelle.getVieInstitutionnelleDetails());
            vieInstitutionnelleDetailService.delete(resultVieInstitutionnelleDetails.get(1));
            associateVieInstitutionnelleDetail(vieInstitutionnelle,resultVieInstitutionnelleDetails.get(0));
            vieInstitutionnelleDetailService.update(resultVieInstitutionnelleDetails.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(vieInstitutionnelleDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
vieInstitutionnelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public VieInstitutionnelle update(VieInstitutionnelle vieInstitutionnelle){
VieInstitutionnelle foundedVieInstitutionnelle = findById(vieInstitutionnelle.getId());
if(foundedVieInstitutionnelle==null) return null;
else{
    updateAssociatedLists(vieInstitutionnelle);
return  vieInstitutionnelleDao.save(vieInstitutionnelle);
}
}

@Override
public VieInstitutionnelle save (VieInstitutionnelle vieInstitutionnelle){

VieInstitutionnelle result =null;

    User currentUser = SecurityUtil.getCurrentUser();
    if (currentUser == null || StringUtil.isEmpty(currentUser.getUsername())) {
    return result;
    }
    String username = currentUser.getUsername();
    Chercheur loadedChercheur = chercheurService.findByUsername(username);
    if (loadedChercheur == null) {
    return result;
    }
    Campagne laodedCampagne = campagneService.findProgressCampagneByChercheurUsername(username);
    if (laodedCampagne == null) {
    return result;
    } else {
    vieInstitutionnelle.setChercheur(loadedChercheur);
    vieInstitutionnelle.setCampagne(laodedCampagne);

    findCampagne(vieInstitutionnelle);
    findChercheur(vieInstitutionnelle);
    findEtatEtapeCampagne(vieInstitutionnelle);

VieInstitutionnelle savedVieInstitutionnelle = vieInstitutionnelleDao.save(vieInstitutionnelle);

       saveVieInstitutionnelleDetails(savedVieInstitutionnelle,vieInstitutionnelle.getVieInstitutionnelleDetails());
result = savedVieInstitutionnelle;
}

return result;
}

@Override
public List<VieInstitutionnelle> save(List<VieInstitutionnelle> vieInstitutionnelles){
List<VieInstitutionnelle> list = new ArrayList<>();
for(VieInstitutionnelle vieInstitutionnelle: vieInstitutionnelles){
list.add(save(vieInstitutionnelle));
}
return list;
}

        private List<VieInstitutionnelleDetail> prepareVieInstitutionnelleDetails(VieInstitutionnelle vieInstitutionnelle,List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){
        for(VieInstitutionnelleDetail vieInstitutionnelleDetail:vieInstitutionnelleDetails ){
        vieInstitutionnelleDetail.setVieInstitutionnelle(vieInstitutionnelle);
        }
        return vieInstitutionnelleDetails;
        }


@Override
@Transactional
public int delete(VieInstitutionnelle vieInstitutionnelle){
    if(vieInstitutionnelle.getId()==null) return -1;
    VieInstitutionnelle foundedVieInstitutionnelle = findById(vieInstitutionnelle.getId());
    if(foundedVieInstitutionnelle==null) return -1;
vieInstitutionnelleDao.delete(foundedVieInstitutionnelle);
return 1;
}


public List<VieInstitutionnelle> findByCriteria(VieInstitutionnelleVo vieInstitutionnelleVo){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())) {

String query = "SELECT o FROM VieInstitutionnelle o where 1=1 ";
    query += SearchUtil.addConstraint("o", "chercheur.username", "=", currentUser.getUsername());

            query += SearchUtil.addConstraint( "o", "id","=",vieInstitutionnelleVo.getId());
            query += SearchUtil.addConstraint( "o", "tempsEstime","=",vieInstitutionnelleVo.getTempsEstime());
            query += SearchUtil.addConstraint( "o", "annee","=",vieInstitutionnelleVo.getAnnee());
            query += SearchUtil.addConstraintMinMax("o","tempsEstime",vieInstitutionnelleVo.getTempsEstimeMin(),vieInstitutionnelleVo.getTempsEstimeMax());
            query += SearchUtil.addConstraintMinMax("o","annee",vieInstitutionnelleVo.getAnneeMin(),vieInstitutionnelleVo.getAnneeMax());
    if(vieInstitutionnelleVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",vieInstitutionnelleVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",vieInstitutionnelleVo.getCampagneVo().getCode());
    }

    if(vieInstitutionnelleVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",vieInstitutionnelleVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",vieInstitutionnelleVo.getChercheurVo().getNumeroMatricule());
    }

    if(vieInstitutionnelleVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",vieInstitutionnelleVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",vieInstitutionnelleVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
return new ArrayList<>();
}
        private  void saveVieInstitutionnelleDetails(VieInstitutionnelle vieInstitutionnelle,List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){

        if (ListUtil.isNotEmpty(vieInstitutionnelle.getVieInstitutionnelleDetails())) {
        List<VieInstitutionnelleDetail> savedVieInstitutionnelleDetails = new ArrayList<>();
        vieInstitutionnelleDetails.forEach(element -> {
        element.setVieInstitutionnelle(vieInstitutionnelle);
         vieInstitutionnelleDetailService.save(element);
        });
        vieInstitutionnelle.setVieInstitutionnelleDetails(savedVieInstitutionnelleDetails);
        }
        }

    private void findCampagne(VieInstitutionnelle vieInstitutionnelle){
        Campagne loadedCampagne =campagneService.findByIdOrCode(vieInstitutionnelle.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    vieInstitutionnelle.setCampagne(loadedCampagne);
    }
    private void findChercheur(VieInstitutionnelle vieInstitutionnelle){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(vieInstitutionnelle.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    vieInstitutionnelle.setChercheur(loadedChercheur);
    }
    private void findEtatEtapeCampagne(VieInstitutionnelle vieInstitutionnelle){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(vieInstitutionnelle.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    vieInstitutionnelle.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<VieInstitutionnelle> vieInstitutionnelles){
        if(ListUtil.isNotEmpty(vieInstitutionnelles)){
        vieInstitutionnelles.forEach(e->vieInstitutionnelleDao.delete(e));
        }
}
@Override
public void update(List<VieInstitutionnelle> vieInstitutionnelles){
if(ListUtil.isNotEmpty(vieInstitutionnelles)){
vieInstitutionnelles.forEach(e->vieInstitutionnelleDao.save(e));
}
}

private void associateVieInstitutionnelleDetail(VieInstitutionnelle vieInstitutionnelle, List<VieInstitutionnelleDetail> vieInstitutionnelleDetail) {
    if (ListUtil.isNotEmpty(vieInstitutionnelleDetail)) {
        vieInstitutionnelleDetail.forEach(e -> e.setVieInstitutionnelle(vieInstitutionnelle));
    }
    }

@Override
public List<VieInstitutionnelle> findByChercheurUsernameAndCampagneId(String username, Long compagneId){
List<VieInstitutionnelle> resultat= vieInstitutionnelleDao.findByChercheurUsernameAndCampagneId(username, compagneId);
    return resultat;
}

}
