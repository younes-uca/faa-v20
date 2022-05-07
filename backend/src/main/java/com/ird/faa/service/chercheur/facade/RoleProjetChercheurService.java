package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.RoleProjet;
import com.ird.faa.ws.rest.provided.vo.RoleProjetVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RoleProjetChercheurService extends AbstractService<RoleProjet,Long,RoleProjetVo>{


    /**
    * find RoleProjet from database by code (reference)
    * @param code - reference of RoleProjet
    * @return the founded RoleProjet , If no RoleProjet were
    *         found in database return  null.
    */
    RoleProjet findByCode(String code);

    /**
    * find RoleProjet from database by id (PK) or code (reference)
    * @param id - id of RoleProjet
    * @param code - reference of RoleProjet
    * @return the founded RoleProjet , If no RoleProjet were
    *         found in database return  null.
    */
    RoleProjet findByIdOrCode(RoleProjet roleProjet);


/**
    * delete RoleProjet from database
    * @param id - id of RoleProjet to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete RoleProjet from database by code (reference)
    *
    * @param code - reference of RoleProjet to be deleted
    * @return 1 if RoleProjet deleted successfully
    */
    int deleteByCode(String code);





}
