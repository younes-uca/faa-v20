package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Pays;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface PaysDao extends JpaRepository<Pays,Long> {



    @Query("SELECT item FROM Pays item ORDER BY item.code ASC")
    List<Pays> findAll();

    Pays findByCode(String code);

    int deleteByCode(String code);



}
