package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeEntiteAdministrative;
import com.ird.faa.ws.rest.provided.vo.TypeEntiteAdministrativeVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeEntiteAdministrativeAdminService extends AbstractService<TypeEntiteAdministrative,Long,TypeEntiteAdministrativeVo>{


    /**
    * find TypeEntiteAdministrative from database by code (reference)
    * @param code - reference of TypeEntiteAdministrative
    * @return the founded TypeEntiteAdministrative , If no TypeEntiteAdministrative were
    *         found in database return  null.
    */
    TypeEntiteAdministrative findByCode(String code);

    /**
    * find TypeEntiteAdministrative from database by id (PK) or code (reference)
    * @param id - id of TypeEntiteAdministrative
    * @param code - reference of TypeEntiteAdministrative
    * @return the founded TypeEntiteAdministrative , If no TypeEntiteAdministrative were
    *         found in database return  null.
    */
    TypeEntiteAdministrative findByIdOrCode(TypeEntiteAdministrative typeEntiteAdministrative);


/**
    * delete TypeEntiteAdministrative from database
    * @param id - id of TypeEntiteAdministrative to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeEntiteAdministrative from database by code (reference)
    *
    * @param code - reference of TypeEntiteAdministrative to be deleted
    * @return 1 if TypeEntiteAdministrative deleted successfully
    */
    int deleteByCode(String code);




    TypeEntiteAdministrative archiver(TypeEntiteAdministrative typeEntiteAdministrative) ;
    TypeEntiteAdministrative desarchiver(TypeEntiteAdministrative typeEntiteAdministrative);

}
