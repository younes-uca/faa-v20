package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseEvaluationComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeExpertiseEvaluationComiteEtCommissionEvaluationAdminService extends AbstractService<TypeExpertiseEvaluationComiteEtCommissionEvaluation,Long,TypeExpertiseEvaluationComiteEtCommissionEvaluationVo>{




/**
    * delete TypeExpertiseEvaluationComiteEtCommissionEvaluation from database
    * @param id - id of TypeExpertiseEvaluationComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationCode(String code);

    int deleteByTypeExpertiseEvaluationCode(String code);

    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationId(Long id);

    int deleteByTypeExpertiseEvaluationId(Long id);

    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);







}
