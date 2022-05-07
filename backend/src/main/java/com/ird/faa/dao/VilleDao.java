package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Ville;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface VilleDao extends JpaRepository<Ville,Long> {



    @Query("SELECT item FROM Ville item ORDER BY item.code ASC")
    List<Ville> findAll();

    Ville findByCode(String code);

    int deleteByCode(String code);

    List<Ville> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<Ville> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
