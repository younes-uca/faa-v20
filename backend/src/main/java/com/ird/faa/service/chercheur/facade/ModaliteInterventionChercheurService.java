package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ModaliteIntervention;
import com.ird.faa.ws.rest.provided.vo.ModaliteInterventionVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ModaliteInterventionChercheurService extends AbstractService<ModaliteIntervention,Long,ModaliteInterventionVo>{


    /**
    * find ModaliteIntervention from database by code (reference)
    * @param code - reference of ModaliteIntervention
    * @return the founded ModaliteIntervention , If no ModaliteIntervention were
    *         found in database return  null.
    */
    ModaliteIntervention findByCode(String code);

    /**
    * find ModaliteIntervention from database by id (PK) or code (reference)
    * @param id - id of ModaliteIntervention
    * @param code - reference of ModaliteIntervention
    * @return the founded ModaliteIntervention , If no ModaliteIntervention were
    *         found in database return  null.
    */
    ModaliteIntervention findByIdOrCode(ModaliteIntervention modaliteIntervention);


/**
    * delete ModaliteIntervention from database
    * @param id - id of ModaliteIntervention to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete ModaliteIntervention from database by code (reference)
    *
    * @param code - reference of ModaliteIntervention to be deleted
    * @return 1 if ModaliteIntervention deleted successfully
    */
    int deleteByCode(String code);





}
