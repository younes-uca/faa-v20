package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NatureEtude;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NatureEtudeDao extends JpaRepository<NatureEtude,Long> {



    @Query("SELECT item FROM NatureEtude item ORDER BY item.code ASC")
    List<NatureEtude> findAll();

    NatureEtude findByCode(String code);

    int deleteByCode(String code);



}
