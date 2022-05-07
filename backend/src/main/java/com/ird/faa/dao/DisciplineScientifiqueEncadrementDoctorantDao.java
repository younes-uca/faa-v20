package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;


@Repository
public interface DisciplineScientifiqueEncadrementDoctorantDao extends JpaRepository<DisciplineScientifiqueEncadrementDoctorant,Long> {






    List<DisciplineScientifiqueEncadrementDoctorant> findByEncadrementDoctorantId(Long id);

    int deleteByEncadrementDoctorantId(Long id);
    List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
