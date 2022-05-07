package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.VieInstitutionnelleDetailEtablissement;
import com.ird.faa.bean.VieInstitutionnelleDetail;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.dao.VieInstitutionnelleDetailEtablissementDao;
import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailEtablissementChercheurService;
import com.ird.faa.service.chercheur.facade.VieInstitutionnelleDetailChercheurService;
import com.ird.faa.service.chercheur.facade.EtablissementChercheurService;

import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailEtablissementVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class VieInstitutionnelleDetailEtablissementChercheurServiceImpl extends AbstractServiceImpl<VieInstitutionnelleDetailEtablissement> implements VieInstitutionnelleDetailEtablissementChercheurService {

@Autowired
private VieInstitutionnelleDetailEtablissementDao vieInstitutionnelleDetailEtablissementDao;

        @Autowired
        private VieInstitutionnelleDetailChercheurService vieInstitutionnelleDetailService ;
        @Autowired
        private EtablissementChercheurService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<VieInstitutionnelleDetailEtablissement> findAll(){
        return vieInstitutionnelleDetailEtablissementDao.findAll();
}
        @Override
        public List<VieInstitutionnelleDetailEtablissement> findByVieInstitutionnelleDetailId(Long id){
        return vieInstitutionnelleDetailEtablissementDao.findByVieInstitutionnelleDetailId(id);
        }

        @Override
        @Transactional
        public int deleteByVieInstitutionnelleDetailId(Long id){
        return vieInstitutionnelleDetailEtablissementDao.deleteByVieInstitutionnelleDetailId(id);
        }


        @Override
        public List<VieInstitutionnelleDetailEtablissement> findByEtablissementCode(String code){
        return vieInstitutionnelleDetailEtablissementDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return vieInstitutionnelleDetailEtablissementDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<VieInstitutionnelleDetailEtablissement> findByEtablissementId(Long id){
        return vieInstitutionnelleDetailEtablissementDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return vieInstitutionnelleDetailEtablissementDao.deleteByEtablissementId(id);
        }


@Override
public VieInstitutionnelleDetailEtablissement findById(Long id){
if(id==null) return null;
return vieInstitutionnelleDetailEtablissementDao.getOne(id);
}

@Override
public VieInstitutionnelleDetailEtablissement findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(vieInstitutionnelleDetailEtablissementDao.findById(id).isPresent())  {
vieInstitutionnelleDetailEtablissementDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public VieInstitutionnelleDetailEtablissement update(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement){
VieInstitutionnelleDetailEtablissement foundedVieInstitutionnelleDetailEtablissement = findById(vieInstitutionnelleDetailEtablissement.getId());
if(foundedVieInstitutionnelleDetailEtablissement==null) return null;
else{
return  vieInstitutionnelleDetailEtablissementDao.save(vieInstitutionnelleDetailEtablissement);
}
}

@Override
public VieInstitutionnelleDetailEtablissement save (VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement){



    findVieInstitutionnelleDetail(vieInstitutionnelleDetailEtablissement);
    findEtablissement(vieInstitutionnelleDetailEtablissement);

return vieInstitutionnelleDetailEtablissementDao.save(vieInstitutionnelleDetailEtablissement);


}

@Override
public List<VieInstitutionnelleDetailEtablissement> save(List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){
List<VieInstitutionnelleDetailEtablissement> list = new ArrayList<>();
for(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement: vieInstitutionnelleDetailEtablissements){
list.add(save(vieInstitutionnelleDetailEtablissement));
}
return list;
}



@Override
@Transactional
public int delete(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement){
    if(vieInstitutionnelleDetailEtablissement.getId()==null) return -1;
    VieInstitutionnelleDetailEtablissement foundedVieInstitutionnelleDetailEtablissement = findById(vieInstitutionnelleDetailEtablissement.getId());
    if(foundedVieInstitutionnelleDetailEtablissement==null) return -1;
vieInstitutionnelleDetailEtablissementDao.delete(foundedVieInstitutionnelleDetailEtablissement);
return 1;
}


public List<VieInstitutionnelleDetailEtablissement> findByCriteria(VieInstitutionnelleDetailEtablissementVo vieInstitutionnelleDetailEtablissementVo){

String query = "SELECT o FROM VieInstitutionnelleDetailEtablissement o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",vieInstitutionnelleDetailEtablissementVo.getId());
    if(vieInstitutionnelleDetailEtablissementVo.getVieInstitutionnelleDetailVo()!=null){
        query += SearchUtil.addConstraint( "o", "vieInstitutionnelleDetail.id","=",vieInstitutionnelleDetailEtablissementVo.getVieInstitutionnelleDetailVo().getId());
    }

    if(vieInstitutionnelleDetailEtablissementVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",vieInstitutionnelleDetailEtablissementVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",vieInstitutionnelleDetailEtablissementVo.getEtablissementVo().getCode());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findVieInstitutionnelleDetail(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement){
        VieInstitutionnelleDetail loadedVieInstitutionnelleDetail = null;
        if(vieInstitutionnelleDetailEtablissement.getVieInstitutionnelleDetail() != null && vieInstitutionnelleDetailEtablissement.getVieInstitutionnelleDetail().getId() !=null)
        loadedVieInstitutionnelleDetail =vieInstitutionnelleDetailService.findById(vieInstitutionnelleDetailEtablissement.getVieInstitutionnelleDetail().getId());

    if(loadedVieInstitutionnelleDetail==null ) {
        return;
    }
    vieInstitutionnelleDetailEtablissement.setVieInstitutionnelleDetail(loadedVieInstitutionnelleDetail);
    }
    private void findEtablissement(VieInstitutionnelleDetailEtablissement vieInstitutionnelleDetailEtablissement){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(vieInstitutionnelleDetailEtablissement.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    vieInstitutionnelleDetailEtablissement.setEtablissement(loadedEtablissement);
    }

@Override
@Transactional
public void delete(List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){
        if(ListUtil.isNotEmpty(vieInstitutionnelleDetailEtablissements)){
        vieInstitutionnelleDetailEtablissements.forEach(e->vieInstitutionnelleDetailEtablissementDao.delete(e));
        }
}
@Override
public void update(List<VieInstitutionnelleDetailEtablissement> vieInstitutionnelleDetailEtablissements){
if(ListUtil.isNotEmpty(vieInstitutionnelleDetailEtablissements)){
vieInstitutionnelleDetailEtablissements.forEach(e->vieInstitutionnelleDetailEtablissementDao.save(e));
}
}



}
