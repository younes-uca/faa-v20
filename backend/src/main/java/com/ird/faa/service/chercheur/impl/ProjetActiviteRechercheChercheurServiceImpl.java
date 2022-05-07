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
import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.dao.ProjetActiviteRechercheDao;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.service.chercheur.facade.ProjetActiviteRechercheDetailChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ProjetActiviteRechercheChercheurServiceImpl extends AbstractServiceImpl<ProjetActiviteRecherche> implements ProjetActiviteRechercheChercheurService {

@Autowired
private ProjetActiviteRechercheDao projetActiviteRechercheDao;

        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private ProjetActiviteRechercheDetailChercheurService projetActiviteRechercheDetailService ;
        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ProjetActiviteRecherche> findAll(){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
    return projetActiviteRechercheDao.findByChercheurUsername(currentUser.getUsername());
    }
    return new ArrayList<>();
}

        @Override
        public List<ProjetActiviteRecherche> findByEtatEtapeCampagneCode(String code){
        return projetActiviteRechercheDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return projetActiviteRechercheDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ProjetActiviteRecherche> findByEtatEtapeCampagneId(Long id){
        return projetActiviteRechercheDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return projetActiviteRechercheDao.deleteByEtatEtapeCampagneId(id);
        }


        @Override
        public List<ProjetActiviteRecherche> findByChercheurNumeroMatricule(String numeroMatricule){
        return projetActiviteRechercheDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return projetActiviteRechercheDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<ProjetActiviteRecherche> findByChercheurId(Long id){
        return projetActiviteRechercheDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return projetActiviteRechercheDao.deleteByChercheurId(id);
        }


        @Override
        public List<ProjetActiviteRecherche> findByCampagneCode(String code){
        return projetActiviteRechercheDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return projetActiviteRechercheDao.deleteByCampagneCode(code);
        }

        @Override
        public List<ProjetActiviteRecherche> findByCampagneId(Long id){
        return projetActiviteRechercheDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return projetActiviteRechercheDao.deleteByCampagneId(id);
        }


@Override
public ProjetActiviteRecherche findById(Long id){
if(id==null) return null;
return projetActiviteRechercheDao.getOne(id);
}

@Override
public ProjetActiviteRecherche findByIdWithAssociatedList(Long id){
ProjetActiviteRecherche projetActiviteRecherche  = findById(id);
findAssociatedLists(projetActiviteRecherche);
return projetActiviteRecherche;
}
private void findAssociatedLists(ProjetActiviteRecherche projetActiviteRecherche){
if(projetActiviteRecherche!=null && projetActiviteRecherche.getId() != null) {
        List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetails = projetActiviteRechercheDetailService.findByProjetActiviteRechercheId(projetActiviteRecherche.getId());
        projetActiviteRecherche.setProjetActiviteRechercheDetails(projetActiviteRechercheDetails);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        projetActiviteRechercheDetailService.deleteByProjetActiviteRechercheId(id);
}
}

    private void updateAssociatedLists(ProjetActiviteRecherche projetActiviteRecherche){
    if(projetActiviteRecherche !=null && projetActiviteRecherche.getId() != null){
            List<List<ProjetActiviteRechercheDetail>> resultProjetActiviteRechercheDetails= projetActiviteRechercheDetailService.getToBeSavedAndToBeDeleted(projetActiviteRechercheDetailService.findByProjetActiviteRechercheId(projetActiviteRecherche.getId()),projetActiviteRecherche.getProjetActiviteRechercheDetails());
            projetActiviteRechercheDetailService.delete(resultProjetActiviteRechercheDetails.get(1));
            associateProjetActiviteRechercheDetail(projetActiviteRecherche,resultProjetActiviteRechercheDetails.get(0));
            projetActiviteRechercheDetailService.update(resultProjetActiviteRechercheDetails.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(projetActiviteRechercheDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
projetActiviteRechercheDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ProjetActiviteRecherche update(ProjetActiviteRecherche projetActiviteRecherche){
ProjetActiviteRecherche foundedProjetActiviteRecherche = findById(projetActiviteRecherche.getId());
if(foundedProjetActiviteRecherche==null) return null;
else{
    updateAssociatedLists(projetActiviteRecherche);
return  projetActiviteRechercheDao.save(projetActiviteRecherche);
}
}

@Override
public ProjetActiviteRecherche save (ProjetActiviteRecherche projetActiviteRecherche){

ProjetActiviteRecherche result =null;

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
    projetActiviteRecherche.setChercheur(loadedChercheur);
    projetActiviteRecherche.setCampagne(laodedCampagne);

    findEtatEtapeCampagne(projetActiviteRecherche);
    findChercheur(projetActiviteRecherche);
    findCampagne(projetActiviteRecherche);

ProjetActiviteRecherche savedProjetActiviteRecherche = projetActiviteRechercheDao.save(projetActiviteRecherche);

       saveProjetActiviteRechercheDetails(savedProjetActiviteRecherche,projetActiviteRecherche.getProjetActiviteRechercheDetails());
result = savedProjetActiviteRecherche;
}

return result;
}

@Override
public List<ProjetActiviteRecherche> save(List<ProjetActiviteRecherche> projetActiviteRecherches){
List<ProjetActiviteRecherche> list = new ArrayList<>();
for(ProjetActiviteRecherche projetActiviteRecherche: projetActiviteRecherches){
list.add(save(projetActiviteRecherche));
}
return list;
}

        private List<ProjetActiviteRechercheDetail> prepareProjetActiviteRechercheDetails(ProjetActiviteRecherche projetActiviteRecherche,List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetails){
        for(ProjetActiviteRechercheDetail projetActiviteRechercheDetail:projetActiviteRechercheDetails ){
        projetActiviteRechercheDetail.setProjetActiviteRecherche(projetActiviteRecherche);
        }
        return projetActiviteRechercheDetails;
        }


@Override
@Transactional
public int delete(ProjetActiviteRecherche projetActiviteRecherche){
    if(projetActiviteRecherche.getId()==null) return -1;
    ProjetActiviteRecherche foundedProjetActiviteRecherche = findById(projetActiviteRecherche.getId());
    if(foundedProjetActiviteRecherche==null) return -1;
projetActiviteRechercheDao.delete(foundedProjetActiviteRecherche);
return 1;
}


public List<ProjetActiviteRecherche> findByCriteria(ProjetActiviteRechercheVo projetActiviteRechercheVo){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())) {

String query = "SELECT o FROM ProjetActiviteRecherche o where 1=1 ";
    query += SearchUtil.addConstraint("o", "chercheur.username", "=", currentUser.getUsername());

            query += SearchUtil.addConstraint( "o", "id","=",projetActiviteRechercheVo.getId());
            query += SearchUtil.addConstraint( "o", "tempsEstimePourCetteAnnne","=",projetActiviteRechercheVo.getTempsEstimePourCetteAnnne());
            query += SearchUtil.addConstraint( "o", "annee","=",projetActiviteRechercheVo.getAnnee());
            query += SearchUtil.addConstraintMinMax("o","tempsEstimePourCetteAnnne",projetActiviteRechercheVo.getTempsEstimePourCetteAnnneMin(),projetActiviteRechercheVo.getTempsEstimePourCetteAnnneMax());
            query += SearchUtil.addConstraintMinMax("o","annee",projetActiviteRechercheVo.getAnneeMin(),projetActiviteRechercheVo.getAnneeMax());
    if(projetActiviteRechercheVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",projetActiviteRechercheVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",projetActiviteRechercheVo.getEtatEtapeCampagneVo().getCode());
    }

    if(projetActiviteRechercheVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",projetActiviteRechercheVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",projetActiviteRechercheVo.getChercheurVo().getNumeroMatricule());
    }

    if(projetActiviteRechercheVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",projetActiviteRechercheVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",projetActiviteRechercheVo.getCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
return new ArrayList<>();
}
        private  void saveProjetActiviteRechercheDetails(ProjetActiviteRecherche projetActiviteRecherche,List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetails){

        if (ListUtil.isNotEmpty(projetActiviteRecherche.getProjetActiviteRechercheDetails())) {
        List<ProjetActiviteRechercheDetail> savedProjetActiviteRechercheDetails = new ArrayList<>();
        projetActiviteRechercheDetails.forEach(element -> {
        element.setProjetActiviteRecherche(projetActiviteRecherche);
         projetActiviteRechercheDetailService.save(element);
        });
        projetActiviteRecherche.setProjetActiviteRechercheDetails(savedProjetActiviteRechercheDetails);
        }
        }

    private void findEtatEtapeCampagne(ProjetActiviteRecherche projetActiviteRecherche){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(projetActiviteRecherche.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    projetActiviteRecherche.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }
    private void findChercheur(ProjetActiviteRecherche projetActiviteRecherche){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(projetActiviteRecherche.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    projetActiviteRecherche.setChercheur(loadedChercheur);
    }
    private void findCampagne(ProjetActiviteRecherche projetActiviteRecherche){
        Campagne loadedCampagne =campagneService.findByIdOrCode(projetActiviteRecherche.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    projetActiviteRecherche.setCampagne(loadedCampagne);
    }

@Override
@Transactional
public void delete(List<ProjetActiviteRecherche> projetActiviteRecherches){
        if(ListUtil.isNotEmpty(projetActiviteRecherches)){
        projetActiviteRecherches.forEach(e->projetActiviteRechercheDao.delete(e));
        }
}
@Override
public void update(List<ProjetActiviteRecherche> projetActiviteRecherches){
if(ListUtil.isNotEmpty(projetActiviteRecherches)){
projetActiviteRecherches.forEach(e->projetActiviteRechercheDao.save(e));
}
}

private void associateProjetActiviteRechercheDetail(ProjetActiviteRecherche projetActiviteRecherche, List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetail) {
    if (ListUtil.isNotEmpty(projetActiviteRechercheDetail)) {
        projetActiviteRechercheDetail.forEach(e -> e.setProjetActiviteRecherche(projetActiviteRecherche));
    }
    }

@Override
public List<ProjetActiviteRecherche> findByChercheurUsernameAndCampagneId(String username, Long compagneId){
List<ProjetActiviteRecherche> resultat= projetActiviteRechercheDao.findByChercheurUsernameAndCampagneId(username, compagneId);
    return resultat;
}

}
