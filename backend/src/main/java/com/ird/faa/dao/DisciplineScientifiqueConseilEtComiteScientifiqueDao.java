package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DisciplineScientifiqueConseilEtComiteScientifique;


@Repository
public interface DisciplineScientifiqueConseilEtComiteScientifiqueDao extends JpaRepository<DisciplineScientifiqueConseilEtComiteScientifique,Long> {





    List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueConseilEtComiteScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);

    List<DisciplineScientifiqueConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id);

    int deleteByConseilEtComiteScientifiqueId(Long id);


}
