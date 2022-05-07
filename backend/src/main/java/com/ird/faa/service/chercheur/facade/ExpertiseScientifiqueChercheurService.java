package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ExpertiseScientifique;
import com.ird.faa.ws.rest.provided.vo.ExpertiseScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ExpertiseScientifiqueChercheurService extends AbstractService<ExpertiseScientifique,Long,ExpertiseScientifiqueVo>{




/**
    * delete ExpertiseScientifique from database
    * @param id - id of ExpertiseScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<ExpertiseScientifique> findByTypeExpertiseCode(String code);

    int deleteByTypeExpertiseCode(String code);

    List<ExpertiseScientifique> findByTypeExpertiseId(Long id);

    int deleteByTypeExpertiseId(Long id);
    List<ExpertiseScientifique> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<ExpertiseScientifique> findByPaysId(Long id);

    int deleteByPaysId(Long id);
    List<ExpertiseScientifique> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<ExpertiseScientifique> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);
    List<ExpertiseScientifique> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<ExpertiseScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<ExpertiseScientifique> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<ExpertiseScientifique> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<ExpertiseScientifique> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<ExpertiseScientifique> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);




   public List<ExpertiseScientifique> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
