package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueErcParent;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueErcParentVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueErcParentAdminService extends AbstractService<DisciplineScientifiqueErcParent,Long,DisciplineScientifiqueErcParentVo>{


    /**
    * find DisciplineScientifiqueErcParent from database by code (reference)
    * @param code - reference of DisciplineScientifiqueErcParent
    * @return the founded DisciplineScientifiqueErcParent , If no DisciplineScientifiqueErcParent were
    *         found in database return  null.
    */
    DisciplineScientifiqueErcParent findByCode(String code);

    /**
    * find DisciplineScientifiqueErcParent from database by id (PK) or code (reference)
    * @param id - id of DisciplineScientifiqueErcParent
    * @param code - reference of DisciplineScientifiqueErcParent
    * @return the founded DisciplineScientifiqueErcParent , If no DisciplineScientifiqueErcParent were
    *         found in database return  null.
    */
    DisciplineScientifiqueErcParent findByIdOrCode(DisciplineScientifiqueErcParent disciplineScientifiqueErcParent);


/**
    * delete DisciplineScientifiqueErcParent from database
    * @param id - id of DisciplineScientifiqueErcParent to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete DisciplineScientifiqueErcParent from database by code (reference)
    *
    * @param code - reference of DisciplineScientifiqueErcParent to be deleted
    * @return 1 if DisciplineScientifiqueErcParent deleted successfully
    */
    int deleteByCode(String code);




    DisciplineScientifiqueErcParent archiver(DisciplineScientifiqueErcParent disciplineScientifiqueErcParent) ;
    DisciplineScientifiqueErcParent desarchiver(DisciplineScientifiqueErcParent disciplineScientifiqueErcParent);

}
