package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.Institution;
import com.ird.faa.ws.rest.provided.vo.InstitutionVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface InstitutionChercheurService extends AbstractService<Institution,Long,InstitutionVo>{


    /**
    * find Institution from database by code (reference)
    * @param code - reference of Institution
    * @return the founded Institution , If no Institution were
    *         found in database return  null.
    */
    Institution findByCode(String code);

    /**
    * find Institution from database by id (PK) or code (reference)
    * @param id - id of Institution
    * @param code - reference of Institution
    * @return the founded Institution , If no Institution were
    *         found in database return  null.
    */
    Institution findByIdOrCode(Institution institution);


/**
    * delete Institution from database
    * @param id - id of Institution to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete Institution from database by code (reference)
    *
    * @param code - reference of Institution to be deleted
    * @return 1 if Institution deleted successfully
    */
    int deleteByCode(String code);





}
