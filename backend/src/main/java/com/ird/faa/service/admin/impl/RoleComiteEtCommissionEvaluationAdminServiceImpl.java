package com.ird.faa.service.admin.impl;

import java.util.List;
import java.util.Date;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.bean.RoleEvaluation;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.dao.RoleComiteEtCommissionEvaluationDao;
import com.ird.faa.service.admin.facade.RoleComiteEtCommissionEvaluationAdminService;
import com.ird.faa.service.admin.facade.ComiteEtCommissionEvaluationAdminService;
import com.ird.faa.service.admin.facade.RoleEvaluationAdminService;

import com.ird.faa.ws.rest.provided.vo.RoleComiteEtCommissionEvaluationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class RoleComiteEtCommissionEvaluationAdminServiceImpl extends AbstractServiceImpl<RoleComiteEtCommissionEvaluation> implements RoleComiteEtCommissionEvaluationAdminService {

@Autowired
private RoleComiteEtCommissionEvaluationDao roleComiteEtCommissionEvaluationDao;

        @Autowired
        private ComiteEtCommissionEvaluationAdminService comiteEtCommissionEvaluationService ;
        @Autowired
        private RoleEvaluationAdminService roleEvaluationService ;


@Autowired
private EntityManager entityManager;


@Override
public List<RoleComiteEtCommissionEvaluation> findAll(){
        return roleComiteEtCommissionEvaluationDao.findAll();
}

        @Override
        public List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationCode(String code){
        return roleComiteEtCommissionEvaluationDao.findByRoleEvaluationCode(code);
        }

        @Override
        @Transactional
        public int deleteByRoleEvaluationCode(String code){
        return roleComiteEtCommissionEvaluationDao.deleteByRoleEvaluationCode(code);
        }

        @Override
        public List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationId(Long id){
        return roleComiteEtCommissionEvaluationDao.findByRoleEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByRoleEvaluationId(Long id){
        return roleComiteEtCommissionEvaluationDao.deleteByRoleEvaluationId(id);
        }

        @Override
        public List<RoleComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id){
        return roleComiteEtCommissionEvaluationDao.findByComiteEtCommissionEvaluationId(id);
        }

        @Override
        @Transactional
        public int deleteByComiteEtCommissionEvaluationId(Long id){
        return roleComiteEtCommissionEvaluationDao.deleteByComiteEtCommissionEvaluationId(id);
        }


@Override
public RoleComiteEtCommissionEvaluation findById(Long id){
if(id==null) return null;
return roleComiteEtCommissionEvaluationDao.getOne(id);
}

@Override
public RoleComiteEtCommissionEvaluation findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(roleComiteEtCommissionEvaluationDao.findById(id).isPresent())  {
roleComiteEtCommissionEvaluationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public RoleComiteEtCommissionEvaluation update(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation){
RoleComiteEtCommissionEvaluation foundedRoleComiteEtCommissionEvaluation = findById(roleComiteEtCommissionEvaluation.getId());
if(foundedRoleComiteEtCommissionEvaluation==null) return null;
else{
return  roleComiteEtCommissionEvaluationDao.save(roleComiteEtCommissionEvaluation);
}
}

@Override
public RoleComiteEtCommissionEvaluation save (RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation){



    findRoleEvaluation(roleComiteEtCommissionEvaluation);
    findComiteEtCommissionEvaluation(roleComiteEtCommissionEvaluation);

return roleComiteEtCommissionEvaluationDao.save(roleComiteEtCommissionEvaluation);


}

@Override
public List<RoleComiteEtCommissionEvaluation> save(List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){
List<RoleComiteEtCommissionEvaluation> list = new ArrayList<>();
for(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation: roleComiteEtCommissionEvaluations){
list.add(save(roleComiteEtCommissionEvaluation));
}
return list;
}



@Override
@Transactional
public int delete(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation){
    if(roleComiteEtCommissionEvaluation.getId()==null) return -1;
    RoleComiteEtCommissionEvaluation foundedRoleComiteEtCommissionEvaluation = findById(roleComiteEtCommissionEvaluation.getId());
    if(foundedRoleComiteEtCommissionEvaluation==null) return -1;
roleComiteEtCommissionEvaluationDao.delete(foundedRoleComiteEtCommissionEvaluation);
return 1;
}


public List<RoleComiteEtCommissionEvaluation> findByCriteria(RoleComiteEtCommissionEvaluationVo roleComiteEtCommissionEvaluationVo){

String query = "SELECT o FROM RoleComiteEtCommissionEvaluation o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",roleComiteEtCommissionEvaluationVo.getId());
    if(roleComiteEtCommissionEvaluationVo.getRoleEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "roleEvaluation.id","=",roleComiteEtCommissionEvaluationVo.getRoleEvaluationVo().getId());
            query += SearchUtil.addConstraint( "o", "roleEvaluation.code","LIKE",roleComiteEtCommissionEvaluationVo.getRoleEvaluationVo().getCode());
    }

    if(roleComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo()!=null){
        query += SearchUtil.addConstraint( "o", "comiteEtCommissionEvaluation.id","=",roleComiteEtCommissionEvaluationVo.getComiteEtCommissionEvaluationVo().getId());
    }

return entityManager.createQuery(query).getResultList();
}

    private void findRoleEvaluation(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation){
        RoleEvaluation loadedRoleEvaluation =roleEvaluationService.findByIdOrCode(roleComiteEtCommissionEvaluation.getRoleEvaluation());

    if(loadedRoleEvaluation==null ) {
        return;
    }
    roleComiteEtCommissionEvaluation.setRoleEvaluation(loadedRoleEvaluation);
    }
    private void findComiteEtCommissionEvaluation(RoleComiteEtCommissionEvaluation roleComiteEtCommissionEvaluation){
        ComiteEtCommissionEvaluation loadedComiteEtCommissionEvaluation = null;
        if(roleComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation() != null && roleComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId() !=null)
        loadedComiteEtCommissionEvaluation =comiteEtCommissionEvaluationService.findById(roleComiteEtCommissionEvaluation.getComiteEtCommissionEvaluation().getId());

    if(loadedComiteEtCommissionEvaluation==null ) {
        return;
    }
    roleComiteEtCommissionEvaluation.setComiteEtCommissionEvaluation(loadedComiteEtCommissionEvaluation);
    }

@Override
@Transactional
public void delete(List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){
        if(ListUtil.isNotEmpty(roleComiteEtCommissionEvaluations)){
        roleComiteEtCommissionEvaluations.forEach(e->roleComiteEtCommissionEvaluationDao.delete(e));
        }
}
@Override
public void update(List<RoleComiteEtCommissionEvaluation> roleComiteEtCommissionEvaluations){
if(ListUtil.isNotEmpty(roleComiteEtCommissionEvaluations)){
roleComiteEtCommissionEvaluations.forEach(e->roleComiteEtCommissionEvaluationDao.save(e));
}
}



}
