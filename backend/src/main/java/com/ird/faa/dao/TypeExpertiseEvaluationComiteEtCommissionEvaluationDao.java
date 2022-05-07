package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeExpertiseEvaluationComiteEtCommissionEvaluation;


@Repository
public interface TypeExpertiseEvaluationComiteEtCommissionEvaluationDao extends JpaRepository<TypeExpertiseEvaluationComiteEtCommissionEvaluation,Long> {





    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationCode(String code);
    int deleteByTypeExpertiseEvaluationCode(String code);

    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByTypeExpertiseEvaluationId(Long id);

    int deleteByTypeExpertiseEvaluationId(Long id);

    List<TypeExpertiseEvaluationComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);


}
