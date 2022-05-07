package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.bean.Campagne;
import com.ird.faa.bean.TemplateRappel;
import com.ird.faa.bean.CampagneRappelChercheur;
import com.ird.faa.dao.CampagneRappelDao;
import com.ird.faa.service.chercheur.facade.CampagneRappelChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneRappelChercheurChercheurService;
import com.ird.faa.service.chercheur.facade.TemplateRappelChercheurService;
import com.ird.faa.service.chercheur.facade.CampagneChercheurService;

import com.ird.faa.ws.rest.provided.vo.CampagneRappelVo;
import com.ird.faa.service.util.*;
import com.ird.faa.bean.CampagneRappelChercheur;
import com.ird.faa.service.chercheur.facade.CampagneRappelChercheurChercheurService;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CampagneRappelChercheurServiceImpl extends AbstractServiceImpl<CampagneRappel> implements CampagneRappelChercheurService {

@Autowired
private CampagneRappelDao campagneRappelDao;

        @Autowired
        private CampagneRappelChercheurChercheurService campagneRappelChercheurService ;
        @Autowired
        private TemplateRappelChercheurService templateRappelService ;
        @Autowired
        private CampagneChercheurService campagneService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CampagneRappel> findAll(){
        return campagneRappelDao.findAll();
}

        @Override
        public List<CampagneRappel> findByCampagneCode(String code){
        return campagneRappelDao.findByCampagneCode(code);
        }

        @Override
        @Transactional
        public int deleteByCampagneCode(String code){
        return campagneRappelDao.deleteByCampagneCode(code);
        }

        @Override
        public List<CampagneRappel> findByCampagneId(Long id){
        return campagneRappelDao.findByCampagneId(id);
        }

        @Override
        @Transactional
        public int deleteByCampagneId(Long id){
        return campagneRappelDao.deleteByCampagneId(id);
        }


        @Override
        public List<CampagneRappel> findByTemplateRappelCode(String code){
        return campagneRappelDao.findByTemplateRappelCode(code);
        }

        @Override
        @Transactional
        public int deleteByTemplateRappelCode(String code){
        return campagneRappelDao.deleteByTemplateRappelCode(code);
        }

        @Override
        public List<CampagneRappel> findByTemplateRappelId(Long id){
        return campagneRappelDao.findByTemplateRappelId(id);
        }

        @Override
        @Transactional
        public int deleteByTemplateRappelId(Long id){
        return campagneRappelDao.deleteByTemplateRappelId(id);
        }


@Override
public CampagneRappel findById(Long id){
if(id==null) return null;
return campagneRappelDao.getOne(id);
}

@Override
public CampagneRappel findByIdWithAssociatedList(Long id){
CampagneRappel campagneRappel  = findById(id);
findAssociatedLists(campagneRappel);
return campagneRappel;
}
private void findAssociatedLists(CampagneRappel campagneRappel){
if(campagneRappel!=null && campagneRappel.getId() != null) {
        List<CampagneRappelChercheur> campagneRappelChercheurs = campagneRappelChercheurService.findByCampagneRappelId(campagneRappel.getId());
        campagneRappel.setCampagneRappelChercheurs(campagneRappelChercheurs);
}
}
private void deleteAssociatedLists(Long id){
if(id != null ) {
        campagneRappelChercheurService.deleteByCampagneRappelId(id);
}
}

    private void updateAssociatedLists(CampagneRappel campagneRappel){
    if(campagneRappel !=null && campagneRappel.getId() != null){
            List<List<CampagneRappelChercheur>> resultCampagneRappelChercheurs= campagneRappelChercheurService.getToBeSavedAndToBeDeleted(campagneRappelChercheurService.findByCampagneRappelId(campagneRappel.getId()),campagneRappel.getCampagneRappelChercheurs());
            campagneRappelChercheurService.delete(resultCampagneRappelChercheurs.get(1));
            associateCampagneRappelChercheur(campagneRappel,resultCampagneRappelChercheurs.get(0));
            campagneRappelChercheurService.update(resultCampagneRappelChercheurs.get(0));

    }
    }

@Transactional
public int deleteById(Long id){
int res=0;
if(campagneRappelDao.findById(id).isPresent())  {
deleteAssociatedLists(id);
campagneRappelDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CampagneRappel update(CampagneRappel campagneRappel){
CampagneRappel foundedCampagneRappel = findById(campagneRappel.getId());
if(foundedCampagneRappel==null) return null;
else{
    updateAssociatedLists(campagneRappel);
return  campagneRappelDao.save(campagneRappel);
}
}

@Override
public CampagneRappel save (CampagneRappel campagneRappel){

CampagneRappel result =null;


    findCampagne(campagneRappel);
    findTemplateRappel(campagneRappel);

CampagneRappel savedCampagneRappel = campagneRappelDao.save(campagneRappel);

       saveCampagneRappelChercheurs(savedCampagneRappel,campagneRappel.getCampagneRappelChercheurs());
result = savedCampagneRappel;

return result;
}

@Override
public List<CampagneRappel> save(List<CampagneRappel> campagneRappels){
List<CampagneRappel> list = new ArrayList<>();
for(CampagneRappel campagneRappel: campagneRappels){
list.add(save(campagneRappel));
}
return list;
}

        private List<CampagneRappelChercheur> prepareCampagneRappelChercheurs(CampagneRappel campagneRappel,List<CampagneRappelChercheur> campagneRappelChercheurs){
        for(CampagneRappelChercheur campagneRappelChercheur:campagneRappelChercheurs ){
        campagneRappelChercheur.setCampagneRappel(campagneRappel);
        }
        return campagneRappelChercheurs;
        }


@Override
@Transactional
public int delete(CampagneRappel campagneRappel){
    if(campagneRappel.getId()==null) return -1;
    CampagneRappel foundedCampagneRappel = findById(campagneRappel.getId());
    if(foundedCampagneRappel==null) return -1;
campagneRappelDao.delete(foundedCampagneRappel);
return 1;
}


public List<CampagneRappel> findByCriteria(CampagneRappelVo campagneRappelVo){

String query = "SELECT o FROM CampagneRappel o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",campagneRappelVo.getId());
        query += SearchUtil.addConstraintDate( "o", "dateRappel","=",campagneRappelVo.getDateRappel());
            query += SearchUtil.addConstraint( "o", "objetRappel","LIKE",campagneRappelVo.getObjetRappel());
            query += SearchUtil.addConstraint( "o", "messageRappel","LIKE",campagneRappelVo.getMessageRappel());
            query += SearchUtil.addConstraintMinMaxDate("o","dateRappel",campagneRappelVo.getDateRappelMin(),campagneRappelVo.getDateRappelMax());
    if(campagneRappelVo.getCampagneVo()!=null){
        query += SearchUtil.addConstraint( "o", "campagne.id","=",campagneRappelVo.getCampagneVo().getId());
            query += SearchUtil.addConstraint( "o", "campagne.code","LIKE",campagneRappelVo.getCampagneVo().getCode());
    }

    if(campagneRappelVo.getTemplateRappelVo()!=null){
        query += SearchUtil.addConstraint( "o", "templateRappel.id","=",campagneRappelVo.getTemplateRappelVo().getId());
            query += SearchUtil.addConstraint( "o", "templateRappel.code","LIKE",campagneRappelVo.getTemplateRappelVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}
        private  void saveCampagneRappelChercheurs(CampagneRappel campagneRappel,List<CampagneRappelChercheur> campagneRappelChercheurs){

        if (ListUtil.isNotEmpty(campagneRappel.getCampagneRappelChercheurs())) {
        List<CampagneRappelChercheur> savedCampagneRappelChercheurs = new ArrayList<>();
        campagneRappelChercheurs.forEach(element -> {
        element.setCampagneRappel(campagneRappel);
         campagneRappelChercheurService.save(element);
        });
        campagneRappel.setCampagneRappelChercheurs(savedCampagneRappelChercheurs);
        }
        }

    private void findCampagne(CampagneRappel campagneRappel){
        Campagne loadedCampagne =campagneService.findByIdOrCode(campagneRappel.getCampagne());

    if(loadedCampagne==null ) {
        return;
    }
    campagneRappel.setCampagne(loadedCampagne);
    }
    private void findTemplateRappel(CampagneRappel campagneRappel){
        TemplateRappel loadedTemplateRappel =templateRappelService.findByIdOrCode(campagneRappel.getTemplateRappel());

    if(loadedTemplateRappel==null ) {
        return;
    }
    campagneRappel.setTemplateRappel(loadedTemplateRappel);
    }

@Override
@Transactional
public void delete(List<CampagneRappel> campagneRappels){
        if(ListUtil.isNotEmpty(campagneRappels)){
        campagneRappels.forEach(e->campagneRappelDao.delete(e));
        }
}
@Override
public void update(List<CampagneRappel> campagneRappels){
if(ListUtil.isNotEmpty(campagneRappels)){
campagneRappels.forEach(e->campagneRappelDao.save(e));
}
}

private void associateCampagneRappelChercheur(CampagneRappel campagneRappel, List<CampagneRappelChercheur> campagneRappelChercheur) {
    if (ListUtil.isNotEmpty(campagneRappelChercheur)) {
        campagneRappelChercheur.forEach(e -> e.setCampagneRappel(campagneRappel));
    }
    }


}
