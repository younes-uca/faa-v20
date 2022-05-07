package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NatureExpertise;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NatureExpertiseDao extends JpaRepository<NatureExpertise,Long> {



    @Query("SELECT item FROM NatureExpertise item ORDER BY item.code ASC")
    List<NatureExpertise> findAll();

    NatureExpertise findByCode(String code);

    int deleteByCode(String code);



}
