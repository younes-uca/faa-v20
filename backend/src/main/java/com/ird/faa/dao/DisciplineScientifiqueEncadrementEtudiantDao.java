package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueEncadrementEtudiant;


@Repository
public interface DisciplineScientifiqueEncadrementEtudiantDao extends JpaRepository<DisciplineScientifiqueEncadrementEtudiant,Long> {





    List<DisciplineScientifiqueEncadrementEtudiant> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueEncadrementEtudiant> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueEncadrementEtudiant> findByEncadrementEtudiantId(Long id);

    int deleteByEncadrementEtudiantId(Long id);


}
