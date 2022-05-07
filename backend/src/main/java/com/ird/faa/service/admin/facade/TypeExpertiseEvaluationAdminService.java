package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeExpertiseEvaluation;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeExpertiseEvaluationAdminService extends AbstractService<TypeExpertiseEvaluation,Long,TypeExpertiseEvaluationVo>{


    /**
    * find TypeExpertiseEvaluation from database by code (reference)
    * @param code - reference of TypeExpertiseEvaluation
    * @return the founded TypeExpertiseEvaluation , If no TypeExpertiseEvaluation were
    *         found in database return  null.
    */
    TypeExpertiseEvaluation findByCode(String code);

    /**
    * find TypeExpertiseEvaluation from database by id (PK) or code (reference)
    * @param id - id of TypeExpertiseEvaluation
    * @param code - reference of TypeExpertiseEvaluation
    * @return the founded TypeExpertiseEvaluation , If no TypeExpertiseEvaluation were
    *         found in database return  null.
    */
    TypeExpertiseEvaluation findByIdOrCode(TypeExpertiseEvaluation typeExpertiseEvaluation);


/**
    * delete TypeExpertiseEvaluation from database
    * @param id - id of TypeExpertiseEvaluation to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeExpertiseEvaluation from database by code (reference)
    *
    * @param code - reference of TypeExpertiseEvaluation to be deleted
    * @return 1 if TypeExpertiseEvaluation deleted successfully
    */
    int deleteByCode(String code);




    TypeExpertiseEvaluation archiver(TypeExpertiseEvaluation typeExpertiseEvaluation) ;
    TypeExpertiseEvaluation desarchiver(TypeExpertiseEvaluation typeExpertiseEvaluation);

}
