package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PubliqueCible;
import com.ird.faa.ws.rest.provided.vo.PubliqueCibleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PubliqueCibleChercheurService extends AbstractService<PubliqueCible,Long,PubliqueCibleVo>{


    /**
    * find PubliqueCible from database by code (reference)
    * @param code - reference of PubliqueCible
    * @return the founded PubliqueCible , If no PubliqueCible were
    *         found in database return  null.
    */
    PubliqueCible findByCode(String code);

    /**
    * find PubliqueCible from database by id (PK) or code (reference)
    * @param id - id of PubliqueCible
    * @param code - reference of PubliqueCible
    * @return the founded PubliqueCible , If no PubliqueCible were
    *         found in database return  null.
    */
    PubliqueCible findByIdOrCode(PubliqueCible publiqueCible);


/**
    * delete PubliqueCible from database
    * @param id - id of PubliqueCible to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete PubliqueCible from database by code (reference)
    *
    * @param code - reference of PubliqueCible to be deleted
    * @return 1 if PubliqueCible deleted successfully
    */
    int deleteByCode(String code);





}
