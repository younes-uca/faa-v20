package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;


@Repository
public interface ConsultanceScientifiquePonctuelleDao extends JpaRepository<ConsultanceScientifiquePonctuelle,Long> {





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
