package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.EtatCampagne;
import com.ird.faa.bean.TemplateOuverture;
import com.ird.faa.bean.TemplateCloture;
import com.ird.faa.bean.CampagneChercheurOuverture;
import com.ird.faa.bean.CampagneChercheurFermeture;
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.bean.Distinction;
import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.bean.InstrumentsEtDispositifsIrd;
import com.ird.faa.bean.GestionEquipe;
import com.ird.faa.dao.CampagneDao;
import com.ird.faa.service.admin.facade.CampagneAdminService;
import com.ird.faa.service.admin.facade.CampagneChercheurOuvertureAdminService;
import com.ird.faa.service.admin.facade.GestionEquipeAdminService;
import com.ird.faa.service.admin.facade.EtatCampagneAdminService;
import com.ird.faa.service.admin.facade.ProjetActiviteRechercheAdminService;
import com.ird.faa.service.admin.facade.TemplateClotureAdminService;
import com.ird.faa.service.admin.facade.InstrumentsEtDispositifsIrdAdminService;
import com.ird.faa.service.admin.facade.TemplateOuvertureAdminService;
import com.ird.faa.service.admin.facade.CampagneRelanceAdminService;
import com.ird.faa.service.admin.facade.DistinctionAdminService;
import com.ird.faa.service.admin.facade.CampagneRappelAdminService;
import com.ird.faa.service.admin.facade.CampagneChercheurFermetureAdminService;

import com.ird.faa.ws.rest.provided.vo.CampagneVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.CampagneChercheurOuverture;
import com.ird.faa.service.admin.facade.CampagneChercheurOuvertureAdminService;
import com.ird.faa.bean.CampagneChercheurFermeture;
import com.ird.faa.service.admin.facade.CampagneChercheurFermetureAdminService;
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.service.admin.facade.CampagneRelanceAdminService;
import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.service.admin.facade.CampagneRappelAdminService;
import com.ird.faa.bean.Distinction;
import com.ird.faa.service.admin.facade.DistinctionAdminService;
import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.service.admin.facade.ProjetActiviteRechercheAdminService;
import com.ird.faa.bean.InstrumentsEtDispositifsIrd;
import com.ird.faa.service.admin.facade.InstrumentsEtDispositifsIrdAdminService;
import com.ird.faa.bean.GestionEquipe;
import com.ird.faa.service.admin.facade.GestionEquipeAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneAdminServiceImpl extends AbstractServiceImpl<Campagne> implements CampagneAdminService {

@Autowired
private CampagneDao campagneDao;

        @Autowired
        private CampagneChercheurOuvertureAdminService campagneChercheurOuvertureService ;
        @Autowired
        private GestionEquipeAdminService gestionEquipeService ;
        @Autowired
        private EtatCampagneAdminService etatCampagneService ;
        @Autowired
        private ProjetActiviteRechercheAdminService projetActiviteRechercheService ;
        @Autowired
        private TemplateClotureAdminService templateClotureService ;
        @Autowired
        private InstrumentsEtDispositifsIrdAdminService instrumentsEtDispositifsIrdService ;
        @Autowired
        private TemplateOuvertureAdminService templateOuvertureService ;
        @Autowired
        private CampagneRelanceAdminService campagneRelanceService ;
        @Autowired
        private DistinctionAdminService distinctionService ;
        @Autowired
        private CampagneRappelAdminService campagneRappelService ;
        @Autowired
        private CampagneChercheurFermetureAdminService campagneChercheurFermetureService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Campagne> findAll(){
        String query = "SELECT o FROM Campagne o where 1=1 ";
        query+= " ORDER BY o.dateDepart";
        return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<Campagne> findByEtatCampagneCode(String code){
        return campagneDao.findByEtatCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatCampagneCode(String code){
        return campagneDao.deleteByEtatCampagneCode(code);
        }

        @Override
        public List<Campagne> findByEtatCampagneId(Long id){
        return campagneDao.findByEtatCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatCampagneId(Long id){
        return campagneDao.deleteByEtatCampagneId(id);
        }


        @Override
        public List<Campagne> findByTemplateOuvertureCode(String code){
        return campagneDao.findByTemplateOuvertureCode(code);
        }

        @Override
        @Transactional
        public int deleteByTemplateOuvertureCode(String code){
        return campagneDao.deleteByTemplateOuvertureCode(code);
        }

        @Override
        public List<Campagne> findByTemplateOuvertureId(Long id){
        return campagneDao.findByTemplateOuvertureId(id);
        }

        @Override
        @Transactional
        public int deleteByTemplateOuvertureId(Long id){
        return campagneDao.deleteByTemplateOuvertureId(id);
        }


        @Override
        public List<Campagne> findByTemplateClotureCode(String code){
        return campagneDao.findByTemplateClotureCode(code);
        }

        @Override
        @Transactional
        public int deleteByTemplateClotureCode(String code){
        return campagneDao.deleteByTemplateClotureCode(code);
        }

        @Override
        public List<Campagne> findByTemplateClotureId(Long id){
        return campagneDao.findByTemplateClotureId(id);
        }

        @Override
        @Transactional
        public int deleteByTemplateClotureId(Long id){
        return campagneDao.deleteByTemplateClotureId(id);
        }

    @Override
    public Campagne findByCode(String code){
    if( code==null) return null;
    return campagneDao.findByCode(code);
    }

    @Override
    @Transactional
    public int deleteByCode(String  code) {
    return campagneDao.deleteByCode(code);
    }
    @Override
    public Campagne findByIdOrCode(Campagne campagne){
        Campagne resultat=null;
        if(campagne != null){
            if(StringUtil.isNotEmpty(campagne.getId())){
            resultat= campagneDao.getOne(campagne.getId());
            }else if(StringUtil.isNotEmpty(campagne.getCode())) {
            resultat= campagneDao.findByCode(campagne.getCode());
            }
        }
    return resultat;
    }

@Override
public Campagne findById(Long id){
if(id==null) return null;
return campagneDao.getOne(id);
}

@Override
public Campagne findByIdWithAssociatedList(Long id){
Campagne campagne  = findById(id);
findAssociatedLists(campagne);
return campagne;
}
private void findAssociatedLists(Campagne campagne){
if(campagne!=null && campagne.getId() != null) {
        List<CampagneChercheurOuverture> campagneChercheurOuvertures = campagneChercheurOuvertureService.findByCampagneId(campagne.getId());
        campagne.setCampagneChercheurOuvertures(campagneChercheurOuvertures);
        List<CampagneChercheurFermeture> campagneChercheurFermetures = campagneChercheurFermetureService.findByCampagneId(campagne.getId());
        campagne.setCampagneChercheurFermetures(campagneChercheurFermetures);
        List<CampagneRelance> campagneRelances = campagneRelanceService.findByCampagneId(campagne.getId());
        campagne.setCampagneRelances(campagneRelances);
        List<CampagneRappel> campagneRappels = campagneRappelService.findByCampagneId(campagne.getId());
        campagne.setCampagneRappels(campagneRappels);
        List<Distinction> distinctions = distinctionService.findByCampagneId(campagne.getId());
        campagne.setDistinctions(distinctions);
        List<ProjetActiviteRecherche> projetActiviteRecherches = projetActiviteRechercheService.findByCampagneId(campagne.getId());
        campagne.setProjetActiviteRecherches(projetActiviteRecherches);
        List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds = instrumentsEtDispositifsIrdService.findByCampagneId(campagne.getId());
        campagne.setInstrumentsEtDispositifsIrds(instrumentsEtDispositifsIrds);
        List<GestionEquipe> gestionEquipes = gestionEquipeService.findByCampagneId(campagne.getId());
        campagne.setGestionEquipes(gestionEquipes);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        campagneChercheurOuvertureService.deleteByCampagneId(id);
        campagneChercheurFermetureService.deleteByCampagneId(id);
        campagneRelanceService.deleteByCampagneId(id);
        campagneRappelService.deleteByCampagneId(id);
        distinctionService.deleteByCampagneId(id);
        projetActiviteRechercheService.deleteByCampagneId(id);
        instrumentsEtDispositifsIrdService.deleteByCampagneId(id);
        gestionEquipeService.deleteByCampagneId(id);
}
}

    private void updateAssociatedLists(Campagne campagne){
    if(campagne !=null && campagne.getId() != null){
            List<List<CampagneChercheurOuverture>> resultCampagneChercheurOuvertures= campagneChercheurOuvertureService.getToBeSavedAndToBeDeleted(campagneChercheurOuvertureService.findByCampagneId(campagne.getId()),campagne.getCampagneChercheurOuvertures());
            campagneChercheurOuvertureService.delete(resultCampagneChercheurOuvertures.get(1));
            associateCampagneChercheurOuverture(campagne,resultCampagneChercheurOuvertures.get(0));
            campagneChercheurOuvertureService.update(resultCampagneChercheurOuvertures.get(0));

            List<List<CampagneChercheurFermeture>> resultCampagneChercheurFermetures= campagneChercheurFermetureService.getToBeSavedAndToBeDeleted(campagneChercheurFermetureService.findByCampagneId(campagne.getId()),campagne.getCampagneChercheurFermetures());
            campagneChercheurFermetureService.delete(resultCampagneChercheurFermetures.get(1));
            associateCampagneChercheurFermeture(campagne,resultCampagneChercheurFermetures.get(0));
            campagneChercheurFermetureService.update(resultCampagneChercheurFermetures.get(0));

            List<List<CampagneRelance>> resultCampagneRelances= campagneRelanceService.getToBeSavedAndToBeDeleted(campagneRelanceService.findByCampagneId(campagne.getId()),campagne.getCampagneRelances());
            campagneRelanceService.delete(resultCampagneRelances.get(1));
            associateCampagneRelance(campagne,resultCampagneRelances.get(0));
            campagneRelanceService.update(resultCampagneRelances.get(0));

            List<List<CampagneRappel>> resultCampagneRappels= campagneRappelService.getToBeSavedAndToBeDeleted(campagneRappelService.findByCampagneId(campagne.getId()),campagne.getCampagneRappels());
            campagneRappelService.delete(resultCampagneRappels.get(1));
            associateCampagneRappel(campagne,resultCampagneRappels.get(0));
            campagneRappelService.update(resultCampagneRappels.get(0));

            List<List<Distinction>> resultDistinctions= distinctionService.getToBeSavedAndToBeDeleted(distinctionService.findByCampagneId(campagne.getId()),campagne.getDistinctions());
            distinctionService.delete(resultDistinctions.get(1));
            associateDistinction(campagne,resultDistinctions.get(0));
            distinctionService.update(resultDistinctions.get(0));

            List<List<ProjetActiviteRecherche>> resultProjetActiviteRecherches= projetActiviteRechercheService.getToBeSavedAndToBeDeleted(projetActiviteRechercheService.findByCampagneId(campagne.getId()),campagne.getProjetActiviteRecherches());
            projetActiviteRechercheService.delete(resultProjetActiviteRecherches.get(1));
            associateProjetActiviteRecherche(campagne,resultProjetActiviteRecherches.get(0));
            projetActiviteRechercheService.update(resultProjetActiviteRecherches.get(0));

            List<List<InstrumentsEtDispositifsIrd>> resultInstrumentsEtDispositifsIrds= instrumentsEtDispositifsIrdService.getToBeSavedAndToBeDeleted(instrumentsEtDispositifsIrdService.findByCampagneId(campagne.getId()),campagne.getInstrumentsEtDispositifsIrds());
            instrumentsEtDispositifsIrdService.delete(resultInstrumentsEtDispositifsIrds.get(1));
            associateInstrumentsEtDispositifsIrd(campagne,resultInstrumentsEtDispositifsIrds.get(0));
            instrumentsEtDispositifsIrdService.update(resultInstrumentsEtDispositifsIrds.get(0));

            List<List<GestionEquipe>> resultGestionEquipes= gestionEquipeService.getToBeSavedAndToBeDeleted(gestionEquipeService.findByCampagneId(campagne.getId()),campagne.getGestionEquipes());
            gestionEquipeService.delete(resultGestionEquipes.get(1));
            associateGestionEquipe(campagne,resultGestionEquipes.get(0));
            gestionEquipeService.update(resultGestionEquipes.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(campagneDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
campagneDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Campagne update(Campagne campagne){
Campagne foundedCampagne = findById(campagne.getId());
if(foundedCampagne==null) return null;
else{
    updateAssociatedLists(campagne);
return  campagneDao.save(campagne);
}
}

@Override
public Campagne save (Campagne campagne){

Campagne result =null;
    Campagne foundedCampagne = findByCode(campagne.getCode());
   if(foundedCampagne == null){


    findEtatCampagne(campagne);
    findTemplateOuverture(campagne);
    findTemplateCloture(campagne);

Campagne savedCampagne = campagneDao.save(campagne);

       saveCampagneChercheurOuvertures(savedCampagne,campagne.getCampagneChercheurOuvertures());
       saveCampagneChercheurFermetures(savedCampagne,campagne.getCampagneChercheurFermetures());
       saveCampagneRelances(savedCampagne,campagne.getCampagneRelances());
       saveCampagneRappels(savedCampagne,campagne.getCampagneRappels());
       saveDistinctions(savedCampagne,campagne.getDistinctions());
       saveProjetActiviteRecherches(savedCampagne,campagne.getProjetActiviteRecherches());
       saveInstrumentsEtDispositifsIrds(savedCampagne,campagne.getInstrumentsEtDispositifsIrds());
       saveGestionEquipes(savedCampagne,campagne.getGestionEquipes());
result = savedCampagne;
   }

return result;
}

@Override
public List<Campagne> save(List<Campagne> campagnes){
List<Campagne> list = new ArrayList<>();
for(Campagne campagne: campagnes){
list.add(save(campagne));
}
return list;
}

        private List<CampagneChercheurOuverture> prepareCampagneChercheurOuvertures(Campagne campagne,List<CampagneChercheurOuverture> campagneChercheurOuvertures){
        for(CampagneChercheurOuverture campagneChercheurOuverture:campagneChercheurOuvertures ){
        campagneChercheurOuverture.setCampagne(campagne);
        }
        return campagneChercheurOuvertures;
        }
        private List<CampagneChercheurFermeture> prepareCampagneChercheurFermetures(Campagne campagne,List<CampagneChercheurFermeture> campagneChercheurFermetures){
        for(CampagneChercheurFermeture campagneChercheurFermeture:campagneChercheurFermetures ){
        campagneChercheurFermeture.setCampagne(campagne);
        }
        return campagneChercheurFermetures;
        }
        private List<CampagneRelance> prepareCampagneRelances(Campagne campagne,List<CampagneRelance> campagneRelances){
        for(CampagneRelance campagneRelance:campagneRelances ){
        campagneRelance.setCampagne(campagne);
        }
        return campagneRelances;
        }
        private List<CampagneRappel> prepareCampagneRappels(Campagne campagne,List<CampagneRappel> campagneRappels){
        for(CampagneRappel campagneRappel:campagneRappels ){
        campagneRappel.setCampagne(campagne);
        }
        return campagneRappels;
        }
        private List<Distinction> prepareDistinctions(Campagne campagne,List<Distinction> distinctions){
        for(Distinction distinction:distinctions ){
        distinction.setCampagne(campagne);
        }
        return distinctions;
        }
        private List<ProjetActiviteRecherche> prepareProjetActiviteRecherches(Campagne campagne,List<ProjetActiviteRecherche> projetActiviteRecherches){
        for(ProjetActiviteRecherche projetActiviteRecherche:projetActiviteRecherches ){
        projetActiviteRecherche.setCampagne(campagne);
        }
        return projetActiviteRecherches;
        }
        private List<InstrumentsEtDispositifsIrd> prepareInstrumentsEtDispositifsIrds(Campagne campagne,List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){
        for(InstrumentsEtDispositifsIrd instrumentsEtDispositifsIrd:instrumentsEtDispositifsIrds ){
        instrumentsEtDispositifsIrd.setCampagne(campagne);
        }
        return instrumentsEtDispositifsIrds;
        }
        private List<GestionEquipe> prepareGestionEquipes(Campagne campagne,List<GestionEquipe> gestionEquipes){
        for(GestionEquipe gestionEquipe:gestionEquipes ){
        gestionEquipe.setCampagne(campagne);
        }
        return gestionEquipes;
        }


@Override
@Transactional
public int delete(Campagne campagne){
    if(campagne.getCode()==null) return -1;

    Campagne foundedCampagne = findByCode(campagne.getCode());
    if(foundedCampagne==null) return -1;
campagneDao.delete(foundedCampagne);
return 1;
}


public List<Campagne> findByCriteria(CampagneVo campagneVo){

String query = "SELECT o FROM Campagne o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",campagneVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "code","LIKE",campagneVo.getCode());
            query += SearchUtil.addConstraint( "o", "annee","=",campagneVo.getAnnee());
        query += SearchUtil.addConstraintDate( "o", "dateDepart","=",campagneVo.getDateDepart());
        query += SearchUtil.addConstraintDate( "o", "dateFin","=",campagneVo.getDateFin());
            query += SearchUtil.addConstraint( "o", "objetOuverture","LIKE",campagneVo.getObjetOuverture());
            query += SearchUtil.addConstraint( "o", "messageOuverture","LIKE",campagneVo.getMessageOuverture());
            query += SearchUtil.addConstraint( "o", "objetCloture","LIKE",campagneVo.getObjetCloture());
            query += SearchUtil.addConstraint( "o", "messageCloture","LIKE",campagneVo.getMessageCloture());
            query += SearchUtil.addConstraintMinMax("o","annee",campagneVo.getAnneeMin(),campagneVo.getAnneeMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateDepart",campagneVo.getDateDepartMin(),campagneVo.getDateDepartMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateFin",campagneVo.getDateFinMin(),campagneVo.getDateFinMax());
    if(campagneVo.getEtatCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatCampagne.id","=",campagneVo.getEtatCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatCampagne.code","LIKE",campagneVo.getEtatCampagneVo().getCode());
    }

    if(campagneVo.getTemplateOuvertureVo()!=null){
        query += SearchUtil.addConstraint( "o", "templateOuverture.id","=",campagneVo.getTemplateOuvertureVo().getId());
            query += SearchUtil.addConstraint( "o", "templateOuverture.code","LIKE",campagneVo.getTemplateOuvertureVo().getCode());
    }

    if(campagneVo.getTemplateClotureVo()!=null){
        query += SearchUtil.addConstraint( "o", "templateCloture.id","=",campagneVo.getTemplateClotureVo().getId());
            query += SearchUtil.addConstraint( "o", "templateCloture.code","LIKE",campagneVo.getTemplateClotureVo().getCode());
    }

query+= " ORDER BY o.dateDepart";
return entityManager.createQuery(query).getResultList();
}
        private  void saveCampagneChercheurOuvertures(Campagne campagne,List<CampagneChercheurOuverture> campagneChercheurOuvertures){

        if (ListUtil.isNotEmpty(campagne.getCampagneChercheurOuvertures())) {
        List<CampagneChercheurOuverture> savedCampagneChercheurOuvertures = new ArrayList<>();
        campagneChercheurOuvertures.forEach(element -> {
        element.setCampagne(campagne);
         campagneChercheurOuvertureService.save(element);
        });
        campagne.setCampagneChercheurOuvertures(savedCampagneChercheurOuvertures);
        }
        }
        private  void saveCampagneChercheurFermetures(Campagne campagne,List<CampagneChercheurFermeture> campagneChercheurFermetures){

        if (ListUtil.isNotEmpty(campagne.getCampagneChercheurFermetures())) {
        List<CampagneChercheurFermeture> savedCampagneChercheurFermetures = new ArrayList<>();
        campagneChercheurFermetures.forEach(element -> {
        element.setCampagne(campagne);
         campagneChercheurFermetureService.save(element);
        });
        campagne.setCampagneChercheurFermetures(savedCampagneChercheurFermetures);
        }
        }
        private  void saveCampagneRelances(Campagne campagne,List<CampagneRelance> campagneRelances){

        if (ListUtil.isNotEmpty(campagne.getCampagneRelances())) {
        List<CampagneRelance> savedCampagneRelances = new ArrayList<>();
        campagneRelances.forEach(element -> {
        element.setCampagne(campagne);
         campagneRelanceService.save(element);
        });
        campagne.setCampagneRelances(savedCampagneRelances);
        }
        }
        private  void saveCampagneRappels(Campagne campagne,List<CampagneRappel> campagneRappels){

        if (ListUtil.isNotEmpty(campagne.getCampagneRappels())) {
        List<CampagneRappel> savedCampagneRappels = new ArrayList<>();
        campagneRappels.forEach(element -> {
        element.setCampagne(campagne);
         campagneRappelService.save(element);
        });
        campagne.setCampagneRappels(savedCampagneRappels);
        }
        }
        private  void saveDistinctions(Campagne campagne,List<Distinction> distinctions){

        if (ListUtil.isNotEmpty(campagne.getDistinctions())) {
        List<Distinction> savedDistinctions = new ArrayList<>();
        distinctions.forEach(element -> {
        element.setCampagne(campagne);
         distinctionService.save(element);
        });
        campagne.setDistinctions(savedDistinctions);
        }
        }
        private  void saveProjetActiviteRecherches(Campagne campagne,List<ProjetActiviteRecherche> projetActiviteRecherches){

        if (ListUtil.isNotEmpty(campagne.getProjetActiviteRecherches())) {
        List<ProjetActiviteRecherche> savedProjetActiviteRecherches = new ArrayList<>();
        projetActiviteRecherches.forEach(element -> {
        element.setCampagne(campagne);
         projetActiviteRechercheService.save(element);
        });
        campagne.setProjetActiviteRecherches(savedProjetActiviteRecherches);
        }
        }
        private  void saveInstrumentsEtDispositifsIrds(Campagne campagne,List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrds){

        if (ListUtil.isNotEmpty(campagne.getInstrumentsEtDispositifsIrds())) {
        List<InstrumentsEtDispositifsIrd> savedInstrumentsEtDispositifsIrds = new ArrayList<>();
        instrumentsEtDispositifsIrds.forEach(element -> {
        element.setCampagne(campagne);
         instrumentsEtDispositifsIrdService.save(element);
        });
        campagne.setInstrumentsEtDispositifsIrds(savedInstrumentsEtDispositifsIrds);
        }
        }
        private  void saveGestionEquipes(Campagne campagne,List<GestionEquipe> gestionEquipes){

        if (ListUtil.isNotEmpty(campagne.getGestionEquipes())) {
        List<GestionEquipe> savedGestionEquipes = new ArrayList<>();
        gestionEquipes.forEach(element -> {
        element.setCampagne(campagne);
         gestionEquipeService.save(element);
        });
        campagne.setGestionEquipes(savedGestionEquipes);
        }
        }

    private void findEtatCampagne(Campagne campagne){
        EtatCampagne loadedEtatCampagne =etatCampagneService.findByIdOrCode(campagne.getEtatCampagne());

    if(loadedEtatCampagne==null ) {
        return;
    }
    campagne.setEtatCampagne(loadedEtatCampagne);
    }
    private void findTemplateOuverture(Campagne campagne){
        TemplateOuverture loadedTemplateOuverture =templateOuvertureService.findByIdOrCode(campagne.getTemplateOuverture());

    if(loadedTemplateOuverture==null ) {
        return;
    }
    campagne.setTemplateOuverture(loadedTemplateOuverture);
    }
    private void findTemplateCloture(Campagne campagne){
        TemplateCloture loadedTemplateCloture =templateClotureService.findByIdOrCode(campagne.getTemplateCloture());

    if(loadedTemplateCloture==null ) {
        return;
    }
    campagne.setTemplateCloture(loadedTemplateCloture);
    }

@Override
@Transactional
public void delete(List<Campagne> campagnes){
        if(ListUtil.isNotEmpty(campagnes)){
        campagnes.forEach(e->campagneDao.delete(e));
        }
}
@Override
public void update(List<Campagne> campagnes){
if(ListUtil.isNotEmpty(campagnes)){
campagnes.forEach(e->campagneDao.save(e));
}
}

private void associateCampagneChercheurOuverture(Campagne campagne, List<CampagneChercheurOuverture> campagneChercheurOuverture) {
    if (ListUtil.isNotEmpty(campagneChercheurOuverture)) {
        campagneChercheurOuverture.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateCampagneChercheurFermeture(Campagne campagne, List<CampagneChercheurFermeture> campagneChercheurFermeture) {
    if (ListUtil.isNotEmpty(campagneChercheurFermeture)) {
        campagneChercheurFermeture.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateCampagneRelance(Campagne campagne, List<CampagneRelance> campagneRelance) {
    if (ListUtil.isNotEmpty(campagneRelance)) {
        campagneRelance.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateCampagneRappel(Campagne campagne, List<CampagneRappel> campagneRappel) {
    if (ListUtil.isNotEmpty(campagneRappel)) {
        campagneRappel.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateDistinction(Campagne campagne, List<Distinction> distinction) {
    if (ListUtil.isNotEmpty(distinction)) {
        distinction.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateProjetActiviteRecherche(Campagne campagne, List<ProjetActiviteRecherche> projetActiviteRecherche) {
    if (ListUtil.isNotEmpty(projetActiviteRecherche)) {
        projetActiviteRecherche.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateInstrumentsEtDispositifsIrd(Campagne campagne, List<InstrumentsEtDispositifsIrd> instrumentsEtDispositifsIrd) {
    if (ListUtil.isNotEmpty(instrumentsEtDispositifsIrd)) {
        instrumentsEtDispositifsIrd.forEach(e -> e.setCampagne(campagne));
    }
    }
private void associateGestionEquipe(Campagne campagne, List<GestionEquipe> gestionEquipe) {
    if (ListUtil.isNotEmpty(gestionEquipe)) {
        gestionEquipe.forEach(e -> e.setCampagne(campagne));
    }
    }


}
