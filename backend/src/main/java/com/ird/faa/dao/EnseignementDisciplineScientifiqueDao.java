package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnseignementDisciplineScientifique;


@Repository
public interface EnseignementDisciplineScientifiqueDao extends JpaRepository<EnseignementDisciplineScientifique,Long> {





    List<EnseignementDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<EnseignementDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<EnseignementDisciplineScientifique> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);


}
