package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.bean.Etablissement;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementDao;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementAdminService;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;
import com.ird.faa.service.admin.facade.EtablissementAdminService;

import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DeveloppementDeSavoirEtInnovationScientifiqueEtablissementAdminServiceImpl extends AbstractServiceImpl<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> implements DeveloppementDeSavoirEtInnovationScientifiqueEtablissementAdminService {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueEtablissementDao developpementDeSavoirEtInnovationScientifiqueEtablissementDao;

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueAdminService developpementDeSavoirEtInnovationScientifiqueService ;
        @Autowired
        private EtablissementAdminService etablissementService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.findAll();
}

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.findByEtablissementCode(code);
        }

        @Override
        @Transactional
        public int deleteByEtablissementCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.deleteByEtablissementCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.findByEtablissementId(id);
        }

        @Override
        @Transactional
        public int deleteByEtablissementId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.deleteByEtablissementId(id);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement findById(Long id){
if(id==null) return null;
return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.getOne(id);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(developpementDeSavoirEtInnovationScientifiqueEtablissementDao.findById(id).isPresent())  {
developpementDeSavoirEtInnovationScientifiqueEtablissementDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement update(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement){
DeveloppementDeSavoirEtInnovationScientifiqueEtablissement foundedDeveloppementDeSavoirEtInnovationScientifiqueEtablissement = findById(developpementDeSavoirEtInnovationScientifiqueEtablissement.getId());
if(foundedDeveloppementDeSavoirEtInnovationScientifiqueEtablissement==null) return null;
else{
return  developpementDeSavoirEtInnovationScientifiqueEtablissementDao.save(developpementDeSavoirEtInnovationScientifiqueEtablissement);
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement save (DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement){



    findEtablissement(developpementDeSavoirEtInnovationScientifiqueEtablissement);
    findDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueEtablissement);

return developpementDeSavoirEtInnovationScientifiqueEtablissementDao.save(developpementDeSavoirEtInnovationScientifiqueEtablissement);


}

@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> save(List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements){
List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> list = new ArrayList<>();
for(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement: developpementDeSavoirEtInnovationScientifiqueEtablissements){
list.add(save(developpementDeSavoirEtInnovationScientifiqueEtablissement));
}
return list;
}



@Override
@Transactional
public int delete(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement){
    if(developpementDeSavoirEtInnovationScientifiqueEtablissement.getId()==null) return -1;
    DeveloppementDeSavoirEtInnovationScientifiqueEtablissement foundedDeveloppementDeSavoirEtInnovationScientifiqueEtablissement = findById(developpementDeSavoirEtInnovationScientifiqueEtablissement.getId());
    if(foundedDeveloppementDeSavoirEtInnovationScientifiqueEtablissement==null) return -1;
developpementDeSavoirEtInnovationScientifiqueEtablissementDao.delete(foundedDeveloppementDeSavoirEtInnovationScientifiqueEtablissement);
return 1;
}


public List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByCriteria(DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo developpementDeSavoirEtInnovationScientifiqueEtablissementVo){

String query = "SELECT o FROM DeveloppementDeSavoirEtInnovationScientifiqueEtablissement o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getId());
    if(developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getEtablissementVo()!=null){
        query += SearchUtil.addConstraint( "o", "etablissement.id","=",developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getEtablissementVo().getId());
            query += SearchUtil.addConstraint( "o", "etablissement.code","LIKE",developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getEtablissementVo().getCode());
    }

    if(developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "developpementDeSavoirEtInnovationScientifique.id","=",developpementDeSavoirEtInnovationScientifiqueEtablissementVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEtablissement(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement){
        Etablissement loadedEtablissement =etablissementService.findByIdOrCode(developpementDeSavoirEtInnovationScientifiqueEtablissement.getEtablissement());

    if(loadedEtablissement==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueEtablissement.setEtablissement(loadedEtablissement);
    }
    private void findDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement developpementDeSavoirEtInnovationScientifiqueEtablissement){
        DeveloppementDeSavoirEtInnovationScientifique loadedDeveloppementDeSavoirEtInnovationScientifique = null;
        if(developpementDeSavoirEtInnovationScientifiqueEtablissement.getDeveloppementDeSavoirEtInnovationScientifique() != null && developpementDeSavoirEtInnovationScientifiqueEtablissement.getDeveloppementDeSavoirEtInnovationScientifique().getId() !=null)
        loadedDeveloppementDeSavoirEtInnovationScientifique =developpementDeSavoirEtInnovationScientifiqueService.findById(developpementDeSavoirEtInnovationScientifiqueEtablissement.getDeveloppementDeSavoirEtInnovationScientifique().getId());

    if(loadedDeveloppementDeSavoirEtInnovationScientifique==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueEtablissement.setDeveloppementDeSavoirEtInnovationScientifique(loadedDeveloppementDeSavoirEtInnovationScientifique);
    }

@Override
@Transactional
public void delete(List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements){
        if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueEtablissements)){
        developpementDeSavoirEtInnovationScientifiqueEtablissements.forEach(e->developpementDeSavoirEtInnovationScientifiqueEtablissementDao.delete(e));
        }
}
@Override
public void update(List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> developpementDeSavoirEtInnovationScientifiqueEtablissements){
if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueEtablissements)){
developpementDeSavoirEtInnovationScientifiqueEtablissements.forEach(e->developpementDeSavoirEtInnovationScientifiqueEtablissementDao.save(e));
}
}



}
