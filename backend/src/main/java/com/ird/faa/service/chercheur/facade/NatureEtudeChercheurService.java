package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.NatureEtude;
import com.ird.faa.ws.rest.provided.vo.NatureEtudeVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface NatureEtudeChercheurService extends AbstractService<NatureEtude,Long,NatureEtudeVo>{


    /**
    * find NatureEtude from database by code (reference)
    * @param code - reference of NatureEtude
    * @return the founded NatureEtude , If no NatureEtude were
    *         found in database return  null.
    */
    NatureEtude findByCode(String code);

    /**
    * find NatureEtude from database by id (PK) or code (reference)
    * @param id - id of NatureEtude
    * @param code - reference of NatureEtude
    * @return the founded NatureEtude , If no NatureEtude were
    *         found in database return  null.
    */
    NatureEtude findByIdOrCode(NatureEtude natureEtude);


/**
    * delete NatureEtude from database
    * @param id - id of NatureEtude to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete NatureEtude from database by code (reference)
    *
    * @param code - reference of NatureEtude to be deleted
    * @return 1 if NatureEtude deleted successfully
    */
    int deleteByCode(String code);





}
