package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.ProjetActiviteRechercheDetailInstitutionCoContractant;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.ProjetActiviteRechercheDetail;
import com.ird.faa.dao.ProjetActiviteRechercheDetailInstitutionCoContractantDao;
import com.ird.faa.service.admin.facade.ProjetActiviteRechercheDetailInstitutionCoContractantAdminService;
import com.ird.faa.service.admin.facade.ProjetActiviteRechercheDetailAdminService;
import com.ird.faa.service.admin.facade.EtablissementAdminService;

import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstitutionCoContractantVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class ProjetActiviteRechercheDetailInstitutionCoContractantAdminServiceImpl extends AbstractServiceImpl<ProjetActiviteRechercheDetailInstitutionCoContractant> implements ProjetActiviteRechercheDetailInstitutionCoContractantAdminService {

@Autowired
private ProjetActiviteRechercheDetailInstitutionCoContractantDao projetActiviteRechercheDetailInstitutionCoContractantDao;

        @Autowired
        private ProjetActiviteRechercheDetailAdminService projetActiviteRechercheDetailService ;
        @Autowired
        private EtablissementAdminService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findAll(){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.findAll();
}

        @Override
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByEtablissementCode(String code){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByEtablissementId(Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.deleteByEtablissementId(id);
        }

        @Override
        public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.findByProjetActiviteRechercheDetailId(id);
        }

        @Override
        @Transactional
        public int deleteByProjetActiviteRechercheDetailId(Long id){
        return projetActiviteRechercheDetailInstitutionCoContractantDao.deleteByProjetActiviteRechercheDetailId(id);
        }


@Override
public ProjetActiviteRechercheDetailInstitutionCoContractant findById(Long id){
if(id==null) return null;
return projetActiviteRechercheDetailInstitutionCoContractantDao.getOne(id);
}

@Override
public ProjetActiviteRechercheDetailInstitutionCoContractant findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(projetActiviteRechercheDetailInstitutionCoContractantDao.findById(id).isPresent())  {
projetActiviteRechercheDetailInstitutionCoContractantDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public ProjetActiviteRechercheDetailInstitutionCoContractant update(ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant){
ProjetActiviteRechercheDetailInstitutionCoContractant foundedProjetActiviteRechercheDetailInstitutionCoContractant = findById(projetActiviteRechercheDetailInstitutionCoContractant.getId());
if(foundedProjetActiviteRechercheDetailInstitutionCoContractant==null) return null;
else{
return  projetActiviteRechercheDetailInstitutionCoContractantDao.save(projetActiviteRechercheDetailInstitutionCoContractant);
}
}

@Override
public ProjetActiviteRechercheDetailInstitutionCoContractant save (ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant){



    findEtablissement(projetActiviteRechercheDetailInstitutionCoContractant);
    findProjetActiviteRechercheDetail(projetActiviteRechercheDetailInstitutionCoContractant);

return projetActiviteRechercheDetailInstitutionCoContractantDao.save(projetActiviteRechercheDetailInstitutionCoContractant);


}

@Override
public List<ProjetActiviteRechercheDetailInstitutionCoContractant> save(List<ProjetActiviteRechercheDetailInstitutionCoContractant> projetActiviteRechercheDetailInstitutionCoContractants){
List<ProjetActiviteRechercheDetailInstitutionCoContractant> list = new ArrayList<>();
for(ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant: projetActiviteRechercheDetailInstitutionCoContractants){
list.add(save(projetActiviteRechercheDetailInstitutionCoContractant));
}
return list;
}



@Override
@Transactional
public int delete(ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant){
    if(projetActiviteRechercheDetailInstitutionCoContractant.getId()==null) return -1;
    ProjetActiviteRechercheDetailInstitutionCoContractant foundedProjetActiviteRechercheDetailInstitutionCoContractant = findById(projetActiviteRechercheDetailInstitutionCoContractant.getId());
    if(foundedProjetActiviteRechercheDetailInstitutionCoContractant==null) return -1;
projetActiviteRechercheDetailInstitutionCoContractantDao.delete(foundedProjetActiviteRechercheDetailInstitutionCoContractant);
return 1;
}


public List<ProjetActiviteRechercheDetailInstitutionCoContractant> findByCriteria(ProjetActiviteRechercheDetailInstitutionCoContractantVo projetActiviteRechercheDetailInstitutionCoContractantVo){

String query = "SELECT o FROM ProjetActiviteRechercheDetailInstitutionCoContractant o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",projetActiviteRechercheDetailInstitutionCoContractantVo.getId());
    if(projetActiviteRechercheDetailInstitutionCoContractantVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",projetActiviteRechercheDetailInstitutionCoContractantVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",projetActiviteRechercheDetailInstitutionCoContractantVo.getEtablissementVo().getCode());
    }

    if(projetActiviteRechercheDetailInstitutionCoContractantVo.getProjetActiviteRechercheDetailVo()!=null){
        query += SearchUtil.addConstraint( "o", "projetActiviteRechercheDetail.id","=",projetActiviteRechercheDetailInstitutionCoContractantVo.getProjetActiviteRechercheDetailVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEtablissement(ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(projetActiviteRechercheDetailInstitutionCoContractant.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    projetActiviteRechercheDetailInstitutionCoContractant.setEtablissement(loadedEtablissement);
    }
    private void findProjetActiviteRechercheDetail(ProjetActiviteRechercheDetailInstitutionCoContractant projetActiviteRechercheDetailInstitutionCoContractant){
        ProjetActiviteRechercheDetail loadedProjetActiviteRechercheDetail = null;
        if(projetActiviteRechercheDetailInstitutionCoContractant.getProjetActiviteRechercheDetail() != null && projetActiviteRechercheDetailInstitutionCoContractant.getProjetActiviteRechercheDetail().getId() !=null)
        loadedProjetActiviteRechercheDetail =projetActiviteRechercheDetailService.findById(projetActiviteRechercheDetailInstitutionCoContractant.getProjetActiviteRechercheDetail().getId());

    if(loadedProjetActiviteRechercheDetail==null ) {
        return;
    }
    projetActiviteRechercheDetailInstitutionCoContractant.setProjetActiviteRechercheDetail(loadedProjetActiviteRechercheDetail);
    }

@Override
@Transactional
public void delete(List<ProjetActiviteRechercheDetailInstitutionCoContractant> projetActiviteRechercheDetailInstitutionCoContractants){
        if(ListUtil.isNotEmpty(projetActiviteRechercheDetailInstitutionCoContractants)){
        projetActiviteRechercheDetailInstitutionCoContractants.forEach(e->projetActiviteRechercheDetailInstitutionCoContractantDao.delete(e));
        }
}
@Override
public void update(List<ProjetActiviteRechercheDetailInstitutionCoContractant> projetActiviteRechercheDetailInstitutionCoContractants){
if(ListUtil.isNotEmpty(projetActiviteRechercheDetailInstitutionCoContractants)){
projetActiviteRechercheDetailInstitutionCoContractants.forEach(e->projetActiviteRechercheDetailInstitutionCoContractantDao.save(e));
}
}



}
