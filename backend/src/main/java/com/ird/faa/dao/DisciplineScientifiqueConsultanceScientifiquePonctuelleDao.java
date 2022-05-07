package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueConsultanceScientifiquePonctuelle;


@Repository
public interface DisciplineScientifiqueConsultanceScientifiquePonctuelleDao extends JpaRepository<DisciplineScientifiqueConsultanceScientifiquePonctuelle,Long> {






    List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
