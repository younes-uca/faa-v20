package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.RoleComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RoleComiteEtCommissionEvaluationAdminService extends AbstractService<RoleComiteEtCommissionEvaluation,Long,RoleComiteEtCommissionEvaluationVo>{




/**
    * delete RoleComiteEtCommissionEvaluation from database
    * @param id - id of RoleComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationCode(String code);

    int deleteByRoleEvaluationCode(String code);

    List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationId(Long id);

    int deleteByRoleEvaluationId(Long id);

    List<RoleComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);







}
