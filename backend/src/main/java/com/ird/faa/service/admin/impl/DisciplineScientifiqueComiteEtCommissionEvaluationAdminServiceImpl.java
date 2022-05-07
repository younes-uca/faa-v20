package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.dao.DisciplineScientifiqueComiteEtCommissionEvaluationDao;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueComiteEtCommissionEvaluationAdminService;
import com.ird.faa.service.admin.facade.ComiteEtCommissionEvaluationAdminService;
import com.ird.faa.service.admin.facade.DisciplineScientifiqueAdminService;

import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueComiteEtCommissionEvaluationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class DisciplineScientifiqueComiteEtCommissionEvaluationAdminServiceImpl extends AbstractServiceImpl<DisciplineScientifiqueComiteEtCommissionEvaluation> implements DisciplineScientifiqueComiteEtCommissionEvaluationAdminService {

@Autowired
private DisciplineScientifiqueComiteEtCommissionEvaluationDao disciplineScientifiqueComiteEtCommissionEvaluationDao;

        @Autowired
        private ComiteEtCommissionEvaluationAdminService comiteEtCommissionEvaluationService ;
        @Autowired
        private DisciplineScientifiqueAdminService disciplineScientifiqueService ;


@Autowired
private EntityManager entityManager;


@Override
public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findAll(){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.findAll();
}

        @Override
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.findByDisciplineScientifiqueCode(code);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueCode(String code){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.deleteByDisciplineScientifiqueCode(code);
        }

        @Override
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.findByDisciplineScientifiqueId(id);
        }

        @Override
        @Transactional
        public int deleteByDisciplineScientifiqueId(Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.deleteByDisciplineScientifiqueId(id);
        }

        @Override
        public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.findByComiteEtCommissionEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByComiteEtCommissionEvaluationId(Long id){
        return disciplineScientifiqueComiteEtCommissionEvaluationDao.deleteByComiteEtCommissionEvaluationId(id);
        }


@Override
public DisciplineScientifiqueComiteEtCommissionEvaluation findById(Long id){
if(id==null) return null;
return disciplineScientifiqueComiteEtCommissionEvaluationDao.getOne(id);
}

@Override
public DisciplineScientifiqueComiteEtCommissionEvaluation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(disciplineScientifiqueComiteEtCommissionEvaluationDao.findById(id).isPresent())  {
disciplineScientifiqueComiteEtCommissionEvaluationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public DisciplineScientifiqueComiteEtCommissionEvaluation update(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation){
DisciplineScientifiqueComiteEtCommissionEvaluation foundedDisciplineScientifiqueComiteEtCommissionEvaluation = findById(disciplineScientifiqueComiteEtCommissionEvaluation.getId());
if(foundedDisciplineScientifiqueComiteEtCommissionEvaluation==null) return null;
else{
return  disciplineScientifiqueComiteEtCommissionEvaluationDao.save(disciplineScientifiqueComiteEtCommissionEvaluation);
}
}

@Override
public DisciplineScientifiqueComiteEtCommissionEvaluation save (DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation){



    findDisciplineScientifique(disciplineScientifiqueComiteEtCommissionEvaluation);
    findComiteEtCommissionEvaluation(disciplineScientifiqueComiteEtCommissionEvaluation);

return disciplineScientifiqueComiteEtCommissionEvaluationDao.save(disciplineScientifiqueComiteEtCommissionEvaluation);


}

@Override
public List<DisciplineScientifiqueComiteEtCommissionEvaluation> save(List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){
List<DisciplineScientifiqueComiteEtCommissionEvaluation> list = new ArrayList<>();
for(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation: disciplineScientifiqueComiteEtCommissionEvaluations){
list.add(save(disciplineScientifiqueComiteEtCommissionEvaluation));
}
return list;
}



@Override
@Transactional
public int delete(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation){
    if(disciplineScientifiqueComiteEtCommissionEvaluation.getId()==null) return -1;
    DisciplineScientifiqueComiteEtCommissionEvaluation foundedDisciplineScientifiqueComiteEtCommissionEvaluation = findById(disciplineScientifiqueComiteEtCommissionEvaluation.getId());
    if(foundedDisciplineScientifiqueComiteEtCommissionEvaluation==null) return -1;
disciplineScientifiqueComiteEtCommissionEvaluationDao.delete(foundedDisciplineScientifiqueComiteEtCommissionEvaluation);
return 1;
}


public List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByCriteria(DisciplineScientifiqueComiteEtCommissionEvaluationVo disciplineScientifiqueComiteEtCommissionEvaluationVo){

String query = "SELECT o FROM DisciplineScientifiqueComiteEtCommissionEvaluation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",disciplineScientifiqueComiteEtCommissionEvaluationVo.getId());
    if(disciplineScientifiqueComiteEtCommissionEvaluationVo.getDisciplineScientifiqueVo()!=null){
        query += SearchUtil.addConstraint( "o", "disciplineScientifique.id","=",disciplineScientifiqueComiteEtCommissionEvaluationVo.getDisciplineScientifiqueVo().getId());
            query += SearchUtil.addConstraint( "o", "disciplineScientifique.code","LIKE",disciplineScientifiqueComiteEtCommissionEvaluationVo.getDisciplineScientifiqueVo().getCode());
    }

    if(disciplineScientifiqueComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "comiteEtCommissionEvaluation.id","=",disciplineScientifiqueComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findDisciplineScientifique(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation){
        DisciplineScientifique loadedDisciplineScientifique =disciplineScientifiqueService.findByIdOrCode(disciplineScientifiqueComiteEtCommissionEvaluation.getDisciplineScientifique());

    if(loadedDisciplineScientifique==null ) {
        return;
    }
    disciplineScientifiqueComiteEtCommissionEvaluation.setDisciplineScientifique(loadedDisciplineScientifique);
    }
    private void findComiteEtCommissionEvaluation(DisciplineScientifiqueComiteEtCommissionEvaluation disciplineScientifiqueComiteEtCommissionEvaluation){
        ComiteEtCommissionEvaluation loadedComiteEtCommissionEvaluation = null;
        if(disciplineScientifiqueComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation() != null && disciplineScientifiqueComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId() !=null)
        loadedComiteEtCommissionEvaluation =comiteEtCommissionEvaluationService.findById(disciplineScientifiqueComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId());

    if(loadedComiteEtCommissionEvaluation==null ) {
        return;
    }
    disciplineScientifiqueComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(loadedComiteEtCommissionEvaluation);
    }

@Override
@Transactional
public void delete(List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){
        if(ListUtil.isNotEmpty(disciplineScientifiqueComiteEtCommissionEvaluations)){
        disciplineScientifiqueComiteEtCommissionEvaluations.forEach(e->disciplineScientifiqueComiteEtCommissionEvaluationDao.delete(e));
        }
}
@Override
public void update(List<DisciplineScientifiqueComiteEtCommissionEvaluation> disciplineScientifiqueComiteEtCommissionEvaluations){
if(ListUtil.isNotEmpty(disciplineScientifiqueComiteEtCommissionEvaluations)){
disciplineScientifiqueComiteEtCommissionEvaluations.forEach(e->disciplineScientifiqueComiteEtCommissionEvaluationDao.save(e));
}
}



}
