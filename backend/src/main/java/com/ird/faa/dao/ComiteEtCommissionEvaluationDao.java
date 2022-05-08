package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ComiteEtCommissionEvaluation;


@Repository
public interface ComiteEtCommissionEvaluationDao extends JpaRepository<ComiteEtCommissionEvaluation,Long> {





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


}
