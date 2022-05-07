package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.dao.EnjeuxIrdConsultanceScientifiquePonctuelleDao;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.ConsultanceScientifiquePonctuelleChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EnjeuxIrdConsultanceScientifiquePonctuelleChercheurServiceImpl extends AbstractServiceImpl<EnjeuxIrdConsultanceScientifiquePonctuelle> implements EnjeuxIrdConsultanceScientifiquePonctuelleChercheurService {

@Autowired
private EnjeuxIrdConsultanceScientifiquePonctuelleDao enjeuxIrdConsultanceScientifiquePonctuelleDao;

        @Autowired
        private ConsultanceScientifiquePonctuelleChercheurService consultanceScientifiquePonctuelleService ;
        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findAll(){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.findAll();
}

        @Override
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdCode(String code){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdId(Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.deleteByEnjeuxIrdId(id);
        }

        @Override
        public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.findByConsultanceScientifiquePonctuelleId(id);
        }

        @Override
        @Transactional
        public int deleteByConsultanceScientifiquePonctuelleId(Long id){
        return enjeuxIrdConsultanceScientifiquePonctuelleDao.deleteByConsultanceScientifiquePonctuelleId(id);
        }


@Override
public EnjeuxIrdConsultanceScientifiquePonctuelle findById(Long id){
if(id==null) return null;
return enjeuxIrdConsultanceScientifiquePonctuelleDao.getOne(id);
}

@Override
public EnjeuxIrdConsultanceScientifiquePonctuelle findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(enjeuxIrdConsultanceScientifiquePonctuelleDao.findById(id).isPresent())  {
enjeuxIrdConsultanceScientifiquePonctuelleDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EnjeuxIrdConsultanceScientifiquePonctuelle update(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle){
EnjeuxIrdConsultanceScientifiquePonctuelle foundedEnjeuxIrdConsultanceScientifiquePonctuelle = findById(enjeuxIrdConsultanceScientifiquePonctuelle.getId());
if(foundedEnjeuxIrdConsultanceScientifiquePonctuelle==null) return null;
else{
return  enjeuxIrdConsultanceScientifiquePonctuelleDao.save(enjeuxIrdConsultanceScientifiquePonctuelle);
}
}

@Override
public EnjeuxIrdConsultanceScientifiquePonctuelle save (EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle){



    findEnjeuxIrd(enjeuxIrdConsultanceScientifiquePonctuelle);
    findConsultanceScientifiquePonctuelle(enjeuxIrdConsultanceScientifiquePonctuelle);

return enjeuxIrdConsultanceScientifiquePonctuelleDao.save(enjeuxIrdConsultanceScientifiquePonctuelle);


}

@Override
public List<EnjeuxIrdConsultanceScientifiquePonctuelle> save(List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){
List<EnjeuxIrdConsultanceScientifiquePonctuelle> list = new ArrayList<>();
for(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle: enjeuxIrdConsultanceScientifiquePonctuelles){
list.add(save(enjeuxIrdConsultanceScientifiquePonctuelle));
}
return list;
}



@Override
@Transactional
public int delete(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle){
    if(enjeuxIrdConsultanceScientifiquePonctuelle.getId()==null) return -1;
    EnjeuxIrdConsultanceScientifiquePonctuelle foundedEnjeuxIrdConsultanceScientifiquePonctuelle = findById(enjeuxIrdConsultanceScientifiquePonctuelle.getId());
    if(foundedEnjeuxIrdConsultanceScientifiquePonctuelle==null) return -1;
enjeuxIrdConsultanceScientifiquePonctuelleDao.delete(foundedEnjeuxIrdConsultanceScientifiquePonctuelle);
return 1;
}


public List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByCriteria(EnjeuxIrdConsultanceScientifiquePonctuelleVo enjeuxIrdConsultanceScientifiquePonctuelleVo){

String query = "SELECT o FROM EnjeuxIrdConsultanceScientifiquePonctuelle o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",enjeuxIrdConsultanceScientifiquePonctuelleVo.getId());
    if(enjeuxIrdConsultanceScientifiquePonctuelleVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",enjeuxIrdConsultanceScientifiquePonctuelleVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",enjeuxIrdConsultanceScientifiquePonctuelleVo.getEnjeuxIrdVo().getCode());
    }

    if(enjeuxIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo()!=null){
        query += SearchUtil.addConstraint( "o", "consultanceScientifiquePonctuelle.id","=",enjeuxIrdConsultanceScientifiquePonctuelleVo.getConsultanceScientifiquePonctuelleVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEnjeuxIrd(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(enjeuxIrdConsultanceScientifiquePonctuelle.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    enjeuxIrdConsultanceScientifiquePonctuelle.setEnjeuxIrd(loadedEnjeuxIrd);
    }
    private void findConsultanceScientifiquePonctuelle(EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle){
        ConsultanceScientifiquePonctuelle loadedConsultanceScientifiquePonctuelle = null;
        if(enjeuxIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle() != null && enjeuxIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId() !=null)
        loadedConsultanceScientifiquePonctuelle =consultanceScientifiquePonctuelleService.findById(enjeuxIrdConsultanceScientifiquePonctuelle.getConsultanceScientifiquePonctuelle().getId());

    if(loadedConsultanceScientifiquePonctuelle==null ) {
        return;
    }
    enjeuxIrdConsultanceScientifiquePonctuelle.setConsultanceScientifiquePonctuelle(loadedConsultanceScientifiquePonctuelle);
    }

@Override
@Transactional
public void delete(List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){
        if(ListUtil.isNotEmpty(enjeuxIrdConsultanceScientifiquePonctuelles)){
        enjeuxIrdConsultanceScientifiquePonctuelles.forEach(e->enjeuxIrdConsultanceScientifiquePonctuelleDao.delete(e));
        }
}
@Override
public void update(List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){
if(ListUtil.isNotEmpty(enjeuxIrdConsultanceScientifiquePonctuelles)){
enjeuxIrdConsultanceScientifiquePonctuelles.forEach(e->enjeuxIrdConsultanceScientifiquePonctuelleDao.save(e));
}
}



}
