package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.InstrumentIrdComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface InstrumentIrdComiteEtCommissionEvaluationChercheurService extends AbstractService<InstrumentIrdComiteEtCommissionEvaluation,Long,InstrumentIrdComiteEtCommissionEvaluationVo>{




/**
    * delete InstrumentIrdComiteEtCommissionEvaluation from database
    * @param id - id of InstrumentIrdComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<InstrumentIrdComiteEtCommissionEvaluation> findByInstrumentIrdCode(String code);

    int deleteByInstrumentIrdCode(String code);

    List<InstrumentIrdComiteEtCommissionEvaluation> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);
    List<InstrumentIrdComiteEtCommissionEvaluation> findByTypeInstrumentIrdCode(String code);

    int deleteByTypeInstrumentIrdCode(String code);

    List<InstrumentIrdComiteEtCommissionEvaluation> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<InstrumentIrdComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);







}
