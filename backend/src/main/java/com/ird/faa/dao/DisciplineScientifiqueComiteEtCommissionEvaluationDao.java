package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueComiteEtCommissionEvaluation;


@Repository
public interface DisciplineScientifiqueComiteEtCommissionEvaluationDao extends JpaRepository<DisciplineScientifiqueComiteEtCommissionEvaluation,Long> {





    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueComiteEtCommissionEvaluation> findByComiteEtCommissionEvaluationId(Long id);

    int deleteByComiteEtCommissionEvaluationId(Long id);


}
