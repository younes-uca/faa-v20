package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NiveauEtude;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NiveauEtudeDao extends JpaRepository<NiveauEtude,Long> {



    @Query("SELECT item FROM NiveauEtude item ORDER BY item.code ASC")
    List<NiveauEtude> findAll();

    NiveauEtude findByCode(String code);

    int deleteByCode(String code);



}
