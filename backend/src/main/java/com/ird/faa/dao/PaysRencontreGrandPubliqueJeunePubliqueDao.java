package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;


@Repository
public interface PaysRencontreGrandPubliqueJeunePubliqueDao extends JpaRepository<PaysRencontreGrandPubliqueJeunePublique,Long> {





    List<PaysRencontreGrandPubliqueJeunePublique> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<PaysRencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<PaysRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);


}
