package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Nationalite;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NationaliteDao extends JpaRepository<Nationalite,Long> {



    @Query("SELECT item FROM Nationalite item ORDER BY item.code ASC")
    List<Nationalite> findAll();

    Nationalite findByCode(String code);

    int deleteByCode(String code);



}
