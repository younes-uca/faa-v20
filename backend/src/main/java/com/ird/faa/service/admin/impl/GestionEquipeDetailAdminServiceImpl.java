package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.GestionEquipeDetail;
import com.ird.faa.bean.GestionEquipe;
import com.ird.faa.dao.GestionEquipeDetailDao;
import com.ird.faa.service.admin.facade.GestionEquipeDetailAdminService;
import com.ird.faa.service.admin.facade.GestionEquipeAdminService;

import com.ird.faa.ws.rest.provided.vo.GestionEquipeDetailVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class GestionEquipeDetailAdminServiceImpl extends AbstractServiceImpl<GestionEquipeDetail> implements GestionEquipeDetailAdminService {

@Autowired
private GestionEquipeDetailDao gestionEquipeDetailDao;

        @Autowired
        private GestionEquipeAdminService gestionEquipeService ;


@Autowired
private EntityManager entityManager;


@Override
public List<GestionEquipeDetail> findAll(){
        return gestionEquipeDetailDao.findAll();
}
        @Override
        public List<GestionEquipeDetail> findByGestionEquipeId(Long id){
        return gestionEquipeDetailDao.findByGestionEquipeId(id);
        }

        @Override
        @Transactional
        public int deleteByGestionEquipeId(Long id){
        return gestionEquipeDetailDao.deleteByGestionEquipeId(id);
        }


@Override
public GestionEquipeDetail findById(Long id){
if(id==null) return null;
return gestionEquipeDetailDao.getOne(id);
}

@Override
public GestionEquipeDetail findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(gestionEquipeDetailDao.findById(id).isPresent())  {
gestionEquipeDetailDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public GestionEquipeDetail update(GestionEquipeDetail gestionEquipeDetail){
GestionEquipeDetail foundedGestionEquipeDetail = findById(gestionEquipeDetail.getId());
if(foundedGestionEquipeDetail==null) return null;
else{
return  gestionEquipeDetailDao.save(gestionEquipeDetail);
}
}
private void prepareSave(GestionEquipeDetail gestionEquipeDetail){
if(gestionEquipeDetail.getFormationManagement() == null)
  gestionEquipeDetail.setFormationManagement(false);



}

@Override
public GestionEquipeDetail save (GestionEquipeDetail gestionEquipeDetail){
prepareSave(gestionEquipeDetail);



    findGestionEquipe(gestionEquipeDetail);

return gestionEquipeDetailDao.save(gestionEquipeDetail);


}

@Override
public List<GestionEquipeDetail> save(List<GestionEquipeDetail> gestionEquipeDetails){
List<GestionEquipeDetail> list = new ArrayList<>();
for(GestionEquipeDetail gestionEquipeDetail: gestionEquipeDetails){
list.add(save(gestionEquipeDetail));
}
return list;
}



@Override
@Transactional
public int delete(GestionEquipeDetail gestionEquipeDetail){
    if(gestionEquipeDetail.getId()==null) return -1;
    GestionEquipeDetail foundedGestionEquipeDetail = findById(gestionEquipeDetail.getId());
    if(foundedGestionEquipeDetail==null) return -1;
gestionEquipeDetailDao.delete(foundedGestionEquipeDetail);
return 1;
}


public List<GestionEquipeDetail> findByCriteria(GestionEquipeDetailVo gestionEquipeDetailVo){

String query = "SELECT o FROM GestionEquipeDetail o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",gestionEquipeDetailVo.getId());
            query += SearchUtil.addConstraint( "o", "nombrePersonneEncadre","=",gestionEquipeDetailVo.getNombrePersonneEncadre());
            query += SearchUtil.addConstraint( "o", "nombrePersonneHorsIrd","=",gestionEquipeDetailVo.getNombrePersonneHorsIrd());
            query += SearchUtil.addConstraint( "o", "nombrePersonneSousConventions","=",gestionEquipeDetailVo.getNombrePersonneSousConventions());
            query += SearchUtil.addConstraint( "o", "formationManagement","=",gestionEquipeDetailVo.getFormationManagement());
            query += SearchUtil.addConstraintMinMax("o","nombrePersonneEncadre",gestionEquipeDetailVo.getNombrePersonneEncadreMin(),gestionEquipeDetailVo.getNombrePersonneEncadreMax());
            query += SearchUtil.addConstraintMinMax("o","nombrePersonneHorsIrd",gestionEquipeDetailVo.getNombrePersonneHorsIrdMin(),gestionEquipeDetailVo.getNombrePersonneHorsIrdMax());
            query += SearchUtil.addConstraintMinMax("o","nombrePersonneSousConventions",gestionEquipeDetailVo.getNombrePersonneSousConventionsMin(),gestionEquipeDetailVo.getNombrePersonneSousConventionsMax());
    if(gestionEquipeDetailVo.getGestionEquipeVo()!=null){
        query += SearchUtil.addConstraint( "o", "gestionEquipe.id","=",gestionEquipeDetailVo.getGestionEquipeVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findGestionEquipe(GestionEquipeDetail gestionEquipeDetail){
        GestionEquipe loadedGestionEquipe = null;
        if(gestionEquipeDetail.getGestionEquipe() != null && gestionEquipeDetail.getGestionEquipe().getId() !=null)
        loadedGestionEquipe =gestionEquipeService.findById(gestionEquipeDetail.getGestionEquipe().getId());

    if(loadedGestionEquipe==null ) {
        return;
    }
    gestionEquipeDetail.setGestionEquipe(loadedGestionEquipe);
    }

@Override
@Transactional
public void delete(List<GestionEquipeDetail> gestionEquipeDetails){
        if(ListUtil.isNotEmpty(gestionEquipeDetails)){
        gestionEquipeDetails.forEach(e->gestionEquipeDetailDao.delete(e));
        }
}
@Override
public void update(List<GestionEquipeDetail> gestionEquipeDetails){
if(ListUtil.isNotEmpty(gestionEquipeDetails)){
gestionEquipeDetails.forEach(e->gestionEquipeDetailDao.save(e));
}
}



}
