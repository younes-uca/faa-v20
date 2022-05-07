package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.AffectationStructurelle;
import com.ird.faa.bean.EntiteAdministrative;
import com.ird.faa.bean.TypeEntiteAdministrative;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.Ville;
import com.ird.faa.bean.DepartementScientifique;
import com.ird.faa.bean.CommissionScientifique;
import com.ird.faa.bean.Grade;
import com.ird.faa.bean.Corps;
import com.ird.faa.bean.Sexe;
import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.bean.DisciplineScientifiqueChercheur;
import com.ird.faa.bean.ZoneActiviteInteractionRecherche;
import com.ird.faa.bean.EnjeuxIrdChercheur;
import com.ird.faa.bean.CommunauteSavoirChercheur;
import com.ird.faa.bean.InstrumentIrdChercheur;
import com.ird.faa.bean.TypeInstrumentIrdChercheur;
import com.ird.faa.bean.IdentifiantAuteurExpert;
import com.ird.faa.dao.ChercheurDao;
import com.ird.faa.service.admin.facade.ChercheurAdminService;
import com.ird.faa.service.admin.facade.CommunauteSavoirChercheurAdminService;
import com.ird.faa.service.admin.facade.TypeEntiteAdministrativeAdminService;
import com.ird.faa.service.admin.facade.DepartementScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ZoneActiviteInteractionRechercheAdminService;
import com.ird.faa.service.admin.facade.GradeAdminService;
import com.ird.faa.service.admin.facade.CorpsAdminService;
import com.ird.faa.service.admin.facade.CommissionScientifiqueAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;
import com.ird.faa.service.admin.facade.ChercheurEmailAdminService;
import com.ird.faa.service.admin.facade.IdentifiantAuteurExpertAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdChercheurAdminService;
import com.ird.faa.service.admin.facade.EntiteAdministrativeAdminService;
import com.ird.faa.service.admin.facade.SexeAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueChercheurAdminService;
import com.ird.faa.service.admin.facade.VilleAdminService;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdChercheurAdminService;
import com.ird.faa.service.admin.facade.AffectationStructurelleAdminService;
import com.ird.faa.service.admin.facade.InstrumentIrdChercheurAdminService;

import com.ird.faa.ws.rest.provided.vo.ChercheurVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.service.admin.facade.ChercheurEmailAdminService;
import com.ird.faa.bean.DisciplineScientifiqueChercheur;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueChercheurAdminService;
import com.ird.faa.bean.ZoneActiviteInteractionRecherche;
import com.ird.faa.service.admin.facade.ZoneActiviteInteractionRechercheAdminService;
import com.ird.faa.bean.EnjeuxIrdChercheur;
import com.ird.faa.service.admin.facade.EnjeuxIrdChercheurAdminService;
import com.ird.faa.bean.CommunauteSavoirChercheur;
import com.ird.faa.service.admin.facade.CommunauteSavoirChercheurAdminService;
import com.ird.faa.bean.InstrumentIrdChercheur;
import com.ird.faa.service.admin.facade.InstrumentIrdChercheurAdminService;
import com.ird.faa.bean.TypeInstrumentIrdChercheur;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdChercheurAdminService;
import com.ird.faa.bean.IdentifiantAuteurExpert;
import com.ird.faa.service.admin.facade.IdentifiantAuteurExpertAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ChercheurAdminServiceImpl extends AbstractServiceImpl<Chercheur> implements ChercheurAdminService {

@Autowired
private ChercheurDao chercheurDao;

        @Autowired
        private CommunauteSavoirChercheurAdminService communauteSavoirChercheurService ;
        @Autowired
        private TypeEntiteAdministrativeAdminService typeEntiteAdministrativeService ;
        @Autowired
        private DepartementScientifiqueAdminService departementScientifiqueService ;
        @Autowired
        private ZoneActiviteInteractionRechercheAdminService zoneActiviteInteractionRechercheService ;
        @Autowired
        private GradeAdminService gradeService ;
        @Autowired
        private CorpsAdminService corpsService ;
        @Autowired
        private CommissionScientifiqueAdminService commissionScientifiqueService ;
        @Autowired
        private PaysAdminService paysService ;
        @Autowired
        private ChercheurEmailAdminService chercheurEmailService ;
        @Autowired
        private IdentifiantAuteurExpertAdminService identifiantAuteurExpertService ;
        @Autowired
        private EnjeuxIrdChercheurAdminService enjeuxIrdChercheurService ;
        @Autowired
        private EntiteAdministrativeAdminService entiteAdministrativeService ;
        @Autowired
        private SexeAdminService sexeService ;
        @Autowired
        private DisciplineScientifiqueChercheurAdminService disciplineScientifiqueChercheurService ;
        @Autowired
        private VilleAdminService villeService ;
        @Autowired
        private TypeInstrumentIrdChercheurAdminService typeInstrumentIrdChercheurService ;
        @Autowired
        private AffectationStructurelleAdminService affectationStructurelleService ;
        @Autowired
        private InstrumentIrdChercheurAdminService instrumentIrdChercheurService ;


@Autowired
private EntityManager entityManager;

    @Override
   public Chercheur findByUsername(String username){
    return chercheurDao.findByUsername(username);
    }

@Override
public List<Chercheur> findAll(){
        return chercheurDao.findAll();
}

        @Override
        public List<Chercheur> findByAffectationStructurelleCode(String code){
        return chercheurDao.findByAffectationStructurelleCode(code);
        }

        @Override
        @Transactional
        public int deleteByAffectationStructurelleCode(String code){
        return chercheurDao.deleteByAffectationStructurelleCode(code);
        }

        @Override
        public List<Chercheur> findByAffectationStructurelleId(Long id){
        return chercheurDao.findByAffectationStructurelleId(id);
        }

        @Override
        @Transactional
        public int deleteByAffectationStructurelleId(Long id){
        return chercheurDao.deleteByAffectationStructurelleId(id);
        }


        @Override
        public List<Chercheur> findByEntiteAdministrativeCode(String code){
        return chercheurDao.findByEntiteAdministrativeCode(code);
        }

        @Override
        @Transactional
        public int deleteByEntiteAdministrativeCode(String code){
        return chercheurDao.deleteByEntiteAdministrativeCode(code);
        }

        @Override
        public List<Chercheur> findByEntiteAdministrativeId(Long id){
        return chercheurDao.findByEntiteAdministrativeId(id);
        }

        @Override
        @Transactional
        public int deleteByEntiteAdministrativeId(Long id){
        return chercheurDao.deleteByEntiteAdministrativeId(id);
        }


        @Override
        public List<Chercheur> findByTypeEntiteAdministrativeCode(String code){
        return chercheurDao.findByTypeEntiteAdministrativeCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeEntiteAdministrativeCode(String code){
        return chercheurDao.deleteByTypeEntiteAdministrativeCode(code);
        }

        @Override
        public List<Chercheur> findByTypeEntiteAdministrativeId(Long id){
        return chercheurDao.findByTypeEntiteAdministrativeId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeEntiteAdministrativeId(Long id){
        return chercheurDao.deleteByTypeEntiteAdministrativeId(id);
        }


        @Override
        public List<Chercheur> findByPaysCode(String code){
        return chercheurDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return chercheurDao.deleteByPaysCode(code);
        }

        @Override
        public List<Chercheur> findByPaysId(Long id){
        return chercheurDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return chercheurDao.deleteByPaysId(id);
        }


        @Override
        public List<Chercheur> findByVilleCode(String code){
        return chercheurDao.findByVilleCode(code);
        }

        @Override
        @Transactional
        public int deleteByVilleCode(String code){
        return chercheurDao.deleteByVilleCode(code);
        }

        @Override
        public List<Chercheur> findByVilleId(Long id){
        return chercheurDao.findByVilleId(id);
        }

        @Override
        @Transactional
        public int deleteByVilleId(Long id){
        return chercheurDao.deleteByVilleId(id);
        }


        @Override
        public List<Chercheur> findByDepartementScientifiqueCode(String code){
        return chercheurDao.findByDepartementScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDepartementScientifiqueCode(String code){
        return chercheurDao.deleteByDepartementScientifiqueCode(code);
        }

        @Override
        public List<Chercheur> findByDepartementScientifiqueId(Long id){
        return chercheurDao.findByDepartementScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDepartementScientifiqueId(Long id){
        return chercheurDao.deleteByDepartementScientifiqueId(id);
        }


        @Override
        public List<Chercheur> findByCommissionScientifiqueCode(String code){
        return chercheurDao.findByCommissionScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByCommissionScientifiqueCode(String code){
        return chercheurDao.deleteByCommissionScientifiqueCode(code);
        }

        @Override
        public List<Chercheur> findByCommissionScientifiqueId(Long id){
        return chercheurDao.findByCommissionScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByCommissionScientifiqueId(Long id){
        return chercheurDao.deleteByCommissionScientifiqueId(id);
        }


        @Override
        public List<Chercheur> findByGradeCode(String code){
        return chercheurDao.findByGradeCode(code);
        }

        @Override
        @Transactional
        public int deleteByGradeCode(String code){
        return chercheurDao.deleteByGradeCode(code);
        }

        @Override
        public List<Chercheur> findByGradeId(Long id){
        return chercheurDao.findByGradeId(id);
        }

        @Override
        @Transactional
        public int deleteByGradeId(Long id){
        return chercheurDao.deleteByGradeId(id);
        }


        @Override
        public List<Chercheur> findByCorpsCode(String code){
        return chercheurDao.findByCorpsCode(code);
        }

        @Override
        @Transactional
        public int deleteByCorpsCode(String code){
        return chercheurDao.deleteByCorpsCode(code);
        }

        @Override
        public List<Chercheur> findByCorpsId(Long id){
        return chercheurDao.findByCorpsId(id);
        }

        @Override
        @Transactional
        public int deleteByCorpsId(Long id){
        return chercheurDao.deleteByCorpsId(id);
        }


        @Override
        public List<Chercheur> findBySexeCode(String code){
        return chercheurDao.findBySexeCode(code);
        }

        @Override
        @Transactional
        public int deleteBySexeCode(String code){
        return chercheurDao.deleteBySexeCode(code);
        }

        @Override
        public List<Chercheur> findBySexeId(Long id){
        return chercheurDao.findBySexeId(id);
        }

        @Override
        @Transactional
        public int deleteBySexeId(Long id){
        return chercheurDao.deleteBySexeId(id);
        }

    @Override
    public Chercheur findByNumeroMatricule(String numeroMatricule){
    if( numeroMatricule==null) return null;
    return chercheurDao.findByNumeroMatricule(numeroMatricule);
    }

    @Override
    @Transactional
    public int deleteByNumeroMatricule(String  numeroMatricule) {
    return chercheurDao.deleteByNumeroMatricule(numeroMatricule);
    }
    @Override
    public Chercheur findByIdOrNumeroMatricule(Chercheur chercheur){
        Chercheur resultat=null;
        if(chercheur != null){
            if(StringUtil.isNotEmpty(chercheur.getId())){
            resultat= chercheurDao.getOne(chercheur.getId());
            }else if(StringUtil.isNotEmpty(chercheur.getNumeroMatricule())) {
            resultat= chercheurDao.findByNumeroMatricule(chercheur.getNumeroMatricule());
            }else if(StringUtil.isNotEmpty(chercheur.getUsername())) {
            resultat = chercheurDao.findByUsername(chercheur.getUsername());
            }
        }
    return resultat;
    }

@Override
public Chercheur findById(Long id){
if(id==null) return null;
return chercheurDao.getOne(id);
}

@Override
public Chercheur findByIdWithAssociatedList(Long id){
Chercheur chercheur  = findById(id);
findAssociatedLists(chercheur);
return chercheur;
}
private void findAssociatedLists(Chercheur chercheur){
if(chercheur!=null && chercheur.getId() != null) {
        List<ChercheurEmail> chercheurEmails = chercheurEmailService.findByChercheurId(chercheur.getId());
        chercheur.setChercheurEmails(chercheurEmails);
        List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheurs = disciplineScientifiqueChercheurService.findByChercheurId(chercheur.getId());
        chercheur.setDisciplineScientifiqueChercheurs(disciplineScientifiqueChercheurs);
        List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherches = zoneActiviteInteractionRechercheService.findByChercheurId(chercheur.getId());
        chercheur.setZoneActiviteInteractionRecherches(zoneActiviteInteractionRecherches);
        List<EnjeuxIrdChercheur> enjeuxIrdChercheurs = enjeuxIrdChercheurService.findByChercheurId(chercheur.getId());
        chercheur.setEnjeuxIrdChercheurs(enjeuxIrdChercheurs);
        List<CommunauteSavoirChercheur> communauteSavoirChercheurs = communauteSavoirChercheurService.findByChercheurId(chercheur.getId());
        chercheur.setCommunauteSavoirChercheurs(communauteSavoirChercheurs);
        List<InstrumentIrdChercheur> instrumentIrdChercheurs = instrumentIrdChercheurService.findByChercheurId(chercheur.getId());
        chercheur.setInstrumentIrdChercheurs(instrumentIrdChercheurs);
        List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheurs = typeInstrumentIrdChercheurService.findByChercheurId(chercheur.getId());
        chercheur.setTypeInstrumentIrdChercheurs(typeInstrumentIrdChercheurs);
        List<IdentifiantAuteurExpert> identifiantAuteurExperts = identifiantAuteurExpertService.findByChercheurId(chercheur.getId());
        chercheur.setIdentifiantAuteurExperts(identifiantAuteurExperts);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        chercheurEmailService.deleteByChercheurId(id);
        disciplineScientifiqueChercheurService.deleteByChercheurId(id);
        zoneActiviteInteractionRechercheService.deleteByChercheurId(id);
        enjeuxIrdChercheurService.deleteByChercheurId(id);
        communauteSavoirChercheurService.deleteByChercheurId(id);
        instrumentIrdChercheurService.deleteByChercheurId(id);
        typeInstrumentIrdChercheurService.deleteByChercheurId(id);
        identifiantAuteurExpertService.deleteByChercheurId(id);
}
}

    private void updateAssociatedLists(Chercheur chercheur){
    if(chercheur !=null && chercheur.getId() != null){
            List<List<ChercheurEmail>> resultChercheurEmails= chercheurEmailService.getToBeSavedAndToBeDeleted(chercheurEmailService.findByChercheurId(chercheur.getId()),chercheur.getChercheurEmails());
            chercheurEmailService.delete(resultChercheurEmails.get(1));
            associateChercheurEmail(chercheur,resultChercheurEmails.get(0));
            chercheurEmailService.update(resultChercheurEmails.get(0));

            List<List<DisciplineScientifiqueChercheur>> resultDisciplineScientifiqueChercheurs= disciplineScientifiqueChercheurService.getToBeSavedAndToBeDeleted(disciplineScientifiqueChercheurService.findByChercheurId(chercheur.getId()),chercheur.getDisciplineScientifiqueChercheurs());
            disciplineScientifiqueChercheurService.delete(resultDisciplineScientifiqueChercheurs.get(1));
            associateDisciplineScientifiqueChercheur(chercheur,resultDisciplineScientifiqueChercheurs.get(0));
            disciplineScientifiqueChercheurService.update(resultDisciplineScientifiqueChercheurs.get(0));

            List<List<ZoneActiviteInteractionRecherche>> resultZoneActiviteInteractionRecherches= zoneActiviteInteractionRechercheService.getToBeSavedAndToBeDeleted(zoneActiviteInteractionRechercheService.findByChercheurId(chercheur.getId()),chercheur.getZoneActiviteInteractionRecherches());
            zoneActiviteInteractionRechercheService.delete(resultZoneActiviteInteractionRecherches.get(1));
            associateZoneActiviteInteractionRecherche(chercheur,resultZoneActiviteInteractionRecherches.get(0));
            zoneActiviteInteractionRechercheService.update(resultZoneActiviteInteractionRecherches.get(0));

            List<List<EnjeuxIrdChercheur>> resultEnjeuxIrdChercheurs= enjeuxIrdChercheurService.getToBeSavedAndToBeDeleted(enjeuxIrdChercheurService.findByChercheurId(chercheur.getId()),chercheur.getEnjeuxIrdChercheurs());
            enjeuxIrdChercheurService.delete(resultEnjeuxIrdChercheurs.get(1));
            associateEnjeuxIrdChercheur(chercheur,resultEnjeuxIrdChercheurs.get(0));
            enjeuxIrdChercheurService.update(resultEnjeuxIrdChercheurs.get(0));

            List<List<CommunauteSavoirChercheur>> resultCommunauteSavoirChercheurs= communauteSavoirChercheurService.getToBeSavedAndToBeDeleted(communauteSavoirChercheurService.findByChercheurId(chercheur.getId()),chercheur.getCommunauteSavoirChercheurs());
            communauteSavoirChercheurService.delete(resultCommunauteSavoirChercheurs.get(1));
            associateCommunauteSavoirChercheur(chercheur,resultCommunauteSavoirChercheurs.get(0));
            communauteSavoirChercheurService.update(resultCommunauteSavoirChercheurs.get(0));

            List<List<InstrumentIrdChercheur>> resultInstrumentIrdChercheurs= instrumentIrdChercheurService.getToBeSavedAndToBeDeleted(instrumentIrdChercheurService.findByChercheurId(chercheur.getId()),chercheur.getInstrumentIrdChercheurs());
            instrumentIrdChercheurService.delete(resultInstrumentIrdChercheurs.get(1));
            associateInstrumentIrdChercheur(chercheur,resultInstrumentIrdChercheurs.get(0));
            instrumentIrdChercheurService.update(resultInstrumentIrdChercheurs.get(0));

            List<List<TypeInstrumentIrdChercheur>> resultTypeInstrumentIrdChercheurs= typeInstrumentIrdChercheurService.getToBeSavedAndToBeDeleted(typeInstrumentIrdChercheurService.findByChercheurId(chercheur.getId()),chercheur.getTypeInstrumentIrdChercheurs());
            typeInstrumentIrdChercheurService.delete(resultTypeInstrumentIrdChercheurs.get(1));
            associateTypeInstrumentIrdChercheur(chercheur,resultTypeInstrumentIrdChercheurs.get(0));
            typeInstrumentIrdChercheurService.update(resultTypeInstrumentIrdChercheurs.get(0));

            List<List<IdentifiantAuteurExpert>> resultIdentifiantAuteurExperts= identifiantAuteurExpertService.getToBeSavedAndToBeDeleted(identifiantAuteurExpertService.findByChercheurId(chercheur.getId()),chercheur.getIdentifiantAuteurExperts());
            identifiantAuteurExpertService.delete(resultIdentifiantAuteurExperts.get(1));
            associateIdentifiantAuteurExpert(chercheur,resultIdentifiantAuteurExperts.get(0));
            identifiantAuteurExpertService.update(resultIdentifiantAuteurExperts.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(chercheurDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
chercheurDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Chercheur update(Chercheur chercheur){
Chercheur foundedChercheur = findById(chercheur.getId());
if(foundedChercheur==null) return null;
else{
    updateAssociatedLists(chercheur);
return  chercheurDao.save(chercheur);
}
}
private void prepareSave(Chercheur chercheur){
if(chercheur.getConsentementRgpd() == null)
  chercheur.setConsentementRgpd(false);
if(chercheur.getFormationEnManagement() == null)
  chercheur.setFormationEnManagement(false);
  chercheur.setCredentialsNonExpired(false);
  chercheur.setEnabled(false);
  chercheur.setAccountNonExpired(false);
  chercheur.setAccountNonLocked(false);
  chercheur.setPasswordChanged(false);



}

@Override
public Chercheur save (Chercheur chercheur){
prepareSave(chercheur);

Chercheur result =null;
    Chercheur foundedChercheur = findByNumeroMatricule(chercheur.getNumeroMatricule());
   if(foundedChercheur == null){


    findAffectationStructurelle(chercheur);
    findEntiteAdministrative(chercheur);
    findTypeEntiteAdministrative(chercheur);
    findPays(chercheur);
    findVille(chercheur);
    findDepartementScientifique(chercheur);
    findCommissionScientifique(chercheur);
    findGrade(chercheur);
    findCorps(chercheur);
    findSexe(chercheur);

Chercheur savedChercheur = chercheurDao.save(chercheur);

       saveChercheurEmails(savedChercheur,chercheur.getChercheurEmails());
       saveDisciplineScientifiqueChercheurs(savedChercheur,chercheur.getDisciplineScientifiqueChercheurs());
       saveZoneActiviteInteractionRecherches(savedChercheur,chercheur.getZoneActiviteInteractionRecherches());
       saveEnjeuxIrdChercheurs(savedChercheur,chercheur.getEnjeuxIrdChercheurs());
       saveCommunauteSavoirChercheurs(savedChercheur,chercheur.getCommunauteSavoirChercheurs());
       saveInstrumentIrdChercheurs(savedChercheur,chercheur.getInstrumentIrdChercheurs());
       saveTypeInstrumentIrdChercheurs(savedChercheur,chercheur.getTypeInstrumentIrdChercheurs());
       saveIdentifiantAuteurExperts(savedChercheur,chercheur.getIdentifiantAuteurExperts());
result = savedChercheur;
   }

return result;
}

@Override
public List<Chercheur> save(List<Chercheur> chercheurs){
List<Chercheur> list = new ArrayList<>();
for(Chercheur chercheur: chercheurs){
list.add(save(chercheur));
}
return list;
}

        private List<ChercheurEmail> prepareChercheurEmails(Chercheur chercheur,List<ChercheurEmail> chercheurEmails){
        for(ChercheurEmail chercheurEmail:chercheurEmails ){
        chercheurEmail.setChercheur(chercheur);
        }
        return chercheurEmails;
        }
        private List<DisciplineScientifiqueChercheur> prepareDisciplineScientifiqueChercheurs(Chercheur chercheur,List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheurs){
        for(DisciplineScientifiqueChercheur disciplineScientifiqueChercheur:disciplineScientifiqueChercheurs ){
        disciplineScientifiqueChercheur.setChercheur(chercheur);
        }
        return disciplineScientifiqueChercheurs;
        }
        private List<ZoneActiviteInteractionRecherche> prepareZoneActiviteInteractionRecherches(Chercheur chercheur,List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherches){
        for(ZoneActiviteInteractionRecherche zoneActiviteInteractionRecherche:zoneActiviteInteractionRecherches ){
        zoneActiviteInteractionRecherche.setChercheur(chercheur);
        }
        return zoneActiviteInteractionRecherches;
        }
        private List<EnjeuxIrdChercheur> prepareEnjeuxIrdChercheurs(Chercheur chercheur,List<EnjeuxIrdChercheur> enjeuxIrdChercheurs){
        for(EnjeuxIrdChercheur enjeuxIrdChercheur:enjeuxIrdChercheurs ){
        enjeuxIrdChercheur.setChercheur(chercheur);
        }
        return enjeuxIrdChercheurs;
        }
        private List<CommunauteSavoirChercheur> prepareCommunauteSavoirChercheurs(Chercheur chercheur,List<CommunauteSavoirChercheur> communauteSavoirChercheurs){
        for(CommunauteSavoirChercheur communauteSavoirChercheur:communauteSavoirChercheurs ){
        communauteSavoirChercheur.setChercheur(chercheur);
        }
        return communauteSavoirChercheurs;
        }
        private List<InstrumentIrdChercheur> prepareInstrumentIrdChercheurs(Chercheur chercheur,List<InstrumentIrdChercheur> instrumentIrdChercheurs){
        for(InstrumentIrdChercheur instrumentIrdChercheur:instrumentIrdChercheurs ){
        instrumentIrdChercheur.setChercheur(chercheur);
        }
        return instrumentIrdChercheurs;
        }
        private List<TypeInstrumentIrdChercheur> prepareTypeInstrumentIrdChercheurs(Chercheur chercheur,List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheurs){
        for(TypeInstrumentIrdChercheur typeInstrumentIrdChercheur:typeInstrumentIrdChercheurs ){
        typeInstrumentIrdChercheur.setChercheur(chercheur);
        }
        return typeInstrumentIrdChercheurs;
        }
        private List<IdentifiantAuteurExpert> prepareIdentifiantAuteurExperts(Chercheur chercheur,List<IdentifiantAuteurExpert> identifiantAuteurExperts){
        for(IdentifiantAuteurExpert identifiantAuteurExpert:identifiantAuteurExperts ){
        identifiantAuteurExpert.setChercheur(chercheur);
        }
        return identifiantAuteurExperts;
        }


@Override
@Transactional
public int delete(Chercheur chercheur){
    if(chercheur.getNumeroMatricule()==null) return -1;

    Chercheur foundedChercheur = findByNumeroMatricule(chercheur.getNumeroMatricule());
    if(foundedChercheur==null) return -1;
chercheurDao.delete(foundedChercheur);
return 1;
}


public List<Chercheur> findByCriteria(ChercheurVo chercheurVo){

String query = "SELECT o FROM Chercheur o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",chercheurVo.getId());
            query += SearchUtil.addConstraint( "o", "consentementRgpd","=",chercheurVo.getConsentementRgpd());
            query += SearchUtil.addConstraint( "o", "numeroMatricule","LIKE",chercheurVo.getNumeroMatricule());
            query += SearchUtil.addConstraint( "o", "emailPrincipale","LIKE",chercheurVo.getEmailPrincipale());
            query += SearchUtil.addConstraint( "o", "resume","LIKE",chercheurVo.getResume());
            query += SearchUtil.addConstraint( "o", "natureImplication","LIKE",chercheurVo.getNatureImplication());
            query += SearchUtil.addConstraint( "o", "formationEnManagement","=",chercheurVo.getFormationEnManagement());
            query += SearchUtil.addConstraint( "o", "credentialsNonExpired","=",chercheurVo.getCredentialsNonExpired());
            query += SearchUtil.addConstraint( "o", "enabled","=",chercheurVo.getEnabled());
            query += SearchUtil.addConstraint( "o", "accountNonExpired","=",chercheurVo.getAccountNonExpired());
            query += SearchUtil.addConstraint( "o", "accountNonLocked","=",chercheurVo.getAccountNonLocked());
            query += SearchUtil.addConstraint( "o", "passwordChanged","=",chercheurVo.getPasswordChanged());
        query += SearchUtil.addConstraintDate( "o", "createdAt","=",chercheurVo.getCreatedAt());
        query += SearchUtil.addConstraintDate( "o", "updatedAt","=",chercheurVo.getUpdatedAt());
            query += SearchUtil.addConstraint( "o", "username","LIKE",chercheurVo.getUsername());
            query += SearchUtil.addConstraint( "o", "password","LIKE",chercheurVo.getPassword());
            query += SearchUtil.addConstraint( "o", "prenom","LIKE",chercheurVo.getPrenom());
            query += SearchUtil.addConstraint( "o", "nom","LIKE",chercheurVo.getNom());
            query += SearchUtil.addConstraint( "o", "baseHorizon","LIKE",chercheurVo.getBaseHorizon());
            query += SearchUtil.addConstraint( "o", "role","LIKE",chercheurVo.getRole());
            query += SearchUtil.addConstraintMinMaxDate("o","createdAt",chercheurVo.getCreatedAtMin(),chercheurVo.getCreatedAtMax());
            query += SearchUtil.addConstraintMinMaxDate("o","updatedAt",chercheurVo.getUpdatedAtMin(),chercheurVo.getUpdatedAtMax());
    if(chercheurVo.getAffectationStructurelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "affectationStructurelle.id","=",chercheurVo.getAffectationStructurelleVo().getId());
            query += SearchUtil.addConstraint( "o", "affectationStructurelle.code","LIKE",chercheurVo.getAffectationStructurelleVo().getCode());
    }

    if(chercheurVo.getEntiteAdministrativeVo()!=null){
        query += SearchUtil.addConstraint( "o", "entiteAdministrative.id","=",chercheurVo.getEntiteAdministrativeVo().getId());
            query += SearchUtil.addConstraint( "o", "entiteAdministrative.code","LIKE",chercheurVo.getEntiteAdministrativeVo().getCode());
    }

    if(chercheurVo.getTypeEntiteAdministrativeVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeEntiteAdministrative.id","=",chercheurVo.getTypeEntiteAdministrativeVo().getId());
            query += SearchUtil.addConstraint( "o", "typeEntiteAdministrative.code","LIKE",chercheurVo.getTypeEntiteAdministrativeVo().getCode());
    }

    if(chercheurVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",chercheurVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",chercheurVo.getPaysVo().getCode());
    }

    if(chercheurVo.getVilleVo()!=null){
        query += SearchUtil.addConstraint( "o", "ville.id","=",chercheurVo.getVilleVo().getId());
            query += SearchUtil.addConstraint( "o", "ville.code","LIKE",chercheurVo.getVilleVo().getCode());
    }

    if(chercheurVo.getDepartementScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "departementScientifique.id","=",chercheurVo.getDepartementScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "departementScientifique.code","LIKE",chercheurVo.getDepartementScientifiqueVo().getCode());
    }

    if(chercheurVo.getCommissionScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "commissionScientifique.id","=",chercheurVo.getCommissionScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "commissionScientifique.code","LIKE",chercheurVo.getCommissionScientifiqueVo().getCode());
    }

    if(chercheurVo.getGradeVo()!=null){
        query += SearchUtil.addConstraint( "o", "grade.id","=",chercheurVo.getGradeVo().getId());
            query += SearchUtil.addConstraint( "o", "grade.code","LIKE",chercheurVo.getGradeVo().getCode());
    }

    if(chercheurVo.getCorpsVo()!=null){
        query += SearchUtil.addConstraint( "o", "corps.id","=",chercheurVo.getCorpsVo().getId());
            query += SearchUtil.addConstraint( "o", "corps.code","LIKE",chercheurVo.getCorpsVo().getCode());
    }

    if(chercheurVo.getSexeVo()!=null){
        query += SearchUtil.addConstraint( "o", "sexe.id","=",chercheurVo.getSexeVo().getId());
            query += SearchUtil.addConstraint( "o", "sexe.code","LIKE",chercheurVo.getSexeVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveChercheurEmails(Chercheur chercheur,List<ChercheurEmail> chercheurEmails){

        if (ListUtil.isNotEmpty(chercheur.getChercheurEmails())) {
        List<ChercheurEmail> savedChercheurEmails = new ArrayList<>();
        chercheurEmails.forEach(element -> {
        element.setChercheur(chercheur);
         chercheurEmailService.save(element);
        });
        chercheur.setChercheurEmails(savedChercheurEmails);
        }
        }
        private  void saveDisciplineScientifiqueChercheurs(Chercheur chercheur,List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheurs){

        if (ListUtil.isNotEmpty(chercheur.getDisciplineScientifiqueChercheurs())) {
        List<DisciplineScientifiqueChercheur> savedDisciplineScientifiqueChercheurs = new ArrayList<>();
        disciplineScientifiqueChercheurs.forEach(element -> {
        element.setChercheur(chercheur);
         disciplineScientifiqueChercheurService.save(element);
        });
        chercheur.setDisciplineScientifiqueChercheurs(savedDisciplineScientifiqueChercheurs);
        }
        }
        private  void saveZoneActiviteInteractionRecherches(Chercheur chercheur,List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherches){

        if (ListUtil.isNotEmpty(chercheur.getZoneActiviteInteractionRecherches())) {
        List<ZoneActiviteInteractionRecherche> savedZoneActiviteInteractionRecherches = new ArrayList<>();
        zoneActiviteInteractionRecherches.forEach(element -> {
        element.setChercheur(chercheur);
         zoneActiviteInteractionRechercheService.save(element);
        });
        chercheur.setZoneActiviteInteractionRecherches(savedZoneActiviteInteractionRecherches);
        }
        }
        private  void saveEnjeuxIrdChercheurs(Chercheur chercheur,List<EnjeuxIrdChercheur> enjeuxIrdChercheurs){

        if (ListUtil.isNotEmpty(chercheur.getEnjeuxIrdChercheurs())) {
        List<EnjeuxIrdChercheur> savedEnjeuxIrdChercheurs = new ArrayList<>();
        enjeuxIrdChercheurs.forEach(element -> {
        element.setChercheur(chercheur);
         enjeuxIrdChercheurService.save(element);
        });
        chercheur.setEnjeuxIrdChercheurs(savedEnjeuxIrdChercheurs);
        }
        }
        private  void saveCommunauteSavoirChercheurs(Chercheur chercheur,List<CommunauteSavoirChercheur> communauteSavoirChercheurs){

        if (ListUtil.isNotEmpty(chercheur.getCommunauteSavoirChercheurs())) {
        List<CommunauteSavoirChercheur> savedCommunauteSavoirChercheurs = new ArrayList<>();
        communauteSavoirChercheurs.forEach(element -> {
        element.setChercheur(chercheur);
         communauteSavoirChercheurService.save(element);
        });
        chercheur.setCommunauteSavoirChercheurs(savedCommunauteSavoirChercheurs);
        }
        }
        private  void saveInstrumentIrdChercheurs(Chercheur chercheur,List<InstrumentIrdChercheur> instrumentIrdChercheurs){

        if (ListUtil.isNotEmpty(chercheur.getInstrumentIrdChercheurs())) {
        List<InstrumentIrdChercheur> savedInstrumentIrdChercheurs = new ArrayList<>();
        instrumentIrdChercheurs.forEach(element -> {
        element.setChercheur(chercheur);
         instrumentIrdChercheurService.save(element);
        });
        chercheur.setInstrumentIrdChercheurs(savedInstrumentIrdChercheurs);
        }
        }
        private  void saveTypeInstrumentIrdChercheurs(Chercheur chercheur,List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheurs){

        if (ListUtil.isNotEmpty(chercheur.getTypeInstrumentIrdChercheurs())) {
        List<TypeInstrumentIrdChercheur> savedTypeInstrumentIrdChercheurs = new ArrayList<>();
        typeInstrumentIrdChercheurs.forEach(element -> {
        element.setChercheur(chercheur);
         typeInstrumentIrdChercheurService.save(element);
        });
        chercheur.setTypeInstrumentIrdChercheurs(savedTypeInstrumentIrdChercheurs);
        }
        }
        private  void saveIdentifiantAuteurExperts(Chercheur chercheur,List<IdentifiantAuteurExpert> identifiantAuteurExperts){

        if (ListUtil.isNotEmpty(chercheur.getIdentifiantAuteurExperts())) {
        List<IdentifiantAuteurExpert> savedIdentifiantAuteurExperts = new ArrayList<>();
        identifiantAuteurExperts.forEach(element -> {
        element.setChercheur(chercheur);
         identifiantAuteurExpertService.save(element);
        });
        chercheur.setIdentifiantAuteurExperts(savedIdentifiantAuteurExperts);
        }
        }

    private void findAffectationStructurelle(Chercheur chercheur){
        AffectationStructurelle loadedAffectationStructurelle =affectationStructurelleService.findByIdOrCode(chercheur.getAffectationStructurelle());

    if(loadedAffectationStructurelle==null ) {
        return;
    }
    chercheur.setAffectationStructurelle(loadedAffectationStructurelle);
    }
    private void findEntiteAdministrative(Chercheur chercheur){
        EntiteAdministrative loadedEntiteAdministrative =entiteAdministrativeService.findByIdOrCode(chercheur.getEntiteAdministrative());

    if(loadedEntiteAdministrative==null ) {
        return;
    }
    chercheur.setEntiteAdministrative(loadedEntiteAdministrative);
    }
    private void findTypeEntiteAdministrative(Chercheur chercheur){
        TypeEntiteAdministrative loadedTypeEntiteAdministrative =typeEntiteAdministrativeService.findByIdOrCode(chercheur.getTypeEntiteAdministrative());

    if(loadedTypeEntiteAdministrative==null ) {
        return;
    }
    chercheur.setTypeEntiteAdministrative(loadedTypeEntiteAdministrative);
    }
    private void findPays(Chercheur chercheur){
        Pays loadedPays =paysService.findByIdOrCode(chercheur.getPays());

    if(loadedPays==null ) {
        return;
    }
    chercheur.setPays(loadedPays);
    }
    private void findVille(Chercheur chercheur){
        Ville loadedVille =villeService.findByIdOrCode(chercheur.getVille());

    if(loadedVille==null ) {
        return;
    }
    chercheur.setVille(loadedVille);
    }
    private void findDepartementScientifique(Chercheur chercheur){
        DepartementScientifique loadedDepartementScientifique =departementScientifiqueService.findByIdOrCode(chercheur.getDepartementScientifique());

    if(loadedDepartementScientifique==null ) {
        return;
    }
    chercheur.setDepartementScientifique(loadedDepartementScientifique);
    }
    private void findCommissionScientifique(Chercheur chercheur){
        CommissionScientifique loadedCommissionScientifique =commissionScientifiqueService.findByIdOrCode(chercheur.getCommissionScientifique());

    if(loadedCommissionScientifique==null ) {
        return;
    }
    chercheur.setCommissionScientifique(loadedCommissionScientifique);
    }
    private void findGrade(Chercheur chercheur){
        Grade loadedGrade =gradeService.findByIdOrCode(chercheur.getGrade());

    if(loadedGrade==null ) {
        return;
    }
    chercheur.setGrade(loadedGrade);
    }
    private void findCorps(Chercheur chercheur){
        Corps loadedCorps =corpsService.findByIdOrCode(chercheur.getCorps());

    if(loadedCorps==null ) {
        return;
    }
    chercheur.setCorps(loadedCorps);
    }
    private void findSexe(Chercheur chercheur){
        Sexe loadedSexe =sexeService.findByIdOrCode(chercheur.getSexe());

    if(loadedSexe==null ) {
        return;
    }
    chercheur.setSexe(loadedSexe);
    }

@Override
@Transactional
public void delete(List<Chercheur> chercheurs){
        if(ListUtil.isNotEmpty(chercheurs)){
        chercheurs.forEach(e->chercheurDao.delete(e));
        }
}
@Override
public void update(List<Chercheur> chercheurs){
if(ListUtil.isNotEmpty(chercheurs)){
chercheurs.forEach(e->chercheurDao.save(e));
}
}

private void associateChercheurEmail(Chercheur chercheur, List<ChercheurEmail> chercheurEmail) {
    if (ListUtil.isNotEmpty(chercheurEmail)) {
        chercheurEmail.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateDisciplineScientifiqueChercheur(Chercheur chercheur, List<DisciplineScientifiqueChercheur> disciplineScientifiqueChercheur) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueChercheur)) {
        disciplineScientifiqueChercheur.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateZoneActiviteInteractionRecherche(Chercheur chercheur, List<ZoneActiviteInteractionRecherche> zoneActiviteInteractionRecherche) {
    if (ListUtil.isNotEmpty(zoneActiviteInteractionRecherche)) {
        zoneActiviteInteractionRecherche.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateEnjeuxIrdChercheur(Chercheur chercheur, List<EnjeuxIrdChercheur> enjeuxIrdChercheur) {
    if (ListUtil.isNotEmpty(enjeuxIrdChercheur)) {
        enjeuxIrdChercheur.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateCommunauteSavoirChercheur(Chercheur chercheur, List<CommunauteSavoirChercheur> communauteSavoirChercheur) {
    if (ListUtil.isNotEmpty(communauteSavoirChercheur)) {
        communauteSavoirChercheur.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateInstrumentIrdChercheur(Chercheur chercheur, List<InstrumentIrdChercheur> instrumentIrdChercheur) {
    if (ListUtil.isNotEmpty(instrumentIrdChercheur)) {
        instrumentIrdChercheur.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateTypeInstrumentIrdChercheur(Chercheur chercheur, List<TypeInstrumentIrdChercheur> typeInstrumentIrdChercheur) {
    if (ListUtil.isNotEmpty(typeInstrumentIrdChercheur)) {
        typeInstrumentIrdChercheur.forEach(e -> e.setChercheur(chercheur));
    }
    }
private void associateIdentifiantAuteurExpert(Chercheur chercheur, List<IdentifiantAuteurExpert> identifiantAuteurExpert) {
    if (ListUtil.isNotEmpty(identifiantAuteurExpert)) {
        identifiantAuteurExpert.forEach(e -> e.setChercheur(chercheur));
    }
    }


}
