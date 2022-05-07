package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EncadrementEtudiantDisciplineScientifique;


@Repository
public interface EncadrementEtudiantDisciplineScientifiqueDao extends JpaRepository<EncadrementEtudiantDisciplineScientifique,Long> {






    List<EncadrementEtudiantDisciplineScientifique> findByEncadrementEtudiantId(Long id);

    int deleteByEncadrementEtudiantId(Long id);
    List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<EncadrementEtudiantDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
