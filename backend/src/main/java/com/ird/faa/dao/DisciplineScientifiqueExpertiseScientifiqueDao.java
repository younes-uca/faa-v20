package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueExpertiseScientifique;


@Repository
public interface DisciplineScientifiqueExpertiseScientifiqueDao extends JpaRepository<DisciplineScientifiqueExpertiseScientifique,Long> {





    List<DisciplineScientifiqueExpertiseScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueExpertiseScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueExpertiseScientifique> findByExpertiseScientifiqueId(Long id);

    int deleteByExpertiseScientifiqueId(Long id);


}
