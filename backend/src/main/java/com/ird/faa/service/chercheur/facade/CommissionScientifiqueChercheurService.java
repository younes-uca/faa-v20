package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CommissionScientifique;
import com.ird.faa.ws.rest.provided.vo.CommissionScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CommissionScientifiqueChercheurService extends AbstractService<CommissionScientifique,Long,CommissionScientifiqueVo>{


    /**
    * find CommissionScientifique from database by code (reference)
    * @param code - reference of CommissionScientifique
    * @return the founded CommissionScientifique , If no CommissionScientifique were
    *         found in database return  null.
    */
    CommissionScientifique findByCode(String code);

    /**
    * find CommissionScientifique from database by id (PK) or code (reference)
    * @param id - id of CommissionScientifique
    * @param code - reference of CommissionScientifique
    * @return the founded CommissionScientifique , If no CommissionScientifique were
    *         found in database return  null.
    */
    CommissionScientifique findByIdOrCode(CommissionScientifique commissionScientifique);


/**
    * delete CommissionScientifique from database
    * @param id - id of CommissionScientifique to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete CommissionScientifique from database by code (reference)
    *
    * @param code - reference of CommissionScientifique to be deleted
    * @return 1 if CommissionScientifique deleted successfully
    */
    int deleteByCode(String code);





}
