package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypePubliqueCultureScientifique;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueCultureScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypePubliqueCultureScientifiqueAdminService extends AbstractService<TypePubliqueCultureScientifique,Long,TypePubliqueCultureScientifiqueVo>{


    /**
    * find TypePubliqueCultureScientifique from database by code (reference)
    * @param code - reference of TypePubliqueCultureScientifique
    * @return the founded TypePubliqueCultureScientifique , If no TypePubliqueCultureScientifique were
    *         found in database return  null.
    */
    TypePubliqueCultureScientifique findByCode(String code);

    /**
    * find TypePubliqueCultureScientifique from database by id (PK) or code (reference)
    * @param id - id of TypePubliqueCultureScientifique
    * @param code - reference of TypePubliqueCultureScientifique
    * @return the founded TypePubliqueCultureScientifique , If no TypePubliqueCultureScientifique were
    *         found in database return  null.
    */
    TypePubliqueCultureScientifique findByIdOrCode(TypePubliqueCultureScientifique typePubliqueCultureScientifique);


/**
    * delete TypePubliqueCultureScientifique from database
    * @param id - id of TypePubliqueCultureScientifique to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypePubliqueCultureScientifique from database by code (reference)
    *
    * @param code - reference of TypePubliqueCultureScientifique to be deleted
    * @return 1 if TypePubliqueCultureScientifique deleted successfully
    */
    int deleteByCode(String code);




    TypePubliqueCultureScientifique archiver(TypePubliqueCultureScientifique typePubliqueCultureScientifique) ;
    TypePubliqueCultureScientifique desarchiver(TypePubliqueCultureScientifique typePubliqueCultureScientifique);

}
