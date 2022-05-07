package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EncadrementDoctorant;
import com.ird.faa.bean.ResponsabiliteEncadrementDoctorant;
import com.ird.faa.bean.FinancementDoctorant;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.Doctorant;
import com.ird.faa.bean.Encadrement;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;
import com.ird.faa.bean.CommunauteSavoirEncadrementDoctorant;
import com.ird.faa.dao.EncadrementDoctorantDao;
import com.ird.faa.service.chercheur.facade.EncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.FinancementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdEncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueEncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirEncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.EncadrementChercheurService;
import com.ird.faa.service.chercheur.facade.DoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.ResponsabiliteEncadrementDoctorantChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;
import com.ird.faa.service.chercheur.facade.PaysChercheurService;

import com.ird.faa.ws.rest.provided.vo.EncadrementDoctorantVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdEncadrementDoctorantChercheurService;
import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueEncadrementDoctorantChercheurService;
import com.ird.faa.bean.CommunauteSavoirEncadrementDoctorant;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirEncadrementDoctorantChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EncadrementDoctorantChercheurServiceImpl extends AbstractServiceImpl<EncadrementDoctorant> implements EncadrementDoctorantChercheurService {

@Autowired
private EncadrementDoctorantDao encadrementDoctorantDao;

        @Autowired
        private FinancementDoctorantChercheurService financementDoctorantService ;
        @Autowired
        private EnjeuxIrdEncadrementDoctorantChercheurService enjeuxIrdEncadrementDoctorantService ;
        @Autowired
        private DisciplineScientifiqueEncadrementDoctorantChercheurService disciplineScientifiqueEncadrementDoctorantService ;
        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private CommunauteSavoirEncadrementDoctorantChercheurService communauteSavoirEncadrementDoctorantService ;
        @Autowired
        private EncadrementChercheurService encadrementService ;
        @Autowired
        private DoctorantChercheurService doctorantService ;
        @Autowired
        private ResponsabiliteEncadrementDoctorantChercheurService responsabiliteEncadrementDoctorantService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;
        @Autowired
        private PaysChercheurService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EncadrementDoctorant> findAll(){
        return encadrementDoctorantDao.findAll();
}

        @Override
        public List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantCode(String code){
        return encadrementDoctorantDao.findByResponsabiliteEncadrementDoctorantCode(code);
        }

        @Override
        @Transactional
        public int deleteByResponsabiliteEncadrementDoctorantCode(String code){
        return encadrementDoctorantDao.deleteByResponsabiliteEncadrementDoctorantCode(code);
        }

        @Override
        public List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantId(Long id){
        return encadrementDoctorantDao.findByResponsabiliteEncadrementDoctorantId(id);
        }

        @Override
        @Transactional
        public int deleteByResponsabiliteEncadrementDoctorantId(Long id){
        return encadrementDoctorantDao.deleteByResponsabiliteEncadrementDoctorantId(id);
        }


        @Override
        public List<EncadrementDoctorant> findByFinancementDoctorantCode(String code){
        return encadrementDoctorantDao.findByFinancementDoctorantCode(code);
        }

        @Override
        @Transactional
        public int deleteByFinancementDoctorantCode(String code){
        return encadrementDoctorantDao.deleteByFinancementDoctorantCode(code);
        }

        @Override
        public List<EncadrementDoctorant> findByFinancementDoctorantId(Long id){
        return encadrementDoctorantDao.findByFinancementDoctorantId(id);
        }

        @Override
        @Transactional
        public int deleteByFinancementDoctorantId(Long id){
        return encadrementDoctorantDao.deleteByFinancementDoctorantId(id);
        }


        @Override
        public List<EncadrementDoctorant> findByEtablissementCode(String code){
        return encadrementDoctorantDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return encadrementDoctorantDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<EncadrementDoctorant> findByEtablissementId(Long id){
        return encadrementDoctorantDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return encadrementDoctorantDao.deleteByEtablissementId(id);
        }


        @Override
        public List<EncadrementDoctorant> findByPaysCode(String code){
        return encadrementDoctorantDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return encadrementDoctorantDao.deleteByPaysCode(code);
        }

        @Override
        public List<EncadrementDoctorant> findByPaysId(Long id){
        return encadrementDoctorantDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return encadrementDoctorantDao.deleteByPaysId(id);
        }

        @Override
        public List<EncadrementDoctorant> findByDoctorantId(Long id){
        return encadrementDoctorantDao.findByDoctorantId(id);
        }

        @Override
        @Transactional
        public int deleteByDoctorantId(Long id){
        return encadrementDoctorantDao.deleteByDoctorantId(id);
        }

        @Override
        public List<EncadrementDoctorant> findByEncadrementId(Long id){
        return encadrementDoctorantDao.findByEncadrementId(id);
        }

        @Override
        @Transactional
        public int deleteByEncadrementId(Long id){
        return encadrementDoctorantDao.deleteByEncadrementId(id);
        }


        @Override
        public List<EncadrementDoctorant> findByEtatEtapeCampagneCode(String code){
        return encadrementDoctorantDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return encadrementDoctorantDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<EncadrementDoctorant> findByEtatEtapeCampagneId(Long id){
        return encadrementDoctorantDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return encadrementDoctorantDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public EncadrementDoctorant findById(Long id){
if(id==null) return null;
return encadrementDoctorantDao.getOne(id);
}

@Override
public EncadrementDoctorant findByIdWithAssociatedList(Long id){
EncadrementDoctorant encadrementDoctorant  = findById(id);
findAssociatedLists(encadrementDoctorant);
return encadrementDoctorant;
}
private void findAssociatedLists(EncadrementDoctorant encadrementDoctorant){
if(encadrementDoctorant!=null && encadrementDoctorant.getId() != null) {
        List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants = enjeuxIrdEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId());
        encadrementDoctorant.setEnjeuxIrdEncadrementDoctorants(enjeuxIrdEncadrementDoctorants);
        List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorants = disciplineScientifiqueEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId());
        encadrementDoctorant.setDisciplineScientifiqueEncadrementDoctorants(disciplineScientifiqueEncadrementDoctorants);
        List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorants = communauteSavoirEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId());
        encadrementDoctorant.setCommunauteSavoirEncadrementDoctorants(communauteSavoirEncadrementDoctorants);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        enjeuxIrdEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
        disciplineScientifiqueEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
        communauteSavoirEncadrementDoctorantService.deleteByEncadrementDoctorantId(id);
}
}

    private void updateAssociatedLists(EncadrementDoctorant encadrementDoctorant){
    if(encadrementDoctorant !=null && encadrementDoctorant.getId() != null){
            List<List<EnjeuxIrdEncadrementDoctorant>> resultEnjeuxIrdEncadrementDoctorants= enjeuxIrdEncadrementDoctorantService.getToBeSavedAndToBeDeleted(enjeuxIrdEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId()),encadrementDoctorant.getEnjeuxIrdEncadrementDoctorants());
            enjeuxIrdEncadrementDoctorantService.delete(resultEnjeuxIrdEncadrementDoctorants.get(1));
            associateEnjeuxIrdEncadrementDoctorant(encadrementDoctorant,resultEnjeuxIrdEncadrementDoctorants.get(0));
            enjeuxIrdEncadrementDoctorantService.update(resultEnjeuxIrdEncadrementDoctorants.get(0));

            List<List<DisciplineScientifiqueEncadrementDoctorant>> resultDisciplineScientifiqueEncadrementDoctorants= disciplineScientifiqueEncadrementDoctorantService.getToBeSavedAndToBeDeleted(disciplineScientifiqueEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId()),encadrementDoctorant.getDisciplineScientifiqueEncadrementDoctorants());
            disciplineScientifiqueEncadrementDoctorantService.delete(resultDisciplineScientifiqueEncadrementDoctorants.get(1));
            associateDisciplineScientifiqueEncadrementDoctorant(encadrementDoctorant,resultDisciplineScientifiqueEncadrementDoctorants.get(0));
            disciplineScientifiqueEncadrementDoctorantService.update(resultDisciplineScientifiqueEncadrementDoctorants.get(0));

            List<List<CommunauteSavoirEncadrementDoctorant>> resultCommunauteSavoirEncadrementDoctorants= communauteSavoirEncadrementDoctorantService.getToBeSavedAndToBeDeleted(communauteSavoirEncadrementDoctorantService.findByEncadrementDoctorantId(encadrementDoctorant.getId()),encadrementDoctorant.getCommunauteSavoirEncadrementDoctorants());
            communauteSavoirEncadrementDoctorantService.delete(resultCommunauteSavoirEncadrementDoctorants.get(1));
            associateCommunauteSavoirEncadrementDoctorant(encadrementDoctorant,resultCommunauteSavoirEncadrementDoctorants.get(0));
            communauteSavoirEncadrementDoctorantService.update(resultCommunauteSavoirEncadrementDoctorants.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(encadrementDoctorantDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
encadrementDoctorantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EncadrementDoctorant update(EncadrementDoctorant encadrementDoctorant){
EncadrementDoctorant foundedEncadrementDoctorant = findById(encadrementDoctorant.getId());
if(foundedEncadrementDoctorant==null) return null;
else{
    updateAssociatedLists(encadrementDoctorant);
return  encadrementDoctorantDao.save(encadrementDoctorant);
}
}
private void prepareSave(EncadrementDoctorant encadrementDoctorant){
if(encadrementDoctorant.getCodirectionInternationale() == null)
  encadrementDoctorant.setCodirectionInternationale(false);
if(encadrementDoctorant.getCursus() == null)
  encadrementDoctorant.setCursus(false);



}

@Override
public EncadrementDoctorant save (EncadrementDoctorant encadrementDoctorant){
prepareSave(encadrementDoctorant);

EncadrementDoctorant result =null;


    findResponsabiliteEncadrementDoctorant(encadrementDoctorant);
    findFinancementDoctorant(encadrementDoctorant);
    findEtablissement(encadrementDoctorant);
    findPays(encadrementDoctorant);
    findDoctorant(encadrementDoctorant);
    findEncadrement(encadrementDoctorant);
    findEtatEtapeCampagne(encadrementDoctorant);

EncadrementDoctorant savedEncadrementDoctorant = encadrementDoctorantDao.save(encadrementDoctorant);

       saveEnjeuxIrdEncadrementDoctorants(savedEncadrementDoctorant,encadrementDoctorant.getEnjeuxIrdEncadrementDoctorants());
       saveDisciplineScientifiqueEncadrementDoctorants(savedEncadrementDoctorant,encadrementDoctorant.getDisciplineScientifiqueEncadrementDoctorants());
       saveCommunauteSavoirEncadrementDoctorants(savedEncadrementDoctorant,encadrementDoctorant.getCommunauteSavoirEncadrementDoctorants());
result = savedEncadrementDoctorant;

return result;
}

@Override
public List<EncadrementDoctorant> save(List<EncadrementDoctorant> encadrementDoctorants){
List<EncadrementDoctorant> list = new ArrayList<>();
for(EncadrementDoctorant encadrementDoctorant: encadrementDoctorants){
list.add(save(encadrementDoctorant));
}
return list;
}

        private List<EnjeuxIrdEncadrementDoctorant> prepareEnjeuxIrdEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){
        for(EnjeuxIrdEncadrementDoctorant enjeuxIrdEncadrementDoctorant:enjeuxIrdEncadrementDoctorants ){
        enjeuxIrdEncadrementDoctorant.setEncadrementDoctorant(encadrementDoctorant);
        }
        return enjeuxIrdEncadrementDoctorants;
        }
        private List<DisciplineScientifiqueEncadrementDoctorant> prepareDisciplineScientifiqueEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorants){
        for(DisciplineScientifiqueEncadrementDoctorant disciplineScientifiqueEncadrementDoctorant:disciplineScientifiqueEncadrementDoctorants ){
        disciplineScientifiqueEncadrementDoctorant.setEncadrementDoctorant(encadrementDoctorant);
        }
        return disciplineScientifiqueEncadrementDoctorants;
        }
        private List<CommunauteSavoirEncadrementDoctorant> prepareCommunauteSavoirEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorants){
        for(CommunauteSavoirEncadrementDoctorant communauteSavoirEncadrementDoctorant:communauteSavoirEncadrementDoctorants ){
        communauteSavoirEncadrementDoctorant.setEncadrementDoctorant(encadrementDoctorant);
        }
        return communauteSavoirEncadrementDoctorants;
        }


@Override
@Transactional
public int delete(EncadrementDoctorant encadrementDoctorant){
    if(encadrementDoctorant.getId()==null) return -1;
    EncadrementDoctorant foundedEncadrementDoctorant = findById(encadrementDoctorant.getId());
    if(foundedEncadrementDoctorant==null) return -1;
encadrementDoctorantDao.delete(foundedEncadrementDoctorant);
return 1;
}


public List<EncadrementDoctorant> findByCriteria(EncadrementDoctorantVo encadrementDoctorantVo){

String query = "SELECT o FROM EncadrementDoctorant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",encadrementDoctorantVo.getId());
            query += SearchUtil.addConstraint( "o", "codirectionInternationale","=",encadrementDoctorantVo.getCodirectionInternationale());
            query += SearchUtil.addConstraint( "o", "cursus","=",encadrementDoctorantVo.getCursus());
            query += SearchUtil.addConstraint( "o", "sujetThese","LIKE",encadrementDoctorantVo.getSujetThese());
        query += SearchUtil.addConstraintDate( "o", "dateDebutThese","=",encadrementDoctorantVo.getDateDebutThese());
        query += SearchUtil.addConstraintDate( "o", "datePrevuSoutenanceThese","=",encadrementDoctorantVo.getDatePrevuSoutenanceThese());
            query += SearchUtil.addConstraint( "o", "intituleEcoleDoctorale","LIKE",encadrementDoctorantVo.getIntituleEcoleDoctorale());
            query += SearchUtil.addConstraintMinMaxDate("o","dateDebutThese",encadrementDoctorantVo.getDateDebutTheseMin(),encadrementDoctorantVo.getDateDebutTheseMax());
            query += SearchUtil.addConstraintMinMaxDate("o","datePrevuSoutenanceThese",encadrementDoctorantVo.getDatePrevuSoutenanceTheseMin(),encadrementDoctorantVo.getDatePrevuSoutenanceTheseMax());
    if(encadrementDoctorantVo.getResponsabiliteEncadrementDoctorantVo()!=null){
        query += SearchUtil.addConstraint( "o", "responsabiliteEncadrementDoctorant.id","=",encadrementDoctorantVo.getResponsabiliteEncadrementDoctorantVo().getId());
            query += SearchUtil.addConstraint( "o", "responsabiliteEncadrementDoctorant.code","LIKE",encadrementDoctorantVo.getResponsabiliteEncadrementDoctorantVo().getCode());
    }

    if(encadrementDoctorantVo.getFinancementDoctorantVo()!=null){
        query += SearchUtil.addConstraint( "o", "financementDoctorant.id","=",encadrementDoctorantVo.getFinancementDoctorantVo().getId());
            query += SearchUtil.addConstraint( "o", "financementDoctorant.code","LIKE",encadrementDoctorantVo.getFinancementDoctorantVo().getCode());
    }

    if(encadrementDoctorantVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",encadrementDoctorantVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",encadrementDoctorantVo.getEtablissementVo().getCode());
    }

    if(encadrementDoctorantVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",encadrementDoctorantVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",encadrementDoctorantVo.getPaysVo().getCode());
    }

    if(encadrementDoctorantVo.getDoctorantVo()!=null){
        query += SearchUtil.addConstraint( "o", "doctorant.id","=",encadrementDoctorantVo.getDoctorantVo().getId());
    }

    if(encadrementDoctorantVo.getEncadrementVo()!=null){
        query += SearchUtil.addConstraint( "o", "encadrement.id","=",encadrementDoctorantVo.getEncadrementVo().getId());
    }

    if(encadrementDoctorantVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",encadrementDoctorantVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",encadrementDoctorantVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveEnjeuxIrdEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorants){

        if (ListUtil.isNotEmpty(encadrementDoctorant.getEnjeuxIrdEncadrementDoctorants())) {
        List<EnjeuxIrdEncadrementDoctorant> savedEnjeuxIrdEncadrementDoctorants = new ArrayList<>();
        enjeuxIrdEncadrementDoctorants.forEach(element -> {
        element.setEncadrementDoctorant(encadrementDoctorant);
         enjeuxIrdEncadrementDoctorantService.save(element);
        });
        encadrementDoctorant.setEnjeuxIrdEncadrementDoctorants(savedEnjeuxIrdEncadrementDoctorants);
        }
        }
        private  void saveDisciplineScientifiqueEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorants){

        if (ListUtil.isNotEmpty(encadrementDoctorant.getDisciplineScientifiqueEncadrementDoctorants())) {
        List<DisciplineScientifiqueEncadrementDoctorant> savedDisciplineScientifiqueEncadrementDoctorants = new ArrayList<>();
        disciplineScientifiqueEncadrementDoctorants.forEach(element -> {
        element.setEncadrementDoctorant(encadrementDoctorant);
         disciplineScientifiqueEncadrementDoctorantService.save(element);
        });
        encadrementDoctorant.setDisciplineScientifiqueEncadrementDoctorants(savedDisciplineScientifiqueEncadrementDoctorants);
        }
        }
        private  void saveCommunauteSavoirEncadrementDoctorants(EncadrementDoctorant encadrementDoctorant,List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorants){

        if (ListUtil.isNotEmpty(encadrementDoctorant.getCommunauteSavoirEncadrementDoctorants())) {
        List<CommunauteSavoirEncadrementDoctorant> savedCommunauteSavoirEncadrementDoctorants = new ArrayList<>();
        communauteSavoirEncadrementDoctorants.forEach(element -> {
        element.setEncadrementDoctorant(encadrementDoctorant);
         communauteSavoirEncadrementDoctorantService.save(element);
        });
        encadrementDoctorant.setCommunauteSavoirEncadrementDoctorants(savedCommunauteSavoirEncadrementDoctorants);
        }
        }

    private void findResponsabiliteEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant){
        ResponsabiliteEncadrementDoctorant loadedResponsabiliteEncadrementDoctorant =responsabiliteEncadrementDoctorantService.findByIdOrCode(encadrementDoctorant.getResponsabiliteEncadrementDoctorant());

    if(loadedResponsabiliteEncadrementDoctorant==null ) {
        return;
    }
    encadrementDoctorant.setResponsabiliteEncadrementDoctorant(loadedResponsabiliteEncadrementDoctorant);
    }
    private void findFinancementDoctorant(EncadrementDoctorant encadrementDoctorant){
        FinancementDoctorant loadedFinancementDoctorant =financementDoctorantService.findByIdOrCode(encadrementDoctorant.getFinancementDoctorant());

    if(loadedFinancementDoctorant==null ) {
        return;
    }
    encadrementDoctorant.setFinancementDoctorant(loadedFinancementDoctorant);
    }
    private void findEtablissement(EncadrementDoctorant encadrementDoctorant){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(encadrementDoctorant.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    encadrementDoctorant.setEtablissement(loadedEtablissement);
    }
    private void findPays(EncadrementDoctorant encadrementDoctorant){
        Pays loadedPays =paysService.findByIdOrCode(encadrementDoctorant.getPays());

    if(loadedPays==null ) {
        return;
    }
    encadrementDoctorant.setPays(loadedPays);
    }
    private void findDoctorant(EncadrementDoctorant encadrementDoctorant){
        Doctorant loadedDoctorant = null;
        if(encadrementDoctorant.getDoctorant() != null && encadrementDoctorant.getDoctorant().getId() !=null)
        loadedDoctorant =doctorantService.findById(encadrementDoctorant.getDoctorant().getId());

    if(loadedDoctorant==null ) {
        return;
    }
    encadrementDoctorant.setDoctorant(loadedDoctorant);
    }
    private void findEncadrement(EncadrementDoctorant encadrementDoctorant){
        Encadrement loadedEncadrement = null;
        if(encadrementDoctorant.getEncadrement() != null && encadrementDoctorant.getEncadrement().getId() !=null)
        loadedEncadrement =encadrementService.findById(encadrementDoctorant.getEncadrement().getId());

    if(loadedEncadrement==null ) {
        return;
    }
    encadrementDoctorant.setEncadrement(loadedEncadrement);
    }
    private void findEtatEtapeCampagne(EncadrementDoctorant encadrementDoctorant){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(encadrementDoctorant.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    encadrementDoctorant.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<EncadrementDoctorant> encadrementDoctorants){
        if(ListUtil.isNotEmpty(encadrementDoctorants)){
        encadrementDoctorants.forEach(e->encadrementDoctorantDao.delete(e));
        }
}
@Override
public void update(List<EncadrementDoctorant> encadrementDoctorants){
if(ListUtil.isNotEmpty(encadrementDoctorants)){
encadrementDoctorants.forEach(e->encadrementDoctorantDao.save(e));
}
}

private void associateEnjeuxIrdEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant, List<EnjeuxIrdEncadrementDoctorant> enjeuxIrdEncadrementDoctorant) {
    if (ListUtil.isNotEmpty(enjeuxIrdEncadrementDoctorant)) {
        enjeuxIrdEncadrementDoctorant.forEach(e -> e.setEncadrementDoctorant(encadrementDoctorant));
    }
    }
private void associateDisciplineScientifiqueEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant, List<DisciplineScientifiqueEncadrementDoctorant> disciplineScientifiqueEncadrementDoctorant) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueEncadrementDoctorant)) {
        disciplineScientifiqueEncadrementDoctorant.forEach(e -> e.setEncadrementDoctorant(encadrementDoctorant));
    }
    }
private void associateCommunauteSavoirEncadrementDoctorant(EncadrementDoctorant encadrementDoctorant, List<CommunauteSavoirEncadrementDoctorant> communauteSavoirEncadrementDoctorant) {
    if (ListUtil.isNotEmpty(communauteSavoirEncadrementDoctorant)) {
        communauteSavoirEncadrementDoctorant.forEach(e -> e.setEncadrementDoctorant(encadrementDoctorant));
    }
    }


}
