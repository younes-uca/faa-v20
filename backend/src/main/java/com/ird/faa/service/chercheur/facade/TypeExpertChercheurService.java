package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypeExpert;
import com.ird.faa.ws.rest.provided.vo.TypeExpertVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeExpertChercheurService extends AbstractService<TypeExpert,Long,TypeExpertVo>{


    /**
    * find TypeExpert from database by code (reference)
    * @param code - reference of TypeExpert
    * @return the founded TypeExpert , If no TypeExpert were
    *         found in database return  null.
    */
    TypeExpert findByCode(String code);

    /**
    * find TypeExpert from database by id (PK) or code (reference)
    * @param id - id of TypeExpert
    * @param code - reference of TypeExpert
    * @return the founded TypeExpert , If no TypeExpert were
    *         found in database return  null.
    */
    TypeExpert findByIdOrCode(TypeExpert typeExpert);


/**
    * delete TypeExpert from database
    * @param id - id of TypeExpert to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeExpert from database by code (reference)
    *
    * @param code - reference of TypeExpert to be deleted
    * @return 1 if TypeExpert deleted successfully
    */
    int deleteByCode(String code);





}
