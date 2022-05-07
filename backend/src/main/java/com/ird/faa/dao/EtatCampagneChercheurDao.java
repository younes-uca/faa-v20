package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtatCampagneChercheur;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EtatCampagneChercheurDao extends JpaRepository<EtatCampagneChercheur,Long> {



    @Query("SELECT item FROM EtatCampagneChercheur item ORDER BY item.ordre ASC")
    List<EtatCampagneChercheur> findAll();

    EtatCampagneChercheur findByCode(String code);

    int deleteByCode(String code);



}
