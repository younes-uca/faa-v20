package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.bean.ConseilEtComiteScientifique;
import com.ird.faa.dao.CommunauteSavoirConseilEtComiteScientifiqueDao;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.ConseilEtComiteScientifiqueChercheurService;
import com.ird.faa.service.chercheur.facade.CommunauteSavoirChercheurService;

import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirConseilEtComiteScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CommunauteSavoirConseilEtComiteScientifiqueChercheurServiceImpl extends AbstractServiceImpl<CommunauteSavoirConseilEtComiteScientifique> implements CommunauteSavoirConseilEtComiteScientifiqueChercheurService {

@Autowired
private CommunauteSavoirConseilEtComiteScientifiqueDao communauteSavoirConseilEtComiteScientifiqueDao;

        @Autowired
        private ConseilEtComiteScientifiqueChercheurService conseilEtComiteScientifiqueService ;
        @Autowired
        private CommunauteSavoirChercheurService communauteSavoirService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CommunauteSavoirConseilEtComiteScientifique> findAll(){
        return communauteSavoirConseilEtComiteScientifiqueDao.findAll();
}

        @Override
        public List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirCode(String code){
        return communauteSavoirConseilEtComiteScientifiqueDao.findByCommunauteSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirCode(String code){
        return communauteSavoirConseilEtComiteScientifiqueDao.deleteByCommunauteSavoirCode(code);
        }

        @Override
        public List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirId(Long id){
        return communauteSavoirConseilEtComiteScientifiqueDao.findByCommunauteSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirId(Long id){
        return communauteSavoirConseilEtComiteScientifiqueDao.deleteByCommunauteSavoirId(id);
        }

        @Override
        public List<CommunauteSavoirConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id){
        return communauteSavoirConseilEtComiteScientifiqueDao.findByConseilEtComiteScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByConseilEtComiteScientifiqueId(Long id){
        return communauteSavoirConseilEtComiteScientifiqueDao.deleteByConseilEtComiteScientifiqueId(id);
        }


@Override
public CommunauteSavoirConseilEtComiteScientifique findById(Long id){
if(id==null) return null;
return communauteSavoirConseilEtComiteScientifiqueDao.getOne(id);
}

@Override
public CommunauteSavoirConseilEtComiteScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(communauteSavoirConseilEtComiteScientifiqueDao.findById(id).isPresent())  {
communauteSavoirConseilEtComiteScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CommunauteSavoirConseilEtComiteScientifique update(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique){
CommunauteSavoirConseilEtComiteScientifique foundedCommunauteSavoirConseilEtComiteScientifique = findById(communauteSavoirConseilEtComiteScientifique.getId());
if(foundedCommunauteSavoirConseilEtComiteScientifique==null) return null;
else{
return  communauteSavoirConseilEtComiteScientifiqueDao.save(communauteSavoirConseilEtComiteScientifique);
}
}

@Override
public CommunauteSavoirConseilEtComiteScientifique save (CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique){



    findCommunauteSavoir(communauteSavoirConseilEtComiteScientifique);
    findConseilEtComiteScientifique(communauteSavoirConseilEtComiteScientifique);

return communauteSavoirConseilEtComiteScientifiqueDao.save(communauteSavoirConseilEtComiteScientifique);


}

@Override
public List<CommunauteSavoirConseilEtComiteScientifique> save(List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){
List<CommunauteSavoirConseilEtComiteScientifique> list = new ArrayList<>();
for(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique: communauteSavoirConseilEtComiteScientifiques){
list.add(save(communauteSavoirConseilEtComiteScientifique));
}
return list;
}



@Override
@Transactional
public int delete(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique){
    if(communauteSavoirConseilEtComiteScientifique.getId()==null) return -1;
    CommunauteSavoirConseilEtComiteScientifique foundedCommunauteSavoirConseilEtComiteScientifique = findById(communauteSavoirConseilEtComiteScientifique.getId());
    if(foundedCommunauteSavoirConseilEtComiteScientifique==null) return -1;
communauteSavoirConseilEtComiteScientifiqueDao.delete(foundedCommunauteSavoirConseilEtComiteScientifique);
return 1;
}


public List<CommunauteSavoirConseilEtComiteScientifique> findByCriteria(CommunauteSavoirConseilEtComiteScientifiqueVo communauteSavoirConseilEtComiteScientifiqueVo){

String query = "SELECT o FROM CommunauteSavoirConseilEtComiteScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",communauteSavoirConseilEtComiteScientifiqueVo.getId());
    if(communauteSavoirConseilEtComiteScientifiqueVo.getCommunauteSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "communauteSavoir.id","=",communauteSavoirConseilEtComiteScientifiqueVo.getCommunauteSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "communauteSavoir.code","LIKE",communauteSavoirConseilEtComiteScientifiqueVo.getCommunauteSavoirVo().getCode());
    }

    if(communauteSavoirConseilEtComiteScientifiqueVo.getConseilEtComiteScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "conseilEtComiteScientifique.id","=",communauteSavoirConseilEtComiteScientifiqueVo.getConseilEtComiteScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCommunauteSavoir(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique){
        CommunauteSavoir loadedCommunauteSavoir =communauteSavoirService.findByIdOrCode(communauteSavoirConseilEtComiteScientifique.getCommunauteSavoir());

    if(loadedCommunauteSavoir==null ) {
        return;
    }
    communauteSavoirConseilEtComiteScientifique.setCommunauteSavoir(loadedCommunauteSavoir);
    }
    private void findConseilEtComiteScientifique(CommunauteSavoirConseilEtComiteScientifique communauteSavoirConseilEtComiteScientifique){
        ConseilEtComiteScientifique loadedConseilEtComiteScientifique = null;
        if(communauteSavoirConseilEtComiteScientifique.getConseilEtComiteScientifique() != null && communauteSavoirConseilEtComiteScientifique.getConseilEtComiteScientifique().getId() !=null)
        loadedConseilEtComiteScientifique =conseilEtComiteScientifiqueService.findById(communauteSavoirConseilEtComiteScientifique.getConseilEtComiteScientifique().getId());

    if(loadedConseilEtComiteScientifique==null ) {
        return;
    }
    communauteSavoirConseilEtComiteScientifique.setConseilEtComiteScientifique(loadedConseilEtComiteScientifique);
    }

@Override
@Transactional
public void delete(List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){
        if(ListUtil.isNotEmpty(communauteSavoirConseilEtComiteScientifiques)){
        communauteSavoirConseilEtComiteScientifiques.forEach(e->communauteSavoirConseilEtComiteScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){
if(ListUtil.isNotEmpty(communauteSavoirConseilEtComiteScientifiques)){
communauteSavoirConseilEtComiteScientifiques.forEach(e->communauteSavoirConseilEtComiteScientifiqueDao.save(e));
}
}



}
