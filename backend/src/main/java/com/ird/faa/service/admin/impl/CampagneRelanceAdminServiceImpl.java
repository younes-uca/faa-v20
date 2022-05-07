package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.TemplateRelance;
import com.ird.faa.bean.CampagneRelanceChercheur;
import com.ird.faa.dao.CampagneRelanceDao;
import com.ird.faa.service.admin.facade.CampagneRelanceAdminService;
import com.ird.faa.service.admin.facade.CampagneRelanceChercheurAdminService;
import com.ird.faa.service.admin.facade.TemplateRelanceAdminService;
import com.ird.faa.service.admin.facade.CampagneAdminService;

import com.ird.faa.ws.rest.provided.vo.CampagneRelanceVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.CampagneRelanceChercheur;
import com.ird.faa.service.admin.facade.CampagneRelanceChercheurAdminService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneRelanceAdminServiceImpl extends AbstractServiceImpl<CampagneRelance> implements CampagneRelanceAdminService {

@Autowired
private CampagneRelanceDao campagneRelanceDao;

        @Autowired
        private CampagneRelanceChercheurAdminService campagneRelanceChercheurService ;
        @Autowired
        private TemplateRelanceAdminService templateRelanceService ;
        @Autowired
        private CampagneAdminService campagneService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CampagneRelance> findAll(){
        return campagneRelanceDao.findAll();
}

        @Override
        public List<CampagneRelance> findByCampagneCode(String code){
        return campagneRelanceDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return campagneRelanceDao.deleteByCampagneCode(code);
        }

        @Override
        public List<CampagneRelance> findByCampagneId(Long id){
        return campagneRelanceDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return campagneRelanceDao.deleteByCampagneId(id);
        }


        @Override
        public List<CampagneRelance> findByTemplateRelanceCode(String code){
        return campagneRelanceDao.findByTemplateRelanceCode(code);
        }

        @Override
        @Transactional
        public int deleteByTemplateRelanceCode(String code){
        return campagneRelanceDao.deleteByTemplateRelanceCode(code);
        }

        @Override
        public List<CampagneRelance> findByTemplateRelanceId(Long id){
        return campagneRelanceDao.findByTemplateRelanceId(id);
        }

        @Override
        @Transactional
        public int deleteByTemplateRelanceId(Long id){
        return campagneRelanceDao.deleteByTemplateRelanceId(id);
        }


@Override
public CampagneRelance findById(Long id){
if(id==null) return null;
return campagneRelanceDao.getOne(id);
}

@Override
public CampagneRelance findByIdWithAssociatedList(Long id){
CampagneRelance campagneRelance  = findById(id);
findAssociatedLists(campagneRelance);
return campagneRelance;
}
private void findAssociatedLists(CampagneRelance campagneRelance){
if(campagneRelance!=null && campagneRelance.getId() != null) {
        List<CampagneRelanceChercheur> campagneRelanceChercheurs = campagneRelanceChercheurService.findByCampagneRelanceId(campagneRelance.getId());
        campagneRelance.setCampagneRelanceChercheurs(campagneRelanceChercheurs);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        campagneRelanceChercheurService.deleteByCampagneRelanceId(id);
}
}

    private void updateAssociatedLists(CampagneRelance campagneRelance){
    if(campagneRelance !=null && campagneRelance.getId() != null){
            List<List<CampagneRelanceChercheur>> resultCampagneRelanceChercheurs= campagneRelanceChercheurService.getToBeSavedAndToBeDeleted(campagneRelanceChercheurService.findByCampagneRelanceId(campagneRelance.getId()),campagneRelance.getCampagneRelanceChercheurs());
            campagneRelanceChercheurService.delete(resultCampagneRelanceChercheurs.get(1));
            associateCampagneRelanceChercheur(campagneRelance,resultCampagneRelanceChercheurs.get(0));
            campagneRelanceChercheurService.update(resultCampagneRelanceChercheurs.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(campagneRelanceDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
campagneRelanceDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CampagneRelance update(CampagneRelance campagneRelance){
CampagneRelance foundedCampagneRelance = findById(campagneRelance.getId());
if(foundedCampagneRelance==null) return null;
else{
    updateAssociatedLists(campagneRelance);
return  campagneRelanceDao.save(campagneRelance);
}
}

@Override
public CampagneRelance save (CampagneRelance campagneRelance){

CampagneRelance result =null;


    findCampagne(campagneRelance);
    findTemplateRelance(campagneRelance);

CampagneRelance savedCampagneRelance = campagneRelanceDao.save(campagneRelance);

       saveCampagneRelanceChercheurs(savedCampagneRelance,campagneRelance.getCampagneRelanceChercheurs());
result = savedCampagneRelance;

return result;
}

@Override
public List<CampagneRelance> save(List<CampagneRelance> campagneRelances){
List<CampagneRelance> list = new ArrayList<>();
for(CampagneRelance campagneRelance: campagneRelances){
list.add(save(campagneRelance));
}
return list;
}

        private List<CampagneRelanceChercheur> prepareCampagneRelanceChercheurs(CampagneRelance campagneRelance,List<CampagneRelanceChercheur> campagneRelanceChercheurs){
        for(CampagneRelanceChercheur campagneRelanceChercheur:campagneRelanceChercheurs ){
        campagneRelanceChercheur.setCampagneRelance(campagneRelance);
        }
        return campagneRelanceChercheurs;
        }


@Override
@Transactional
public int delete(CampagneRelance campagneRelance){
    if(campagneRelance.getId()==null) return -1;
    CampagneRelance foundedCampagneRelance = findById(campagneRelance.getId());
    if(foundedCampagneRelance==null) return -1;
campagneRelanceDao.delete(foundedCampagneRelance);
return 1;
}


public List<CampagneRelance> findByCriteria(CampagneRelanceVo campagneRelanceVo){

String query = "SELECT o FROM CampagneRelance o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneRelanceVo.getId());
        query += SearchUtil.addConstraintDate( "o", "dateRelance","=",campagneRelanceVo.getDateRelance());
            query += SearchUtil.addConstraint( "o", "objetRelance","LIKE",campagneRelanceVo.getObjetRelance());
            query += SearchUtil.addConstraint( "o", "messageRelance","LIKE",campagneRelanceVo.getMessageRelance());
            query += SearchUtil.addConstraintMinMaxDate("o","dateRelance",campagneRelanceVo.getDateRelanceMin(),campagneRelanceVo.getDateRelanceMax());
    if(campagneRelanceVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",campagneRelanceVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",campagneRelanceVo.getCampagneVo().getCode());
    }

    if(campagneRelanceVo.getTemplateRelanceVo()!=null){
        query += SearchUtil.addConstraint( "o", "templateRelance.id","=",campagneRelanceVo.getTemplateRelanceVo().getId());
            query += SearchUtil.addConstraint( "o", "templateRelance.code","LIKE",campagneRelanceVo.getTemplateRelanceVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveCampagneRelanceChercheurs(CampagneRelance campagneRelance,List<CampagneRelanceChercheur> campagneRelanceChercheurs){

        if (ListUtil.isNotEmpty(campagneRelance.getCampagneRelanceChercheurs())) {
        List<CampagneRelanceChercheur> savedCampagneRelanceChercheurs = new ArrayList<>();
        campagneRelanceChercheurs.forEach(element -> {
        element.setCampagneRelance(campagneRelance);
         campagneRelanceChercheurService.save(element);
        });
        campagneRelance.setCampagneRelanceChercheurs(savedCampagneRelanceChercheurs);
        }
        }

    private void findCampagne(CampagneRelance campagneRelance){
        Campagne loadedCampagne =campagneService.findByIdOrCode(campagneRelance.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    campagneRelance.setCampagne(loadedCampagne);
    }
    private void findTemplateRelance(CampagneRelance campagneRelance){
        TemplateRelance loadedTemplateRelance =templateRelanceService.findByIdOrCode(campagneRelance.getTemplateRelance());

    if(loadedTemplateRelance==null ) {
        return;
    }
    campagneRelance.setTemplateRelance(loadedTemplateRelance);
    }

@Override
@Transactional
public void delete(List<CampagneRelance> campagneRelances){
        if(ListUtil.isNotEmpty(campagneRelances)){
        campagneRelances.forEach(e->campagneRelanceDao.delete(e));
        }
}
@Override
public void update(List<CampagneRelance> campagneRelances){
if(ListUtil.isNotEmpty(campagneRelances)){
campagneRelances.forEach(e->campagneRelanceDao.save(e));
}
}

private void associateCampagneRelanceChercheur(CampagneRelance campagneRelance, List<CampagneRelanceChercheur> campagneRelanceChercheur) {
    if (ListUtil.isNotEmpty(campagneRelanceChercheur)) {
        campagneRelanceChercheur.forEach(e -> e.setCampagneRelance(campagneRelance));
    }
    }


}
