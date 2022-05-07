package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Commanditaire;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CommanditaireDao extends JpaRepository<Commanditaire,Long> {



    @Query("SELECT item FROM Commanditaire item ORDER BY item.code ASC")
    List<Commanditaire> findAll();

    Commanditaire findByCode(String code);

    int deleteByCode(String code);

    List<Commanditaire> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<Commanditaire> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
