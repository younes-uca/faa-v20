package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueComiteEtCommissionEvaluationChercheurService extends AbstractService<DisciplineScientifiqueComiteEtCommissionEvaluation,Long,DisciplineScientifiqueComiteEtCommissionEvaluationVo>{




/**
    * delete DisciplineScientifiqueComiteEtCommissionEvaluation from database
    * @param id - id of DisciplineScientifiqueComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);







}
