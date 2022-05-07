package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.Nationalite;
import com.ird.faa.ws.rest.provided.vo.NationaliteVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface NationaliteChercheurService extends AbstractService<Nationalite,Long,NationaliteVo>{


    /**
    * find Nationalite from database by code (reference)
    * @param code - reference of Nationalite
    * @return the founded Nationalite , If no Nationalite were
    *         found in database return  null.
    */
    Nationalite findByCode(String code);

    /**
    * find Nationalite from database by id (PK) or code (reference)
    * @param id - id of Nationalite
    * @param code - reference of Nationalite
    * @return the founded Nationalite , If no Nationalite were
    *         found in database return  null.
    */
    Nationalite findByIdOrCode(Nationalite nationalite);


/**
    * delete Nationalite from database
    * @param id - id of Nationalite to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete Nationalite from database by code (reference)
    *
    * @param code - reference of Nationalite to be deleted
    * @return 1 if Nationalite deleted successfully
    */
    int deleteByCode(String code);





}
