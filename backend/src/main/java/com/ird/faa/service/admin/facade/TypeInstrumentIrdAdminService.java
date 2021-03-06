package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeInstrumentIrdAdminService extends AbstractService<TypeInstrumentIrd,Long,TypeInstrumentIrdVo>{


    /**
    * find TypeInstrumentIrd from database by code (reference)
    * @param code - reference of TypeInstrumentIrd
    * @return the founded TypeInstrumentIrd , If no TypeInstrumentIrd were
    *         found in database return  null.
    */
    TypeInstrumentIrd findByCode(String code);

    /**
    * find TypeInstrumentIrd from database by id (PK) or code (reference)
    * @param id - id of TypeInstrumentIrd
    * @param code - reference of TypeInstrumentIrd
    * @return the founded TypeInstrumentIrd , If no TypeInstrumentIrd were
    *         found in database return  null.
    */
    TypeInstrumentIrd findByIdOrCode(TypeInstrumentIrd typeInstrumentIrd);


/**
    * delete TypeInstrumentIrd from database
    * @param id - id of TypeInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete TypeInstrumentIrd from database by code (reference)
    *
    * @param code - reference of TypeInstrumentIrd to be deleted
    * @return 1 if TypeInstrumentIrd deleted successfully
    */
    int deleteByCode(String code);




    TypeInstrumentIrd archiver(TypeInstrumentIrd typeInstrumentIrd) ;
    TypeInstrumentIrd desarchiver(TypeInstrumentIrd typeInstrumentIrd);

}
