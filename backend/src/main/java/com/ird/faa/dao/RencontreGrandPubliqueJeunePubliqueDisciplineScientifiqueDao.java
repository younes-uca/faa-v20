package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;


@Repository
public interface RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueDao extends JpaRepository<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique,Long> {






    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
