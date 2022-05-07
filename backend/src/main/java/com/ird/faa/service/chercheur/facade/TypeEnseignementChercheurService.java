package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypeEnseignement;
import com.ird.faa.ws.rest.provided.vo.TypeEnseignementVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeEnseignementChercheurService extends AbstractService<TypeEnseignement,Long,TypeEnseignementVo>{


    /**
    * find TypeEnseignement from database by code (reference)
    * @param code - reference of TypeEnseignement
    * @return the founded TypeEnseignement , If no TypeEnseignement were
    *         found in database return  null.
    */
    TypeEnseignement findByCode(String code);

    /**
    * find TypeEnseignement from database by id (PK) or code (reference)
    * @param id - id of TypeEnseignement
    * @param code - reference of TypeEnseignement
    * @return the founded TypeEnseignement , If no TypeEnseignement were
    *         found in database return  null.
    */
    TypeEnseignement findByIdOrCode(TypeEnseignement typeEnseignement);


/**
    * delete TypeEnseignement from database
    * @param id - id of TypeEnseignement to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeEnseignement from database by code (reference)
    *
    * @param code - reference of TypeEnseignement to be deleted
    * @return 1 if TypeEnseignement deleted successfully
    */
    int deleteByCode(String code);





}
