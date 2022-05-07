package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.StatusContratEtConvention;
import com.ird.faa.ws.rest.provided.vo.StatusContratEtConventionVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface StatusContratEtConventionChercheurService extends AbstractService<StatusContratEtConvention,Long,StatusContratEtConventionVo>{


    /**
    * find StatusContratEtConvention from database by code (reference)
    * @param code - reference of StatusContratEtConvention
    * @return the founded StatusContratEtConvention , If no StatusContratEtConvention were
    *         found in database return  null.
    */
    StatusContratEtConvention findByCode(String code);

    /**
    * find StatusContratEtConvention from database by id (PK) or code (reference)
    * @param id - id of StatusContratEtConvention
    * @param code - reference of StatusContratEtConvention
    * @return the founded StatusContratEtConvention , If no StatusContratEtConvention were
    *         found in database return  null.
    */
    StatusContratEtConvention findByIdOrCode(StatusContratEtConvention statusContratEtConvention);


/**
    * delete StatusContratEtConvention from database
    * @param id - id of StatusContratEtConvention to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete StatusContratEtConvention from database by code (reference)
    *
    * @param code - reference of StatusContratEtConvention to be deleted
    * @return 1 if StatusContratEtConvention deleted successfully
    */
    int deleteByCode(String code);





}
