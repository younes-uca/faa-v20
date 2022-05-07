package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueEvenementColloqueScientifique;


@Repository
public interface DisciplineScientifiqueEvenementColloqueScientifiqueDao extends JpaRepository<DisciplineScientifiqueEvenementColloqueScientifique,Long> {






    List<DisciplineScientifiqueEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueEvenementColloqueScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
