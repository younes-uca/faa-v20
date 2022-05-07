package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NiveauFormation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NiveauFormationDao extends JpaRepository<NiveauFormation,Long> {



    @Query("SELECT item FROM NiveauFormation item ORDER BY item.code ASC")
    List<NiveauFormation> findAll();

    NiveauFormation findByCode(String code);

    int deleteByCode(String code);



}
