package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.bean.TypeExpertiseEvaluation;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.dao.TypeExpertiseEvaluationComiteEtCommissionEvaluationDao;
import com.ird.faa.service.chercheur.facade.TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.ComiteEtCommissionEvaluationChercheurService;
import com.ird.faa.service.chercheur.facade.TypeExpertiseEvaluationChercheurService;

import com.ird.faa.ws.rest.provided.vo.TypeExpertiseEvaluationComiteEtCommissionEvaluationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurServiceImpl extends AbstractServiceImpl<TypeExpertiseEvaluationComiteEtCommissionEvaluation> implements TypeExpertiseEvaluationComiteEtCommissionEvaluationChercheurService {

@Autowired
private TypeExpertiseEvaluationComiteEtCommissionEvaluationDao typeExpertiseEvaluationComiteEtCommissionEvaluationDao;

        @Autowired
        private ComiteEtCommissionEvaluationChercheurService comiteEtCommissionEvaluationService ;
        @Autowired
        private TypeExpertiseEvaluationChercheurService typeExpertiseEvaluationService ;


@Autowired
private EntityManager entityManager;


@Override
public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findAll(){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.findAll();
}

        @Override
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationCode(String code){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.findByTypeExpertiseEvaluationCode(code);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseEvaluationCode(String code){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.deleteByTypeExpertiseEvaluationCode(code);
        }

        @Override
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationId(Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.findByTypeExpertiseEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByTypeExpertiseEvaluationId(Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.deleteByTypeExpertiseEvaluationId(id);
        }

        @Override
        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.findByComiteEtCommissionEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByComiteEtCommissionEvaluationId(Long id){
        return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.deleteByComiteEtCommissionEvaluationId(id);
        }


@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluation findById(Long id){
if(id==null) return null;
return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.getOne(id);
}

@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(typeExpertiseEvaluationComiteEtCommissionEvaluationDao.findById(id).isPresent())  {
typeExpertiseEvaluationComiteEtCommissionEvaluationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluation update(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation){
TypeExpertiseEvaluationComiteEtCommissionEvaluation foundedTypeExpertiseEvaluationComiteEtCommissionEvaluation = findById(typeExpertiseEvaluationComiteEtCommissionEvaluation.getId());
if(foundedTypeExpertiseEvaluationComiteEtCommissionEvaluation==null) return null;
else{
return  typeExpertiseEvaluationComiteEtCommissionEvaluationDao.save(typeExpertiseEvaluationComiteEtCommissionEvaluation);
}
}

@Override
public TypeExpertiseEvaluationComiteEtCommissionEvaluation save (TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation){



    findTypeExpertiseEvaluation(typeExpertiseEvaluationComiteEtCommissionEvaluation);
    findComiteEtCommissionEvaluation(typeExpertiseEvaluationComiteEtCommissionEvaluation);

return typeExpertiseEvaluationComiteEtCommissionEvaluationDao.save(typeExpertiseEvaluationComiteEtCommissionEvaluation);


}

@Override
public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> save(List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){
List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> list = new ArrayList<>();
for(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation: typeExpertiseEvaluationComiteEtCommissionEvaluations){
list.add(save(typeExpertiseEvaluationComiteEtCommissionEvaluation));
}
return list;
}



@Override
@Transactional
public int delete(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation){
    if(typeExpertiseEvaluationComiteEtCommissionEvaluation.getId()==null) return -1;
    TypeExpertiseEvaluationComiteEtCommissionEvaluation foundedTypeExpertiseEvaluationComiteEtCommissionEvaluation = findById(typeExpertiseEvaluationComiteEtCommissionEvaluation.getId());
    if(foundedTypeExpertiseEvaluationComiteEtCommissionEvaluation==null) return -1;
typeExpertiseEvaluationComiteEtCommissionEvaluationDao.delete(foundedTypeExpertiseEvaluationComiteEtCommissionEvaluation);
return 1;
}


public List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByCriteria(TypeExpertiseEvaluationComiteEtCommissionEvaluationVo typeExpertiseEvaluationComiteEtCommissionEvaluationVo){

String query = "SELECT o FROM TypeExpertiseEvaluationComiteEtCommissionEvaluation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getId());
    if(typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getTypeExpertiseEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "typeExpertiseEvaluation.id","=",typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getTypeExpertiseEvaluationVo().getId());
            query += SearchUtil.addConstraint( "o", "typeExpertiseEvaluation.code","LIKE",typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getTypeExpertiseEvaluationVo().getCode());
    }

    if(typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "comiteEtCommissionEvaluation.id","=",typeExpertiseEvaluationComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findTypeExpertiseEvaluation(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation){
        TypeExpertiseEvaluation loadedTypeExpertiseEvaluation =typeExpertiseEvaluationService.findByIdOrCode(typeExpertiseEvaluationComiteEtCommissionEvaluation.getTypeExpertiseEvaluation());

    if(loadedTypeExpertiseEvaluation==null ) {
        return;
    }
    typeExpertiseEvaluationComiteEtCommissionEvaluation.setTypeExpertiseEvaluation(loadedTypeExpertiseEvaluation);
    }
    private void findComiteEtCommissionEvaluation(TypeExpertiseEvaluationComiteEtCommissionEvaluation typeExpertiseEvaluationComiteEtCommissionEvaluation){
        ComiteEtCommissionEvaluation loadedComiteEtCommissionEvaluation = null;
        if(typeExpertiseEvaluationComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation() != null && typeExpertiseEvaluationComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId() !=null)
        loadedComiteEtCommissionEvaluation =comiteEtCommissionEvaluationService.findById(typeExpertiseEvaluationComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId());

    if(loadedComiteEtCommissionEvaluation==null ) {
        return;
    }
    typeExpertiseEvaluationComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(loadedComiteEtCommissionEvaluation);
    }

@Override
@Transactional
public void delete(List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){
        if(ListUtil.isNotEmpty(typeExpertiseEvaluationComiteEtCommissionEvaluations)){
        typeExpertiseEvaluationComiteEtCommissionEvaluations.forEach(e->typeExpertiseEvaluationComiteEtCommissionEvaluationDao.delete(e));
        }
}
@Override
public void update(List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> typeExpertiseEvaluationComiteEtCommissionEvaluations){
if(ListUtil.isNotEmpty(typeExpertiseEvaluationComiteEtCommissionEvaluations)){
typeExpertiseEvaluationComiteEtCommissionEvaluations.forEach(e->typeExpertiseEvaluationComiteEtCommissionEvaluationDao.save(e));
}
}



}
