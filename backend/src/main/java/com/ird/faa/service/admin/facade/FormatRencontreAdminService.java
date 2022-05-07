package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.FormatRencontre;
import com.ird.faa.ws.rest.provided.vo.FormatRencontreVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface FormatRencontreAdminService extends AbstractService<FormatRencontre,Long,FormatRencontreVo>{


    /**
    * find FormatRencontre from database by code (reference)
    * @param code - reference of FormatRencontre
    * @return the founded FormatRencontre , If no FormatRencontre were
    *         found in database return  null.
    */
    FormatRencontre findByCode(String code);

    /**
    * find FormatRencontre from database by id (PK) or code (reference)
    * @param id - id of FormatRencontre
    * @param code - reference of FormatRencontre
    * @return the founded FormatRencontre , If no FormatRencontre were
    *         found in database return  null.
    */
    FormatRencontre findByIdOrCode(FormatRencontre formatRencontre);


/**
    * delete FormatRencontre from database
    * @param id - id of FormatRencontre to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete FormatRencontre from database by code (reference)
    *
    * @param code - reference of FormatRencontre to be deleted
    * @return 1 if FormatRencontre deleted successfully
    */
    int deleteByCode(String code);




    FormatRencontre archiver(FormatRencontre formatRencontre) ;
    FormatRencontre desarchiver(FormatRencontre formatRencontre);

}
