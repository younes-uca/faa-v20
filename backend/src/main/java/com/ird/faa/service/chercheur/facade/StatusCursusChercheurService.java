package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.StatusCursus;
import com.ird.faa.ws.rest.provided.vo.StatusCursusVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface StatusCursusChercheurService extends AbstractService<StatusCursus,Long,StatusCursusVo>{


    /**
    * find StatusCursus from database by code (reference)
    * @param code - reference of StatusCursus
    * @return the founded StatusCursus , If no StatusCursus were
    *         found in database return  null.
    */
    StatusCursus findByCode(String code);

    /**
    * find StatusCursus from database by id (PK) or code (reference)
    * @param id - id of StatusCursus
    * @param code - reference of StatusCursus
    * @return the founded StatusCursus , If no StatusCursus were
    *         found in database return  null.
    */
    StatusCursus findByIdOrCode(StatusCursus statusCursus);


/**
    * delete StatusCursus from database
    * @param id - id of StatusCursus to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete StatusCursus from database by code (reference)
    *
    * @param code - reference of StatusCursus to be deleted
    * @return 1 if StatusCursus deleted successfully
    */
    int deleteByCode(String code);





}
