package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;
import com.ird.faa.bean.EnjeuxIrd;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.dao.EnjeuxIrdComiteEtCommissionEvaluationDao;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.EnjeuxIrdChercheurService;

import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdComiteEtCommissionEvaluationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class EnjeuxIrdComiteEtCommissionEvaluationChercheurServiceImpl extends AbstractServiceImpl<EnjeuxIrdComiteEtCommissionEvaluation> implements EnjeuxIrdComiteEtCommissionEvaluationChercheurService {

@Autowired
private EnjeuxIrdComiteEtCommissionEvaluationDao enjeuxIrdComiteEtCommissionEvaluationDao;

        @Autowired
        private ComiteEtCommissionEvaluationChercheurService comiteEtCommissionEvaluationService ;
        @Autowired
        private EnjeuxIrdChercheurService enjeuxIrdService ;


@Autowired
private EntityManager entityManager;


@Override
public List<EnjeuxIrdComiteEtCommissionEvaluation> findAll(){
        return enjeuxIrdComiteEtCommissionEvaluationDao.findAll();
}

        @Override
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdCode(String code){
        return enjeuxIrdComiteEtCommissionEvaluationDao.findByEnjeuxIrdCode(code);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdCode(String code){
        return enjeuxIrdComiteEtCommissionEvaluationDao.deleteByEnjeuxIrdCode(code);
        }

        @Override
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdId(Long id){
        return enjeuxIrdComiteEtCommissionEvaluationDao.findByEnjeuxIrdId(id);
        }

        @Override
        @Transactional
        public int deleteByEnjeuxIrdId(Long id){
        return enjeuxIrdComiteEtCommissionEvaluationDao.deleteByEnjeuxIrdId(id);
        }

        @Override
        public List<EnjeuxIrdComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id){
        return enjeuxIrdComiteEtCommissionEvaluationDao.findByComiteEtCommissionEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByComiteEtCommissionEvaluationId(Long id){
        return enjeuxIrdComiteEtCommissionEvaluationDao.deleteByComiteEtCommissionEvaluationId(id);
        }


@Override
public EnjeuxIrdComiteEtCommissionEvaluation findById(Long id){
if(id==null) return null;
return enjeuxIrdComiteEtCommissionEvaluationDao.getOne(id);
}

@Override
public EnjeuxIrdComiteEtCommissionEvaluation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(enjeuxIrdComiteEtCommissionEvaluationDao.findById(id).isPresent())  {
enjeuxIrdComiteEtCommissionEvaluationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public EnjeuxIrdComiteEtCommissionEvaluation update(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation){
EnjeuxIrdComiteEtCommissionEvaluation foundedEnjeuxIrdComiteEtCommissionEvaluation = findById(enjeuxIrdComiteEtCommissionEvaluation.getId());
if(foundedEnjeuxIrdComiteEtCommissionEvaluation==null) return null;
else{
return  enjeuxIrdComiteEtCommissionEvaluationDao.save(enjeuxIrdComiteEtCommissionEvaluation);
}
}

@Override
public EnjeuxIrdComiteEtCommissionEvaluation save (EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation){



    findEnjeuxIrd(enjeuxIrdComiteEtCommissionEvaluation);
    findComiteEtCommissionEvaluation(enjeuxIrdComiteEtCommissionEvaluation);

return enjeuxIrdComiteEtCommissionEvaluationDao.save(enjeuxIrdComiteEtCommissionEvaluation);


}

@Override
public List<EnjeuxIrdComiteEtCommissionEvaluation> save(List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){
List<EnjeuxIrdComiteEtCommissionEvaluation> list = new ArrayList<>();
for(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation: enjeuxIrdComiteEtCommissionEvaluations){
list.add(save(enjeuxIrdComiteEtCommissionEvaluation));
}
return list;
}



@Override
@Transactional
public int delete(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation){
    if(enjeuxIrdComiteEtCommissionEvaluation.getId()==null) return -1;
    EnjeuxIrdComiteEtCommissionEvaluation foundedEnjeuxIrdComiteEtCommissionEvaluation = findById(enjeuxIrdComiteEtCommissionEvaluation.getId());
    if(foundedEnjeuxIrdComiteEtCommissionEvaluation==null) return -1;
enjeuxIrdComiteEtCommissionEvaluationDao.delete(foundedEnjeuxIrdComiteEtCommissionEvaluation);
return 1;
}


public List<EnjeuxIrdComiteEtCommissionEvaluation> findByCriteria(EnjeuxIrdComiteEtCommissionEvaluationVo enjeuxIrdComiteEtCommissionEvaluationVo){

String query = "SELECT o FROM EnjeuxIrdComiteEtCommissionEvaluation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",enjeuxIrdComiteEtCommissionEvaluationVo.getId());
    if(enjeuxIrdComiteEtCommissionEvaluationVo.getEnjeuxIrdVo()!=null){
        query += SearchUtil.addConstraint( "o", "enjeuxIrd.id","=",enjeuxIrdComiteEtCommissionEvaluationVo.getEnjeuxIrdVo().getId());
            query += SearchUtil.addConstraint( "o", "enjeuxIrd.code","LIKE",enjeuxIrdComiteEtCommissionEvaluationVo.getEnjeuxIrdVo().getCode());
    }

    if(enjeuxIrdComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "comiteEtCommissionEvaluation.id","=",enjeuxIrdComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findEnjeuxIrd(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation){
        EnjeuxIrd loadedEnjeuxIrd =enjeuxIrdService.findByIdOrCode(enjeuxIrdComiteEtCommissionEvaluation.getEnjeuxIrd());

    if(loadedEnjeuxIrd==null ) {
        return;
    }
    enjeuxIrdComiteEtCommissionEvaluation.setEnjeuxIrd(loadedEnjeuxIrd);
    }
    private void findComiteEtCommissionEvaluation(EnjeuxIrdComiteEtCommissionEvaluation enjeuxIrdComiteEtCommissionEvaluation){
        ComiteEtCommissionEvaluation loadedComiteEtCommissionEvaluation = null;
        if(enjeuxIrdComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation() != null && enjeuxIrdComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId() !=null)
        loadedComiteEtCommissionEvaluation =comiteEtCommissionEvaluationService.findById(enjeuxIrdComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId());

    if(loadedComiteEtCommissionEvaluation==null ) {
        return;
    }
    enjeuxIrdComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(loadedComiteEtCommissionEvaluation);
    }

@Override
@Transactional
public void delete(List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){
        if(ListUtil.isNotEmpty(enjeuxIrdComiteEtCommissionEvaluations)){
        enjeuxIrdComiteEtCommissionEvaluations.forEach(e->enjeuxIrdComiteEtCommissionEvaluationDao.delete(e));
        }
}
@Override
public void update(List<EnjeuxIrdComiteEtCommissionEvaluation> enjeuxIrdComiteEtCommissionEvaluations){
if(ListUtil.isNotEmpty(enjeuxIrdComiteEtCommissionEvaluations)){
enjeuxIrdComiteEtCommissionEvaluations.forEach(e->enjeuxIrdComiteEtCommissionEvaluationDao.save(e));
}
}



}
