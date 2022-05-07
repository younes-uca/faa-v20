package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilsScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueConseilsScientifiqueAdminService extends AbstractService<DisciplineScientifiqueConseilsScientifique,Long,DisciplineScientifiqueConseilsScientifiqueVo>{




/**
    * delete DisciplineScientifiqueConseilsScientifique from database
    * @param id - id of DisciplineScientifiqueConseilsScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<DisciplineScientifiqueConseilsScientifique> findByConseilsScientifiqueId(Long id);

    int deleteByConseilsScientifiqueId(Long id);
    List<DisciplineScientifiqueConseilsScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueConseilsScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
