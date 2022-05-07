package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreMediaDisciplineScientifique;


@Repository
public interface RencontreMediaDisciplineScientifiqueDao extends JpaRepository<RencontreMediaDisciplineScientifique,Long> {






    List<RencontreMediaDisciplineScientifique> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);
    List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
