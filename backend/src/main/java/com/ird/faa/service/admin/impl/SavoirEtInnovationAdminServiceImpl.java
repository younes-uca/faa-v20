package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.SavoirEtInnovation;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.ContratEtConventionIrd;
import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.SavoirEtInnovationDao;
import com.ird.faa.service.admin.facade.SavoirEtInnovationAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.ContratEtConventionIrdAdminService;
import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueAdminService;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;
import com.ird.faa.service.admin.facade.CampagneAdminService;
import com.ird.faa.service.admin.facade.ChercheurAdminService;

import com.ird.faa.ws.rest.provided.vo.SavoirEtInnovationVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.ContratEtConventionIrd;
import com.ird.faa.service.admin.facade.ContratEtConventionIrdAdminService;
import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.service.admin.facade.EvenementColloqueScienntifiqueAdminService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class SavoirEtInnovationAdminServiceImpl extends AbstractServiceImpl<SavoirEtInnovation> implements SavoirEtInnovationAdminService {

@Autowired
private SavoirEtInnovationDao savoirEtInnovationDao;

        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private ContratEtConventionIrdAdminService contratEtConventionIrdService ;
        @Autowired
        private EvenementColloqueScienntifiqueAdminService evenementColloqueScienntifiqueService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueAdminService developpementDeSavoirEtInnovationScientifiqueService ;
        @Autowired
        private CampagneAdminService campagneService ;
        @Autowired
        private ChercheurAdminService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<SavoirEtInnovation> findAll(){
        return savoirEtInnovationDao.findAll();
}

        @Override
        public List<SavoirEtInnovation> findByCampagneCode(String code){
        return savoirEtInnovationDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return savoirEtInnovationDao.deleteByCampagneCode(code);
        }

        @Override
        public List<SavoirEtInnovation> findByCampagneId(Long id){
        return savoirEtInnovationDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return savoirEtInnovationDao.deleteByCampagneId(id);
        }


        @Override
        public List<SavoirEtInnovation> findByChercheurNumeroMatricule(String numeroMatricule){
        return savoirEtInnovationDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return savoirEtInnovationDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<SavoirEtInnovation> findByChercheurId(Long id){
        return savoirEtInnovationDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return savoirEtInnovationDao.deleteByChercheurId(id);
        }


        @Override
        public List<SavoirEtInnovation> findByEtatEtapeCampagneCode(String code){
        return savoirEtInnovationDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return savoirEtInnovationDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<SavoirEtInnovation> findByEtatEtapeCampagneId(Long id){
        return savoirEtInnovationDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return savoirEtInnovationDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public SavoirEtInnovation findById(Long id){
if(id==null) return null;
return savoirEtInnovationDao.getOne(id);
}

@Override
public SavoirEtInnovation findByIdWithAssociatedList(Long id){
SavoirEtInnovation savoirEtInnovation  = findById(id);
findAssociatedLists(savoirEtInnovation);
return savoirEtInnovation;
}
private void findAssociatedLists(SavoirEtInnovation savoirEtInnovation){
if(savoirEtInnovation!=null && savoirEtInnovation.getId() != null) {
        List<ContratEtConventionIrd> contratEtConventionIrds = contratEtConventionIrdService.findBySavoirEtInnovationId(savoirEtInnovation.getId());
        savoirEtInnovation.setContratEtConventionIrds(contratEtConventionIrds);
        List<EvenementColloqueScienntifique> evenementColloqueScienntifiques = evenementColloqueScienntifiqueService.findBySavoirEtInnovationId(savoirEtInnovation.getId());
        savoirEtInnovation.setEvenementColloqueScienntifiques(evenementColloqueScienntifiques);
        List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques = developpementDeSavoirEtInnovationScientifiqueService.findBySavoirEtInnovationId(savoirEtInnovation.getId());
        savoirEtInnovation.setDeveloppementDeSavoirEtInnovationScientifiques(developpementDeSavoirEtInnovationScientifiques);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        contratEtConventionIrdService.deleteBySavoirEtInnovationId(id);
        evenementColloqueScienntifiqueService.deleteBySavoirEtInnovationId(id);
        developpementDeSavoirEtInnovationScientifiqueService.deleteBySavoirEtInnovationId(id);
}
}

    private void updateAssociatedLists(SavoirEtInnovation savoirEtInnovation){
    if(savoirEtInnovation !=null && savoirEtInnovation.getId() != null){
            List<List<ContratEtConventionIrd>> resultContratEtConventionIrds= contratEtConventionIrdService.getToBeSavedAndToBeDeleted(contratEtConventionIrdService.findBySavoirEtInnovationId(savoirEtInnovation.getId()),savoirEtInnovation.getContratEtConventionIrds());
            contratEtConventionIrdService.delete(resultContratEtConventionIrds.get(1));
            associateContratEtConventionIrd(savoirEtInnovation,resultContratEtConventionIrds.get(0));
            contratEtConventionIrdService.update(resultContratEtConventionIrds.get(0));

            List<List<EvenementColloqueScienntifique>> resultEvenementColloqueScienntifiques= evenementColloqueScienntifiqueService.getToBeSavedAndToBeDeleted(evenementColloqueScienntifiqueService.findBySavoirEtInnovationId(savoirEtInnovation.getId()),savoirEtInnovation.getEvenementColloqueScienntifiques());
            evenementColloqueScienntifiqueService.delete(resultEvenementColloqueScienntifiques.get(1));
            associateEvenementColloqueScienntifique(savoirEtInnovation,resultEvenementColloqueScienntifiques.get(0));
            evenementColloqueScienntifiqueService.update(resultEvenementColloqueScienntifiques.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifique>> resultDeveloppementDeSavoirEtInnovationScientifiques= developpementDeSavoirEtInnovationScientifiqueService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueService.findBySavoirEtInnovationId(savoirEtInnovation.getId()),savoirEtInnovation.getDeveloppementDeSavoirEtInnovationScientifiques());
            developpementDeSavoirEtInnovationScientifiqueService.delete(resultDeveloppementDeSavoirEtInnovationScientifiques.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifique(savoirEtInnovation,resultDeveloppementDeSavoirEtInnovationScientifiques.get(0));
            developpementDeSavoirEtInnovationScientifiqueService.update(resultDeveloppementDeSavoirEtInnovationScientifiques.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(savoirEtInnovationDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
savoirEtInnovationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public SavoirEtInnovation update(SavoirEtInnovation savoirEtInnovation){
SavoirEtInnovation foundedSavoirEtInnovation = findById(savoirEtInnovation.getId());
if(foundedSavoirEtInnovation==null) return null;
else{
    updateAssociatedLists(savoirEtInnovation);
return  savoirEtInnovationDao.save(savoirEtInnovation);
}
}

@Override
public SavoirEtInnovation save (SavoirEtInnovation savoirEtInnovation){

SavoirEtInnovation result =null;


    findCampagne(savoirEtInnovation);
    findChercheur(savoirEtInnovation);
    findEtatEtapeCampagne(savoirEtInnovation);

SavoirEtInnovation savedSavoirEtInnovation = savoirEtInnovationDao.save(savoirEtInnovation);

       saveContratEtConventionIrds(savedSavoirEtInnovation,savoirEtInnovation.getContratEtConventionIrds());
       saveEvenementColloqueScienntifiques(savedSavoirEtInnovation,savoirEtInnovation.getEvenementColloqueScienntifiques());
       saveDeveloppementDeSavoirEtInnovationScientifiques(savedSavoirEtInnovation,savoirEtInnovation.getDeveloppementDeSavoirEtInnovationScientifiques());
result = savedSavoirEtInnovation;

return result;
}

@Override
public List<SavoirEtInnovation> save(List<SavoirEtInnovation> savoirEtInnovations){
List<SavoirEtInnovation> list = new ArrayList<>();
for(SavoirEtInnovation savoirEtInnovation: savoirEtInnovations){
list.add(save(savoirEtInnovation));
}
return list;
}

        private List<ContratEtConventionIrd> prepareContratEtConventionIrds(SavoirEtInnovation savoirEtInnovation,List<ContratEtConventionIrd> contratEtConventionIrds){
        for(ContratEtConventionIrd contratEtConventionIrd:contratEtConventionIrds ){
        contratEtConventionIrd.setSavoirEtInnovation(savoirEtInnovation);
        }
        return contratEtConventionIrds;
        }
        private List<EvenementColloqueScienntifique> prepareEvenementColloqueScienntifiques(SavoirEtInnovation savoirEtInnovation,List<EvenementColloqueScienntifique> evenementColloqueScienntifiques){
        for(EvenementColloqueScienntifique evenementColloqueScienntifique:evenementColloqueScienntifiques ){
        evenementColloqueScienntifique.setSavoirEtInnovation(savoirEtInnovation);
        }
        return evenementColloqueScienntifiques;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifique> prepareDeveloppementDeSavoirEtInnovationScientifiques(SavoirEtInnovation savoirEtInnovation,List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){
        for(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique:developpementDeSavoirEtInnovationScientifiques ){
        developpementDeSavoirEtInnovationScientifique.setSavoirEtInnovation(savoirEtInnovation);
        }
        return developpementDeSavoirEtInnovationScientifiques;
        }


@Override
@Transactional
public int delete(SavoirEtInnovation savoirEtInnovation){
    if(savoirEtInnovation.getId()==null) return -1;
    SavoirEtInnovation foundedSavoirEtInnovation = findById(savoirEtInnovation.getId());
    if(foundedSavoirEtInnovation==null) return -1;
savoirEtInnovationDao.delete(foundedSavoirEtInnovation);
return 1;
}


public List<SavoirEtInnovation> findByCriteria(SavoirEtInnovationVo savoirEtInnovationVo){

String query = "SELECT o FROM SavoirEtInnovation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",savoirEtInnovationVo.getId());
            query += SearchUtil.addConstraint( "o", "annee","=",savoirEtInnovationVo.getAnnee());
            query += SearchUtil.addConstraint( "o", "tempsEstimePourCetteAnnne","=",savoirEtInnovationVo.getTempsEstimePourCetteAnnne());
            query += SearchUtil.addConstraintMinMax("o","annee",savoirEtInnovationVo.getAnneeMin(),savoirEtInnovationVo.getAnneeMax());
            query += SearchUtil.addConstraintMinMax("o","tempsEstimePourCetteAnnne",savoirEtInnovationVo.getTempsEstimePourCetteAnnneMin(),savoirEtInnovationVo.getTempsEstimePourCetteAnnneMax());
    if(savoirEtInnovationVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",savoirEtInnovationVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",savoirEtInnovationVo.getCampagneVo().getCode());
    }

    if(savoirEtInnovationVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",savoirEtInnovationVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",savoirEtInnovationVo.getChercheurVo().getNumeroMatricule());
    }

    if(savoirEtInnovationVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",savoirEtInnovationVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",savoirEtInnovationVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveContratEtConventionIrds(SavoirEtInnovation savoirEtInnovation,List<ContratEtConventionIrd> contratEtConventionIrds){

        if (ListUtil.isNotEmpty(savoirEtInnovation.getContratEtConventionIrds())) {
        List<ContratEtConventionIrd> savedContratEtConventionIrds = new ArrayList<>();
        contratEtConventionIrds.forEach(element -> {
        element.setSavoirEtInnovation(savoirEtInnovation);
         contratEtConventionIrdService.save(element);
        });
        savoirEtInnovation.setContratEtConventionIrds(savedContratEtConventionIrds);
        }
        }
        private  void saveEvenementColloqueScienntifiques(SavoirEtInnovation savoirEtInnovation,List<EvenementColloqueScienntifique> evenementColloqueScienntifiques){

        if (ListUtil.isNotEmpty(savoirEtInnovation.getEvenementColloqueScienntifiques())) {
        List<EvenementColloqueScienntifique> savedEvenementColloqueScienntifiques = new ArrayList<>();
        evenementColloqueScienntifiques.forEach(element -> {
        element.setSavoirEtInnovation(savoirEtInnovation);
         evenementColloqueScienntifiqueService.save(element);
        });
        savoirEtInnovation.setEvenementColloqueScienntifiques(savedEvenementColloqueScienntifiques);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiques(SavoirEtInnovation savoirEtInnovation,List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){

        if (ListUtil.isNotEmpty(savoirEtInnovation.getDeveloppementDeSavoirEtInnovationScientifiques())) {
        List<DeveloppementDeSavoirEtInnovationScientifique> savedDeveloppementDeSavoirEtInnovationScientifiques = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiques.forEach(element -> {
        element.setSavoirEtInnovation(savoirEtInnovation);
         developpementDeSavoirEtInnovationScientifiqueService.save(element);
        });
        savoirEtInnovation.setDeveloppementDeSavoirEtInnovationScientifiques(savedDeveloppementDeSavoirEtInnovationScientifiques);
        }
        }

    private void findCampagne(SavoirEtInnovation savoirEtInnovation){
        Campagne loadedCampagne =campagneService.findByIdOrCode(savoirEtInnovation.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    savoirEtInnovation.setCampagne(loadedCampagne);
    }
    private void findChercheur(SavoirEtInnovation savoirEtInnovation){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(savoirEtInnovation.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    savoirEtInnovation.setChercheur(loadedChercheur);
    }
    private void findEtatEtapeCampagne(SavoirEtInnovation savoirEtInnovation){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(savoirEtInnovation.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    savoirEtInnovation.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<SavoirEtInnovation> savoirEtInnovations){
        if(ListUtil.isNotEmpty(savoirEtInnovations)){
        savoirEtInnovations.forEach(e->savoirEtInnovationDao.delete(e));
        }
}
@Override
public void update(List<SavoirEtInnovation> savoirEtInnovations){
if(ListUtil.isNotEmpty(savoirEtInnovations)){
savoirEtInnovations.forEach(e->savoirEtInnovationDao.save(e));
}
}

private void associateContratEtConventionIrd(SavoirEtInnovation savoirEtInnovation, List<ContratEtConventionIrd> contratEtConventionIrd) {
    if (ListUtil.isNotEmpty(contratEtConventionIrd)) {
        contratEtConventionIrd.forEach(e -> e.setSavoirEtInnovation(savoirEtInnovation));
    }
    }
private void associateEvenementColloqueScienntifique(SavoirEtInnovation savoirEtInnovation, List<EvenementColloqueScienntifique> evenementColloqueScienntifique) {
    if (ListUtil.isNotEmpty(evenementColloqueScienntifique)) {
        evenementColloqueScienntifique.forEach(e -> e.setSavoirEtInnovation(savoirEtInnovation));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifique(SavoirEtInnovation savoirEtInnovation, List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifique) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique)) {
        developpementDeSavoirEtInnovationScientifique.forEach(e -> e.setSavoirEtInnovation(savoirEtInnovation));
    }
    }


}
