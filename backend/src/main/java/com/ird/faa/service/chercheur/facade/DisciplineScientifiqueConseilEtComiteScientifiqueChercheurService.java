package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueConseilEtComiteScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueConseilEtComiteScientifiqueChercheurService extends AbstractService<DisciplineScientifiqueConseilEtComiteScientifique,Long,DisciplineScientifiqueConseilEtComiteScientifiqueVo>{




/**
    * delete DisciplineScientifiqueConseilEtComiteScientifique from database
    * @param id - id of DisciplineScientifiqueConseilEtComiteScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id);

    int deleteByConseilEtComiteScientifiqueId(Long id);







}
