package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.EtablissementComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.EtablissementComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EtablissementComiteEtCommissionEvaluationChercheurService extends AbstractService<EtablissementComiteEtCommissionEvaluation,Long,EtablissementComiteEtCommissionEvaluationVo>{




/**
    * delete EtablissementComiteEtCommissionEvaluation from database
    * @param id - id of EtablissementComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<EtablissementComiteEtCommissionEvaluation> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<EtablissementComiteEtCommissionEvaluation> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<EtablissementComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);







}
