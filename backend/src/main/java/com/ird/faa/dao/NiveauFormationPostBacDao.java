package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NiveauFormationPostBac;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NiveauFormationPostBacDao extends JpaRepository<NiveauFormationPostBac,Long> {



    @Query("SELECT item FROM NiveauFormationPostBac item ORDER BY item.code ASC")
    List<NiveauFormationPostBac> findAll();

    NiveauFormationPostBac findByCode(String code);

    int deleteByCode(String code);



}
