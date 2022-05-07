package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TemplateRappel;
import com.ird.faa.ws.rest.provided.vo.TemplateRappelVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TemplateRappelAdminService extends AbstractService<TemplateRappel,Long,TemplateRappelVo>{


    /**
    * find TemplateRappel from database by code (reference)
    * @param code - reference of TemplateRappel
    * @return the founded TemplateRappel , If no TemplateRappel were
    *         found in database return  null.
    */
    TemplateRappel findByCode(String code);

    /**
    * find TemplateRappel from database by id (PK) or code (reference)
    * @param id - id of TemplateRappel
    * @param code - reference of TemplateRappel
    * @return the founded TemplateRappel , If no TemplateRappel were
    *         found in database return  null.
    */
    TemplateRappel findByIdOrCode(TemplateRappel templateRappel);


/**
    * delete TemplateRappel from database
    * @param id - id of TemplateRappel to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TemplateRappel from database by code (reference)
    *
    * @param code - reference of TemplateRappel to be deleted
    * @return 1 if TemplateRappel deleted successfully
    */
    int deleteByCode(String code);




    TemplateRappel archiver(TemplateRappel templateRappel) ;
    TemplateRappel desarchiver(TemplateRappel templateRappel);

}
