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
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.bean.FormatRencontre;
import com.ird.faa.bean.CultureScientifique;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.dao.RencontreMediaDao;
import com.ird.faa.service.chercheur.facade.RencontreMediaChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreMediaPeriodeChercheurService;
import com.ird.faa.service.chercheur.facade.EtatEtapeCampagneChercheurService;
import com.ird.faa.service.chercheur.facade.PaysRencontreMediaChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreMediaDisciplineScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.RencontreMediaEnjeuxIrdChercheurService;
import com.ird.faa.service.chercheur.facade.TypePubliqueRencontreMediaChercheurService;
import com.ird.faa.service.chercheur.facade.FormatRencontreChercheurService;
import com.ird.faa.service.chercheur.facade.CultureScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.RencontreMediaVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.service.chercheur.facade.TypePubliqueRencontreMediaChercheurService;
import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.service.chercheur.facade.RencontreMediaEnjeuxIrdChercheurService;
import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.service.chercheur.facade.RencontreMediaDisciplineScientifiqueChercheurService;
import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.service.chercheur.facade.RencontreMediaPeriodeChercheurService;
import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.service.chercheur.facade.PaysRencontreMediaChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreMediaChercheurServiceImpl extends AbstractServiceImpl<RencontreMedia> implements RencontreMediaChercheurService {

@Autowired
private RencontreMediaDao rencontreMediaDao;

        @Autowired
        private RencontreMediaPeriodeChercheurService rencontreMediaPeriodeService ;
        @Autowired
        private EtatEtapeCampagneChercheurService etatEtapeCampagneService ;
        @Autowired
        private PaysRencontreMediaChercheurService paysRencontreMediaService ;
        @Autowired
        private RencontreMediaDisciplineScientifiqueChercheurService rencontreMediaDisciplineScientifiqueService ;
        @Autowired
        private RencontreMediaEnjeuxIrdChercheurService rencontreMediaEnjeuxIrdService ;
        @Autowired
        private TypePubliqueRencontreMediaChercheurService typePubliqueRencontreMediaService ;
        @Autowired
        private FormatRencontreChercheurService formatRencontreService ;
        @Autowired
        private CultureScientifiqueChercheurService cultureScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreMedia> findAll(){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())){
    return rencontreMediaDao.findByChercheurUsername(currentUser.getUsername());
    }
    return new ArrayList<>();
}

        @Override
        public List<RencontreMedia> findByFormatRencontreCode(String code){
        return rencontreMediaDao.findByFormatRencontreCode(code);
        }

        @Override
        @Transactional
        public int deleteByFormatRencontreCode(String code){
        return rencontreMediaDao.deleteByFormatRencontreCode(code);
        }

        @Override
        public List<RencontreMedia> findByFormatRencontreId(Long id){
        return rencontreMediaDao.findByFormatRencontreId(id);
        }

        @Override
        @Transactional
        public int deleteByFormatRencontreId(Long id){
        return rencontreMediaDao.deleteByFormatRencontreId(id);
        }

        @Override
        public List<RencontreMedia> findByCultureScientifiqueId(Long id){
        return rencontreMediaDao.findByCultureScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByCultureScientifiqueId(Long id){
        return rencontreMediaDao.deleteByCultureScientifiqueId(id);
        }


        @Override
        public List<RencontreMedia> findByEtatEtapeCampagneCode(String code){
        return rencontreMediaDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return rencontreMediaDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<RencontreMedia> findByEtatEtapeCampagneId(Long id){
        return rencontreMediaDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return rencontreMediaDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public RencontreMedia findById(Long id){
if(id==null) return null;
return rencontreMediaDao.getOne(id);
}

@Override
public RencontreMedia findByIdWithAssociatedList(Long id){
RencontreMedia rencontreMedia  = findById(id);
findAssociatedLists(rencontreMedia);
return rencontreMedia;
}
private void findAssociatedLists(RencontreMedia rencontreMedia){
if(rencontreMedia!=null && rencontreMedia.getId() != null) {
        List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias = typePubliqueRencontreMediaService.findByRencontreMediaId(rencontreMedia.getId());
        rencontreMedia.setTypePubliqueRencontreMedias(typePubliqueRencontreMedias);
        List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds = rencontreMediaEnjeuxIrdService.findByRencontreMediaId(rencontreMedia.getId());
        rencontreMedia.setRencontreMediaEnjeuxIrds(rencontreMediaEnjeuxIrds);
        List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques = rencontreMediaDisciplineScientifiqueService.findByRencontreMediaId(rencontreMedia.getId());
        rencontreMedia.setRencontreMediaDisciplineScientifiques(rencontreMediaDisciplineScientifiques);
        List<RencontreMediaPeriode> rencontreMediaPeriodes = rencontreMediaPeriodeService.findByRencontreMediaId(rencontreMedia.getId());
        rencontreMedia.setRencontreMediaPeriodes(rencontreMediaPeriodes);
        List<PaysRencontreMedia> paysRencontreMedias = paysRencontreMediaService.findByRencontreMediaId(rencontreMedia.getId());
        rencontreMedia.setPaysRencontreMedias(paysRencontreMedias);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        typePubliqueRencontreMediaService.deleteByRencontreMediaId(id);
        rencontreMediaEnjeuxIrdService.deleteByRencontreMediaId(id);
        rencontreMediaDisciplineScientifiqueService.deleteByRencontreMediaId(id);
        rencontreMediaPeriodeService.deleteByRencontreMediaId(id);
        paysRencontreMediaService.deleteByRencontreMediaId(id);
}
}

    private void updateAssociatedLists(RencontreMedia rencontreMedia){
    if(rencontreMedia !=null && rencontreMedia.getId() != null){
            List<List<TypePubliqueRencontreMedia>> resultTypePubliqueRencontreMedias= typePubliqueRencontreMediaService.getToBeSavedAndToBeDeleted(typePubliqueRencontreMediaService.findByRencontreMediaId(rencontreMedia.getId()),rencontreMedia.getTypePubliqueRencontreMedias());
            typePubliqueRencontreMediaService.delete(resultTypePubliqueRencontreMedias.get(1));
            associateTypePubliqueRencontreMedia(rencontreMedia,resultTypePubliqueRencontreMedias.get(0));
            typePubliqueRencontreMediaService.update(resultTypePubliqueRencontreMedias.get(0));

            List<List<RencontreMediaEnjeuxIrd>> resultRencontreMediaEnjeuxIrds= rencontreMediaEnjeuxIrdService.getToBeSavedAndToBeDeleted(rencontreMediaEnjeuxIrdService.findByRencontreMediaId(rencontreMedia.getId()),rencontreMedia.getRencontreMediaEnjeuxIrds());
            rencontreMediaEnjeuxIrdService.delete(resultRencontreMediaEnjeuxIrds.get(1));
            associateRencontreMediaEnjeuxIrd(rencontreMedia,resultRencontreMediaEnjeuxIrds.get(0));
            rencontreMediaEnjeuxIrdService.update(resultRencontreMediaEnjeuxIrds.get(0));

            List<List<RencontreMediaDisciplineScientifique>> resultRencontreMediaDisciplineScientifiques= rencontreMediaDisciplineScientifiqueService.getToBeSavedAndToBeDeleted(rencontreMediaDisciplineScientifiqueService.findByRencontreMediaId(rencontreMedia.getId()),rencontreMedia.getRencontreMediaDisciplineScientifiques());
            rencontreMediaDisciplineScientifiqueService.delete(resultRencontreMediaDisciplineScientifiques.get(1));
            associateRencontreMediaDisciplineScientifique(rencontreMedia,resultRencontreMediaDisciplineScientifiques.get(0));
            rencontreMediaDisciplineScientifiqueService.update(resultRencontreMediaDisciplineScientifiques.get(0));

            List<List<RencontreMediaPeriode>> resultRencontreMediaPeriodes= rencontreMediaPeriodeService.getToBeSavedAndToBeDeleted(rencontreMediaPeriodeService.findByRencontreMediaId(rencontreMedia.getId()),rencontreMedia.getRencontreMediaPeriodes());
            rencontreMediaPeriodeService.delete(resultRencontreMediaPeriodes.get(1));
            associateRencontreMediaPeriode(rencontreMedia,resultRencontreMediaPeriodes.get(0));
            rencontreMediaPeriodeService.update(resultRencontreMediaPeriodes.get(0));

            List<List<PaysRencontreMedia>> resultPaysRencontreMedias= paysRencontreMediaService.getToBeSavedAndToBeDeleted(paysRencontreMediaService.findByRencontreMediaId(rencontreMedia.getId()),rencontreMedia.getPaysRencontreMedias());
            paysRencontreMediaService.delete(resultPaysRencontreMedias.get(1));
            associatePaysRencontreMedia(rencontreMedia,resultPaysRencontreMedias.get(0));
            paysRencontreMediaService.update(resultPaysRencontreMedias.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreMediaDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
rencontreMediaDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreMedia update(RencontreMedia rencontreMedia){
RencontreMedia foundedRencontreMedia = findById(rencontreMedia.getId());
if(foundedRencontreMedia==null) return null;
else{
    updateAssociatedLists(rencontreMedia);
return  rencontreMediaDao.save(rencontreMedia);
}
}

@Override
public RencontreMedia save (RencontreMedia rencontreMedia){

RencontreMedia result =null;

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
    rencontreMedia.setChercheur(loadedChercheur);
    rencontreMedia.setCampagne(laodedCampagne);

    findFormatRencontre(rencontreMedia);
    findCultureScientifique(rencontreMedia);
    findEtatEtapeCampagne(rencontreMedia);

RencontreMedia savedRencontreMedia = rencontreMediaDao.save(rencontreMedia);

       saveTypePubliqueRencontreMedias(savedRencontreMedia,rencontreMedia.getTypePubliqueRencontreMedias());
       saveRencontreMediaEnjeuxIrds(savedRencontreMedia,rencontreMedia.getRencontreMediaEnjeuxIrds());
       saveRencontreMediaDisciplineScientifiques(savedRencontreMedia,rencontreMedia.getRencontreMediaDisciplineScientifiques());
       saveRencontreMediaPeriodes(savedRencontreMedia,rencontreMedia.getRencontreMediaPeriodes());
       savePaysRencontreMedias(savedRencontreMedia,rencontreMedia.getPaysRencontreMedias());
result = savedRencontreMedia;
}

return result;
}

@Override
public List<RencontreMedia> save(List<RencontreMedia> rencontreMedias){
List<RencontreMedia> list = new ArrayList<>();
for(RencontreMedia rencontreMedia: rencontreMedias){
list.add(save(rencontreMedia));
}
return list;
}

        private List<TypePubliqueRencontreMedia> prepareTypePubliqueRencontreMedias(RencontreMedia rencontreMedia,List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){
        for(TypePubliqueRencontreMedia typePubliqueRencontreMedia:typePubliqueRencontreMedias ){
        typePubliqueRencontreMedia.setRencontreMedia(rencontreMedia);
        }
        return typePubliqueRencontreMedias;
        }
        private List<RencontreMediaEnjeuxIrd> prepareRencontreMediaEnjeuxIrds(RencontreMedia rencontreMedia,List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){
        for(RencontreMediaEnjeuxIrd rencontreMediaEnjeuxIrd:rencontreMediaEnjeuxIrds ){
        rencontreMediaEnjeuxIrd.setRencontreMedia(rencontreMedia);
        }
        return rencontreMediaEnjeuxIrds;
        }
        private List<RencontreMediaDisciplineScientifique> prepareRencontreMediaDisciplineScientifiques(RencontreMedia rencontreMedia,List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){
        for(RencontreMediaDisciplineScientifique rencontreMediaDisciplineScientifique:rencontreMediaDisciplineScientifiques ){
        rencontreMediaDisciplineScientifique.setRencontreMedia(rencontreMedia);
        }
        return rencontreMediaDisciplineScientifiques;
        }
        private List<RencontreMediaPeriode> prepareRencontreMediaPeriodes(RencontreMedia rencontreMedia,List<RencontreMediaPeriode> rencontreMediaPeriodes){
        for(RencontreMediaPeriode rencontreMediaPeriode:rencontreMediaPeriodes ){
        rencontreMediaPeriode.setRencontreMedia(rencontreMedia);
        }
        return rencontreMediaPeriodes;
        }
        private List<PaysRencontreMedia> preparePaysRencontreMedias(RencontreMedia rencontreMedia,List<PaysRencontreMedia> paysRencontreMedias){
        for(PaysRencontreMedia paysRencontreMedia:paysRencontreMedias ){
        paysRencontreMedia.setRencontreMedia(rencontreMedia);
        }
        return paysRencontreMedias;
        }


@Override
@Transactional
public int delete(RencontreMedia rencontreMedia){
    if(rencontreMedia.getId()==null) return -1;
    RencontreMedia foundedRencontreMedia = findById(rencontreMedia.getId());
    if(foundedRencontreMedia==null) return -1;
rencontreMediaDao.delete(foundedRencontreMedia);
return 1;
}


public List<RencontreMedia> findByCriteria(RencontreMediaVo rencontreMediaVo){
User currentUser = SecurityUtil.getCurrentUser();
if (currentUser != null && StringUtil.isNotEmpty(currentUser.getUsername())) {

String query = "SELECT o FROM RencontreMedia o where 1=1 ";
    query += SearchUtil.addConstraint("o", "chercheur.username", "=", currentUser.getUsername());

            query += SearchUtil.addConstraint( "o", "id","=",rencontreMediaVo.getId());
            query += SearchUtil.addConstraint( "o", "intituleSujet","LIKE",rencontreMediaVo.getIntituleSujet());
            query += SearchUtil.addConstraint( "o", "lienWeb","LIKE",rencontreMediaVo.getLienWeb());
            query += SearchUtil.addConstraint( "o", "remarque","LIKE",rencontreMediaVo.getRemarque());
    if(rencontreMediaVo.getFormatRencontreVo()!=null){
        query += SearchUtil.addConstraint( "o", "formatRencontre.id","=",rencontreMediaVo.getFormatRencontreVo().getId());
            query += SearchUtil.addConstraint( "o", "formatRencontre.code","LIKE",rencontreMediaVo.getFormatRencontreVo().getCode());
    }

    if(rencontreMediaVo.getCultureScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "cultureScientifique.id","=",rencontreMediaVo.getCultureScientifiqueVo().getId());
    }

    if(rencontreMediaVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",rencontreMediaVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",rencontreMediaVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
return new ArrayList<>();
}
        private  void saveTypePubliqueRencontreMedias(RencontreMedia rencontreMedia,List<TypePubliqueRencontreMedia> typePubliqueRencontreMedias){

        if (ListUtil.isNotEmpty(rencontreMedia.getTypePubliqueRencontreMedias())) {
        List<TypePubliqueRencontreMedia> savedTypePubliqueRencontreMedias = new ArrayList<>();
        typePubliqueRencontreMedias.forEach(element -> {
        element.setRencontreMedia(rencontreMedia);
         typePubliqueRencontreMediaService.save(element);
        });
        rencontreMedia.setTypePubliqueRencontreMedias(savedTypePubliqueRencontreMedias);
        }
        }
        private  void saveRencontreMediaEnjeuxIrds(RencontreMedia rencontreMedia,List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrds){

        if (ListUtil.isNotEmpty(rencontreMedia.getRencontreMediaEnjeuxIrds())) {
        List<RencontreMediaEnjeuxIrd> savedRencontreMediaEnjeuxIrds = new ArrayList<>();
        rencontreMediaEnjeuxIrds.forEach(element -> {
        element.setRencontreMedia(rencontreMedia);
         rencontreMediaEnjeuxIrdService.save(element);
        });
        rencontreMedia.setRencontreMediaEnjeuxIrds(savedRencontreMediaEnjeuxIrds);
        }
        }
        private  void saveRencontreMediaDisciplineScientifiques(RencontreMedia rencontreMedia,List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifiques){

        if (ListUtil.isNotEmpty(rencontreMedia.getRencontreMediaDisciplineScientifiques())) {
        List<RencontreMediaDisciplineScientifique> savedRencontreMediaDisciplineScientifiques = new ArrayList<>();
        rencontreMediaDisciplineScientifiques.forEach(element -> {
        element.setRencontreMedia(rencontreMedia);
         rencontreMediaDisciplineScientifiqueService.save(element);
        });
        rencontreMedia.setRencontreMediaDisciplineScientifiques(savedRencontreMediaDisciplineScientifiques);
        }
        }
        private  void saveRencontreMediaPeriodes(RencontreMedia rencontreMedia,List<RencontreMediaPeriode> rencontreMediaPeriodes){

        if (ListUtil.isNotEmpty(rencontreMedia.getRencontreMediaPeriodes())) {
        List<RencontreMediaPeriode> savedRencontreMediaPeriodes = new ArrayList<>();
        rencontreMediaPeriodes.forEach(element -> {
        element.setRencontreMedia(rencontreMedia);
         rencontreMediaPeriodeService.save(element);
        });
        rencontreMedia.setRencontreMediaPeriodes(savedRencontreMediaPeriodes);
        }
        }
        private  void savePaysRencontreMedias(RencontreMedia rencontreMedia,List<PaysRencontreMedia> paysRencontreMedias){

        if (ListUtil.isNotEmpty(rencontreMedia.getPaysRencontreMedias())) {
        List<PaysRencontreMedia> savedPaysRencontreMedias = new ArrayList<>();
        paysRencontreMedias.forEach(element -> {
        element.setRencontreMedia(rencontreMedia);
         paysRencontreMediaService.save(element);
        });
        rencontreMedia.setPaysRencontreMedias(savedPaysRencontreMedias);
        }
        }

    private void findFormatRencontre(RencontreMedia rencontreMedia){
        FormatRencontre loadedFormatRencontre =formatRencontreService.findByIdOrCode(rencontreMedia.getFormatRencontre());

    if(loadedFormatRencontre==null ) {
        return;
    }
    rencontreMedia.setFormatRencontre(loadedFormatRencontre);
    }
    private void findCultureScientifique(RencontreMedia rencontreMedia){
        CultureScientifique loadedCultureScientifique = null;
        if(rencontreMedia.getCultureScientifique() != null && rencontreMedia.getCultureScientifique().getId() !=null)
        loadedCultureScientifique =cultureScientifiqueService.findById(rencontreMedia.getCultureScientifique().getId());

    if(loadedCultureScientifique==null ) {
        return;
    }
    rencontreMedia.setCultureScientifique(loadedCultureScientifique);
    }
    private void findEtatEtapeCampagne(RencontreMedia rencontreMedia){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(rencontreMedia.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    rencontreMedia.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<RencontreMedia> rencontreMedias){
        if(ListUtil.isNotEmpty(rencontreMedias)){
        rencontreMedias.forEach(e->rencontreMediaDao.delete(e));
        }
}
@Override
public void update(List<RencontreMedia> rencontreMedias){
if(ListUtil.isNotEmpty(rencontreMedias)){
rencontreMedias.forEach(e->rencontreMediaDao.save(e));
}
}

private void associateTypePubliqueRencontreMedia(RencontreMedia rencontreMedia, List<TypePubliqueRencontreMedia> typePubliqueRencontreMedia) {
    if (ListUtil.isNotEmpty(typePubliqueRencontreMedia)) {
        typePubliqueRencontreMedia.forEach(e -> e.setRencontreMedia(rencontreMedia));
    }
    }
private void associateRencontreMediaEnjeuxIrd(RencontreMedia rencontreMedia, List<RencontreMediaEnjeuxIrd> rencontreMediaEnjeuxIrd) {
    if (ListUtil.isNotEmpty(rencontreMediaEnjeuxIrd)) {
        rencontreMediaEnjeuxIrd.forEach(e -> e.setRencontreMedia(rencontreMedia));
    }
    }
private void associateRencontreMediaDisciplineScientifique(RencontreMedia rencontreMedia, List<RencontreMediaDisciplineScientifique> rencontreMediaDisciplineScientifique) {
    if (ListUtil.isNotEmpty(rencontreMediaDisciplineScientifique)) {
        rencontreMediaDisciplineScientifique.forEach(e -> e.setRencontreMedia(rencontreMedia));
    }
    }
private void associateRencontreMediaPeriode(RencontreMedia rencontreMedia, List<RencontreMediaPeriode> rencontreMediaPeriode) {
    if (ListUtil.isNotEmpty(rencontreMediaPeriode)) {
        rencontreMediaPeriode.forEach(e -> e.setRencontreMedia(rencontreMedia));
    }
    }
private void associatePaysRencontreMedia(RencontreMedia rencontreMedia, List<PaysRencontreMedia> paysRencontreMedia) {
    if (ListUtil.isNotEmpty(paysRencontreMedia)) {
        paysRencontreMedia.forEach(e -> e.setRencontreMedia(rencontreMedia));
    }
    }

@Override
public List<RencontreMedia> findByChercheurUsernameAndCampagneId(String username, Long compagneId){
List<RencontreMedia> resultat= rencontreMediaDao.findByChercheurUsernameAndCampagneId(username, compagneId);
    return resultat;
}

}
