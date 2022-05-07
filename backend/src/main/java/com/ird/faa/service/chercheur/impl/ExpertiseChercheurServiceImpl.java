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
import com.ird.faa.bean.Expertise;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.dao.ExpertiseDao;
import com.ird.faa.service.chercheur.facade.ExpertiseChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.ConseilsScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.ExpertiseVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.service.chercheur.facade.ConseilsScientifiqueChercheurService;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.service.chercheur.facade.ConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ExpertiseChercheurServiceImpl extends AbstractServiceImpl<Expertise> implements ExpertiseChercheurService {

@Autowired
private ExpertiseDao expertiseDao;

        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private ConsultanceScientifiquePonctuelleChercheurService consultanceScientifiquePonctuelleService ;
        @Autowired
        private ComiteEtCommissionEvaluationChercheurService comiteEtCommissionEvaluationService ;
        @Autowired
        private ConseilsScientifiqueChercheurService conseilsScientifiqueService ;
        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Expertise> findAll(){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
    return expertiseDao.findByChercheurUsername(currentUser.getUsername());
    }
    return new ArrayList<>();
}

        @Override
        public List<Expertise> findByEtatEtapeCampagneCode(String code){
        return expertiseDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return expertiseDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<Expertise> findByEtatEtapeCampagneId(Long id){
        return expertiseDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return expertiseDao.deleteByEtatEtapeCampagneId(id);
        }


        @Override
        public List<Expertise> findByChercheurNumeroMatricule(String numeroMatricule){
        return expertiseDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return expertiseDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<Expertise> findByChercheurId(Long id){
        return expertiseDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return expertiseDao.deleteByChercheurId(id);
        }


        @Override
        public List<Expertise> findByCampagneCode(String code){
        return expertiseDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return expertiseDao.deleteByCampagneCode(code);
        }

        @Override
        public List<Expertise> findByCampagneId(Long id){
        return expertiseDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return expertiseDao.deleteByCampagneId(id);
        }


@Override
public Expertise findById(Long id){
if(id==null) return null;
return expertiseDao.getOne(id);
}

@Override
public Expertise findByIdWithAssociatedList(Long id){
Expertise expertise  = findById(id);
findAssociatedLists(expertise);
return expertise;
}
private void findAssociatedLists(Expertise expertise){
if(expertise!=null && expertise.getId() != null) {
        List<ConseilsScientifique> conseilsScientifiques = conseilsScientifiqueService.findByExpertiseId(expertise.getId());
        expertise.setConseilsScientifiques(conseilsScientifiques);
        List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles = consultanceScientifiquePonctuelleService.findByExpertiseId(expertise.getId());
        expertise.setConsultanceScientifiquePonctuelles(consultanceScientifiquePonctuelles);
        List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations = comiteEtCommissionEvaluationService.findByExpertiseId(expertise.getId());
        expertise.setComiteEtCommissionEvaluations(comiteEtCommissionEvaluations);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        conseilsScientifiqueService.deleteByExpertiseId(id);
        consultanceScientifiquePonctuelleService.deleteByExpertiseId(id);
        comiteEtCommissionEvaluationService.deleteByExpertiseId(id);
}
}

    private void updateAssociatedLists(Expertise expertise){
    if(expertise !=null && expertise.getId() != null){
            List<List<ConseilsScientifique>> resultConseilsScientifiques= conseilsScientifiqueService.getToBeSavedAndToBeDeleted(conseilsScientifiqueService.findByExpertiseId(expertise.getId()),expertise.getConseilsScientifiques());
            conseilsScientifiqueService.delete(resultConseilsScientifiques.get(1));
            associateConseilsScientifique(expertise,resultConseilsScientifiques.get(0));
            conseilsScientifiqueService.update(resultConseilsScientifiques.get(0));

            List<List<ConsultanceScientifiquePonctuelle>> resultConsultanceScientifiquePonctuelles= consultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(consultanceScientifiquePonctuelleService.findByExpertiseId(expertise.getId()),expertise.getConsultanceScientifiquePonctuelles());
            consultanceScientifiquePonctuelleService.delete(resultConsultanceScientifiquePonctuelles.get(1));
            associateConsultanceScientifiquePonctuelle(expertise,resultConsultanceScientifiquePonctuelles.get(0));
            consultanceScientifiquePonctuelleService.update(resultConsultanceScientifiquePonctuelles.get(0));

            List<List<ComiteEtCommissionEvaluation>> resultComiteEtCommissionEvaluations= comiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(comiteEtCommissionEvaluationService.findByExpertiseId(expertise.getId()),expertise.getComiteEtCommissionEvaluations());
            comiteEtCommissionEvaluationService.delete(resultComiteEtCommissionEvaluations.get(1));
            associateComiteEtCommissionEvaluation(expertise,resultComiteEtCommissionEvaluations.get(0));
            comiteEtCommissionEvaluationService.update(resultComiteEtCommissionEvaluations.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(expertiseDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
expertiseDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Expertise update(Expertise expertise){
Expertise foundedExpertise = findById(expertise.getId());
if(foundedExpertise==null) return null;
else{
    updateAssociatedLists(expertise);
return  expertiseDao.save(expertise);
}
}

@Override
public Expertise save (Expertise expertise){

Expertise result =null;

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
    expertise.setChercheur(loadedChercheur);
    expertise.setCampagne(laodedCampagne);

    findEtatEtapeCampagne(expertise);
    findChercheur(expertise);
    findCampagne(expertise);

Expertise savedExpertise = expertiseDao.save(expertise);

       saveConseilsScientifiques(savedExpertise,expertise.getConseilsScientifiques());
       saveConsultanceScientifiquePonctuelles(savedExpertise,expertise.getConsultanceScientifiquePonctuelles());
       saveComiteEtCommissionEvaluations(savedExpertise,expertise.getComiteEtCommissionEvaluations());
result = savedExpertise;
}

return result;
}

@Override
public List<Expertise> save(List<Expertise> expertises){
List<Expertise> list = new ArrayList<>();
for(Expertise expertise: expertises){
list.add(save(expertise));
}
return list;
}

        private List<ConseilsScientifique> prepareConseilsScientifiques(Expertise expertise,List<ConseilsScientifique> conseilsScientifiques){
        for(ConseilsScientifique conseilsScientifique:conseilsScientifiques ){
        conseilsScientifique.setExpertise(expertise);
        }
        return conseilsScientifiques;
        }
        private List<ConsultanceScientifiquePonctuelle> prepareConsultanceScientifiquePonctuelles(Expertise expertise,List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles){
        for(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle:consultanceScientifiquePonctuelles ){
        consultanceScientifiquePonctuelle.setExpertise(expertise);
        }
        return consultanceScientifiquePonctuelles;
        }
        private List<ComiteEtCommissionEvaluation> prepareComiteEtCommissionEvaluations(Expertise expertise,List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations){
        for(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation:comiteEtCommissionEvaluations ){
        comiteEtCommissionEvaluation.setExpertise(expertise);
        }
        return comiteEtCommissionEvaluations;
        }


@Override
@Transactional
public int delete(Expertise expertise){
    if(expertise.getId()==null) return -1;
    Expertise foundedExpertise = findById(expertise.getId());
    if(foundedExpertise==null) return -1;
expertiseDao.delete(foundedExpertise);
return 1;
}


public List<Expertise> findByCriteria(ExpertiseVo expertiseVo){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())) {

String query = "SELECT o FROM Expertise o where 1=1 ";
    query += SearchUtil.addConstraint("o", "chercheur.username", "=", currentUser.getUsername());

            query += SearchUtil.addConstraint( "o", "id","=",expertiseVo.getId());
            query += SearchUtil.addConstraint( "o", "tempsEstimePourCetteAnnne","=",expertiseVo.getTempsEstimePourCetteAnnne());
            query += SearchUtil.addConstraint( "o", "annee","=",expertiseVo.getAnnee());
            query += SearchUtil.addConstraintMinMax("o","tempsEstimePourCetteAnnne",expertiseVo.getTempsEstimePourCetteAnnneMin(),expertiseVo.getTempsEstimePourCetteAnnneMax());
            query += SearchUtil.addConstraintMinMax("o","annee",expertiseVo.getAnneeMin(),expertiseVo.getAnneeMax());
    if(expertiseVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",expertiseVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",expertiseVo.getEtatEtapeCampagneVo().getCode());
    }

    if(expertiseVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",expertiseVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",expertiseVo.getChercheurVo().getNumeroMatricule());
    }

    if(expertiseVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",expertiseVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",expertiseVo.getCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
return new ArrayList<>();
}
        private  void saveConseilsScientifiques(Expertise expertise,List<ConseilsScientifique> conseilsScientifiques){

        if (ListUtil.isNotEmpty(expertise.getConseilsScientifiques())) {
        List<ConseilsScientifique> savedConseilsScientifiques = new ArrayList<>();
        conseilsScientifiques.forEach(element -> {
        element.setExpertise(expertise);
         conseilsScientifiqueService.save(element);
        });
        expertise.setConseilsScientifiques(savedConseilsScientifiques);
        }
        }
        private  void saveConsultanceScientifiquePonctuelles(Expertise expertise,List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(expertise.getConsultanceScientifiquePonctuelles())) {
        List<ConsultanceScientifiquePonctuelle> savedConsultanceScientifiquePonctuelles = new ArrayList<>();
        consultanceScientifiquePonctuelles.forEach(element -> {
        element.setExpertise(expertise);
         consultanceScientifiquePonctuelleService.save(element);
        });
        expertise.setConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelles);
        }
        }
        private  void saveComiteEtCommissionEvaluations(Expertise expertise,List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(expertise.getComiteEtCommissionEvaluations())) {
        List<ComiteEtCommissionEvaluation> savedComiteEtCommissionEvaluations = new ArrayList<>();
        comiteEtCommissionEvaluations.forEach(element -> {
        element.setExpertise(expertise);
         comiteEtCommissionEvaluationService.save(element);
        });
        expertise.setComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluations);
        }
        }

    private void findEtatEtapeCampagne(Expertise expertise){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(expertise.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    expertise.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }
    private void findChercheur(Expertise expertise){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(expertise.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    expertise.setChercheur(loadedChercheur);
    }
    private void findCampagne(Expertise expertise){
        Campagne loadedCampagne =campagneService.findByIdOrCode(expertise.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    expertise.setCampagne(loadedCampagne);
    }

@Override
@Transactional
public void delete(List<Expertise> expertises){
        if(ListUtil.isNotEmpty(expertises)){
        expertises.forEach(e->expertiseDao.delete(e));
        }
}
@Override
public void update(List<Expertise> expertises){
if(ListUtil.isNotEmpty(expertises)){
expertises.forEach(e->expertiseDao.save(e));
}
}

private void associateConseilsScientifique(Expertise expertise, List<ConseilsScientifique> conseilsScientifique) {
    if (ListUtil.isNotEmpty(conseilsScientifique)) {
        conseilsScientifique.forEach(e -> e.setExpertise(expertise));
    }
    }
private void associateConsultanceScientifiquePonctuelle(Expertise expertise, List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle)) {
        consultanceScientifiquePonctuelle.forEach(e -> e.setExpertise(expertise));
    }
    }
private void associateComiteEtCommissionEvaluation(Expertise expertise, List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation)) {
        comiteEtCommissionEvaluation.forEach(e -> e.setExpertise(expertise));
    }
    }

@Override
public List<Expertise> findByChercheurUsernameAndCampagneId(String username, Long compagneId){
List<Expertise> resultat= expertiseDao.findByChercheurUsernameAndCampagneId(username, compagneId);
    return resultat;
}

}
