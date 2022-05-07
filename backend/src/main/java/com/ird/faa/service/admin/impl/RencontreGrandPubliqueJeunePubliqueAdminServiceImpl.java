package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.FormatRencontre;
import com.ird.faa.bean.Contexte;
import com.ird.faa.bean.Pays;
import com.ird.faa.bean.CultureScientifique;
import com.ird.faa.bean.EtatEtapeCampagne;
import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.bean.StructureOganisatrice;
import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd;
import com.ird.faa.dao.RencontreGrandPubliqueJeunePubliqueDao;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.EtatEtapeCampagneAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.FormatRencontreAdminService;
import com.ird.faa.service.admin.facade.PaysRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService;
import com.ird.faa.service.admin.facade.PaysAdminService;
import com.ird.faa.service.admin.facade.CultureScientifiqueAdminService;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliquePeriodeAdminService;
import com.ird.faa.service.admin.facade.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.TypePubliqueRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.service.admin.facade.StructureOganisatriceAdminService;
import com.ird.faa.service.admin.facade.ContexteAdminService;

import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;
import com.ird.faa.service.admin.facade.TypePubliqueRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdAdminService;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliquePeriodeAdminService;
import com.ird.faa.bean.StructureOganisatrice;
import com.ird.faa.service.admin.facade.StructureOganisatriceAdminService;
import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.service.admin.facade.PaysRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.service.admin.facade.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueInstrumentIrdAdminService;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd;
import com.ird.faa.service.admin.facade.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RencontreGrandPubliqueJeunePubliqueAdminServiceImpl extends AbstractServiceImpl<RencontreGrandPubliqueJeunePublique> implements RencontreGrandPubliqueJeunePubliqueAdminService {

@Autowired
private RencontreGrandPubliqueJeunePubliqueDao rencontreGrandPubliqueJeunePubliqueDao;

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueEnjeuxIrdAdminService rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueInstrumentIrdAdminService rencontreGrandPubliqueJeunePubliqueInstrumentIrdService ;
        @Autowired
        private EtatEtapeCampagneAdminService etatEtapeCampagneService ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService ;
        @Autowired
        private FormatRencontreAdminService formatRencontreService ;
        @Autowired
        private PaysRencontreGrandPubliqueJeunePubliqueAdminService paysRencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService ;
        @Autowired
        private PaysAdminService paysService ;
        @Autowired
        private CultureScientifiqueAdminService cultureScientifiqueService ;
        @Autowired
        private RencontreGrandPubliqueJeunePubliquePeriodeAdminService rencontreGrandPubliqueJeunePubliquePeriodeService ;
        @Autowired
        private PaysOrganisateurRencontreGrandPubliqueJeunePubliqueAdminService paysOrganisateurRencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private TypePubliqueRencontreGrandPubliqueJeunePubliqueAdminService typePubliqueRencontreGrandPubliqueJeunePubliqueService ;
        @Autowired
        private StructureOganisatriceAdminService structureOganisatriceService ;
        @Autowired
        private ContexteAdminService contexteService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RencontreGrandPubliqueJeunePublique> findAll(){
        return rencontreGrandPubliqueJeunePubliqueDao.findAll();
}

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.findByFormatRencontreCode(code);
        }

        @Override
        @Transactional
        public int deleteByFormatRencontreCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByFormatRencontreCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.findByFormatRencontreId(id);
        }

        @Override
        @Transactional
        public int deleteByFormatRencontreId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByFormatRencontreId(id);
        }


        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByContexteCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.findByContexteCode(code);
        }

        @Override
        @Transactional
        public int deleteByContexteCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByContexteCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByContexteId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.findByContexteId(id);
        }

        @Override
        @Transactional
        public int deleteByContexteId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByContexteId(id);
        }


        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByPaysCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.findByPaysCode(code);
        }

        @Override
        @Transactional
        public int deleteByPaysCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByPaysCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByPaysId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.findByPaysId(id);
        }

        @Override
        @Transactional
        public int deleteByPaysId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByPaysId(id);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByCultureScientifiqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.findByCultureScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByCultureScientifiqueId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByCultureScientifiqueId(id);
        }


        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.findByEtatEtapeCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneCode(String code){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByEtatEtapeCampagneCode(code);
        }

        @Override
        public List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.findByEtatEtapeCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByEtatEtapeCampagneId(Long id){
        return rencontreGrandPubliqueJeunePubliqueDao.deleteByEtatEtapeCampagneId(id);
        }


@Override
public RencontreGrandPubliqueJeunePublique findById(Long id){
if(id==null) return null;
return rencontreGrandPubliqueJeunePubliqueDao.getOne(id);
}

@Override
public RencontreGrandPubliqueJeunePublique findByIdWithAssociatedList(Long id){
RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique  = findById(id);
findAssociatedLists(rencontreGrandPubliqueJeunePublique);
return rencontreGrandPubliqueJeunePublique;
}
private void findAssociatedLists(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
if(rencontreGrandPubliqueJeunePublique!=null && rencontreGrandPubliqueJeunePublique.getId() != null) {
        List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePubliques = typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setTypePubliqueRencontreGrandPubliqueJeunePubliques(typePubliqueRencontreGrandPubliqueJeunePubliques);
        List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds = rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(rencontreGrandPubliqueJeunePubliqueEnjeuxIrds);
        List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques = rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques);
        List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes = rencontreGrandPubliqueJeunePubliquePeriodeService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliquePeriodes(rencontreGrandPubliqueJeunePubliquePeriodes);
        List<StructureOganisatrice> structureOganisatrices = structureOganisatriceService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setStructureOganisatrices(structureOganisatrices);
        List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques = paysRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setPaysRencontreGrandPubliqueJeunePubliques(paysRencontreGrandPubliqueJeunePubliques);
        List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques = paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setPaysOrganisateurRencontreGrandPubliqueJeunePubliques(paysOrganisateurRencontreGrandPubliqueJeunePubliques);
        List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds = rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueInstrumentIrds(rencontreGrandPubliqueJeunePubliqueInstrumentIrds);
        List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds = rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId());
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        typePubliqueRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        rencontreGrandPubliqueJeunePubliquePeriodeService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        structureOganisatriceService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        paysRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.deleteByRencontreGrandPubliqueJeunePubliqueId(id);
}
}

    private void updateAssociatedLists(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
    if(rencontreGrandPubliqueJeunePublique !=null && rencontreGrandPubliqueJeunePublique.getId() != null){
            List<List<TypePubliqueRencontreGrandPubliqueJeunePublique>> resultTypePubliqueRencontreGrandPubliqueJeunePubliques= typePubliqueRencontreGrandPubliqueJeunePubliqueService.getToBeSavedAndToBeDeleted(typePubliqueRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getTypePubliqueRencontreGrandPubliqueJeunePubliques());
            typePubliqueRencontreGrandPubliqueJeunePubliqueService.delete(resultTypePubliqueRencontreGrandPubliqueJeunePubliques.get(1));
            associateTypePubliqueRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique,resultTypePubliqueRencontreGrandPubliqueJeunePubliques.get(0));
            typePubliqueRencontreGrandPubliqueJeunePubliqueService.update(resultTypePubliqueRencontreGrandPubliqueJeunePubliques.get(0));

            List<List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd>> resultRencontreGrandPubliqueJeunePubliqueEnjeuxIrds= rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.getToBeSavedAndToBeDeleted(rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds());
            rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.delete(resultRencontreGrandPubliqueJeunePubliqueEnjeuxIrds.get(1));
            associateRencontreGrandPubliqueJeunePubliqueEnjeuxIrd(rencontreGrandPubliqueJeunePublique,resultRencontreGrandPubliqueJeunePubliqueEnjeuxIrds.get(0));
            rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.update(resultRencontreGrandPubliqueJeunePubliqueEnjeuxIrds.get(0));

            List<List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique>> resultRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques= rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.getToBeSavedAndToBeDeleted(rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques());
            rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.delete(resultRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.get(1));
            associateRencontreGrandPubliqueJeunePubliqueDisciplineScientifique(rencontreGrandPubliqueJeunePublique,resultRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.get(0));
            rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.update(resultRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.get(0));

            List<List<RencontreGrandPubliqueJeunePubliquePeriode>> resultRencontreGrandPubliqueJeunePubliquePeriodes= rencontreGrandPubliqueJeunePubliquePeriodeService.getToBeSavedAndToBeDeleted(rencontreGrandPubliqueJeunePubliquePeriodeService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliquePeriodes());
            rencontreGrandPubliqueJeunePubliquePeriodeService.delete(resultRencontreGrandPubliqueJeunePubliquePeriodes.get(1));
            associateRencontreGrandPubliqueJeunePubliquePeriode(rencontreGrandPubliqueJeunePublique,resultRencontreGrandPubliqueJeunePubliquePeriodes.get(0));
            rencontreGrandPubliqueJeunePubliquePeriodeService.update(resultRencontreGrandPubliqueJeunePubliquePeriodes.get(0));

            List<List<StructureOganisatrice>> resultStructureOganisatrices= structureOganisatriceService.getToBeSavedAndToBeDeleted(structureOganisatriceService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getStructureOganisatrices());
            structureOganisatriceService.delete(resultStructureOganisatrices.get(1));
            associateStructureOganisatrice(rencontreGrandPubliqueJeunePublique,resultStructureOganisatrices.get(0));
            structureOganisatriceService.update(resultStructureOganisatrices.get(0));

            List<List<PaysRencontreGrandPubliqueJeunePublique>> resultPaysRencontreGrandPubliqueJeunePubliques= paysRencontreGrandPubliqueJeunePubliqueService.getToBeSavedAndToBeDeleted(paysRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getPaysRencontreGrandPubliqueJeunePubliques());
            paysRencontreGrandPubliqueJeunePubliqueService.delete(resultPaysRencontreGrandPubliqueJeunePubliques.get(1));
            associatePaysRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique,resultPaysRencontreGrandPubliqueJeunePubliques.get(0));
            paysRencontreGrandPubliqueJeunePubliqueService.update(resultPaysRencontreGrandPubliqueJeunePubliques.get(0));

            List<List<PaysOrganisateurRencontreGrandPubliqueJeunePublique>> resultPaysOrganisateurRencontreGrandPubliqueJeunePubliques= paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.getToBeSavedAndToBeDeleted(paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getPaysOrganisateurRencontreGrandPubliqueJeunePubliques());
            paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.delete(resultPaysOrganisateurRencontreGrandPubliqueJeunePubliques.get(1));
            associatePaysOrganisateurRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique,resultPaysOrganisateurRencontreGrandPubliqueJeunePubliques.get(0));
            paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.update(resultPaysOrganisateurRencontreGrandPubliqueJeunePubliques.get(0));

            List<List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd>> resultRencontreGrandPubliqueJeunePubliqueInstrumentIrds= rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.getToBeSavedAndToBeDeleted(rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueInstrumentIrds());
            rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.delete(resultRencontreGrandPubliqueJeunePubliqueInstrumentIrds.get(1));
            associateRencontreGrandPubliqueJeunePubliqueInstrumentIrd(rencontreGrandPubliqueJeunePublique,resultRencontreGrandPubliqueJeunePubliqueInstrumentIrds.get(0));
            rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.update(resultRencontreGrandPubliqueJeunePubliqueInstrumentIrds.get(0));

            List<List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd>> resultRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds= rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.getToBeSavedAndToBeDeleted(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.findByRencontreGrandPubliqueJeunePubliqueId(rencontreGrandPubliqueJeunePublique.getId()),rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds());
            rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.delete(resultRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.get(1));
            associateRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd(rencontreGrandPubliqueJeunePublique,resultRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.get(0));
            rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.update(resultRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(rencontreGrandPubliqueJeunePubliqueDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
rencontreGrandPubliqueJeunePubliqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RencontreGrandPubliqueJeunePublique update(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
RencontreGrandPubliqueJeunePublique foundedRencontreGrandPubliqueJeunePublique = findById(rencontreGrandPubliqueJeunePublique.getId());
if(foundedRencontreGrandPubliqueJeunePublique==null) return null;
else{
    updateAssociatedLists(rencontreGrandPubliqueJeunePublique);
return  rencontreGrandPubliqueJeunePubliqueDao.save(rencontreGrandPubliqueJeunePublique);
}
}
private void prepareSave(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
if(rencontreGrandPubliqueJeunePublique.getLienInstrumentIrd() == null)
  rencontreGrandPubliqueJeunePublique.setLienInstrumentIrd(false);



}

@Override
public RencontreGrandPubliqueJeunePublique save (RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
prepareSave(rencontreGrandPubliqueJeunePublique);

RencontreGrandPubliqueJeunePublique result =null;


    findFormatRencontre(rencontreGrandPubliqueJeunePublique);
    findContexte(rencontreGrandPubliqueJeunePublique);
    findPays(rencontreGrandPubliqueJeunePublique);
    findCultureScientifique(rencontreGrandPubliqueJeunePublique);
    findEtatEtapeCampagne(rencontreGrandPubliqueJeunePublique);

RencontreGrandPubliqueJeunePublique savedRencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePubliqueDao.save(rencontreGrandPubliqueJeunePublique);

       saveTypePubliqueRencontreGrandPubliqueJeunePubliques(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getTypePubliqueRencontreGrandPubliqueJeunePubliques());
       saveRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds());
       saveRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques());
       saveRencontreGrandPubliqueJeunePubliquePeriodes(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliquePeriodes());
       saveStructureOganisatrices(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getStructureOganisatrices());
       savePaysRencontreGrandPubliqueJeunePubliques(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getPaysRencontreGrandPubliqueJeunePubliques());
       savePaysOrganisateurRencontreGrandPubliqueJeunePubliques(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getPaysOrganisateurRencontreGrandPubliqueJeunePubliques());
       saveRencontreGrandPubliqueJeunePubliqueInstrumentIrds(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueInstrumentIrds());
       saveRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(savedRencontreGrandPubliqueJeunePublique,rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds());
result = savedRencontreGrandPubliqueJeunePublique;

return result;
}

@Override
public List<RencontreGrandPubliqueJeunePublique> save(List<RencontreGrandPubliqueJeunePublique> rencontreGrandPubliqueJeunePubliques){
List<RencontreGrandPubliqueJeunePublique> list = new ArrayList<>();
for(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique: rencontreGrandPubliqueJeunePubliques){
list.add(save(rencontreGrandPubliqueJeunePublique));
}
return list;
}

        private List<TypePubliqueRencontreGrandPubliqueJeunePublique> prepareTypePubliqueRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePubliques){
        for(TypePubliqueRencontreGrandPubliqueJeunePublique typePubliqueRencontreGrandPubliqueJeunePublique:typePubliqueRencontreGrandPubliqueJeunePubliques ){
        typePubliqueRencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return typePubliqueRencontreGrandPubliqueJeunePubliques;
        }
        private List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> prepareRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){
        for(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd rencontreGrandPubliqueJeunePubliqueEnjeuxIrd:rencontreGrandPubliqueJeunePubliqueEnjeuxIrds ){
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return rencontreGrandPubliqueJeunePubliqueEnjeuxIrds;
        }
        private List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> prepareRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){
        for(RencontreGrandPubliqueJeunePubliqueDisciplineScientifique rencontreGrandPubliqueJeunePubliqueDisciplineScientifique:rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques ){
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques;
        }
        private List<RencontreGrandPubliqueJeunePubliquePeriode> prepareRencontreGrandPubliqueJeunePubliquePeriodes(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){
        for(RencontreGrandPubliqueJeunePubliquePeriode rencontreGrandPubliqueJeunePubliquePeriode:rencontreGrandPubliqueJeunePubliquePeriodes ){
        rencontreGrandPubliqueJeunePubliquePeriode.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return rencontreGrandPubliqueJeunePubliquePeriodes;
        }
        private List<StructureOganisatrice> prepareStructureOganisatrices(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<StructureOganisatrice> structureOganisatrices){
        for(StructureOganisatrice structureOganisatrice:structureOganisatrices ){
        structureOganisatrice.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return structureOganisatrices;
        }
        private List<PaysRencontreGrandPubliqueJeunePublique> preparePaysRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){
        for(PaysRencontreGrandPubliqueJeunePublique paysRencontreGrandPubliqueJeunePublique:paysRencontreGrandPubliqueJeunePubliques ){
        paysRencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return paysRencontreGrandPubliqueJeunePubliques;
        }
        private List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> preparePaysOrganisateurRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){
        for(PaysOrganisateurRencontreGrandPubliqueJeunePublique paysOrganisateurRencontreGrandPubliqueJeunePublique:paysOrganisateurRencontreGrandPubliqueJeunePubliques ){
        paysOrganisateurRencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return paysOrganisateurRencontreGrandPubliqueJeunePubliques;
        }
        private List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> prepareRencontreGrandPubliqueJeunePubliqueInstrumentIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){
        for(RencontreGrandPubliqueJeunePubliqueInstrumentIrd rencontreGrandPubliqueJeunePubliqueInstrumentIrd:rencontreGrandPubliqueJeunePubliqueInstrumentIrds ){
        rencontreGrandPubliqueJeunePubliqueInstrumentIrd.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return rencontreGrandPubliqueJeunePubliqueInstrumentIrds;
        }
        private List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> prepareRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){
        for(RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd:rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds ){
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
        }
        return rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds;
        }


@Override
@Transactional
public int delete(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
    if(rencontreGrandPubliqueJeunePublique.getId()==null) return -1;
    RencontreGrandPubliqueJeunePublique foundedRencontreGrandPubliqueJeunePublique = findById(rencontreGrandPubliqueJeunePublique.getId());
    if(foundedRencontreGrandPubliqueJeunePublique==null) return -1;
rencontreGrandPubliqueJeunePubliqueDao.delete(foundedRencontreGrandPubliqueJeunePublique);
return 1;
}


public List<RencontreGrandPubliqueJeunePublique> findByCriteria(RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){

String query = "SELECT o FROM RencontreGrandPubliqueJeunePublique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",rencontreGrandPubliqueJeunePubliqueVo.getId());
            query += SearchUtil.addConstraint( "o", "intituleSujet","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getIntituleSujet());
            query += SearchUtil.addConstraint( "o", "nombrePersonneEstime","=",rencontreGrandPubliqueJeunePubliqueVo.getNombrePersonneEstime());
            query += SearchUtil.addConstraint( "o", "lienInstrumentIrd","=",rencontreGrandPubliqueJeunePubliqueVo.getLienInstrumentIrd());
            query += SearchUtil.addConstraint( "o", "lienWeb","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getLienWeb());
            query += SearchUtil.addConstraint( "o", "remarque","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getRemarque());
            query += SearchUtil.addConstraintMinMax("o","nombrePersonneEstime",rencontreGrandPubliqueJeunePubliqueVo.getNombrePersonneEstimeMin(),rencontreGrandPubliqueJeunePubliqueVo.getNombrePersonneEstimeMax());
    if(rencontreGrandPubliqueJeunePubliqueVo.getFormatRencontreVo()!=null){
        query += SearchUtil.addConstraint( "o", "formatRencontre.id","=",rencontreGrandPubliqueJeunePubliqueVo.getFormatRencontreVo().getId());
            query += SearchUtil.addConstraint( "o", "formatRencontre.code","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getFormatRencontreVo().getCode());
    }

    if(rencontreGrandPubliqueJeunePubliqueVo.getContexteVo()!=null){
        query += SearchUtil.addConstraint( "o", "contexte.id","=",rencontreGrandPubliqueJeunePubliqueVo.getContexteVo().getId());
            query += SearchUtil.addConstraint( "o", "contexte.code","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getContexteVo().getCode());
    }

    if(rencontreGrandPubliqueJeunePubliqueVo.getPaysVo()!=null){
        query += SearchUtil.addConstraint( "o", "pays.id","=",rencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getId());
            query += SearchUtil.addConstraint( "o", "pays.code","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getPaysVo().getCode());
    }

    if(rencontreGrandPubliqueJeunePubliqueVo.getCultureScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "cultureScientifique.id","=",rencontreGrandPubliqueJeunePubliqueVo.getCultureScientifiqueVo().getId());
    }

    if(rencontreGrandPubliqueJeunePubliqueVo.getEtatEtapeCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.id","=",rencontreGrandPubliqueJeunePubliqueVo.getEtatEtapeCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "etatEtapeCampagne.code","LIKE",rencontreGrandPubliqueJeunePubliqueVo.getEtatEtapeCampagneVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveTypePubliqueRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePubliques){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getTypePubliqueRencontreGrandPubliqueJeunePubliques())) {
        List<TypePubliqueRencontreGrandPubliqueJeunePublique> savedTypePubliqueRencontreGrandPubliqueJeunePubliques = new ArrayList<>();
        typePubliqueRencontreGrandPubliqueJeunePubliques.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         typePubliqueRencontreGrandPubliqueJeunePubliqueService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setTypePubliqueRencontreGrandPubliqueJeunePubliques(savedTypePubliqueRencontreGrandPubliqueJeunePubliques);
        }
        }
        private  void saveRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrds){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueEnjeuxIrds())) {
        List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> savedRencontreGrandPubliqueJeunePubliqueEnjeuxIrds = new ArrayList<>();
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrds.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         rencontreGrandPubliqueJeunePubliqueEnjeuxIrdService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueEnjeuxIrds(savedRencontreGrandPubliqueJeunePubliqueEnjeuxIrds);
        }
        }
        private  void saveRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques())) {
        List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> savedRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques = new ArrayList<>();
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifiques.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         rencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques(savedRencontreGrandPubliqueJeunePubliqueDisciplineScientifiques);
        }
        }
        private  void saveRencontreGrandPubliqueJeunePubliquePeriodes(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriodes){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliquePeriodes())) {
        List<RencontreGrandPubliqueJeunePubliquePeriode> savedRencontreGrandPubliqueJeunePubliquePeriodes = new ArrayList<>();
        rencontreGrandPubliqueJeunePubliquePeriodes.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         rencontreGrandPubliqueJeunePubliquePeriodeService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliquePeriodes(savedRencontreGrandPubliqueJeunePubliquePeriodes);
        }
        }
        private  void saveStructureOganisatrices(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<StructureOganisatrice> structureOganisatrices){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getStructureOganisatrices())) {
        List<StructureOganisatrice> savedStructureOganisatrices = new ArrayList<>();
        structureOganisatrices.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         structureOganisatriceService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setStructureOganisatrices(savedStructureOganisatrices);
        }
        }
        private  void savePaysRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePubliques){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getPaysRencontreGrandPubliqueJeunePubliques())) {
        List<PaysRencontreGrandPubliqueJeunePublique> savedPaysRencontreGrandPubliqueJeunePubliques = new ArrayList<>();
        paysRencontreGrandPubliqueJeunePubliques.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         paysRencontreGrandPubliqueJeunePubliqueService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setPaysRencontreGrandPubliqueJeunePubliques(savedPaysRencontreGrandPubliqueJeunePubliques);
        }
        }
        private  void savePaysOrganisateurRencontreGrandPubliqueJeunePubliques(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePubliques){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getPaysOrganisateurRencontreGrandPubliqueJeunePubliques())) {
        List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> savedPaysOrganisateurRencontreGrandPubliqueJeunePubliques = new ArrayList<>();
        paysOrganisateurRencontreGrandPubliqueJeunePubliques.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         paysOrganisateurRencontreGrandPubliqueJeunePubliqueService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setPaysOrganisateurRencontreGrandPubliqueJeunePubliques(savedPaysOrganisateurRencontreGrandPubliqueJeunePubliques);
        }
        }
        private  void saveRencontreGrandPubliqueJeunePubliqueInstrumentIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrds){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueInstrumentIrds())) {
        List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> savedRencontreGrandPubliqueJeunePubliqueInstrumentIrds = new ArrayList<>();
        rencontreGrandPubliqueJeunePubliqueInstrumentIrds.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         rencontreGrandPubliqueJeunePubliqueInstrumentIrdService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueInstrumentIrds(savedRencontreGrandPubliqueJeunePubliqueInstrumentIrds);
        }
        }
        private  void saveRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique,List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds){

        if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePublique.getRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds())) {
        List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> savedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds = new ArrayList<>();
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds.forEach(element -> {
        element.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique);
         rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdService.save(element);
        });
        rencontreGrandPubliqueJeunePublique.setRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds(savedRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrds);
        }
        }

    private void findFormatRencontre(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
        FormatRencontre loadedFormatRencontre =formatRencontreService.findByIdOrCode(rencontreGrandPubliqueJeunePublique.getFormatRencontre());

    if(loadedFormatRencontre==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePublique.setFormatRencontre(loadedFormatRencontre);
    }
    private void findContexte(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
        Contexte loadedContexte =contexteService.findByIdOrCode(rencontreGrandPubliqueJeunePublique.getContexte());

    if(loadedContexte==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePublique.setContexte(loadedContexte);
    }
    private void findPays(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
        Pays loadedPays =paysService.findByIdOrCode(rencontreGrandPubliqueJeunePublique.getPays());

    if(loadedPays==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePublique.setPays(loadedPays);
    }
    private void findCultureScientifique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
        CultureScientifique loadedCultureScientifique = null;
        if(rencontreGrandPubliqueJeunePublique.getCultureScientifique() != null && rencontreGrandPubliqueJeunePublique.getCultureScientifique().getId() !=null)
        loadedCultureScientifique =cultureScientifiqueService.findById(rencontreGrandPubliqueJeunePublique.getCultureScientifique().getId());

    if(loadedCultureScientifique==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePublique.setCultureScientifique(loadedCultureScientifique);
    }
    private void findEtatEtapeCampagne(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique){
        EtatEtapeCampagne loadedEtatEtapeCampagne =etatEtapeCampagneService.findByIdOrCode(rencontreGrandPubliqueJeunePublique.getEtatEtapeCampagne());

    if(loadedEtatEtapeCampagne==null ) {
        return;
    }
    rencontreGrandPubliqueJeunePublique.setEtatEtapeCampagne(loadedEtatEtapeCampagne);
    }

@Override
@Transactional
public void delete(List<RencontreGrandPubliqueJeunePublique> rencontreGrandPubliqueJeunePubliques){
        if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliques)){
        rencontreGrandPubliqueJeunePubliques.forEach(e->rencontreGrandPubliqueJeunePubliqueDao.delete(e));
        }
}
@Override
public void update(List<RencontreGrandPubliqueJeunePublique> rencontreGrandPubliqueJeunePubliques){
if(ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliques)){
rencontreGrandPubliqueJeunePubliques.forEach(e->rencontreGrandPubliqueJeunePubliqueDao.save(e));
}
}

private void associateTypePubliqueRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<TypePubliqueRencontreGrandPubliqueJeunePublique> typePubliqueRencontreGrandPubliqueJeunePublique) {
    if (ListUtil.isNotEmpty(typePubliqueRencontreGrandPubliqueJeunePublique)) {
        typePubliqueRencontreGrandPubliqueJeunePublique.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateRencontreGrandPubliqueJeunePubliqueEnjeuxIrd(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> rencontreGrandPubliqueJeunePubliqueEnjeuxIrd) {
    if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueEnjeuxIrd)) {
        rencontreGrandPubliqueJeunePubliqueEnjeuxIrd.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateRencontreGrandPubliqueJeunePubliqueDisciplineScientifique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> rencontreGrandPubliqueJeunePubliqueDisciplineScientifique) {
    if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueDisciplineScientifique)) {
        rencontreGrandPubliqueJeunePubliqueDisciplineScientifique.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateRencontreGrandPubliqueJeunePubliquePeriode(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<RencontreGrandPubliqueJeunePubliquePeriode> rencontreGrandPubliqueJeunePubliquePeriode) {
    if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliquePeriode)) {
        rencontreGrandPubliqueJeunePubliquePeriode.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateStructureOganisatrice(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<StructureOganisatrice> structureOganisatrice) {
    if (ListUtil.isNotEmpty(structureOganisatrice)) {
        structureOganisatrice.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associatePaysRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<PaysRencontreGrandPubliqueJeunePublique> paysRencontreGrandPubliqueJeunePublique) {
    if (ListUtil.isNotEmpty(paysRencontreGrandPubliqueJeunePublique)) {
        paysRencontreGrandPubliqueJeunePublique.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associatePaysOrganisateurRencontreGrandPubliqueJeunePublique(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> paysOrganisateurRencontreGrandPubliqueJeunePublique) {
    if (ListUtil.isNotEmpty(paysOrganisateurRencontreGrandPubliqueJeunePublique)) {
        paysOrganisateurRencontreGrandPubliqueJeunePublique.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateRencontreGrandPubliqueJeunePubliqueInstrumentIrd(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> rencontreGrandPubliqueJeunePubliqueInstrumentIrd) {
    if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueInstrumentIrd)) {
        rencontreGrandPubliqueJeunePubliqueInstrumentIrd.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }
private void associateRencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd(RencontreGrandPubliqueJeunePublique rencontreGrandPubliqueJeunePublique, List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd) {
    if (ListUtil.isNotEmpty(rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd)) {
        rencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd.forEach(e -> e.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePublique));
    }
    }


}
