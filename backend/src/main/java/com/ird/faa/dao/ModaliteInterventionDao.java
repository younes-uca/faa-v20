package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ModaliteIntervention;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ModaliteInterventionDao extends JpaRepository<ModaliteIntervention,Long> {



    @Query("SELECT item FROM ModaliteIntervention item ORDER BY item.code ASC")
    List<ModaliteIntervention> findAll();

    ModaliteIntervention findByCode(String code);

    int deleteByCode(String code);



}
