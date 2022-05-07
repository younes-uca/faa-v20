package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;
import com.ird.faa.bean.ModeDiffusion;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionDao;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService;
import com.ird.faa.service.chercheur.facade.ModeDiffusionChercheurService;
import com.ird.faa.service.chercheur.facade.DeveloppementDeSavoirEtInnovationScientifiqueChercheurService;

import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurServiceImpl extends AbstractServiceImpl<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> implements DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionChercheurService {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionDao developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao;

        @Autowired
        private ModeDiffusionChercheurService modeDiffusionService ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueChercheurService developpementDeSavoirEtInnovationScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.findAll();
}

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.findByModeDiffusionCode(code);
        }

        @Override
        @Transactional
        public int deleteByModeDiffusionCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.deleteByModeDiffusionCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.findByModeDiffusionId(id);
        }

        @Override
        @Transactional
        public int deleteByModeDiffusionId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.deleteByModeDiffusionId(id);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion findById(Long id){
if(id==null) return null;
return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.getOne(id);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.findById(id).isPresent())  {
developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion update(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion){
DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion foundedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion = findById(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getId());
if(foundedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion==null) return null;
else{
return  developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.save(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion save (DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion){



    findModeDiffusion(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);
    findDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);

return developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.save(developpementDeSavoirEtInnovationScientifiqueModeDiffusion);


}

@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> save(List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> list = new ArrayList<>();
for(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion: developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
list.add(save(developpementDeSavoirEtInnovationScientifiqueModeDiffusion));
}
return list;
}



@Override
@Transactional
public int delete(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion){
    if(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getId()==null) return -1;
    DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion foundedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion = findById(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getId());
    if(foundedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion==null) return -1;
developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.delete(foundedDeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion);
return 1;
}


public List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByCriteria(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo){

String query = "SELECT o FROM DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getId());
    if(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getModeDiffusionVo()!=null){
        query += SearchUtil.addConstraint( "o", "modeDiffusion.id","=",developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getModeDiffusionVo().getId());
            query += SearchUtil.addConstraint( "o", "modeDiffusion.code","LIKE",developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getModeDiffusionVo().getCode());
    }

    if(developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "developpementDeSavoirEtInnovationScientifique.id","=",developpementDeSavoirEtInnovationScientifiqueModeDiffusionVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findModeDiffusion(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion){
        ModeDiffusion loadedModeDiffusion =modeDiffusionService.findByIdOrCode(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getModeDiffusion());

    if(loadedModeDiffusion==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueModeDiffusion.setModeDiffusion(loadedModeDiffusion);
    }
    private void findDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion developpementDeSavoirEtInnovationScientifiqueModeDiffusion){
        DeveloppementDeSavoirEtInnovationScientifique loadedDeveloppementDeSavoirEtInnovationScientifique = null;
        if(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getDeveloppementDeSavoirEtInnovationScientifique() != null && developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getDeveloppementDeSavoirEtInnovationScientifique().getId() !=null)
        loadedDeveloppementDeSavoirEtInnovationScientifique =developpementDeSavoirEtInnovationScientifiqueService.findById(developpementDeSavoirEtInnovationScientifiqueModeDiffusion.getDeveloppementDeSavoirEtInnovationScientifique().getId());

    if(loadedDeveloppementDeSavoirEtInnovationScientifique==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueModeDiffusion.setDeveloppementDeSavoirEtInnovationScientifique(loadedDeveloppementDeSavoirEtInnovationScientifique);
    }

@Override
@Transactional
public void delete(List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
        if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueModeDiffusions)){
        developpementDeSavoirEtInnovationScientifiqueModeDiffusions.forEach(e->developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.delete(e));
        }
}
@Override
public void update(List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> developpementDeSavoirEtInnovationScientifiqueModeDiffusions){
if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueModeDiffusions)){
developpementDeSavoirEtInnovationScientifiqueModeDiffusions.forEach(e->developpementDeSavoirEtInnovationScientifiqueModeDiffusionDao.save(e));
}
}



}
