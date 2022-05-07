package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreMediaPeriode;


@Repository
public interface RencontreMediaPeriodeDao extends JpaRepository<RencontreMediaPeriode,Long> {






    List<RencontreMediaPeriode> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);


}
