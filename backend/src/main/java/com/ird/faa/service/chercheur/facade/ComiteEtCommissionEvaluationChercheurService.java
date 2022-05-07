package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.ComiteEtCommissionEvaluationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ComiteEtCommissionEvaluationChercheurService extends AbstractService<ComiteEtCommissionEvaluation,Long,ComiteEtCommissionEvaluationVo>{




/**
    * delete ComiteEtCommissionEvaluation from database
    * @param id - id of ComiteEtCommissionEvaluation to be deleted
    *
    */
    int deleteById(Long id);


    List<ComiteEtCommissionEvaluation> findByNatureExpertiseCode(String code);

    int deleteByNatureExpertiseCode(String code);

    List<ComiteEtCommissionEvaluation> findByNatureExpertiseId(Long id);

    int deleteByNatureExpertiseId(Long id);

    List<ComiteEtCommissionEvaluation> findByExpertiseId(Long id);

    int deleteByExpertiseId(Long id);
    List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<ComiteEtCommissionEvaluation> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);




   public List<ComiteEtCommissionEvaluation> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
