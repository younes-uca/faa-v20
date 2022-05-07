package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEvenementColloqueScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueEvenementColloqueScientifiqueAdminService extends AbstractService<DisciplineScientifiqueEvenementColloqueScientifique,Long,DisciplineScientifiqueEvenementColloqueScientifiqueVo>{




/**
    * delete DisciplineScientifiqueEvenementColloqueScientifique from database
    * @param id - id of DisciplineScientifiqueEvenementColloqueScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<DisciplineScientifiqueEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
