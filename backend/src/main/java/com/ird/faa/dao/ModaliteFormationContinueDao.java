package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ModaliteFormationContinue;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ModaliteFormationContinueDao extends JpaRepository<ModaliteFormationContinue,Long> {



    @Query("SELECT item FROM ModaliteFormationContinue item ORDER BY item.code ASC")
    List<ModaliteFormationContinue> findAll();

    ModaliteFormationContinue findByCode(String code);

    int deleteByCode(String code);



}
