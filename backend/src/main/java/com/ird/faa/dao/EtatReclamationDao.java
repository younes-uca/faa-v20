package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtatReclamation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EtatReclamationDao extends JpaRepository<EtatReclamation,Long> {



    @Query("SELECT item FROM EtatReclamation item ORDER BY item.ordre ASC")
    List<EtatReclamation> findAll();

    EtatReclamation findByCode(String code);

    int deleteByCode(String code);



}
