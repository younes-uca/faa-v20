package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.bean.NatureExpertise;
import com.ird.faa.bean.Expertise;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.bean.EtablissementComiteEtCommissionEvaluation;
import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;
import com.ird.faa.bean.InstrumentIrdComiteEtCommissionEvaluation;
import com.ird.faa.dao.ComiteEtCommissionEvaluationDao;
import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.InstrumentIrdComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.NatureExpertiseChercheurService;
import com.ird.faa.service.chercheur.facade.RoleComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.ExpertiseChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdComiteEtCommissionEvaluationChercheurService;

import com.ird.faa.ws.rest.provided.vo.ComiteEtCommissionEvaluationVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.bean.EtablissementComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.EtablissementComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.RoleComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.DisciplineScientifiqueComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.bean.InstrumentIrdComiteEtCommissionEvaluation;
import com.ird.faa.service.chercheur.facade.InstrumentIrdComiteEtCommissionEvaluationChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ComiteEtCommissionEvaluationChercheurServiceImpl extends AbstractServiceImpl<ComiteEtCommissionEvaluation> implements ComiteEtCommissionEvaluationChercheurService {

@Autowired
private ComiteEtCommissionEvaluationDao comiteEtCommissionEvaluationDao;

        @Autowired
        private DisciplineScientifiqueComiteEtCommissionEvaluationChercheurService disciplineScientifiqueComiteEtCommissionEvaluationService ;
        @Autowired
        private InstrumentIrdComiteEtCommissionEvaluationChercheurService instrumentIrdComiteEtCommissionEvaluationService ;
        @Autowired
        private TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService typeExpertiseEvaluationComiteEtCommissionEvaluationService ;
        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private NatureExpertiseChercheurService natureExpertiseService ;
        @Autowired
        private RoleComiteEtCommissionEvaluationChercheurService roleComiteEtCommissionEvaluationService ;
        @Autowired
        private ExpertiseChercheurService expertiseService ;
        @Autowired
        private EtablissementComiteEtCommissionEvaluationChercheurService etablissementComiteEtCommissionEvaluationService ;
        @Autowired
        private EnjeuxIrdComiteEtCommissionEvaluationChercheurService enjeuxIrdComiteEtCommissionEvaluationService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ComiteEtCommissionEvaluation> findAll(){
        return comiteEtCommissionEvaluationDao.findAll();
}

        @Override
        public List<ComiteEtCommissionEvaluation> findByNatureExpertiseCode(String code){
        return comiteEtCommissionEvaluationDao.findByNatureExpertiseCode(code);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseCode(String code){
        return comiteEtCommissionEvaluationDao.deleteByNatureExpertiseCode(code);
        }

        @Override
        public List<ComiteEtCommissionEvaluation> findByNatureExpertiseId(Long id){
        return comiteEtCommissionEvaluationDao.findByNatureExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseId(Long id){
        return comiteEtCommissionEvaluationDao.deleteByNatureExpertiseId(id);
        }

        @Override
        public List<ComiteEtCommissionEvaluation> findByExpertiseId(Long id){
        return comiteEtCommissionEvaluationDao.findByExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByExpertiseId(Long id){
        return comiteEtCommissionEvaluationDao.deleteByExpertiseId(id);
        }


        @Override
        public List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneCode(String code){
        return comiteEtCommissionEvaluationDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return comiteEtCommissionEvaluationDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneId(Long id){
        return comiteEtCommissionEvaluationDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return comiteEtCommissionEvaluationDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public ComiteEtCommissionEvaluation findById(Long id){
if(id==null) return null;
return comiteEtCommissionEvaluationDao.getOne(id);
}

@Override
public ComiteEtCommissionEvaluation findByIdWithAssociatedList(Long id){
ComiteEtCommissionEvaluation comiteEtCommissionEvaluation  = findById(id);
findAssociatedLists(comiteEtCommissionEvaluation);
return comiteEtCommissionEvaluation;
}
private void findAssociatedLists(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
if(comiteEtCommissionEvaluation!=null && comiteEtCommissionEvaluation.getId() != null) {
        List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations = typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setTypeExpertiseEvaluationComiteEtCommissionEvaluations(typeExpertiseEvaluationComiteEtCommissionEvaluations);
        List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluations = etablissementComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setEtablissementComiteEtCommissionEvaluations(etablissementComiteEtCommissionEvaluations);
        List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations = roleComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setRoleComiteEtCommissionEvaluations(roleComiteEtCommissionEvaluations);
        List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations = disciplineScientifiqueComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setDisciplineScientifiqueComiteEtCommissionEvaluations(disciplineScientifiqueComiteEtCommissionEvaluations);
        List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations = enjeuxIrdComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setEnjeuxIrdComiteEtCommissionEvaluations(enjeuxIrdComiteEtCommissionEvaluations);
        List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluations = instrumentIrdComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId());
        comiteEtCommissionEvaluation.setInstrumentIrdComiteEtCommissionEvaluations(instrumentIrdComiteEtCommissionEvaluations);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        typeExpertiseEvaluationComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        etablissementComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        roleComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        disciplineScientifiqueComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        enjeuxIrdComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
        instrumentIrdComiteEtCommissionEvaluationService.deleteByComiteEtCommissionEvaluationId(id);
}
}

    private void updateAssociatedLists(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
    if(comiteEtCommissionEvaluation !=null && comiteEtCommissionEvaluation.getId() != null){
            List<List<TypeExpertiseEvaluationComiteEtCommissionEvaluation>> resultTypeExpertiseEvaluationComiteEtCommissionEvaluations= typeExpertiseEvaluationComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(typeExpertiseEvaluationComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getTypeExpertiseEvaluationComiteEtCommissionEvaluations());
            typeExpertiseEvaluationComiteEtCommissionEvaluationService.delete(resultTypeExpertiseEvaluationComiteEtCommissionEvaluations.get(1));
            associateTypeExpertiseEvaluationComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultTypeExpertiseEvaluationComiteEtCommissionEvaluations.get(0));
            typeExpertiseEvaluationComiteEtCommissionEvaluationService.update(resultTypeExpertiseEvaluationComiteEtCommissionEvaluations.get(0));

            List<List<EtablissementComiteEtCommissionEvaluation>> resultEtablissementComiteEtCommissionEvaluations= etablissementComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(etablissementComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getEtablissementComiteEtCommissionEvaluations());
            etablissementComiteEtCommissionEvaluationService.delete(resultEtablissementComiteEtCommissionEvaluations.get(1));
            associateEtablissementComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultEtablissementComiteEtCommissionEvaluations.get(0));
            etablissementComiteEtCommissionEvaluationService.update(resultEtablissementComiteEtCommissionEvaluations.get(0));

            List<List<RoleComiteEtCommissionEvaluation>> resultRoleComiteEtCommissionEvaluations= roleComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(roleComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getRoleComiteEtCommissionEvaluations());
            roleComiteEtCommissionEvaluationService.delete(resultRoleComiteEtCommissionEvaluations.get(1));
            associateRoleComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultRoleComiteEtCommissionEvaluations.get(0));
            roleComiteEtCommissionEvaluationService.update(resultRoleComiteEtCommissionEvaluations.get(0));

            List<List<DisciplineScientifiqueComiteEtCommissionEvaluation>> resultDisciplineScientifiqueComiteEtCommissionEvaluations= disciplineScientifiqueComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(disciplineScientifiqueComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getDisciplineScientifiqueComiteEtCommissionEvaluations());
            disciplineScientifiqueComiteEtCommissionEvaluationService.delete(resultDisciplineScientifiqueComiteEtCommissionEvaluations.get(1));
            associateDisciplineScientifiqueComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultDisciplineScientifiqueComiteEtCommissionEvaluations.get(0));
            disciplineScientifiqueComiteEtCommissionEvaluationService.update(resultDisciplineScientifiqueComiteEtCommissionEvaluations.get(0));

            List<List<EnjeuxIrdComiteEtCommissionEvaluation>> resultEnjeuxIrdComiteEtCommissionEvaluations= enjeuxIrdComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(enjeuxIrdComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getEnjeuxIrdComiteEtCommissionEvaluations());
            enjeuxIrdComiteEtCommissionEvaluationService.delete(resultEnjeuxIrdComiteEtCommissionEvaluations.get(1));
            associateEnjeuxIrdComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultEnjeuxIrdComiteEtCommissionEvaluations.get(0));
            enjeuxIrdComiteEtCommissionEvaluationService.update(resultEnjeuxIrdComiteEtCommissionEvaluations.get(0));

            List<List<InstrumentIrdComiteEtCommissionEvaluation>> resultInstrumentIrdComiteEtCommissionEvaluations= instrumentIrdComiteEtCommissionEvaluationService.getToBeSavedAndToBeDeleted(instrumentIrdComiteEtCommissionEvaluationService.findByComiteEtCommissionEvaluationId(comiteEtCommissionEvaluation.getId()),comiteEtCommissionEvaluation.getInstrumentIrdComiteEtCommissionEvaluations());
            instrumentIrdComiteEtCommissionEvaluationService.delete(resultInstrumentIrdComiteEtCommissionEvaluations.get(1));
            associateInstrumentIrdComiteEtCommissionEvaluation(comiteEtCommissionEvaluation,resultInstrumentIrdComiteEtCommissionEvaluations.get(0));
            instrumentIrdComiteEtCommissionEvaluationService.update(resultInstrumentIrdComiteEtCommissionEvaluations.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(comiteEtCommissionEvaluationDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
comiteEtCommissionEvaluationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ComiteEtCommissionEvaluation update(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
ComiteEtCommissionEvaluation foundedComiteEtCommissionEvaluation = findById(comiteEtCommissionEvaluation.getId());
if(foundedComiteEtCommissionEvaluation==null) return null;
else{
    updateAssociatedLists(comiteEtCommissionEvaluation);
return  comiteEtCommissionEvaluationDao.save(comiteEtCommissionEvaluation);
}
}
private void prepareSave(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
if(comiteEtCommissionEvaluation.getRelieeInstrumentsIrd() == null)
  comiteEtCommissionEvaluation.setRelieeInstrumentsIrd(false);



}

@Override
public ComiteEtCommissionEvaluation save (ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
prepareSave(comiteEtCommissionEvaluation);

ComiteEtCommissionEvaluation result =null;


    findNatureExpertise(comiteEtCommissionEvaluation);
    findExpertise(comiteEtCommissionEvaluation);
    findEtatEtapeCampagne(comiteEtCommissionEvaluation);

ComiteEtCommissionEvaluation savedComiteEtCommissionEvaluation = comiteEtCommissionEvaluationDao.save(comiteEtCommissionEvaluation);

       saveTypeExpertiseEvaluationComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getTypeExpertiseEvaluationComiteEtCommissionEvaluations());
       saveEtablissementComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getEtablissementComiteEtCommissionEvaluations());
       saveRoleComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getRoleComiteEtCommissionEvaluations());
       saveDisciplineScientifiqueComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getDisciplineScientifiqueComiteEtCommissionEvaluations());
       saveEnjeuxIrdComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getEnjeuxIrdComiteEtCommissionEvaluations());
       saveInstrumentIrdComiteEtCommissionEvaluations(savedComiteEtCommissionEvaluation,comiteEtCommissionEvaluation.getInstrumentIrdComiteEtCommissionEvaluations());
result = savedComiteEtCommissionEvaluation;

return result;
}

@Override
public List<ComiteEtCommissionEvaluation> save(List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations){
List<ComiteEtCommissionEvaluation> list = new ArrayList<>();
for(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation: comiteEtCommissionEvaluations){
list.add(save(comiteEtCommissionEvaluation));
}
return list;
}

        private List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> prepareTypeExpertiseEvaluationComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){
        for(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation:typeExpertiseEvaluationComiteEtCommissionEvaluations ){
        typeExpertiseEvaluationComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return typeExpertiseEvaluationComiteEtCommissionEvaluations;
        }
        private List<EtablissementComiteEtCommissionEvaluation> prepareEtablissementComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluations){
        for(EtablissementComiteEtCommissionEvaluation etablissementComiteEtCommissionEvaluation:etablissementComiteEtCommissionEvaluations ){
        etablissementComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return etablissementComiteEtCommissionEvaluations;
        }
        private List<RoleComiteEtCommissionEvaluation> prepareRoleComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){
        for(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation:roleComiteEtCommissionEvaluations ){
        roleComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return roleComiteEtCommissionEvaluations;
        }
        private List<DisciplineScientifiqueComiteEtCommissionEvaluation> prepareDisciplineScientifiqueComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){
        for(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation:disciplineScientifiqueComiteEtCommissionEvaluations ){
        disciplineScientifiqueComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return disciplineScientifiqueComiteEtCommissionEvaluations;
        }
        private List<EnjeuxIrdComiteEtCommissionEvaluation> prepareEnjeuxIrdComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){
        for(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation:enjeuxIrdComiteEtCommissionEvaluations ){
        enjeuxIrdComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return enjeuxIrdComiteEtCommissionEvaluations;
        }
        private List<InstrumentIrdComiteEtCommissionEvaluation> prepareInstrumentIrdComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluations){
        for(InstrumentIrdComiteEtCommissionEvaluation instrumentIrdComiteEtCommissionEvaluation:instrumentIrdComiteEtCommissionEvaluations ){
        instrumentIrdComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
        }
        return instrumentIrdComiteEtCommissionEvaluations;
        }


@Override
@Transactional
public int delete(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
    if(comiteEtCommissionEvaluation.getId()==null) return -1;
    ComiteEtCommissionEvaluation foundedComiteEtCommissionEvaluation = findById(comiteEtCommissionEvaluation.getId());
    if(foundedComiteEtCommissionEvaluation==null) return -1;
comiteEtCommissionEvaluationDao.delete(foundedComiteEtCommissionEvaluation);
return 1;
}


public List<ComiteEtCommissionEvaluation> findByCriteria(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){

String query = "SELECT o FROM ComiteEtCommissionEvaluation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",comiteEtCommissionEvaluationVo.getId());
            query += SearchUtil.addConstraint( "o", "nom","LIKE",comiteEtCommissionEvaluationVo.getNom());
            query += SearchUtil.addConstraint( "o", "nomRevueOuEditeur","LIKE",comiteEtCommissionEvaluationVo.getNomRevueOuEditeur());
            query += SearchUtil.addConstraint( "o", "role","LIKE",comiteEtCommissionEvaluationVo.getRole());
            query += SearchUtil.addConstraint( "o", "nombreJourDedie","=",comiteEtCommissionEvaluationVo.getNombreJourDedie());
            query += SearchUtil.addConstraint( "o", "relieeInstrumentsIrd","=",comiteEtCommissionEvaluationVo.getRelieeInstrumentsIrd());
            query += SearchUtil.addConstraint( "o", "commentaire","LIKE",comiteEtCommissionEvaluationVo.getCommentaire());
            query += SearchUtil.addConstraintMinMax("o","nombreJourDedie",comiteEtCommissionEvaluationVo.getNombreJourDedieMin(),comiteEtCommissionEvaluationVo.getNombreJourDedieMax());
    if(comiteEtCommissionEvaluationVo.getNatureExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "natureExpertise.id","=",comiteEtCommissionEvaluationVo.getNatureExpertiseVo().getId());
            query += SearchUtil.addConstraint( "o", "natureExpertise.code","LIKE",comiteEtCommissionEvaluationVo.getNatureExpertiseVo().getCode());
    }

    if(comiteEtCommissionEvaluationVo.getExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "expertise.id","=",comiteEtCommissionEvaluationVo.getExpertiseVo().getId());
    }

    if(comiteEtCommissionEvaluationVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",comiteEtCommissionEvaluationVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",comiteEtCommissionEvaluationVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveTypeExpertiseEvaluationComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getTypeExpertiseEvaluationComiteEtCommissionEvaluations())) {
        List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> savedTypeExpertiseEvaluationComiteEtCommissionEvaluations = new ArrayList<>();
        typeExpertiseEvaluationComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         typeExpertiseEvaluationComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setTypeExpertiseEvaluationComiteEtCommissionEvaluations(savedTypeExpertiseEvaluationComiteEtCommissionEvaluations);
        }
        }
        private  void saveEtablissementComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getEtablissementComiteEtCommissionEvaluations())) {
        List<EtablissementComiteEtCommissionEvaluation> savedEtablissementComiteEtCommissionEvaluations = new ArrayList<>();
        etablissementComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         etablissementComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setEtablissementComiteEtCommissionEvaluations(savedEtablissementComiteEtCommissionEvaluations);
        }
        }
        private  void saveRoleComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getRoleComiteEtCommissionEvaluations())) {
        List<RoleComiteEtCommissionEvaluation> savedRoleComiteEtCommissionEvaluations = new ArrayList<>();
        roleComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         roleComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setRoleComiteEtCommissionEvaluations(savedRoleComiteEtCommissionEvaluations);
        }
        }
        private  void saveDisciplineScientifiqueComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getDisciplineScientifiqueComiteEtCommissionEvaluations())) {
        List<DisciplineScientifiqueComiteEtCommissionEvaluation> savedDisciplineScientifiqueComiteEtCommissionEvaluations = new ArrayList<>();
        disciplineScientifiqueComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         disciplineScientifiqueComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setDisciplineScientifiqueComiteEtCommissionEvaluations(savedDisciplineScientifiqueComiteEtCommissionEvaluations);
        }
        }
        private  void saveEnjeuxIrdComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getEnjeuxIrdComiteEtCommissionEvaluations())) {
        List<EnjeuxIrdComiteEtCommissionEvaluation> savedEnjeuxIrdComiteEtCommissionEvaluations = new ArrayList<>();
        enjeuxIrdComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         enjeuxIrdComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setEnjeuxIrdComiteEtCommissionEvaluations(savedEnjeuxIrdComiteEtCommissionEvaluations);
        }
        }
        private  void saveInstrumentIrdComiteEtCommissionEvaluations(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation,List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluations){

        if (ListUtil.isNotEmpty(comiteEtCommissionEvaluation.getInstrumentIrdComiteEtCommissionEvaluations())) {
        List<InstrumentIrdComiteEtCommissionEvaluation> savedInstrumentIrdComiteEtCommissionEvaluations = new ArrayList<>();
        instrumentIrdComiteEtCommissionEvaluations.forEach(element -> {
        element.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation);
         instrumentIrdComiteEtCommissionEvaluationService.save(element);
        });
        comiteEtCommissionEvaluation.setInstrumentIrdComiteEtCommissionEvaluations(savedInstrumentIrdComiteEtCommissionEvaluations);
        }
        }

    private void findNatureExpertise(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
        NatureExpertise loadedNatureExpertise =natureExpertiseService.findByIdOrCode(comiteEtCommissionEvaluation.getNatureExpertise());

    if(loadedNatureExpertise==null ) {
        return;
    }
    comiteEtCommissionEvaluation.setNatureExpertise(loadedNatureExpertise);
    }
    private void findExpertise(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
        Expertise loadedExpertise = null;
        if(comiteEtCommissionEvaluation.getExpertise() != null && comiteEtCommissionEvaluation.getExpertise().getId() !=null)
        loadedExpertise =expertiseService.findById(comiteEtCommissionEvaluation.getExpertise().getId());

    if(loadedExpertise==null ) {
        return;
    }
    comiteEtCommissionEvaluation.setExpertise(loadedExpertise);
    }
    private void findEtatEtapeCampagne(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(comiteEtCommissionEvaluation.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    comiteEtCommissionEvaluation.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations){
        if(ListUtil.isNotEmpty(comiteEtCommissionEvaluations)){
        comiteEtCommissionEvaluations.forEach(e->comiteEtCommissionEvaluationDao.delete(e));
        }
}
@Override
public void update(List<ComiteEtCommissionEvaluation> comiteEtCommissionEvaluations){
if(ListUtil.isNotEmpty(comiteEtCommissionEvaluations)){
comiteEtCommissionEvaluations.forEach(e->comiteEtCommissionEvaluationDao.save(e));
}
}

private void associateTypeExpertiseEvaluationComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(typeExpertiseEvaluationComiteEtCommissionEvaluation)) {
        typeExpertiseEvaluationComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }
private void associateEtablissementComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<EtablissementComiteEtCommissionEvaluation> etablissementComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(etablissementComiteEtCommissionEvaluation)) {
        etablissementComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }
private void associateRoleComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(roleComiteEtCommissionEvaluation)) {
        roleComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }
private void associateDisciplineScientifiqueComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueComiteEtCommissionEvaluation)) {
        disciplineScientifiqueComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }
private void associateEnjeuxIrdComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(enjeuxIrdComiteEtCommissionEvaluation)) {
        enjeuxIrdComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }
private void associateInstrumentIrdComiteEtCommissionEvaluation(ComiteEtCommissionEvaluation comiteEtCommissionEvaluation, List<InstrumentIrdComiteEtCommissionEvaluation> instrumentIrdComiteEtCommissionEvaluation) {
    if (ListUtil.isNotEmpty(instrumentIrdComiteEtCommissionEvaluation)) {
        instrumentIrdComiteEtCommissionEvaluation.forEach(e -> e.setComiteEtCommissionEvaluation(comiteEtCommissionEvaluation));
    }
    }


}
