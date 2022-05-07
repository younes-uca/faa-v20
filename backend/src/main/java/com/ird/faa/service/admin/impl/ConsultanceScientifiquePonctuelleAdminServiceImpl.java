package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.TypeExpertise;
import com.ird.faa.bean.NatureExpertise;
import com.ird.faa.bean.Expertise;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.PaysCommanditaire;
import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.DisciplineScientifiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.dao.ConsultanceScientifiquePonctuelleDao;
import com.ird.faa.service.admin.facade.ConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.EtablissementConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.InstrumentIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.PaysCommanditaireAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.TypeExpertiseAdminService;
import com.ird.faa.service.admin.facade.NatureExpertiseAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.ZoneGeographiqueConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.service.admin.facade.ExpertiseAdminService;

import com.ird.faa.ws.rest.provided.vo.ConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.ZoneGeographiqueConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.bean.PaysCommanditaire;
import com.ird.faa.service.admin.facade.PaysCommanditaireAdminService;
import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.EtablissementConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.bean.DisciplineScientifiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.EnjeuxIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.InstrumentIrdConsultanceScientifiquePonctuelleAdminService;
import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.service.admin.facade.TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ConsultanceScientifiquePonctuelleAdminServiceImpl extends AbstractServiceImpl<ConsultanceScientifiquePonctuelle> implements ConsultanceScientifiquePonctuelleAdminService {

@Autowired
private ConsultanceScientifiquePonctuelleDao consultanceScientifiquePonctuelleDao;

        @Autowired
        private TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService typeInstrumentIrdConsultanceScientifiquePonctuelleService ;
        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private EtablissementConsultanceScientifiquePonctuelleAdminService etablissementConsultanceScientifiquePonctuelleService ;
        @Autowired
        private InstrumentIrdConsultanceScientifiquePonctuelleAdminService instrumentIrdConsultanceScientifiquePonctuelleService ;
        @Autowired
        private PaysCommanditaireAdminService paysCommanditaireService ;
        @Autowired
        private DisciplineScientifiqueConsultanceScientifiquePonctuelleAdminService disciplineScientifiqueConsultanceScientifiquePonctuelleService ;
        @Autowired
        private TypeExpertiseAdminService typeExpertiseService ;
        @Autowired
        private NatureExpertiseAdminService natureExpertiseService ;
        @Autowired
        private EnjeuxIrdConsultanceScientifiquePonctuelleAdminService enjeuxIrdConsultanceScientifiquePonctuelleService ;
        @Autowired
        private ZoneGeographiqueConsultanceScientifiquePonctuelleAdminService zoneGeographiqueConsultanceScientifiquePonctuelleService ;
        @Autowired
        private ExpertiseAdminService expertiseService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ConsultanceScientifiquePonctuelle> findAll(){
        return consultanceScientifiquePonctuelleDao.findAll();
}

        @Override
        public List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseCode(String code){
        return consultanceScientifiquePonctuelleDao.findByTypeExpertiseCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseCode(String code){
        return consultanceScientifiquePonctuelleDao.deleteByTypeExpertiseCode(code);
        }

        @Override
        public List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.findByTypeExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.deleteByTypeExpertiseId(id);
        }


        @Override
        public List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseCode(String code){
        return consultanceScientifiquePonctuelleDao.findByNatureExpertiseCode(code);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseCode(String code){
        return consultanceScientifiquePonctuelleDao.deleteByNatureExpertiseCode(code);
        }

        @Override
        public List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.findByNatureExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.deleteByNatureExpertiseId(id);
        }

        @Override
        public List<ConsultanceScientifiquePonctuelle> findByExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.findByExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByExpertiseId(Long id){
        return consultanceScientifiquePonctuelleDao.deleteByExpertiseId(id);
        }


        @Override
        public List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneCode(String code){
        return consultanceScientifiquePonctuelleDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return consultanceScientifiquePonctuelleDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneId(Long id){
        return consultanceScientifiquePonctuelleDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return consultanceScientifiquePonctuelleDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public ConsultanceScientifiquePonctuelle findById(Long id){
if(id==null) return null;
return consultanceScientifiquePonctuelleDao.getOne(id);
}

@Override
public ConsultanceScientifiquePonctuelle findByIdWithAssociatedList(Long id){
ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle  = findById(id);
findAssociatedLists(consultanceScientifiquePonctuelle);
return consultanceScientifiquePonctuelle;
}
private void findAssociatedLists(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
if(consultanceScientifiquePonctuelle!=null && consultanceScientifiquePonctuelle.getId() != null) {
        List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelles = zoneGeographiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setZoneGeographiqueConsultanceScientifiquePonctuelles(zoneGeographiqueConsultanceScientifiquePonctuelles);
        List<PaysCommanditaire> paysCommanditaires = paysCommanditaireService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setPaysCommanditaires(paysCommanditaires);
        List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles = etablissementConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setEtablissementConsultanceScientifiquePonctuelles(etablissementConsultanceScientifiquePonctuelles);
        List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelles = disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setDisciplineScientifiqueConsultanceScientifiquePonctuelles(disciplineScientifiqueConsultanceScientifiquePonctuelles);
        List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles = enjeuxIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setEnjeuxIrdConsultanceScientifiquePonctuelles(enjeuxIrdConsultanceScientifiquePonctuelles);
        List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles = instrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setInstrumentIrdConsultanceScientifiquePonctuelles(instrumentIrdConsultanceScientifiquePonctuelles);
        List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles = typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId());
        consultanceScientifiquePonctuelle.setTypeInstrumentIrdConsultanceScientifiquePonctuelles(typeInstrumentIrdConsultanceScientifiquePonctuelles);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        zoneGeographiqueConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        paysCommanditaireService.deleteByConsultanceScientifiquePonctuelleId(id);
        etablissementConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        disciplineScientifiqueConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        enjeuxIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        instrumentIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
        typeInstrumentIrdConsultanceScientifiquePonctuelleService.deleteByConsultanceScientifiquePonctuelleId(id);
}
}

    private void updateAssociatedLists(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
    if(consultanceScientifiquePonctuelle !=null && consultanceScientifiquePonctuelle.getId() != null){
            List<List<ZoneGeographiqueConsultanceScientifiquePonctuelle>> resultZoneGeographiqueConsultanceScientifiquePonctuelles= zoneGeographiqueConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(zoneGeographiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getZoneGeographiqueConsultanceScientifiquePonctuelles());
            zoneGeographiqueConsultanceScientifiquePonctuelleService.delete(resultZoneGeographiqueConsultanceScientifiquePonctuelles.get(1));
            associateZoneGeographiqueConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultZoneGeographiqueConsultanceScientifiquePonctuelles.get(0));
            zoneGeographiqueConsultanceScientifiquePonctuelleService.update(resultZoneGeographiqueConsultanceScientifiquePonctuelles.get(0));

            List<List<PaysCommanditaire>> resultPaysCommanditaires= paysCommanditaireService.getToBeSavedAndToBeDeleted(paysCommanditaireService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getPaysCommanditaires());
            paysCommanditaireService.delete(resultPaysCommanditaires.get(1));
            associatePaysCommanditaire(consultanceScientifiquePonctuelle,resultPaysCommanditaires.get(0));
            paysCommanditaireService.update(resultPaysCommanditaires.get(0));

            List<List<EtablissementConsultanceScientifiquePonctuelle>> resultEtablissementConsultanceScientifiquePonctuelles= etablissementConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(etablissementConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getEtablissementConsultanceScientifiquePonctuelles());
            etablissementConsultanceScientifiquePonctuelleService.delete(resultEtablissementConsultanceScientifiquePonctuelles.get(1));
            associateEtablissementConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultEtablissementConsultanceScientifiquePonctuelles.get(0));
            etablissementConsultanceScientifiquePonctuelleService.update(resultEtablissementConsultanceScientifiquePonctuelles.get(0));

            List<List<DisciplineScientifiqueConsultanceScientifiquePonctuelle>> resultDisciplineScientifiqueConsultanceScientifiquePonctuelles= disciplineScientifiqueConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(disciplineScientifiqueConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getDisciplineScientifiqueConsultanceScientifiquePonctuelles());
            disciplineScientifiqueConsultanceScientifiquePonctuelleService.delete(resultDisciplineScientifiqueConsultanceScientifiquePonctuelles.get(1));
            associateDisciplineScientifiqueConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultDisciplineScientifiqueConsultanceScientifiquePonctuelles.get(0));
            disciplineScientifiqueConsultanceScientifiquePonctuelleService.update(resultDisciplineScientifiqueConsultanceScientifiquePonctuelles.get(0));

            List<List<EnjeuxIrdConsultanceScientifiquePonctuelle>> resultEnjeuxIrdConsultanceScientifiquePonctuelles= enjeuxIrdConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(enjeuxIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getEnjeuxIrdConsultanceScientifiquePonctuelles());
            enjeuxIrdConsultanceScientifiquePonctuelleService.delete(resultEnjeuxIrdConsultanceScientifiquePonctuelles.get(1));
            associateEnjeuxIrdConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultEnjeuxIrdConsultanceScientifiquePonctuelles.get(0));
            enjeuxIrdConsultanceScientifiquePonctuelleService.update(resultEnjeuxIrdConsultanceScientifiquePonctuelles.get(0));

            List<List<InstrumentIrdConsultanceScientifiquePonctuelle>> resultInstrumentIrdConsultanceScientifiquePonctuelles= instrumentIrdConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(instrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getInstrumentIrdConsultanceScientifiquePonctuelles());
            instrumentIrdConsultanceScientifiquePonctuelleService.delete(resultInstrumentIrdConsultanceScientifiquePonctuelles.get(1));
            associateInstrumentIrdConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultInstrumentIrdConsultanceScientifiquePonctuelles.get(0));
            instrumentIrdConsultanceScientifiquePonctuelleService.update(resultInstrumentIrdConsultanceScientifiquePonctuelles.get(0));

            List<List<TypeInstrumentIrdConsultanceScientifiquePonctuelle>> resultTypeInstrumentIrdConsultanceScientifiquePonctuelles= typeInstrumentIrdConsultanceScientifiquePonctuelleService.getToBeSavedAndToBeDeleted(typeInstrumentIrdConsultanceScientifiquePonctuelleService.findByConsultanceScientifiquePonctuelleId(consultanceScientifiquePonctuelle.getId()),consultanceScientifiquePonctuelle.getTypeInstrumentIrdConsultanceScientifiquePonctuelles());
            typeInstrumentIrdConsultanceScientifiquePonctuelleService.delete(resultTypeInstrumentIrdConsultanceScientifiquePonctuelles.get(1));
            associateTypeInstrumentIrdConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle,resultTypeInstrumentIrdConsultanceScientifiquePonctuelles.get(0));
            typeInstrumentIrdConsultanceScientifiquePonctuelleService.update(resultTypeInstrumentIrdConsultanceScientifiquePonctuelles.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(consultanceScientifiquePonctuelleDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
consultanceScientifiquePonctuelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ConsultanceScientifiquePonctuelle update(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
ConsultanceScientifiquePonctuelle foundedConsultanceScientifiquePonctuelle = findById(consultanceScientifiquePonctuelle.getId());
if(foundedConsultanceScientifiquePonctuelle==null) return null;
else{
    updateAssociatedLists(consultanceScientifiquePonctuelle);
return  consultanceScientifiquePonctuelleDao.save(consultanceScientifiquePonctuelle);
}
}
private void prepareSave(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
if(consultanceScientifiquePonctuelle.getRelieeInstrumentsIrd() == null)
  consultanceScientifiquePonctuelle.setRelieeInstrumentsIrd(false);



}

@Override
public ConsultanceScientifiquePonctuelle save (ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
prepareSave(consultanceScientifiquePonctuelle);

ConsultanceScientifiquePonctuelle result =null;


    findTypeExpertise(consultanceScientifiquePonctuelle);
    findNatureExpertise(consultanceScientifiquePonctuelle);
    findExpertise(consultanceScientifiquePonctuelle);
    findEtatEtapeCampagne(consultanceScientifiquePonctuelle);

ConsultanceScientifiquePonctuelle savedConsultanceScientifiquePonctuelle = consultanceScientifiquePonctuelleDao.save(consultanceScientifiquePonctuelle);

       saveZoneGeographiqueConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getZoneGeographiqueConsultanceScientifiquePonctuelles());
       savePaysCommanditaires(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getPaysCommanditaires());
       saveEtablissementConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getEtablissementConsultanceScientifiquePonctuelles());
       saveDisciplineScientifiqueConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getDisciplineScientifiqueConsultanceScientifiquePonctuelles());
       saveEnjeuxIrdConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getEnjeuxIrdConsultanceScientifiquePonctuelles());
       saveInstrumentIrdConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getInstrumentIrdConsultanceScientifiquePonctuelles());
       saveTypeInstrumentIrdConsultanceScientifiquePonctuelles(savedConsultanceScientifiquePonctuelle,consultanceScientifiquePonctuelle.getTypeInstrumentIrdConsultanceScientifiquePonctuelles());
result = savedConsultanceScientifiquePonctuelle;

return result;
}

@Override
public List<ConsultanceScientifiquePonctuelle> save(List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles){
List<ConsultanceScientifiquePonctuelle> list = new ArrayList<>();
for(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle: consultanceScientifiquePonctuelles){
list.add(save(consultanceScientifiquePonctuelle));
}
return list;
}

        private List<ZoneGeographiqueConsultanceScientifiquePonctuelle> prepareZoneGeographiqueConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelles){
        for(ZoneGeographiqueConsultanceScientifiquePonctuelle zoneGeographiqueConsultanceScientifiquePonctuelle:zoneGeographiqueConsultanceScientifiquePonctuelles ){
        zoneGeographiqueConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return zoneGeographiqueConsultanceScientifiquePonctuelles;
        }
        private List<PaysCommanditaire> preparePaysCommanditaires(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<PaysCommanditaire> paysCommanditaires){
        for(PaysCommanditaire paysCommanditaire:paysCommanditaires ){
        paysCommanditaire.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return paysCommanditaires;
        }
        private List<EtablissementConsultanceScientifiquePonctuelle> prepareEtablissementConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){
        for(EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle:etablissementConsultanceScientifiquePonctuelles ){
        etablissementConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return etablissementConsultanceScientifiquePonctuelles;
        }
        private List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> prepareDisciplineScientifiqueConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelles){
        for(DisciplineScientifiqueConsultanceScientifiquePonctuelle disciplineScientifiqueConsultanceScientifiquePonctuelle:disciplineScientifiqueConsultanceScientifiquePonctuelles ){
        disciplineScientifiqueConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return disciplineScientifiqueConsultanceScientifiquePonctuelles;
        }
        private List<EnjeuxIrdConsultanceScientifiquePonctuelle> prepareEnjeuxIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){
        for(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle:enjeuxIrdConsultanceScientifiquePonctuelles ){
        enjeuxIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return enjeuxIrdConsultanceScientifiquePonctuelles;
        }
        private List<InstrumentIrdConsultanceScientifiquePonctuelle> prepareInstrumentIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){
        for(InstrumentIrdConsultanceScientifiquePonctuelle instrumentIrdConsultanceScientifiquePonctuelle:instrumentIrdConsultanceScientifiquePonctuelles ){
        instrumentIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return instrumentIrdConsultanceScientifiquePonctuelles;
        }
        private List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> prepareTypeInstrumentIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){
        for(TypeInstrumentIrdConsultanceScientifiquePonctuelle typeInstrumentIrdConsultanceScientifiquePonctuelle:typeInstrumentIrdConsultanceScientifiquePonctuelles ){
        typeInstrumentIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
        }
        return typeInstrumentIrdConsultanceScientifiquePonctuelles;
        }


@Override
@Transactional
public int delete(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
    if(consultanceScientifiquePonctuelle.getId()==null) return -1;
    ConsultanceScientifiquePonctuelle foundedConsultanceScientifiquePonctuelle = findById(consultanceScientifiquePonctuelle.getId());
    if(foundedConsultanceScientifiquePonctuelle==null) return -1;
consultanceScientifiquePonctuelleDao.delete(foundedConsultanceScientifiquePonctuelle);
return 1;
}


public List<ConsultanceScientifiquePonctuelle> findByCriteria(ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){

String query = "SELECT o FROM ConsultanceScientifiquePonctuelle o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",consultanceScientifiquePonctuelleVo.getId());
            query += SearchUtil.addConstraint( "o", "sujetExpertise","LIKE",consultanceScientifiquePonctuelleVo.getSujetExpertise());
            query += SearchUtil.addConstraint( "o", "nombreJourDedie","=",consultanceScientifiquePonctuelleVo.getNombreJourDedie());
        query += SearchUtil.addConstraintDate( "o", "dateFin","=",consultanceScientifiquePonctuelleVo.getDateFin());
            query += SearchUtil.addConstraint( "o", "relieeInstrumentsIrd","=",consultanceScientifiquePonctuelleVo.getRelieeInstrumentsIrd());
            query += SearchUtil.addConstraint( "o", "commentaire","LIKE",consultanceScientifiquePonctuelleVo.getCommentaire());
            query += SearchUtil.addConstraintMinMax("o","nombreJourDedie",consultanceScientifiquePonctuelleVo.getNombreJourDedieMin(),consultanceScientifiquePonctuelleVo.getNombreJourDedieMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateFin",consultanceScientifiquePonctuelleVo.getDateFinMin(),consultanceScientifiquePonctuelleVo.getDateFinMax());
    if(consultanceScientifiquePonctuelleVo.getTypeExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeExpertise.id","=",consultanceScientifiquePonctuelleVo.getTypeExpertiseVo().getId());
            query += SearchUtil.addConstraint( "o", "typeExpertise.code","LIKE",consultanceScientifiquePonctuelleVo.getTypeExpertiseVo().getCode());
    }

    if(consultanceScientifiquePonctuelleVo.getNatureExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "natureExpertise.id","=",consultanceScientifiquePonctuelleVo.getNatureExpertiseVo().getId());
            query += SearchUtil.addConstraint( "o", "natureExpertise.code","LIKE",consultanceScientifiquePonctuelleVo.getNatureExpertiseVo().getCode());
    }

    if(consultanceScientifiquePonctuelleVo.getExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "expertise.id","=",consultanceScientifiquePonctuelleVo.getExpertiseVo().getId());
    }

    if(consultanceScientifiquePonctuelleVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",consultanceScientifiquePonctuelleVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",consultanceScientifiquePonctuelleVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveZoneGeographiqueConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getZoneGeographiqueConsultanceScientifiquePonctuelles())) {
        List<ZoneGeographiqueConsultanceScientifiquePonctuelle> savedZoneGeographiqueConsultanceScientifiquePonctuelles = new ArrayList<>();
        zoneGeographiqueConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         zoneGeographiqueConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setZoneGeographiqueConsultanceScientifiquePonctuelles(savedZoneGeographiqueConsultanceScientifiquePonctuelles);
        }
        }
        private  void savePaysCommanditaires(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<PaysCommanditaire> paysCommanditaires){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getPaysCommanditaires())) {
        List<PaysCommanditaire> savedPaysCommanditaires = new ArrayList<>();
        paysCommanditaires.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         paysCommanditaireService.save(element);
        });
        consultanceScientifiquePonctuelle.setPaysCommanditaires(savedPaysCommanditaires);
        }
        }
        private  void saveEtablissementConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getEtablissementConsultanceScientifiquePonctuelles())) {
        List<EtablissementConsultanceScientifiquePonctuelle> savedEtablissementConsultanceScientifiquePonctuelles = new ArrayList<>();
        etablissementConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         etablissementConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setEtablissementConsultanceScientifiquePonctuelles(savedEtablissementConsultanceScientifiquePonctuelles);
        }
        }
        private  void saveDisciplineScientifiqueConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getDisciplineScientifiqueConsultanceScientifiquePonctuelles())) {
        List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> savedDisciplineScientifiqueConsultanceScientifiquePonctuelles = new ArrayList<>();
        disciplineScientifiqueConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         disciplineScientifiqueConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setDisciplineScientifiqueConsultanceScientifiquePonctuelles(savedDisciplineScientifiqueConsultanceScientifiquePonctuelles);
        }
        }
        private  void saveEnjeuxIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getEnjeuxIrdConsultanceScientifiquePonctuelles())) {
        List<EnjeuxIrdConsultanceScientifiquePonctuelle> savedEnjeuxIrdConsultanceScientifiquePonctuelles = new ArrayList<>();
        enjeuxIrdConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         enjeuxIrdConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setEnjeuxIrdConsultanceScientifiquePonctuelles(savedEnjeuxIrdConsultanceScientifiquePonctuelles);
        }
        }
        private  void saveInstrumentIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getInstrumentIrdConsultanceScientifiquePonctuelles())) {
        List<InstrumentIrdConsultanceScientifiquePonctuelle> savedInstrumentIrdConsultanceScientifiquePonctuelles = new ArrayList<>();
        instrumentIrdConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         instrumentIrdConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setInstrumentIrdConsultanceScientifiquePonctuelles(savedInstrumentIrdConsultanceScientifiquePonctuelles);
        }
        }
        private  void saveTypeInstrumentIrdConsultanceScientifiquePonctuelles(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle,List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){

        if (ListUtil.isNotEmpty(consultanceScientifiquePonctuelle.getTypeInstrumentIrdConsultanceScientifiquePonctuelles())) {
        List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> savedTypeInstrumentIrdConsultanceScientifiquePonctuelles = new ArrayList<>();
        typeInstrumentIrdConsultanceScientifiquePonctuelles.forEach(element -> {
        element.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle);
         typeInstrumentIrdConsultanceScientifiquePonctuelleService.save(element);
        });
        consultanceScientifiquePonctuelle.setTypeInstrumentIrdConsultanceScientifiquePonctuelles(savedTypeInstrumentIrdConsultanceScientifiquePonctuelles);
        }
        }

    private void findTypeExpertise(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
        TypeExpertise loadedTypeExpertise =typeExpertiseService.findByIdOrCode(consultanceScientifiquePonctuelle.getTypeExpertise());

    if(loadedTypeExpertise==null ) {
        return;
    }
    consultanceScientifiquePonctuelle.setTypeExpertise(loadedTypeExpertise);
    }
    private void findNatureExpertise(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
        NatureExpertise loadedNatureExpertise =natureExpertiseService.findByIdOrCode(consultanceScientifiquePonctuelle.getNatureExpertise());

    if(loadedNatureExpertise==null ) {
        return;
    }
    consultanceScientifiquePonctuelle.setNatureExpertise(loadedNatureExpertise);
    }
    private void findExpertise(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
        Expertise loadedExpertise = null;
        if(consultanceScientifiquePonctuelle.getExpertise() != null && consultanceScientifiquePonctuelle.getExpertise().getId() !=null)
        loadedExpertise =expertiseService.findById(consultanceScientifiquePonctuelle.getExpertise().getId());

    if(loadedExpertise==null ) {
        return;
    }
    consultanceScientifiquePonctuelle.setExpertise(loadedExpertise);
    }
    private void findEtatEtapeCampagne(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(consultanceScientifiquePonctuelle.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    consultanceScientifiquePonctuelle.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles){
        if(ListUtil.isNotEmpty(consultanceScientifiquePonctuelles)){
        consultanceScientifiquePonctuelles.forEach(e->consultanceScientifiquePonctuelleDao.delete(e));
        }
}
@Override
public void update(List<ConsultanceScientifiquePonctuelle> consultanceScientifiquePonctuelles){
if(ListUtil.isNotEmpty(consultanceScientifiquePonctuelles)){
consultanceScientifiquePonctuelles.forEach(e->consultanceScientifiquePonctuelleDao.save(e));
}
}

private void associateZoneGeographiqueConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(zoneGeographiqueConsultanceScientifiquePonctuelle)) {
        zoneGeographiqueConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associatePaysCommanditaire(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<PaysCommanditaire> paysCommanditaire) {
    if (ListUtil.isNotEmpty(paysCommanditaire)) {
        paysCommanditaire.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associateEtablissementConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(etablissementConsultanceScientifiquePonctuelle)) {
        etablissementConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associateDisciplineScientifiqueConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueConsultanceScientifiquePonctuelle)) {
        disciplineScientifiqueConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associateEnjeuxIrdConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(enjeuxIrdConsultanceScientifiquePonctuelle)) {
        enjeuxIrdConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associateInstrumentIrdConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(instrumentIrdConsultanceScientifiquePonctuelle)) {
        instrumentIrdConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }
private void associateTypeInstrumentIrdConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle, List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelle) {
    if (ListUtil.isNotEmpty(typeInstrumentIrdConsultanceScientifiquePonctuelle)) {
        typeInstrumentIrdConsultanceScientifiquePonctuelle.forEach(e -> e.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelle));
    }
    }


}
