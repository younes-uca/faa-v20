package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.dao.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminService;
import com.ird.faa.service.admin.facade.DeveloppementDeSavoirEtInnovationScientifiqueAdminService;
import com.ird.faa.service.admin.facade.CommunauteSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminServiceImpl extends AbstractServiceImpl<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> implements DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminService {

@Autowired
private DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao;

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueAdminService developpementDeSavoirEtInnovationScientifiqueService ;
        @Autowired
        private CommunauteSavoirAdminService communauteSavoirService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findAll(){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.findAll();
}

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.findByCommunauteSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirCode(String code){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.deleteByCommunauteSavoirCode(code);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.findByCommunauteSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.deleteByCommunauteSavoirId(id);
        }

        @Override
        public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.findByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id){
        return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(id);
        }


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir findById(Long id){
if(id==null) return null;
return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.getOne(id);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.findById(id).isPresent())  {
developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir update(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir){
DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir foundedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir = findById(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getId());
if(foundedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir==null) return null;
else{
return  developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.save(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir save (DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir){



    findCommunauteSavoir(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
    findDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);

return developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.save(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir);


}

@Override
public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> save(List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> list = new ArrayList<>();
for(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir: developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
list.add(save(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir));
}
return list;
}



@Override
@Transactional
public int delete(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir){
    if(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getId()==null) return -1;
    DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir foundedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir = findById(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getId());
    if(foundedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir==null) return -1;
developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.delete(foundedDeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir);
return 1;
}


public List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCriteria(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo){

String query = "SELECT o FROM DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getId());
    if(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getCommunauteSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "communauteSavoir.id","=",developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getCommunauteSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "communauteSavoir.code","LIKE",developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getCommunauteSavoirVo().getCode());
    }

    if(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "developpementDeSavoirEtInnovationScientifique.id","=",developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo.getDeveloppementDeSavoirEtInnovationScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCommunauteSavoir(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir){
        CommunauteSavoir loadedCommunauteSavoir =communauteSavoirService.findByIdOrCode(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getCommunauteSavoir());

    if(loadedCommunauteSavoir==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.setCommunauteSavoir(loadedCommunauteSavoir);
    }
    private void findDeveloppementDeSavoirEtInnovationScientifique(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir){
        DeveloppementDeSavoirEtInnovationScientifique loadedDeveloppementDeSavoirEtInnovationScientifique = null;
        if(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getDeveloppementDeSavoirEtInnovationScientifique() != null && developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getDeveloppementDeSavoirEtInnovationScientifique().getId() !=null)
        loadedDeveloppementDeSavoirEtInnovationScientifique =developpementDeSavoirEtInnovationScientifiqueService.findById(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.getDeveloppementDeSavoirEtInnovationScientifique().getId());

    if(loadedDeveloppementDeSavoirEtInnovationScientifique==null ) {
        return;
    }
    developpementDeSavoirEtInnovationScientifiqueCommunauteSavoir.setDeveloppementDeSavoirEtInnovationScientifique(loadedDeveloppementDeSavoirEtInnovationScientifique);
    }

@Override
@Transactional
public void delete(List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
        if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs)){
        developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.forEach(e->developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.delete(e));
        }
}
@Override
public void update(List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs){
if(ListUtil.isNotEmpty(developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs)){
developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirs.forEach(e->developpementDeSavoirEtInnovationScientifiqueCommunauteSavoirDao.save(e));
}
}



}
