package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique;
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueAdminService;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;
import com.ird.faa.service.admin.facade.CommunauteSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueAdminServiceImpl extends AbstractServiceImpl<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> implements DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueAdminService {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao;

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueAdminService developpementDeSavoirEtInnovationScientifiqueService ;
        @Autowired
        private CommunauteSavoirAdminService communauteSavoirService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.findAll();
}

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.findByCommunauteSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.deleteByCommunauteSavoirCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.findByCommunauteSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.deleteByCommunauteSavoirId(id);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique findById(Long id){
if(id==null) return null;
return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.getOne(id);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.findById(id).isPresent())  {
developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique update(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique){
DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique foundedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique = findById(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getId());
if(foundedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique==null) return null;
else{
return  developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.save(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique);
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique save (DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique){



    findCommunauteSavoir(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique);
    findDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique);

return developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.save(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique);


}

@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> save(List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> list = new ArrayList<>();
for(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique: developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
list.add(save(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique));
}
return list;
}



@Override
@Transactional
public int delete(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique){
    if(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getId()==null) return -1;
    DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique foundedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique = findById(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getId());
    if(foundedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique==null) return -1;
developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.delete(foundedDeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique);
return 1;
}


public List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCriteria(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo){

String query = "SELECT o FROM DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getId());
    if(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getCommunauteSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "communauteSavoir.id","=",developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getCommunauteSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "communauteSavoir.code","LIKE",developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getCommunauteSavoirVo().getCode());
    }

    if(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "developpementDeSavoirEtInnovationScientifique.id","=",developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCommunauteSavoir(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique){
        CommunauteSavoir loadedCommunauteSavoir =communauteSavoirService.findByIdOrCode(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getCommunauteSavoir());

    if(loadedCommunauteSavoir==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.setCommunauteSavoir(loadedCommunauteSavoir);
    }
    private void findDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique){
        DeveloppementDeSavoirEtInnovationScientifique loadedDeveloppementDeSavoirEtInnovationScientifique = null;
        if(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getDeveloppementDeSavoirEtInnovationScientifique() != null && developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getDeveloppementDeSavoirEtInnovationScientifique().getId() !=null)
        loadedDeveloppementDeSavoirEtInnovationScientifique =developpementDeSavoirEtInnovationScientifiqueService.findById(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.getDeveloppementDeSavoirEtInnovationScientifique().getId());

    if(loadedDeveloppementDeSavoirEtInnovationScientifique==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueDisciplineScientifique.setDeveloppementDeSavoirEtInnovationScientifique(loadedDeveloppementDeSavoirEtInnovationScientifique);
    }

@Override
@Transactional
public void delete(List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
        if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques)){
        developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.forEach(e->developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques){
if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques)){
developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiques.forEach(e->developpementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao.save(e));
}
}



}
