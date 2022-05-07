package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.bean.RoleDeveloppementDeSavoir;
import com.ird.faa.bean.SavoirEtInnovation;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.bean.TypeUtilisateurSavoirConcu;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.dao.DeveloppementDeSavoirEtInnovationScientifiqueDao;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.SavoirEtInnovationChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurService;
import com.ird.faa.service.chercheur.facade.RoleDeveloppementDeSavoirChercheurService;
import com.ird.faa.service.chercheur.facade.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirChercheurService;
import com.ird.faa.service.chercheur.facade.TypeUtilisateurSavoirConcuChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.service.chercheur.facade.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService;
import com.ird.faa.bean.TypeUtilisateurSavoirConcu;
import com.ird.faa.service.chercheur.facade.TypeUtilisateurSavoirConcuChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DeveloppementDeSavoirEtInnovationScientifiqueChercheurServiceImpl extends AbstractServiceImpl<DeveloppementDeSavoirEtInnovationScientifique> implements DeveloppementDeSavoirEtInnovationScientifiqueChercheurService {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueDao developpementDeSavoirEtInnovationScientifiqueDao;

        @Autowired
        private SavoirEtInnovationChercheurService savoirEtInnovationService ;
        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService developpementDeSavoirEtInnovationScientifiquePaysService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueEtablissementChercheurService developpementDeSavoirEtInnovationScientifiqueEtablissementService ;
        @Autowired
        private RoleDeveloppementDeSavoirChercheurService roleDeveloppementDeSavoirService ;
        @Autowired
        private TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirChercheurService developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService ;
        @Autowired
        private TypeUtilisateurSavoirConcuChercheurService typeUtilisateurSavoirConcuService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueChercheurService developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService developpementDeSavoirEtInnovationScientifiqueModeDiffusionService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdChercheurService developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DeveloppementDeSavoirEtInnovationScientifique> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueDao.findAll();
}

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDao.findByRoleDeveloppementDeSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByRoleDeveloppementDeSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDao.deleteByRoleDeveloppementDeSavoirCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.findByRoleDeveloppementDeSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByRoleDeveloppementDeSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.deleteByRoleDeveloppementDeSavoirId(id);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifique> findBySavoirEtInnovationId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.findBySavoirEtInnovationId(id);
        }

        @Override
        @Transactional
        public int deleteBySavoirEtInnovationId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.deleteBySavoirEtInnovationId(id);
        }


        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public DeveloppementDeSavoirEtInnovationScientifique findById(Long id){
if(id==null) return null;
return developpementDeSavoirEtInnovationScientifiqueDao.getOne(id);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifique findByIdWithAssociatedList(Long id){
DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique  = findById(id);
findAssociatedLists(developpementDeSavoirEtInnovationScientifique);
return developpementDeSavoirEtInnovationScientifique;
}
private void findAssociatedLists(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
if(developpementDeSavoirEtInnovationScientifique!=null && developpementDeSavoirEtInnovationScientifique.getId() != null) {
        List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> typeSavoirDeveloppementDeSavoirEtInnovationScientifiques = typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(typeSavoirDeveloppementDeSavoirEtInnovationScientifiques);
        List<TypeUtilisateurSavoirConcu> typeUtilisateurSavoirConcus = typeUtilisateurSavoirConcuService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setTypeUtilisateurSavoirConcus(typeUtilisateurSavoirConcus);
        List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions = developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(developpementDeSavoirEtInnovationScientifiqueModeDiffusions);
        List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds = developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds);
        List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques = developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques);
        List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs = developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs);
        List<DeveloppementDeSavoirEtInnovationScientifiquePays> developpementDeSavoirEtInnovationScientifiquePayss = developpementDeSavoirEtInnovationScientifiquePaysService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiquePayss(developpementDeSavoirEtInnovationScientifiquePayss);
        List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements = developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId());
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(developpementDeSavoirEtInnovationScientifiqueEtablissements);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        typeUtilisateurSavoirConcuService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiquePaysService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        developpementDeSavoirEtInnovationScientifiqueEtablissementService.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
}
}

    private void updateAssociatedLists(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
    if(developpementDeSavoirEtInnovationScientifique !=null && developpementDeSavoirEtInnovationScientifique.getId() != null){
            List<List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique>> resultTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques= typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.getToBeSavedAndToBeDeleted(typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques());
            typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.delete(resultTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques.get(1));
            associateTypeSavoirDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique,resultTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques.get(0));
            typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.update(resultTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques.get(0));

            List<List<TypeUtilisateurSavoirConcu>> resultTypeUtilisateurSavoirConcus= typeUtilisateurSavoirConcuService.getToBeSavedAndToBeDeleted(typeUtilisateurSavoirConcuService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getTypeUtilisateurSavoirConcus());
            typeUtilisateurSavoirConcuService.delete(resultTypeUtilisateurSavoirConcus.get(1));
            associateTypeUtilisateurSavoirConcu(developpementDeSavoirEtInnovationScientifique,resultTypeUtilisateurSavoirConcus.get(0));
            typeUtilisateurSavoirConcuService.update(resultTypeUtilisateurSavoirConcus.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion>> resultDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions= developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions());
            developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.delete(resultDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions.get(0));
            developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.update(resultDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd>> resultDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds= developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds());
            developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.delete(resultDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds.get(0));
            developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.update(resultDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique>> resultDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques= developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques());
            developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.delete(resultDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.get(0));
            developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.update(resultDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir>> resultDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs= developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs());
            developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.delete(resultDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.get(0));
            developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.update(resultDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiquePays>> resultDeveloppementDeSavoirEtInnovationScientifiquePayss= developpementDeSavoirEtInnovationScientifiquePaysService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiquePaysService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiquePayss());
            developpementDeSavoirEtInnovationScientifiquePaysService.delete(resultDeveloppementDeSavoirEtInnovationScientifiquePayss.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiquePays(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiquePayss.get(0));
            developpementDeSavoirEtInnovationScientifiquePaysService.update(resultDeveloppementDeSavoirEtInnovationScientifiquePayss.get(0));

            List<List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement>> resultDeveloppementDeSavoirEtInnovationScientifiqueEtablissements= developpementDeSavoirEtInnovationScientifiqueEtablissementService.getToBeSavedAndToBeDeleted(developpementDeSavoirEtInnovationScientifiqueEtablissementService.findByDeveloppementDeSavoirEtInnovationScientifiqueId(developpementDeSavoirEtInnovationScientifique.getId()),developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissements());
            developpementDeSavoirEtInnovationScientifiqueEtablissementService.delete(resultDeveloppementDeSavoirEtInnovationScientifiqueEtablissements.get(1));
            associateDeveloppementDeSavoirEtInnovationScientifiqueEtablissement(developpementDeSavoirEtInnovationScientifique,resultDeveloppementDeSavoirEtInnovationScientifiqueEtablissements.get(0));
            developpementDeSavoirEtInnovationScientifiqueEtablissementService.update(resultDeveloppementDeSavoirEtInnovationScientifiqueEtablissements.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(developpementDeSavoirEtInnovationScientifiqueDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
developpementDeSavoirEtInnovationScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DeveloppementDeSavoirEtInnovationScientifique update(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
DeveloppementDeSavoirEtInnovationScientifique foundedDeveloppementDeSavoirEtInnovationScientifique = findById(developpementDeSavoirEtInnovationScientifique.getId());
if(foundedDeveloppementDeSavoirEtInnovationScientifique==null) return null;
else{
    updateAssociatedLists(developpementDeSavoirEtInnovationScientifique);
return  developpementDeSavoirEtInnovationScientifiqueDao.save(developpementDeSavoirEtInnovationScientifique);
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifique save (DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){

DeveloppementDeSavoirEtInnovationScientifique result =null;


    findRoleDeveloppementDeSavoir(developpementDeSavoirEtInnovationScientifique);
    findSavoirEtInnovation(developpementDeSavoirEtInnovationScientifique);
    findEtatEtapeCampagne(developpementDeSavoirEtInnovationScientifique);

DeveloppementDeSavoirEtInnovationScientifique savedDeveloppementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifiqueDao.save(developpementDeSavoirEtInnovationScientifique);

       saveTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques());
       saveTypeUtilisateurSavoirConcus(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getTypeUtilisateurSavoirConcus());
       saveDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions());
       saveDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds());
       saveDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques());
       saveDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs());
       saveDeveloppementDeSavoirEtInnovationScientifiquePayss(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiquePayss());
       saveDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(savedDeveloppementDeSavoirEtInnovationScientifique,developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissements());
result = savedDeveloppementDeSavoirEtInnovationScientifique;

return result;
}

@Override
public List<DeveloppementDeSavoirEtInnovationScientifique> save(List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){
List<DeveloppementDeSavoirEtInnovationScientifique> list = new ArrayList<>();
for(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique: developpementDeSavoirEtInnovationScientifiques){
list.add(save(developpementDeSavoirEtInnovationScientifique));
}
return list;
}

        private List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> prepareTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> typeSavoirDeveloppementDeSavoirEtInnovationScientifiques){
        for(TypeSavoirDeveloppementDeSavoirEtInnovationScientifique typeSavoirDeveloppementDeSavoirEtInnovationScientifique:typeSavoirDeveloppementDeSavoirEtInnovationScientifiques ){
        typeSavoirDeveloppementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return typeSavoirDeveloppementDeSavoirEtInnovationScientifiques;
        }
        private List<TypeUtilisateurSavoirConcu> prepareTypeUtilisateurSavoirConcus(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<TypeUtilisateurSavoirConcu> typeUtilisateurSavoirConcus){
        for(TypeUtilisateurSavoirConcu typeUtilisateurSavoirConcu:typeUtilisateurSavoirConcus ){
        typeUtilisateurSavoirConcu.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return typeUtilisateurSavoirConcus;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> prepareDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
        for(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion:developpementDeSavoirEtInnovationScientifiqueModeDiffusions ){
        developpementDeSavoirEtInnovationScientifiqueModeDiffusion.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusions;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> prepareDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds){
        for(DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd:developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds ){
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> prepareDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
        for(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique:developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques ){
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> prepareDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
        for(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir:developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs ){
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiquePays> prepareDeveloppementDeSavoirEtInnovationScientifiquePayss(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiquePays> developpementDeSavoirEtInnovationScientifiquePayss){
        for(DeveloppementDeSavoirEtInnovationScientifiquePays developpementDeSavoirEtInnovationScientifiquePays:developpementDeSavoirEtInnovationScientifiquePayss ){
        developpementDeSavoirEtInnovationScientifiquePays.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiquePayss;
        }
        private List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> prepareDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements){
        for(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement:developpementDeSavoirEtInnovationScientifiqueEtablissements ){
        developpementDeSavoirEtInnovationScientifiqueEtablissement.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
        }
        return developpementDeSavoirEtInnovationScientifiqueEtablissements;
        }


@Override
@Transactional
public int delete(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
    if(developpementDeSavoirEtInnovationScientifique.getId()==null) return -1;
    DeveloppementDeSavoirEtInnovationScientifique foundedDeveloppementDeSavoirEtInnovationScientifique = findById(developpementDeSavoirEtInnovationScientifique.getId());
    if(foundedDeveloppementDeSavoirEtInnovationScientifique==null) return -1;
developpementDeSavoirEtInnovationScientifiqueDao.delete(foundedDeveloppementDeSavoirEtInnovationScientifique);
return 1;
}


public List<DeveloppementDeSavoirEtInnovationScientifique> findByCriteria(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){

String query = "SELECT o FROM DeveloppementDeSavoirEtInnovationScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",developpementDeSavoirEtInnovationScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "titreInstrument","LIKE",developpementDeSavoirEtInnovationScientifiqueVo.getTitreInstrument());
            query += SearchUtil.addConstraint( "o", "anneeMiseEnOeuvre","=",developpementDeSavoirEtInnovationScientifiqueVo.getAnneeMiseEnOeuvre());
            query += SearchUtil.addConstraint( "o", "lienWeb","LIKE",developpementDeSavoirEtInnovationScientifiqueVo.getLienWeb());
            query += SearchUtil.addConstraintMinMax("o","anneeMiseEnOeuvre",developpementDeSavoirEtInnovationScientifiqueVo.getAnneeMiseEnOeuvreMin(),developpementDeSavoirEtInnovationScientifiqueVo.getAnneeMiseEnOeuvreMax());
    if(developpementDeSavoirEtInnovationScientifiqueVo.getRoleDeveloppementDeSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "roleDeveloppementDeSavoir.id","=",developpementDeSavoirEtInnovationScientifiqueVo.getRoleDeveloppementDeSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "roleDeveloppementDeSavoir.code","LIKE",developpementDeSavoirEtInnovationScientifiqueVo.getRoleDeveloppementDeSavoirVo().getCode());
    }

    if(developpementDeSavoirEtInnovationScientifiqueVo.getSavoirEtInnovationVo()!=null){
        query += SearchUtil.addConstraint( "o", "savoirEtInnovation.id","=",developpementDeSavoirEtInnovationScientifiqueVo.getSavoirEtInnovationVo().getId());
    }

    if(developpementDeSavoirEtInnovationScientifiqueVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",developpementDeSavoirEtInnovationScientifiqueVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",developpementDeSavoirEtInnovationScientifiqueVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> typeSavoirDeveloppementDeSavoirEtInnovationScientifiques){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques())) {
        List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> savedTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques = new ArrayList<>();
        typeSavoirDeveloppementDeSavoirEtInnovationScientifiques.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         typeSavoirDeveloppementDeSavoirEtInnovationScientifiqueService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques(savedTypeSavoirDeveloppementDeSavoirEtInnovationScientifiques);
        }
        }
        private  void saveTypeUtilisateurSavoirConcus(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<TypeUtilisateurSavoirConcu> typeUtilisateurSavoirConcus){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getTypeUtilisateurSavoirConcus())) {
        List<TypeUtilisateurSavoirConcu> savedTypeUtilisateurSavoirConcus = new ArrayList<>();
        typeUtilisateurSavoirConcus.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         typeUtilisateurSavoirConcuService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setTypeUtilisateurSavoirConcus(savedTypeUtilisateurSavoirConcus);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions())) {
        List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> savedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiqueModeDiffusions.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiqueModeDiffusionService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions(savedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusions);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds())) {
        List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> savedDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrds.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiqueEnjeuxIrdService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds(savedDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrds);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques())) {
        List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> savedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques(savedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiques);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs())) {
        List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> savedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs(savedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirs);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiquePayss(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiquePays> developpementDeSavoirEtInnovationScientifiquePayss){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiquePayss())) {
        List<DeveloppementDeSavoirEtInnovationScientifiquePays> savedDeveloppementDeSavoirEtInnovationScientifiquePayss = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiquePayss.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiquePaysService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiquePayss(savedDeveloppementDeSavoirEtInnovationScientifiquePayss);
        }
        }
        private  void saveDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique,List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements){

        if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifique.getDeveloppementDeSavoirEtInnovationScientifiqueEtablissements())) {
        List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> savedDeveloppementDeSavoirEtInnovationScientifiqueEtablissements = new ArrayList<>();
        developpementDeSavoirEtInnovationScientifiqueEtablissements.forEach(element -> {
        element.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique);
         developpementDeSavoirEtInnovationScientifiqueEtablissementService.save(element);
        });
        developpementDeSavoirEtInnovationScientifique.setDeveloppementDeSavoirEtInnovationScientifiqueEtablissements(savedDeveloppementDeSavoirEtInnovationScientifiqueEtablissements);
        }
        }

    private void findRoleDeveloppementDeSavoir(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
        RoleDeveloppementDeSavoir loadedRoleDeveloppementDeSavoir =roleDeveloppementDeSavoirService.findByIdOrCode(developpementDeSavoirEtInnovationScientifique.getRoleDeveloppementDeSavoir());

    if(loadedRoleDeveloppementDeSavoir==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifique.setRoleDeveloppementDeSavoir(loadedRoleDeveloppementDeSavoir);
    }
    private void findSavoirEtInnovation(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
        SavoirEtInnovation loadedSavoirEtInnovation = null;
        if(developpementDeSavoirEtInnovationScientifique.getSavoirEtInnovation() != null && developpementDeSavoirEtInnovationScientifique.getSavoirEtInnovation().getId() !=null)
        loadedSavoirEtInnovation =savoirEtInnovationService.findById(developpementDeSavoirEtInnovationScientifique.getSavoirEtInnovation().getId());

    if(loadedSavoirEtInnovation==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifique.setSavoirEtInnovation(loadedSavoirEtInnovation);
    }
    private void findEtatEtapeCampagne(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(developpementDeSavoirEtInnovationScientifique.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifique.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){
        if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiques)){
        developpementDeSavoirEtInnovationScientifiques.forEach(e->developpementDeSavoirEtInnovationScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){
if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiques)){
developpementDeSavoirEtInnovationScientifiques.forEach(e->developpementDeSavoirEtInnovationScientifiqueDao.save(e));
}
}

private void associateTypeSavoirDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> typeSavoirDeveloppementDeSavoirEtInnovationScientifique) {
    if (ListUtil.isNotEmpty(typeSavoirDeveloppementDeSavoirEtInnovationScientifique)) {
        typeSavoirDeveloppementDeSavoirEtInnovationScientifique.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateTypeUtilisateurSavoirConcu(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<TypeUtilisateurSavoirConcu> typeUtilisateurSavoirConcu) {
    if (ListUtil.isNotEmpty(typeUtilisateurSavoirConcu)) {
        typeUtilisateurSavoirConcu.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusion) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueModeDiffusion)) {
        developpementDeSavoirEtInnovationScientifiqueModeDiffusion.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd)) {
        developpementDeSavoirEtInnovationScientifiqueEnjeuxIrd.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique)) {
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir)) {
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiquePays(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiquePays> developpementDeSavoirEtInnovationScientifiquePays) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiquePays)) {
        developpementDeSavoirEtInnovationScientifiquePays.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }
private void associateDeveloppementDeSavoirEtInnovationScientifiqueEtablissement(DeveloppementDeSavoirEtInnovationScientifique developpementDeSavoirEtInnovationScientifique, List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissement) {
    if (ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueEtablissement)) {
        developpementDeSavoirEtInnovationScientifiqueEtablissement.forEach(e -> e.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifique));
    }
    }


}
