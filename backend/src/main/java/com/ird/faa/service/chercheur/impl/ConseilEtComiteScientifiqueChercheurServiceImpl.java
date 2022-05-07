package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ConseilEtComiteScientifique;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;
import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;
import com.ird.faa.dao.ConseilEtComiteScientifiqueDao;
import com.ird.faa.service.chercheur.facade.ConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.ConseilEtComiteScientifiqueVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ConseilEtComiteScientifiqueChercheurServiceImpl extends AbstractServiceImpl<ConseilEtComiteScientifique> implements ConseilEtComiteScientifiqueChercheurService {

@Autowired
private ConseilEtComiteScientifiqueDao conseilEtComiteScientifiqueDao;

        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService disciplineScientifiqueConseilEtComiteScientifiqueService ;
        @Autowired
        private CommunauteSavoirConseilEtComiteScientifiqueChercheurService communauteSavoirConseilEtComiteScientifiqueService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;
        @Autowired
        private CampagneChercheurService campagneService ;
        @Autowired
        private PaysChercheurService paysService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ConseilEtComiteScientifique> findAll(){
        return conseilEtComiteScientifiqueDao.findAll();
}

        @Override
        public List<ConseilEtComiteScientifique> findByPaysCode(String code){
        return conseilEtComiteScientifiqueDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return conseilEtComiteScientifiqueDao.deleteByPaysCode(code);
        }

        @Override
        public List<ConseilEtComiteScientifique> findByPaysId(Long id){
        return conseilEtComiteScientifiqueDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return conseilEtComiteScientifiqueDao.deleteByPaysId(id);
        }


        @Override
        public List<ConseilEtComiteScientifique> findByEtablissementCode(String code){
        return conseilEtComiteScientifiqueDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return conseilEtComiteScientifiqueDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<ConseilEtComiteScientifique> findByEtablissementId(Long id){
        return conseilEtComiteScientifiqueDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return conseilEtComiteScientifiqueDao.deleteByEtablissementId(id);
        }


        @Override
        public List<ConseilEtComiteScientifique> findByChercheurNumeroMatricule(String numeroMatricule){
        return conseilEtComiteScientifiqueDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return conseilEtComiteScientifiqueDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<ConseilEtComiteScientifique> findByChercheurId(Long id){
        return conseilEtComiteScientifiqueDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return conseilEtComiteScientifiqueDao.deleteByChercheurId(id);
        }


        @Override
        public List<ConseilEtComiteScientifique> findByCampagneCode(String code){
        return conseilEtComiteScientifiqueDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return conseilEtComiteScientifiqueDao.deleteByCampagneCode(code);
        }

        @Override
        public List<ConseilEtComiteScientifique> findByCampagneId(Long id){
        return conseilEtComiteScientifiqueDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return conseilEtComiteScientifiqueDao.deleteByCampagneId(id);
        }


        @Override
        public List<ConseilEtComiteScientifique> findByEtatEtapeCampagneCode(String code){
        return conseilEtComiteScientifiqueDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return conseilEtComiteScientifiqueDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ConseilEtComiteScientifique> findByEtatEtapeCampagneId(Long id){
        return conseilEtComiteScientifiqueDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return conseilEtComiteScientifiqueDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public ConseilEtComiteScientifique findById(Long id){
if(id==null) return null;
return conseilEtComiteScientifiqueDao.getOne(id);
}

@Override
public ConseilEtComiteScientifique findByIdWithAssociatedList(Long id){
ConseilEtComiteScientifique conseilEtComiteScientifique  = findById(id);
findAssociatedLists(conseilEtComiteScientifique);
return conseilEtComiteScientifique;
}
private void findAssociatedLists(ConseilEtComiteScientifique conseilEtComiteScientifique){
if(conseilEtComiteScientifique!=null && conseilEtComiteScientifique.getId() != null) {
        List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques = communauteSavoirConseilEtComiteScientifiqueService.findByConseilEtComiteScientifiqueId(conseilEtComiteScientifique.getId());
        conseilEtComiteScientifique.setCommunauteSavoirConseilEtComiteScientifiques(communauteSavoirConseilEtComiteScientifiques);
        List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques = disciplineScientifiqueConseilEtComiteScientifiqueService.findByConseilEtComiteScientifiqueId(conseilEtComiteScientifique.getId());
        conseilEtComiteScientifique.setDisciplineScientifiqueConseilEtComiteScientifiques(disciplineScientifiqueConseilEtComiteScientifiques);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        communauteSavoirConseilEtComiteScientifiqueService.deleteByConseilEtComiteScientifiqueId(id);
        disciplineScientifiqueConseilEtComiteScientifiqueService.deleteByConseilEtComiteScientifiqueId(id);
}
}

    private void updateAssociatedLists(ConseilEtComiteScientifique conseilEtComiteScientifique){
    if(conseilEtComiteScientifique !=null && conseilEtComiteScientifique.getId() != null){
            List<List<CommunauteSavoirConseilEtComiteScientifique>> resultCommunauteSavoirConseilEtComiteScientifiques= communauteSavoirConseilEtComiteScientifiqueService.getToBeSavedAndToBeDeleted(communauteSavoirConseilEtComiteScientifiqueService.findByConseilEtComiteScientifiqueId(conseilEtComiteScientifique.getId()),conseilEtComiteScientifique.getCommunauteSavoirConseilEtComiteScientifiques());
            communauteSavoirConseilEtComiteScientifiqueService.delete(resultCommunauteSavoirConseilEtComiteScientifiques.get(1));
            associateCommunauteSavoirConseilEtComiteScientifique(conseilEtComiteScientifique,resultCommunauteSavoirConseilEtComiteScientifiques.get(0));
            communauteSavoirConseilEtComiteScientifiqueService.update(resultCommunauteSavoirConseilEtComiteScientifiques.get(0));

            List<List<DisciplineScientifiqueConseilEtComiteScientifique>> resultDisciplineScientifiqueConseilEtComiteScientifiques= disciplineScientifiqueConseilEtComiteScientifiqueService.getToBeSavedAndToBeDeleted(disciplineScientifiqueConseilEtComiteScientifiqueService.findByConseilEtComiteScientifiqueId(conseilEtComiteScientifique.getId()),conseilEtComiteScientifique.getDisciplineScientifiqueConseilEtComiteScientifiques());
            disciplineScientifiqueConseilEtComiteScientifiqueService.delete(resultDisciplineScientifiqueConseilEtComiteScientifiques.get(1));
            associateDisciplineScientifiqueConseilEtComiteScientifique(conseilEtComiteScientifique,resultDisciplineScientifiqueConseilEtComiteScientifiques.get(0));
            disciplineScientifiqueConseilEtComiteScientifiqueService.update(resultDisciplineScientifiqueConseilEtComiteScientifiques.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(conseilEtComiteScientifiqueDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
conseilEtComiteScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ConseilEtComiteScientifique update(ConseilEtComiteScientifique conseilEtComiteScientifique){
ConseilEtComiteScientifique foundedConseilEtComiteScientifique = findById(conseilEtComiteScientifique.getId());
if(foundedConseilEtComiteScientifique==null) return null;
else{
    updateAssociatedLists(conseilEtComiteScientifique);
return  conseilEtComiteScientifiqueDao.save(conseilEtComiteScientifique);
}
}

@Override
public ConseilEtComiteScientifique save (ConseilEtComiteScientifique conseilEtComiteScientifique){

ConseilEtComiteScientifique result =null;


    findPays(conseilEtComiteScientifique);
    findEtablissement(conseilEtComiteScientifique);
    findChercheur(conseilEtComiteScientifique);
    findCampagne(conseilEtComiteScientifique);
    findEtatEtapeCampagne(conseilEtComiteScientifique);

ConseilEtComiteScientifique savedConseilEtComiteScientifique = conseilEtComiteScientifiqueDao.save(conseilEtComiteScientifique);

       saveCommunauteSavoirConseilEtComiteScientifiques(savedConseilEtComiteScientifique,conseilEtComiteScientifique.getCommunauteSavoirConseilEtComiteScientifiques());
       saveDisciplineScientifiqueConseilEtComiteScientifiques(savedConseilEtComiteScientifique,conseilEtComiteScientifique.getDisciplineScientifiqueConseilEtComiteScientifiques());
result = savedConseilEtComiteScientifique;

return result;
}

@Override
public List<ConseilEtComiteScientifique> save(List<ConseilEtComiteScientifique> conseilEtComiteScientifiques){
List<ConseilEtComiteScientifique> list = new ArrayList<>();
for(ConseilEtComiteScientifique conseilEtComiteScientifique: conseilEtComiteScientifiques){
list.add(save(conseilEtComiteScientifique));
}
return list;
}

        private List<CommunauteSavoirConseilEtComiteScientifique> prepareCommunauteSavoirConseilEtComiteScientifiques(ConseilEtComiteScientifique conseilEtComiteScientifique,List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){
        for(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique:communauteSavoirConseilEtComiteScientifiques ){
        communauteSavoirConseilEtComiteScientifique.setConseilEtComiteScientifique(conseilEtComiteScientifique);
        }
        return communauteSavoirConseilEtComiteScientifiques;
        }
        private List<DisciplineScientifiqueConseilEtComiteScientifique> prepareDisciplineScientifiqueConseilEtComiteScientifiques(ConseilEtComiteScientifique conseilEtComiteScientifique,List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){
        for(DisciplineScientifiqueConseilEtComiteScientifique disciplineScientifiqueConseilEtComiteScientifique:disciplineScientifiqueConseilEtComiteScientifiques ){
        disciplineScientifiqueConseilEtComiteScientifique.setConseilEtComiteScientifique(conseilEtComiteScientifique);
        }
        return disciplineScientifiqueConseilEtComiteScientifiques;
        }


@Override
@Transactional
public int delete(ConseilEtComiteScientifique conseilEtComiteScientifique){
    if(conseilEtComiteScientifique.getId()==null) return -1;
    ConseilEtComiteScientifique foundedConseilEtComiteScientifique = findById(conseilEtComiteScientifique.getId());
    if(foundedConseilEtComiteScientifique==null) return -1;
conseilEtComiteScientifiqueDao.delete(foundedConseilEtComiteScientifique);
return 1;
}


public List<ConseilEtComiteScientifique> findByCriteria(ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){

String query = "SELECT o FROM ConseilEtComiteScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",conseilEtComiteScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "tempsEstimePourCetteAnnne","=",conseilEtComiteScientifiqueVo.getTempsEstimePourCetteAnnne());
            query += SearchUtil.addConstraint( "o", "intitule","LIKE",conseilEtComiteScientifiqueVo.getIntitule());
            query += SearchUtil.addConstraint( "o", "nombreJoursParAnnee","=",conseilEtComiteScientifiqueVo.getNombreJoursParAnnee());
            query += SearchUtil.addConstraintMinMax("o","tempsEstimePourCetteAnnne",conseilEtComiteScientifiqueVo.getTempsEstimePourCetteAnnneMin(),conseilEtComiteScientifiqueVo.getTempsEstimePourCetteAnnneMax());
            query += SearchUtil.addConstraintMinMax("o","nombreJoursParAnnee",conseilEtComiteScientifiqueVo.getNombreJoursParAnneeMin(),conseilEtComiteScientifiqueVo.getNombreJoursParAnneeMax());
    if(conseilEtComiteScientifiqueVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",conseilEtComiteScientifiqueVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",conseilEtComiteScientifiqueVo.getPaysVo().getCode());
    }

    if(conseilEtComiteScientifiqueVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",conseilEtComiteScientifiqueVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",conseilEtComiteScientifiqueVo.getEtablissementVo().getCode());
    }

    if(conseilEtComiteScientifiqueVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",conseilEtComiteScientifiqueVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",conseilEtComiteScientifiqueVo.getChercheurVo().getNumeroMatricule());
    }

    if(conseilEtComiteScientifiqueVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",conseilEtComiteScientifiqueVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",conseilEtComiteScientifiqueVo.getCampagneVo().getCode());
    }

    if(conseilEtComiteScientifiqueVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",conseilEtComiteScientifiqueVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",conseilEtComiteScientifiqueVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveCommunauteSavoirConseilEtComiteScientifiques(ConseilEtComiteScientifique conseilEtComiteScientifique,List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){

        if (ListUtil.isNotEmpty(conseilEtComiteScientifique.getCommunauteSavoirConseilEtComiteScientifiques())) {
        List<CommunauteSavoirConseilEtComiteScientifique> savedCommunauteSavoirConseilEtComiteScientifiques = new ArrayList<>();
        communauteSavoirConseilEtComiteScientifiques.forEach(element -> {
        element.setConseilEtComiteScientifique(conseilEtComiteScientifique);
         communauteSavoirConseilEtComiteScientifiqueService.save(element);
        });
        conseilEtComiteScientifique.setCommunauteSavoirConseilEtComiteScientifiques(savedCommunauteSavoirConseilEtComiteScientifiques);
        }
        }
        private  void saveDisciplineScientifiqueConseilEtComiteScientifiques(ConseilEtComiteScientifique conseilEtComiteScientifique,List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){

        if (ListUtil.isNotEmpty(conseilEtComiteScientifique.getDisciplineScientifiqueConseilEtComiteScientifiques())) {
        List<DisciplineScientifiqueConseilEtComiteScientifique> savedDisciplineScientifiqueConseilEtComiteScientifiques = new ArrayList<>();
        disciplineScientifiqueConseilEtComiteScientifiques.forEach(element -> {
        element.setConseilEtComiteScientifique(conseilEtComiteScientifique);
         disciplineScientifiqueConseilEtComiteScientifiqueService.save(element);
        });
        conseilEtComiteScientifique.setDisciplineScientifiqueConseilEtComiteScientifiques(savedDisciplineScientifiqueConseilEtComiteScientifiques);
        }
        }

    private void findPays(ConseilEtComiteScientifique conseilEtComiteScientifique){
        Pays loadedPays =paysService.findByIdOrCode(conseilEtComiteScientifique.getPays());

    if(loadedPays==null ) {
        return;
    }
    conseilEtComiteScientifique.setPays(loadedPays);
    }
    private void findEtablissement(ConseilEtComiteScientifique conseilEtComiteScientifique){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(conseilEtComiteScientifique.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    conseilEtComiteScientifique.setEtablissement(loadedEtablissement);
    }
    private void findChercheur(ConseilEtComiteScientifique conseilEtComiteScientifique){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(conseilEtComiteScientifique.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    conseilEtComiteScientifique.setChercheur(loadedChercheur);
    }
    private void findCampagne(ConseilEtComiteScientifique conseilEtComiteScientifique){
        Campagne loadedCampagne =campagneService.findByIdOrCode(conseilEtComiteScientifique.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    conseilEtComiteScientifique.setCampagne(loadedCampagne);
    }
    private void findEtatEtapeCampagne(ConseilEtComiteScientifique conseilEtComiteScientifique){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(conseilEtComiteScientifique.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    conseilEtComiteScientifique.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<ConseilEtComiteScientifique> conseilEtComiteScientifiques){
        if(ListUtil.isNotEmpty(conseilEtComiteScientifiques)){
        conseilEtComiteScientifiques.forEach(e->conseilEtComiteScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<ConseilEtComiteScientifique> conseilEtComiteScientifiques){
if(ListUtil.isNotEmpty(conseilEtComiteScientifiques)){
conseilEtComiteScientifiques.forEach(e->conseilEtComiteScientifiqueDao.save(e));
}
}

private void associateCommunauteSavoirConseilEtComiteScientifique(ConseilEtComiteScientifique conseilEtComiteScientifique, List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifique) {
    if (ListUtil.isNotEmpty(communauteSavoirConseilEtComiteScientifique)) {
        communauteSavoirConseilEtComiteScientifique.forEach(e -> e.setConseilEtComiteScientifique(conseilEtComiteScientifique));
    }
    }
private void associateDisciplineScientifiqueConseilEtComiteScientifique(ConseilEtComiteScientifique conseilEtComiteScientifique, List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifique) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueConseilEtComiteScientifique)) {
        disciplineScientifiqueConseilEtComiteScientifique.forEach(e -> e.setConseilEtComiteScientifique(conseilEtComiteScientifique));
    }
    }


}
