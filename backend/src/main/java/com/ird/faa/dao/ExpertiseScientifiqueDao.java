package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ExpertiseScientifique;


@Repository
public interface ExpertiseScientifiqueDao extends JpaRepository<ExpertiseScientifique,Long> {





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

    List<ExpertiseScientifique> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<ExpertiseScientifique> findByChercheurUsername(String username);

}
