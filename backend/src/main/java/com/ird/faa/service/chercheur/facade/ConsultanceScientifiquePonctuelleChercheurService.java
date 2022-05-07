package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.ConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ConsultanceScientifiquePonctuelleChercheurService extends AbstractService<ConsultanceScientifiquePonctuelle,Long,ConsultanceScientifiquePonctuelleVo>{




/**
    * delete ConsultanceScientifiquePonctuelle from database
    * @param id - id of ConsultanceScientifiquePonctuelle to be deleted
    *
    */
    int deleteById(Long id);


    List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseCode(String code);

    int deleteByTypeExpertiseCode(String code);

    List<ConsultanceScientifiquePonctuelle> findByTypeExpertiseId(Long id);

    int deleteByTypeExpertiseId(Long id);
    List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseCode(String code);

    int deleteByNatureExpertiseCode(String code);

    List<ConsultanceScientifiquePonctuelle> findByNatureExpertiseId(Long id);

    int deleteByNatureExpertiseId(Long id);

    List<ConsultanceScientifiquePonctuelle> findByExpertiseId(Long id);

    int deleteByExpertiseId(Long id);
    List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<ConsultanceScientifiquePonctuelle> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);







}
