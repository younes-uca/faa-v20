package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;


@Repository
public interface RencontreGrandPubliqueJeunePubliquePeriodeDao extends JpaRepository<RencontreGrandPubliqueJeunePubliquePeriode,Long> {






    List<RencontreGrandPubliqueJeunePubliquePeriode> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);


}
