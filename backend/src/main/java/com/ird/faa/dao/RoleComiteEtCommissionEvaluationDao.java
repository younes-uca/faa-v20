package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RoleComiteEtCommissionEvaluation;


@Repository
public interface RoleComiteEtCommissionEvaluationDao extends JpaRepository<RoleComiteEtCommissionEvaluation,Long> {





    List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationCode(String code);
    int deleteByRoleEvaluationCode(String code);

    List<RoleComiteEtCommissionEvaluation> findByRoleEvaluationId(Long id);

    int deleteByRoleEvaluationId(Long id);

    List<RoleComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);


}
