package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinueDisciplineScientifique;


@Repository
public interface FormationContinueDisciplineScientifiqueDao extends JpaRepository<FormationContinueDisciplineScientifique,Long> {






    List<FormationContinueDisciplineScientifique> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);
    List<FormationContinueDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<FormationContinueDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
