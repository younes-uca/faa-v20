package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EncadrementEtudiant;
import com.ird.faa.bean.NiveauFormationPostBac;
import com.ird.faa.bean.ResponsabiliteDirectionEncadrementEtudiant;
import com.ird.faa.bean.Etudiant;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.Encadrement;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;
import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;
import com.ird.faa.dao.EncadrementEtudiantDao;
import com.ird.faa.service.admin.facade.EncadrementEtudiantAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.EtudiantAdminService;
import com.ird.faa.service.admin.facade.ResponsabiliteDirectionEncadrementEtudiantAdminService;
import com.ird.faa.service.admin.facade.EncadrementAdminService;
import com.ird.faa.service.admin.facade.EncadrementEtudiantEnjeuxIrdAdminService;
import com.ird.faa.service.admin.facade.NiveauFormationPostBacAdminService;
import com.ird.faa.service.admin.facade.EtablissementAdminService;
import com.ird.faa.service.admin.facade.EncadrementEtudiantDisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;

import com.ird.faa.ws.rest.provided.vo.EncadrementEtudiantVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;
import com.ird.faa.service.admin.facade.EncadrementEtudiantEnjeuxIrdAdminService;
import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;
import com.ird.faa.service.admin.facade.EncadrementEtudiantDisciplineScientifiqueAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EncadrementEtudiantAdminServiceImpl extends AbstractServiceImpl<EncadrementEtudiant> implements EncadrementEtudiantAdminService {

@Autowired
private EncadrementEtudiantDao encadrementEtudiantDao;

        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private EtudiantAdminService etudiantService ;
        @Autowired
        private ResponsabiliteDirectionEncadrementEtudiantAdminService responsabiliteDirectionEncadrementEtudiantService ;
        @Autowired
        private EncadrementAdminService encadrementService ;
        @Autowired
        private EncadrementEtudiantEnjeuxIrdAdminService encadrementEtudiantEnjeuxIrdService ;
        @Autowired
        private NiveauFormationPostBacAdminService niveauFormationPostBacService ;
        @Autowired
        private EtablissementAdminService etablissementService ;
        @Autowired
        private EncadrementEtudiantDisciplineScientifiqueAdminService encadrementEtudiantDisciplineScientifiqueService ;
        @Autowired
        private PaysAdminService paysService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EncadrementEtudiant> findAll(){
        return encadrementEtudiantDao.findAll();
}

        @Override
        public List<EncadrementEtudiant> findByNiveauFormationPostBacCode(String code){
        return encadrementEtudiantDao.findByNiveauFormationPostBacCode(code);
        }

        @Override
        @Transactional
        public int deleteByNiveauFormationPostBacCode(String code){
        return encadrementEtudiantDao.deleteByNiveauFormationPostBacCode(code);
        }

        @Override
        public List<EncadrementEtudiant> findByNiveauFormationPostBacId(Long id){
        return encadrementEtudiantDao.findByNiveauFormationPostBacId(id);
        }

        @Override
        @Transactional
        public int deleteByNiveauFormationPostBacId(Long id){
        return encadrementEtudiantDao.deleteByNiveauFormationPostBacId(id);
        }


        @Override
        public List<EncadrementEtudiant> findByResponsabiliteDirectionEncadrementEtudiantCode(String code){
        return encadrementEtudiantDao.findByResponsabiliteDirectionEncadrementEtudiantCode(code);
        }

        @Override
        @Transactional
        public int deleteByResponsabiliteDirectionEncadrementEtudiantCode(String code){
        return encadrementEtudiantDao.deleteByResponsabiliteDirectionEncadrementEtudiantCode(code);
        }

        @Override
        public List<EncadrementEtudiant> findByResponsabiliteDirectionEncadrementEtudiantId(Long id){
        return encadrementEtudiantDao.findByResponsabiliteDirectionEncadrementEtudiantId(id);
        }

        @Override
        @Transactional
        public int deleteByResponsabiliteDirectionEncadrementEtudiantId(Long id){
        return encadrementEtudiantDao.deleteByResponsabiliteDirectionEncadrementEtudiantId(id);
        }

        @Override
        public List<EncadrementEtudiant> findByEtudiantId(Long id){
        return encadrementEtudiantDao.findByEtudiantId(id);
        }

        @Override
        @Transactional
        public int deleteByEtudiantId(Long id){
        return encadrementEtudiantDao.deleteByEtudiantId(id);
        }


        @Override
        public List<EncadrementEtudiant> findByEtablissementCode(String code){
        return encadrementEtudiantDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return encadrementEtudiantDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<EncadrementEtudiant> findByEtablissementId(Long id){
        return encadrementEtudiantDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return encadrementEtudiantDao.deleteByEtablissementId(id);
        }


        @Override
        public List<EncadrementEtudiant> findByPaysCode(String code){
        return encadrementEtudiantDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return encadrementEtudiantDao.deleteByPaysCode(code);
        }

        @Override
        public List<EncadrementEtudiant> findByPaysId(Long id){
        return encadrementEtudiantDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return encadrementEtudiantDao.deleteByPaysId(id);
        }

        @Override
        public List<EncadrementEtudiant> findByEncadrementId(Long id){
        return encadrementEtudiantDao.findByEncadrementId(id);
        }

        @Override
        @Transactional
        public int deleteByEncadrementId(Long id){
        return encadrementEtudiantDao.deleteByEncadrementId(id);
        }


        @Override
        public List<EncadrementEtudiant> findByEtatEtapeCampagneCode(String code){
        return encadrementEtudiantDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return encadrementEtudiantDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<EncadrementEtudiant> findByEtatEtapeCampagneId(Long id){
        return encadrementEtudiantDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return encadrementEtudiantDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public EncadrementEtudiant findById(Long id){
if(id==null) return null;
return encadrementEtudiantDao.getOne(id);
}

@Override
public EncadrementEtudiant findByIdWithAssociatedList(Long id){
EncadrementEtudiant encadrementEtudiant  = findById(id);
findAssociatedLists(encadrementEtudiant);
return encadrementEtudiant;
}
private void findAssociatedLists(EncadrementEtudiant encadrementEtudiant){
if(encadrementEtudiant!=null && encadrementEtudiant.getId() != null) {
        List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds = encadrementEtudiantEnjeuxIrdService.findByEncadrementEtudiantId(encadrementEtudiant.getId());
        encadrementEtudiant.setEncadrementEtudiantEnjeuxIrds(encadrementEtudiantEnjeuxIrds);
        List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques = encadrementEtudiantDisciplineScientifiqueService.findByEncadrementEtudiantId(encadrementEtudiant.getId());
        encadrementEtudiant.setEncadrementEtudiantDisciplineScientifiques(encadrementEtudiantDisciplineScientifiques);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        encadrementEtudiantEnjeuxIrdService.deleteByEncadrementEtudiantId(id);
        encadrementEtudiantDisciplineScientifiqueService.deleteByEncadrementEtudiantId(id);
}
}

    private void updateAssociatedLists(EncadrementEtudiant encadrementEtudiant){
    if(encadrementEtudiant !=null && encadrementEtudiant.getId() != null){
            List<List<EncadrementEtudiantEnjeuxIrd>> resultEncadrementEtudiantEnjeuxIrds= encadrementEtudiantEnjeuxIrdService.getToBeSavedAndToBeDeleted(encadrementEtudiantEnjeuxIrdService.findByEncadrementEtudiantId(encadrementEtudiant.getId()),encadrementEtudiant.getEncadrementEtudiantEnjeuxIrds());
            encadrementEtudiantEnjeuxIrdService.delete(resultEncadrementEtudiantEnjeuxIrds.get(1));
            associateEncadrementEtudiantEnjeuxIrd(encadrementEtudiant,resultEncadrementEtudiantEnjeuxIrds.get(0));
            encadrementEtudiantEnjeuxIrdService.update(resultEncadrementEtudiantEnjeuxIrds.get(0));

            List<List<EncadrementEtudiantDisciplineScientifique>> resultEncadrementEtudiantDisciplineScientifiques= encadrementEtudiantDisciplineScientifiqueService.getToBeSavedAndToBeDeleted(encadrementEtudiantDisciplineScientifiqueService.findByEncadrementEtudiantId(encadrementEtudiant.getId()),encadrementEtudiant.getEncadrementEtudiantDisciplineScientifiques());
            encadrementEtudiantDisciplineScientifiqueService.delete(resultEncadrementEtudiantDisciplineScientifiques.get(1));
            associateEncadrementEtudiantDisciplineScientifique(encadrementEtudiant,resultEncadrementEtudiantDisciplineScientifiques.get(0));
            encadrementEtudiantDisciplineScientifiqueService.update(resultEncadrementEtudiantDisciplineScientifiques.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(encadrementEtudiantDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
encadrementEtudiantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EncadrementEtudiant update(EncadrementEtudiant encadrementEtudiant){
EncadrementEtudiant foundedEncadrementEtudiant = findById(encadrementEtudiant.getId());
if(foundedEncadrementEtudiant==null) return null;
else{
    updateAssociatedLists(encadrementEtudiant);
return  encadrementEtudiantDao.save(encadrementEtudiant);
}
}

@Override
public EncadrementEtudiant save (EncadrementEtudiant encadrementEtudiant){

EncadrementEtudiant result =null;


    findNiveauFormationPostBac(encadrementEtudiant);
    findResponsabiliteDirectionEncadrementEtudiant(encadrementEtudiant);
    findEtudiant(encadrementEtudiant);
    findEtablissement(encadrementEtudiant);
    findPays(encadrementEtudiant);
    findEncadrement(encadrementEtudiant);
    findEtatEtapeCampagne(encadrementEtudiant);

EncadrementEtudiant savedEncadrementEtudiant = encadrementEtudiantDao.save(encadrementEtudiant);

       saveEncadrementEtudiantEnjeuxIrds(savedEncadrementEtudiant,encadrementEtudiant.getEncadrementEtudiantEnjeuxIrds());
       saveEncadrementEtudiantDisciplineScientifiques(savedEncadrementEtudiant,encadrementEtudiant.getEncadrementEtudiantDisciplineScientifiques());
result = savedEncadrementEtudiant;

return result;
}

@Override
public List<EncadrementEtudiant> save(List<EncadrementEtudiant> encadrementEtudiants){
List<EncadrementEtudiant> list = new ArrayList<>();
for(EncadrementEtudiant encadrementEtudiant: encadrementEtudiants){
list.add(save(encadrementEtudiant));
}
return list;
}

        private List<EncadrementEtudiantEnjeuxIrd> prepareEncadrementEtudiantEnjeuxIrds(EncadrementEtudiant encadrementEtudiant,List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){
        for(EncadrementEtudiantEnjeuxIrd encadrementEtudiantEnjeuxIrd:encadrementEtudiantEnjeuxIrds ){
        encadrementEtudiantEnjeuxIrd.setEncadrementEtudiant(encadrementEtudiant);
        }
        return encadrementEtudiantEnjeuxIrds;
        }
        private List<EncadrementEtudiantDisciplineScientifique> prepareEncadrementEtudiantDisciplineScientifiques(EncadrementEtudiant encadrementEtudiant,List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){
        for(EncadrementEtudiantDisciplineScientifique encadrementEtudiantDisciplineScientifique:encadrementEtudiantDisciplineScientifiques ){
        encadrementEtudiantDisciplineScientifique.setEncadrementEtudiant(encadrementEtudiant);
        }
        return encadrementEtudiantDisciplineScientifiques;
        }


@Override
@Transactional
public int delete(EncadrementEtudiant encadrementEtudiant){
    if(encadrementEtudiant.getId()==null) return -1;
    EncadrementEtudiant foundedEncadrementEtudiant = findById(encadrementEtudiant.getId());
    if(foundedEncadrementEtudiant==null) return -1;
encadrementEtudiantDao.delete(foundedEncadrementEtudiant);
return 1;
}


public List<EncadrementEtudiant> findByCriteria(EncadrementEtudiantVo encadrementEtudiantVo){

String query = "SELECT o FROM EncadrementEtudiant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",encadrementEtudiantVo.getId());
            query += SearchUtil.addConstraint( "o", "sujetEtude","LIKE",encadrementEtudiantVo.getSujetEtude());
            query += SearchUtil.addConstraint( "o", "cursus","LIKE",encadrementEtudiantVo.getCursus());
    if(encadrementEtudiantVo.getNiveauFormationPostBacVo()!=null){
        query += SearchUtil.addConstraint( "o", "niveauFormationPostBac.id","=",encadrementEtudiantVo.getNiveauFormationPostBacVo().getId());
            query += SearchUtil.addConstraint( "o", "niveauFormationPostBac.code","LIKE",encadrementEtudiantVo.getNiveauFormationPostBacVo().getCode());
    }

    if(encadrementEtudiantVo.getResponsabiliteDirectionEncadrementEtudiantVo()!=null){
        query += SearchUtil.addConstraint( "o", "responsabiliteDirectionEncadrementEtudiant.id","=",encadrementEtudiantVo.getResponsabiliteDirectionEncadrementEtudiantVo().getId());
            query += SearchUtil.addConstraint( "o", "responsabiliteDirectionEncadrementEtudiant.code","LIKE",encadrementEtudiantVo.getResponsabiliteDirectionEncadrementEtudiantVo().getCode());
    }

    if(encadrementEtudiantVo.getEtudiantVo()!=null){
        query += SearchUtil.addConstraint( "o", "etudiant.id","=",encadrementEtudiantVo.getEtudiantVo().getId());
    }

    if(encadrementEtudiantVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",encadrementEtudiantVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",encadrementEtudiantVo.getEtablissementVo().getCode());
    }

    if(encadrementEtudiantVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",encadrementEtudiantVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",encadrementEtudiantVo.getPaysVo().getCode());
    }

    if(encadrementEtudiantVo.getEncadrementVo()!=null){
        query += SearchUtil.addConstraint( "o", "encadrement.id","=",encadrementEtudiantVo.getEncadrementVo().getId());
    }

    if(encadrementEtudiantVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",encadrementEtudiantVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",encadrementEtudiantVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveEncadrementEtudiantEnjeuxIrds(EncadrementEtudiant encadrementEtudiant,List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrds){

        if (ListUtil.isNotEmpty(encadrementEtudiant.getEncadrementEtudiantEnjeuxIrds())) {
        List<EncadrementEtudiantEnjeuxIrd> savedEncadrementEtudiantEnjeuxIrds = new ArrayList<>();
        encadrementEtudiantEnjeuxIrds.forEach(element -> {
        element.setEncadrementEtudiant(encadrementEtudiant);
         encadrementEtudiantEnjeuxIrdService.save(element);
        });
        encadrementEtudiant.setEncadrementEtudiantEnjeuxIrds(savedEncadrementEtudiantEnjeuxIrds);
        }
        }
        private  void saveEncadrementEtudiantDisciplineScientifiques(EncadrementEtudiant encadrementEtudiant,List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifiques){

        if (ListUtil.isNotEmpty(encadrementEtudiant.getEncadrementEtudiantDisciplineScientifiques())) {
        List<EncadrementEtudiantDisciplineScientifique> savedEncadrementEtudiantDisciplineScientifiques = new ArrayList<>();
        encadrementEtudiantDisciplineScientifiques.forEach(element -> {
        element.setEncadrementEtudiant(encadrementEtudiant);
         encadrementEtudiantDisciplineScientifiqueService.save(element);
        });
        encadrementEtudiant.setEncadrementEtudiantDisciplineScientifiques(savedEncadrementEtudiantDisciplineScientifiques);
        }
        }

    private void findNiveauFormationPostBac(EncadrementEtudiant encadrementEtudiant){
        NiveauFormationPostBac loadedNiveauFormationPostBac =niveauFormationPostBacService.findByIdOrCode(encadrementEtudiant.getNiveauFormationPostBac());

    if(loadedNiveauFormationPostBac==null ) {
        return;
    }
    encadrementEtudiant.setNiveauFormationPostBac(loadedNiveauFormationPostBac);
    }
    private void findResponsabiliteDirectionEncadrementEtudiant(EncadrementEtudiant encadrementEtudiant){
        ResponsabiliteDirectionEncadrementEtudiant loadedResponsabiliteDirectionEncadrementEtudiant =responsabiliteDirectionEncadrementEtudiantService.findByIdOrCode(encadrementEtudiant.getResponsabiliteDirectionEncadrementEtudiant());

    if(loadedResponsabiliteDirectionEncadrementEtudiant==null ) {
        return;
    }
    encadrementEtudiant.setResponsabiliteDirectionEncadrementEtudiant(loadedResponsabiliteDirectionEncadrementEtudiant);
    }
    private void findEtudiant(EncadrementEtudiant encadrementEtudiant){
        Etudiant loadedEtudiant = null;
        if(encadrementEtudiant.getEtudiant() != null && encadrementEtudiant.getEtudiant().getId() !=null)
        loadedEtudiant =etudiantService.findById(encadrementEtudiant.getEtudiant().getId());

    if(loadedEtudiant==null ) {
        return;
    }
    encadrementEtudiant.setEtudiant(loadedEtudiant);
    }
    private void findEtablissement(EncadrementEtudiant encadrementEtudiant){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(encadrementEtudiant.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    encadrementEtudiant.setEtablissement(loadedEtablissement);
    }
    private void findPays(EncadrementEtudiant encadrementEtudiant){
        Pays loadedPays =paysService.findByIdOrCode(encadrementEtudiant.getPays());

    if(loadedPays==null ) {
        return;
    }
    encadrementEtudiant.setPays(loadedPays);
    }
    private void findEncadrement(EncadrementEtudiant encadrementEtudiant){
        Encadrement loadedEncadrement = null;
        if(encadrementEtudiant.getEncadrement() != null && encadrementEtudiant.getEncadrement().getId() !=null)
        loadedEncadrement =encadrementService.findById(encadrementEtudiant.getEncadrement().getId());

    if(loadedEncadrement==null ) {
        return;
    }
    encadrementEtudiant.setEncadrement(loadedEncadrement);
    }
    private void findEtatEtapeCampagne(EncadrementEtudiant encadrementEtudiant){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(encadrementEtudiant.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    encadrementEtudiant.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<EncadrementEtudiant> encadrementEtudiants){
        if(ListUtil.isNotEmpty(encadrementEtudiants)){
        encadrementEtudiants.forEach(e->encadrementEtudiantDao.delete(e));
        }
}
@Override
public void update(List<EncadrementEtudiant> encadrementEtudiants){
if(ListUtil.isNotEmpty(encadrementEtudiants)){
encadrementEtudiants.forEach(e->encadrementEtudiantDao.save(e));
}
}

private void associateEncadrementEtudiantEnjeuxIrd(EncadrementEtudiant encadrementEtudiant, List<EncadrementEtudiantEnjeuxIrd> encadrementEtudiantEnjeuxIrd) {
    if (ListUtil.isNotEmpty(encadrementEtudiantEnjeuxIrd)) {
        encadrementEtudiantEnjeuxIrd.forEach(e -> e.setEncadrementEtudiant(encadrementEtudiant));
    }
    }
private void associateEncadrementEtudiantDisciplineScientifique(EncadrementEtudiant encadrementEtudiant, List<EncadrementEtudiantDisciplineScientifique> encadrementEtudiantDisciplineScientifique) {
    if (ListUtil.isNotEmpty(encadrementEtudiantDisciplineScientifique)) {
        encadrementEtudiantDisciplineScientifique.forEach(e -> e.setEncadrementEtudiant(encadrementEtudiant));
    }
    }


}
