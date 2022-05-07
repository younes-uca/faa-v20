package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NatureEnseignement;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NatureEnseignementDao extends JpaRepository<NatureEnseignement,Long> {



    @Query("SELECT item FROM NatureEnseignement item ORDER BY item.code ASC")
    List<NatureEnseignement> findAll();

    NatureEnseignement findByCode(String code);

    int deleteByCode(String code);



}
