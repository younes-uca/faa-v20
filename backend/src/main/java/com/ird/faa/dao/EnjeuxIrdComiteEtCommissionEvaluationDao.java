package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnjeuxIrdComiteEtCommissionEvaluation;


@Repository
public interface EnjeuxIrdComiteEtCommissionEvaluationDao extends JpaRepository<EnjeuxIrdComiteEtCommissionEvaluation,Long> {





    List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<EnjeuxIrdComiteEtCommissionEvaluation> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<EnjeuxIrdComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);


}
