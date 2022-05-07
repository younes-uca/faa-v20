package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.bean.NatureExpertise;
import com.ird.faa.bean.TypeExpertise;
import com.ird.faa.bean.Expertise;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.EtablissementConseilsScientifique;
import com.ird.faa.bean.ZoneGeographiqueConseilsScientifique;
import com.ird.faa.bean.EnjeuxIrdConseilsScientifique;
import com.ird.faa.bean.DisciplineScientifiqueConseilsScientifique;
import com.ird.faa.dao.ConseilsScientifiqueDao;
import com.ird.faa.service.admin.facade.ConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.EnjeuxIrdConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.NatureExpertiseAdminService;
import com.ird.faa.service.admin.facade.TypeExpertiseAdminService;
import com.ird.faa.service.admin.facade.EtablissementConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ZoneGeographiqueConseilsScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ExpertiseAdminService;

import com.ird.faa.ws.rest.provided.vo.ConseilsScientifiqueVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.EtablissementConseilsScientifique;
import com.ird.faa.service.admin.facade.EtablissementConseilsScientifiqueAdminService;
import com.ird.faa.bean.ZoneGeographiqueConseilsScientifique;
import com.ird.faa.service.admin.facade.ZoneGeographiqueConseilsScientifiqueAdminService;
import com.ird.faa.bean.EnjeuxIrdConseilsScientifique;
import com.ird.faa.service.admin.facade.EnjeuxIrdConseilsScientifiqueAdminService;
import com.ird.faa.bean.DisciplineScientifiqueConseilsScientifique;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueConseilsScientifiqueAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ConseilsScientifiqueAdminServiceImpl extends AbstractServiceImpl<ConseilsScientifique> implements ConseilsScientifiqueAdminService {

@Autowired
private ConseilsScientifiqueDao conseilsScientifiqueDao;

        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private EnjeuxIrdConseilsScientifiqueAdminService enjeuxIrdConseilsScientifiqueService ;
        @Autowired
        private NatureExpertiseAdminService natureExpertiseService ;
        @Autowired
        private TypeExpertiseAdminService typeExpertiseService ;
        @Autowired
        private EtablissementConseilsScientifiqueAdminService etablissementConseilsScientifiqueService ;
        @Autowired
        private DisciplineScientifiqueConseilsScientifiqueAdminService disciplineScientifiqueConseilsScientifiqueService ;
        @Autowired
        private ZoneGeographiqueConseilsScientifiqueAdminService zoneGeographiqueConseilsScientifiqueService ;
        @Autowired
        private ExpertiseAdminService expertiseService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ConseilsScientifique> findAll(){
        return conseilsScientifiqueDao.findAll();
}

        @Override
        public List<ConseilsScientifique> findByNatureExpertiseCode(String code){
        return conseilsScientifiqueDao.findByNatureExpertiseCode(code);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseCode(String code){
        return conseilsScientifiqueDao.deleteByNatureExpertiseCode(code);
        }

        @Override
        public List<ConseilsScientifique> findByNatureExpertiseId(Long id){
        return conseilsScientifiqueDao.findByNatureExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByNatureExpertiseId(Long id){
        return conseilsScientifiqueDao.deleteByNatureExpertiseId(id);
        }


        @Override
        public List<ConseilsScientifique> findByTypeExpertiseCode(String code){
        return conseilsScientifiqueDao.findByTypeExpertiseCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseCode(String code){
        return conseilsScientifiqueDao.deleteByTypeExpertiseCode(code);
        }

        @Override
        public List<ConseilsScientifique> findByTypeExpertiseId(Long id){
        return conseilsScientifiqueDao.findByTypeExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseId(Long id){
        return conseilsScientifiqueDao.deleteByTypeExpertiseId(id);
        }

        @Override
        public List<ConseilsScientifique> findByExpertiseId(Long id){
        return conseilsScientifiqueDao.findByExpertiseId(id);
        }

        @Override
        @Transactional
        public int deleteByExpertiseId(Long id){
        return conseilsScientifiqueDao.deleteByExpertiseId(id);
        }


        @Override
        public List<ConseilsScientifique> findByEtatEtapeCampagneCode(String code){
        return conseilsScientifiqueDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return conseilsScientifiqueDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<ConseilsScientifique> findByEtatEtapeCampagneId(Long id){
        return conseilsScientifiqueDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return conseilsScientifiqueDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public ConseilsScientifique findById(Long id){
if(id==null) return null;
return conseilsScientifiqueDao.getOne(id);
}

@Override
public ConseilsScientifique findByIdWithAssociatedList(Long id){
ConseilsScientifique conseilsScientifique  = findById(id);
findAssociatedLists(conseilsScientifique);
return conseilsScientifique;
}
private void findAssociatedLists(ConseilsScientifique conseilsScientifique){
if(conseilsScientifique!=null && conseilsScientifique.getId() != null) {
        List<EtablissementConseilsScientifique> etablissementConseilsScientifiques = etablissementConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId());
        conseilsScientifique.setEtablissementConseilsScientifiques(etablissementConseilsScientifiques);
        List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifiques = zoneGeographiqueConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId());
        conseilsScientifique.setZoneGeographiqueConseilsScientifiques(zoneGeographiqueConseilsScientifiques);
        List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques = enjeuxIrdConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId());
        conseilsScientifique.setEnjeuxIrdConseilsScientifiques(enjeuxIrdConseilsScientifiques);
        List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques = disciplineScientifiqueConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId());
        conseilsScientifique.setDisciplineScientifiqueConseilsScientifiques(disciplineScientifiqueConseilsScientifiques);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        etablissementConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        zoneGeographiqueConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        enjeuxIrdConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
        disciplineScientifiqueConseilsScientifiqueService.deleteByConseilsScientifiqueId(id);
}
}

    private void updateAssociatedLists(ConseilsScientifique conseilsScientifique){
    if(conseilsScientifique !=null && conseilsScientifique.getId() != null){
            List<List<EtablissementConseilsScientifique>> resultEtablissementConseilsScientifiques= etablissementConseilsScientifiqueService.getToBeSavedAndToBeDeleted(etablissementConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId()),conseilsScientifique.getEtablissementConseilsScientifiques());
            etablissementConseilsScientifiqueService.delete(resultEtablissementConseilsScientifiques.get(1));
            associateEtablissementConseilsScientifique(conseilsScientifique,resultEtablissementConseilsScientifiques.get(0));
            etablissementConseilsScientifiqueService.update(resultEtablissementConseilsScientifiques.get(0));

            List<List<ZoneGeographiqueConseilsScientifique>> resultZoneGeographiqueConseilsScientifiques= zoneGeographiqueConseilsScientifiqueService.getToBeSavedAndToBeDeleted(zoneGeographiqueConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId()),conseilsScientifique.getZoneGeographiqueConseilsScientifiques());
            zoneGeographiqueConseilsScientifiqueService.delete(resultZoneGeographiqueConseilsScientifiques.get(1));
            associateZoneGeographiqueConseilsScientifique(conseilsScientifique,resultZoneGeographiqueConseilsScientifiques.get(0));
            zoneGeographiqueConseilsScientifiqueService.update(resultZoneGeographiqueConseilsScientifiques.get(0));

            List<List<EnjeuxIrdConseilsScientifique>> resultEnjeuxIrdConseilsScientifiques= enjeuxIrdConseilsScientifiqueService.getToBeSavedAndToBeDeleted(enjeuxIrdConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId()),conseilsScientifique.getEnjeuxIrdConseilsScientifiques());
            enjeuxIrdConseilsScientifiqueService.delete(resultEnjeuxIrdConseilsScientifiques.get(1));
            associateEnjeuxIrdConseilsScientifique(conseilsScientifique,resultEnjeuxIrdConseilsScientifiques.get(0));
            enjeuxIrdConseilsScientifiqueService.update(resultEnjeuxIrdConseilsScientifiques.get(0));

            List<List<DisciplineScientifiqueConseilsScientifique>> resultDisciplineScientifiqueConseilsScientifiques= disciplineScientifiqueConseilsScientifiqueService.getToBeSavedAndToBeDeleted(disciplineScientifiqueConseilsScientifiqueService.findByConseilsScientifiqueId(conseilsScientifique.getId()),conseilsScientifique.getDisciplineScientifiqueConseilsScientifiques());
            disciplineScientifiqueConseilsScientifiqueService.delete(resultDisciplineScientifiqueConseilsScientifiques.get(1));
            associateDisciplineScientifiqueConseilsScientifique(conseilsScientifique,resultDisciplineScientifiqueConseilsScientifiques.get(0));
            disciplineScientifiqueConseilsScientifiqueService.update(resultDisciplineScientifiqueConseilsScientifiques.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(conseilsScientifiqueDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
conseilsScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ConseilsScientifique update(ConseilsScientifique conseilsScientifique){
ConseilsScientifique foundedConseilsScientifique = findById(conseilsScientifique.getId());
if(foundedConseilsScientifique==null) return null;
else{
    updateAssociatedLists(conseilsScientifique);
return  conseilsScientifiqueDao.save(conseilsScientifique);
}
}

@Override
public ConseilsScientifique save (ConseilsScientifique conseilsScientifique){

ConseilsScientifique result =null;


    findNatureExpertise(conseilsScientifique);
    findTypeExpertise(conseilsScientifique);
    findExpertise(conseilsScientifique);
    findEtatEtapeCampagne(conseilsScientifique);

ConseilsScientifique savedConseilsScientifique = conseilsScientifiqueDao.save(conseilsScientifique);

       saveEtablissementConseilsScientifiques(savedConseilsScientifique,conseilsScientifique.getEtablissementConseilsScientifiques());
       saveZoneGeographiqueConseilsScientifiques(savedConseilsScientifique,conseilsScientifique.getZoneGeographiqueConseilsScientifiques());
       saveEnjeuxIrdConseilsScientifiques(savedConseilsScientifique,conseilsScientifique.getEnjeuxIrdConseilsScientifiques());
       saveDisciplineScientifiqueConseilsScientifiques(savedConseilsScientifique,conseilsScientifique.getDisciplineScientifiqueConseilsScientifiques());
result = savedConseilsScientifique;

return result;
}

@Override
public List<ConseilsScientifique> save(List<ConseilsScientifique> conseilsScientifiques){
List<ConseilsScientifique> list = new ArrayList<>();
for(ConseilsScientifique conseilsScientifique: conseilsScientifiques){
list.add(save(conseilsScientifique));
}
return list;
}

        private List<EtablissementConseilsScientifique> prepareEtablissementConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<EtablissementConseilsScientifique> etablissementConseilsScientifiques){
        for(EtablissementConseilsScientifique etablissementConseilsScientifique:etablissementConseilsScientifiques ){
        etablissementConseilsScientifique.setConseilsScientifique(conseilsScientifique);
        }
        return etablissementConseilsScientifiques;
        }
        private List<ZoneGeographiqueConseilsScientifique> prepareZoneGeographiqueConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifiques){
        for(ZoneGeographiqueConseilsScientifique zoneGeographiqueConseilsScientifique:zoneGeographiqueConseilsScientifiques ){
        zoneGeographiqueConseilsScientifique.setConseilsScientifique(conseilsScientifique);
        }
        return zoneGeographiqueConseilsScientifiques;
        }
        private List<EnjeuxIrdConseilsScientifique> prepareEnjeuxIrdConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){
        for(EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique:enjeuxIrdConseilsScientifiques ){
        enjeuxIrdConseilsScientifique.setConseilsScientifique(conseilsScientifique);
        }
        return enjeuxIrdConseilsScientifiques;
        }
        private List<DisciplineScientifiqueConseilsScientifique> prepareDisciplineScientifiqueConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){
        for(DisciplineScientifiqueConseilsScientifique disciplineScientifiqueConseilsScientifique:disciplineScientifiqueConseilsScientifiques ){
        disciplineScientifiqueConseilsScientifique.setConseilsScientifique(conseilsScientifique);
        }
        return disciplineScientifiqueConseilsScientifiques;
        }


@Override
@Transactional
public int delete(ConseilsScientifique conseilsScientifique){
    if(conseilsScientifique.getId()==null) return -1;
    ConseilsScientifique foundedConseilsScientifique = findById(conseilsScientifique.getId());
    if(foundedConseilsScientifique==null) return -1;
conseilsScientifiqueDao.delete(foundedConseilsScientifique);
return 1;
}


public List<ConseilsScientifique> findByCriteria(ConseilsScientifiqueVo conseilsScientifiqueVo){

String query = "SELECT o FROM ConseilsScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",conseilsScientifiqueVo.getId());
            query += SearchUtil.addConstraint( "o", "intitule","LIKE",conseilsScientifiqueVo.getIntitule());
            query += SearchUtil.addConstraint( "o", "nombreJoursConsacres","=",conseilsScientifiqueVo.getNombreJoursConsacres());
            query += SearchUtil.addConstraintMinMax("o","nombreJoursConsacres",conseilsScientifiqueVo.getNombreJoursConsacresMin(),conseilsScientifiqueVo.getNombreJoursConsacresMax());
    if(conseilsScientifiqueVo.getNatureExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "natureExpertise.id","=",conseilsScientifiqueVo.getNatureExpertiseVo().getId());
            query += SearchUtil.addConstraint( "o", "natureExpertise.code","LIKE",conseilsScientifiqueVo.getNatureExpertiseVo().getCode());
    }

    if(conseilsScientifiqueVo.getTypeExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeExpertise.id","=",conseilsScientifiqueVo.getTypeExpertiseVo().getId());
            query += SearchUtil.addConstraint( "o", "typeExpertise.code","LIKE",conseilsScientifiqueVo.getTypeExpertiseVo().getCode());
    }

    if(conseilsScientifiqueVo.getExpertiseVo()!=null){
        query += SearchUtil.addConstraint( "o", "expertise.id","=",conseilsScientifiqueVo.getExpertiseVo().getId());
    }

    if(conseilsScientifiqueVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",conseilsScientifiqueVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",conseilsScientifiqueVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveEtablissementConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<EtablissementConseilsScientifique> etablissementConseilsScientifiques){

        if (ListUtil.isNotEmpty(conseilsScientifique.getEtablissementConseilsScientifiques())) {
        List<EtablissementConseilsScientifique> savedEtablissementConseilsScientifiques = new ArrayList<>();
        etablissementConseilsScientifiques.forEach(element -> {
        element.setConseilsScientifique(conseilsScientifique);
         etablissementConseilsScientifiqueService.save(element);
        });
        conseilsScientifique.setEtablissementConseilsScientifiques(savedEtablissementConseilsScientifiques);
        }
        }
        private  void saveZoneGeographiqueConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifiques){

        if (ListUtil.isNotEmpty(conseilsScientifique.getZoneGeographiqueConseilsScientifiques())) {
        List<ZoneGeographiqueConseilsScientifique> savedZoneGeographiqueConseilsScientifiques = new ArrayList<>();
        zoneGeographiqueConseilsScientifiques.forEach(element -> {
        element.setConseilsScientifique(conseilsScientifique);
         zoneGeographiqueConseilsScientifiqueService.save(element);
        });
        conseilsScientifique.setZoneGeographiqueConseilsScientifiques(savedZoneGeographiqueConseilsScientifiques);
        }
        }
        private  void saveEnjeuxIrdConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifiques){

        if (ListUtil.isNotEmpty(conseilsScientifique.getEnjeuxIrdConseilsScientifiques())) {
        List<EnjeuxIrdConseilsScientifique> savedEnjeuxIrdConseilsScientifiques = new ArrayList<>();
        enjeuxIrdConseilsScientifiques.forEach(element -> {
        element.setConseilsScientifique(conseilsScientifique);
         enjeuxIrdConseilsScientifiqueService.save(element);
        });
        conseilsScientifique.setEnjeuxIrdConseilsScientifiques(savedEnjeuxIrdConseilsScientifiques);
        }
        }
        private  void saveDisciplineScientifiqueConseilsScientifiques(ConseilsScientifique conseilsScientifique,List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifiques){

        if (ListUtil.isNotEmpty(conseilsScientifique.getDisciplineScientifiqueConseilsScientifiques())) {
        List<DisciplineScientifiqueConseilsScientifique> savedDisciplineScientifiqueConseilsScientifiques = new ArrayList<>();
        disciplineScientifiqueConseilsScientifiques.forEach(element -> {
        element.setConseilsScientifique(conseilsScientifique);
         disciplineScientifiqueConseilsScientifiqueService.save(element);
        });
        conseilsScientifique.setDisciplineScientifiqueConseilsScientifiques(savedDisciplineScientifiqueConseilsScientifiques);
        }
        }

    private void findNatureExpertise(ConseilsScientifique conseilsScientifique){
        NatureExpertise loadedNatureExpertise =natureExpertiseService.findByIdOrCode(conseilsScientifique.getNatureExpertise());

    if(loadedNatureExpertise==null ) {
        return;
    }
    conseilsScientifique.setNatureExpertise(loadedNatureExpertise);
    }
    private void findTypeExpertise(ConseilsScientifique conseilsScientifique){
        TypeExpertise loadedTypeExpertise =typeExpertiseService.findByIdOrCode(conseilsScientifique.getTypeExpertise());

    if(loadedTypeExpertise==null ) {
        return;
    }
    conseilsScientifique.setTypeExpertise(loadedTypeExpertise);
    }
    private void findExpertise(ConseilsScientifique conseilsScientifique){
        Expertise loadedExpertise = null;
        if(conseilsScientifique.getExpertise() != null && conseilsScientifique.getExpertise().getId() !=null)
        loadedExpertise =expertiseService.findById(conseilsScientifique.getExpertise().getId());

    if(loadedExpertise==null ) {
        return;
    }
    conseilsScientifique.setExpertise(loadedExpertise);
    }
    private void findEtatEtapeCampagne(ConseilsScientifique conseilsScientifique){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(conseilsScientifique.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    conseilsScientifique.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<ConseilsScientifique> conseilsScientifiques){
        if(ListUtil.isNotEmpty(conseilsScientifiques)){
        conseilsScientifiques.forEach(e->conseilsScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<ConseilsScientifique> conseilsScientifiques){
if(ListUtil.isNotEmpty(conseilsScientifiques)){
conseilsScientifiques.forEach(e->conseilsScientifiqueDao.save(e));
}
}

private void associateEtablissementConseilsScientifique(ConseilsScientifique conseilsScientifique, List<EtablissementConseilsScientifique> etablissementConseilsScientifique) {
    if (ListUtil.isNotEmpty(etablissementConseilsScientifique)) {
        etablissementConseilsScientifique.forEach(e -> e.setConseilsScientifique(conseilsScientifique));
    }
    }
private void associateZoneGeographiqueConseilsScientifique(ConseilsScientifique conseilsScientifique, List<ZoneGeographiqueConseilsScientifique> zoneGeographiqueConseilsScientifique) {
    if (ListUtil.isNotEmpty(zoneGeographiqueConseilsScientifique)) {
        zoneGeographiqueConseilsScientifique.forEach(e -> e.setConseilsScientifique(conseilsScientifique));
    }
    }
private void associateEnjeuxIrdConseilsScientifique(ConseilsScientifique conseilsScientifique, List<EnjeuxIrdConseilsScientifique> enjeuxIrdConseilsScientifique) {
    if (ListUtil.isNotEmpty(enjeuxIrdConseilsScientifique)) {
        enjeuxIrdConseilsScientifique.forEach(e -> e.setConseilsScientifique(conseilsScientifique));
    }
    }
private void associateDisciplineScientifiqueConseilsScientifique(ConseilsScientifique conseilsScientifique, List<DisciplineScientifiqueConseilsScientifique> disciplineScientifiqueConseilsScientifique) {
    if (ListUtil.isNotEmpty(disciplineScientifiqueConseilsScientifique)) {
        disciplineScientifiqueConseilsScientifique.forEach(e -> e.setConseilsScientifique(conseilsScientifique));
    }
    }


}
