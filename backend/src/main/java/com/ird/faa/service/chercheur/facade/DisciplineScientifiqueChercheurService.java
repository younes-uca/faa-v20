package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueChercheurService extends AbstractService<DisciplineScientifique,Long,DisciplineScientifiqueVo>{


    /**
    * find DisciplineScientifique from database by code (reference)
    * @param code - reference of DisciplineScientifique
    * @return the founded DisciplineScientifique , If no DisciplineScientifique were
    *         found in database return  null.
    */
    DisciplineScientifique findByCode(String code);

    /**
    * find DisciplineScientifique from database by id (PK) or code (reference)
    * @param id - id of DisciplineScientifique
    * @param code - reference of DisciplineScientifique
    * @return the founded DisciplineScientifique , If no DisciplineScientifique were
    *         found in database return  null.
    */
    DisciplineScientifique findByIdOrCode(DisciplineScientifique disciplineScientifique);


/**
    * delete DisciplineScientifique from database
    * @param id - id of DisciplineScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<DisciplineScientifique> findByDisciplineScientifiqueParentCode(String code);

    int deleteByDisciplineScientifiqueParentCode(String code);

    List<DisciplineScientifique> findByDisciplineScientifiqueParentId(Long id);

    int deleteByDisciplineScientifiqueParentId(Long id);


    /**
    * delete DisciplineScientifique from database by code (reference)
    *
    * @param code - reference of DisciplineScientifique to be deleted
    * @return 1 if DisciplineScientifique deleted successfully
    */
    int deleteByCode(String code);





}
