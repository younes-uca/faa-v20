package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.StatusProjet;
import com.ird.faa.ws.rest.provided.vo.StatusProjetVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface StatusProjetChercheurService extends AbstractService<StatusProjet,Long,StatusProjetVo>{


    /**
    * find StatusProjet from database by code (reference)
    * @param code - reference of StatusProjet
    * @return the founded StatusProjet , If no StatusProjet were
    *         found in database return  null.
    */
    StatusProjet findByCode(String code);

    /**
    * find StatusProjet from database by id (PK) or code (reference)
    * @param id - id of StatusProjet
    * @param code - reference of StatusProjet
    * @return the founded StatusProjet , If no StatusProjet were
    *         found in database return  null.
    */
    StatusProjet findByIdOrCode(StatusProjet statusProjet);


/**
    * delete StatusProjet from database
    * @param id - id of StatusProjet to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete StatusProjet from database by code (reference)
    *
    * @param code - reference of StatusProjet to be deleted
    * @return 1 if StatusProjet deleted successfully
    */
    int deleteByCode(String code);





}
