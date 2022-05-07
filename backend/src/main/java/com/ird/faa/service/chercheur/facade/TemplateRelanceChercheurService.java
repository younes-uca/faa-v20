package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TemplateRelance;
import com.ird.faa.ws.rest.provided.vo.TemplateRelanceVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TemplateRelanceChercheurService extends AbstractService<TemplateRelance,Long,TemplateRelanceVo>{


    /**
    * find TemplateRelance from database by code (reference)
    * @param code - reference of TemplateRelance
    * @return the founded TemplateRelance , If no TemplateRelance were
    *         found in database return  null.
    */
    TemplateRelance findByCode(String code);

    /**
    * find TemplateRelance from database by id (PK) or code (reference)
    * @param id - id of TemplateRelance
    * @param code - reference of TemplateRelance
    * @return the founded TemplateRelance , If no TemplateRelance were
    *         found in database return  null.
    */
    TemplateRelance findByIdOrCode(TemplateRelance templateRelance);


/**
    * delete TemplateRelance from database
    * @param id - id of TemplateRelance to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TemplateRelance from database by code (reference)
    *
    * @param code - reference of TemplateRelance to be deleted
    * @return 1 if TemplateRelance deleted successfully
    */
    int deleteByCode(String code);





}
