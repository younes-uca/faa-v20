package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeReclamation;
import com.ird.faa.ws.rest.provided.vo.TypeReclamationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeReclamationAdminService extends AbstractService<TypeReclamation,Long,TypeReclamationVo>{


    /**
    * find TypeReclamation from database by code (reference)
    * @param code - reference of TypeReclamation
    * @return the founded TypeReclamation , If no TypeReclamation were
    *         found in database return  null.
    */
    TypeReclamation findByCode(String code);

    /**
    * find TypeReclamation from database by id (PK) or code (reference)
    * @param id - id of TypeReclamation
    * @param code - reference of TypeReclamation
    * @return the founded TypeReclamation , If no TypeReclamation were
    *         found in database return  null.
    */
    TypeReclamation findByIdOrCode(TypeReclamation typeReclamation);


/**
    * delete TypeReclamation from database
    * @param id - id of TypeReclamation to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeReclamation from database by code (reference)
    *
    * @param code - reference of TypeReclamation to be deleted
    * @return 1 if TypeReclamation deleted successfully
    */
    int deleteByCode(String code);




    TypeReclamation archiver(TypeReclamation typeReclamation) ;
    TypeReclamation desarchiver(TypeReclamation typeReclamation);

}
