package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.CommunauteSavoirExpertiseScientifique;
import com.ird.faa.bean.CommunauteSavoir;
import com.ird.faa.bean.ExpertiseScientifique;
import com.ird.faa.dao.CommunauteSavoirExpertiseScientifiqueDao;
import com.ird.faa.service.admin.facade.CommunauteSavoirExpertiseScientifiqueAdminService;
import com.ird.faa.service.admin.facade.ExpertiseScientifiqueAdminService;
import com.ird.faa.service.admin.facade.CommunauteSavoirAdminService;

import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirExpertiseScientifiqueVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class CommunauteSavoirExpertiseScientifiqueAdminServiceImpl extends AbstractServiceImpl<CommunauteSavoirExpertiseScientifique> implements CommunauteSavoirExpertiseScientifiqueAdminService {

@Autowired
private CommunauteSavoirExpertiseScientifiqueDao communauteSavoirExpertiseScientifiqueDao;

        @Autowired
        private ExpertiseScientifiqueAdminService expertiseScientifiqueService ;
        @Autowired
        private CommunauteSavoirAdminService communauteSavoirService ;


@Autowired
private EntityManager entityManager;


@Override
public List<CommunauteSavoirExpertiseScientifique> findAll(){
        return communauteSavoirExpertiseScientifiqueDao.findAll();
}

        @Override
        public List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirCode(String code){
        return communauteSavoirExpertiseScientifiqueDao.findByCommunauteSavoirCode(code);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirCode(String code){
        return communauteSavoirExpertiseScientifiqueDao.deleteByCommunauteSavoirCode(code);
        }

        @Override
        public List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirId(Long id){
        return communauteSavoirExpertiseScientifiqueDao.findByCommunauteSavoirId(id);
        }

        @Override
        @Transactional
        public int deleteByCommunauteSavoirId(Long id){
        return communauteSavoirExpertiseScientifiqueDao.deleteByCommunauteSavoirId(id);
        }

        @Override
        public List<CommunauteSavoirExpertiseScientifique> findByExpertiseScientifiqueId(Long id){
        return communauteSavoirExpertiseScientifiqueDao.findByExpertiseScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByExpertiseScientifiqueId(Long id){
        return communauteSavoirExpertiseScientifiqueDao.deleteByExpertiseScientifiqueId(id);
        }


@Override
public CommunauteSavoirExpertiseScientifique findById(Long id){
if(id==null) return null;
return communauteSavoirExpertiseScientifiqueDao.getOne(id);
}

@Override
public CommunauteSavoirExpertiseScientifique findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(communauteSavoirExpertiseScientifiqueDao.findById(id).isPresent())  {
communauteSavoirExpertiseScientifiqueDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public CommunauteSavoirExpertiseScientifique update(CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique){
CommunauteSavoirExpertiseScientifique foundedCommunauteSavoirExpertiseScientifique = findById(communauteSavoirExpertiseScientifique.getId());
if(foundedCommunauteSavoirExpertiseScientifique==null) return null;
else{
return  communauteSavoirExpertiseScientifiqueDao.save(communauteSavoirExpertiseScientifique);
}
}

@Override
public CommunauteSavoirExpertiseScientifique save (CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique){



    findCommunauteSavoir(communauteSavoirExpertiseScientifique);
    findExpertiseScientifique(communauteSavoirExpertiseScientifique);

return communauteSavoirExpertiseScientifiqueDao.save(communauteSavoirExpertiseScientifique);


}

@Override
public List<CommunauteSavoirExpertiseScientifique> save(List<CommunauteSavoirExpertiseScientifique> communauteSavoirExpertiseScientifiques){
List<CommunauteSavoirExpertiseScientifique> list = new ArrayList<>();
for(CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique: communauteSavoirExpertiseScientifiques){
list.add(save(communauteSavoirExpertiseScientifique));
}
return list;
}



@Override
@Transactional
public int delete(CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique){
    if(communauteSavoirExpertiseScientifique.getId()==null) return -1;
    CommunauteSavoirExpertiseScientifique foundedCommunauteSavoirExpertiseScientifique = findById(communauteSavoirExpertiseScientifique.getId());
    if(foundedCommunauteSavoirExpertiseScientifique==null) return -1;
communauteSavoirExpertiseScientifiqueDao.delete(foundedCommunauteSavoirExpertiseScientifique);
return 1;
}


public List<CommunauteSavoirExpertiseScientifique> findByCriteria(CommunauteSavoirExpertiseScientifiqueVo communauteSavoirExpertiseScientifiqueVo){

String query = "SELECT o FROM CommunauteSavoirExpertiseScientifique o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",communauteSavoirExpertiseScientifiqueVo.getId());
    if(communauteSavoirExpertiseScientifiqueVo.getCommunauteSavoirVo()!=null){
        query += SearchUtil.addConstraint( "o", "communauteSavoir.id","=",communauteSavoirExpertiseScientifiqueVo.getCommunauteSavoirVo().getId());
            query += SearchUtil.addConstraint( "o", "communauteSavoir.code","LIKE",communauteSavoirExpertiseScientifiqueVo.getCommunauteSavoirVo().getCode());
    }

    if(communauteSavoirExpertiseScientifiqueVo.getExpertiseScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "expertiseScientifique.id","=",communauteSavoirExpertiseScientifiqueVo.getExpertiseScientifiqueVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findCommunauteSavoir(CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique){
        CommunauteSavoir loadedCommunauteSavoir =communauteSavoirService.findByIdOrCode(communauteSavoirExpertiseScientifique.getCommunauteSavoir());

    if(loadedCommunauteSavoir==null ) {
        return;
    }
    communauteSavoirExpertiseScientifique.setCommunauteSavoir(loadedCommunauteSavoir);
    }
    private void findExpertiseScientifique(CommunauteSavoirExpertiseScientifique communauteSavoirExpertiseScientifique){
        ExpertiseScientifique loadedExpertiseScientifique = null;
        if(communauteSavoirExpertiseScientifique.getExpertiseScientifique() != null && communauteSavoirExpertiseScientifique.getExpertiseScientifique().getId() !=null)
        loadedExpertiseScientifique =expertiseScientifiqueService.findById(communauteSavoirExpertiseScientifique.getExpertiseScientifique().getId());

    if(loadedExpertiseScientifique==null ) {
        return;
    }
    communauteSavoirExpertiseScientifique.setExpertiseScientifique(loadedExpertiseScientifique);
    }

@Override
@Transactional
public void delete(List<CommunauteSavoirExpertiseScientifique> communauteSavoirExpertiseScientifiques){
        if(ListUtil.isNotEmpty(communauteSavoirExpertiseScientifiques)){
        communauteSavoirExpertiseScientifiques.forEach(e->communauteSavoirExpertiseScientifiqueDao.delete(e));
        }
}
@Override
public void update(List<CommunauteSavoirExpertiseScientifique> communauteSavoirExpertiseScientifiques){
if(ListUtil.isNotEmpty(communauteSavoirExpertiseScientifiques)){
communauteSavoirExpertiseScientifiques.forEach(e->communauteSavoirExpertiseScientifiqueDao.save(e));
}
}



}
