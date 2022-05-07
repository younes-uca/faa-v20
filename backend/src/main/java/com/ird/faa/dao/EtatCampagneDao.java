package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtatCampagne;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EtatCampagneDao extends JpaRepository<EtatCampagne,Long> {



    @Query("SELECT item FROM EtatCampagne item ORDER BY item.ordre ASC")
    List<EtatCampagne> findAll();

    EtatCampagne findByCode(String code);

    int deleteByCode(String code);



}
