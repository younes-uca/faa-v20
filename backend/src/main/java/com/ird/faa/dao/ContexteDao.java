package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Contexte;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ContexteDao extends JpaRepository<Contexte,Long> {



    @Query("SELECT item FROM Contexte item ORDER BY item.code ASC")
    List<Contexte> findAll();

    Contexte findByCode(String code);

    int deleteByCode(String code);



}
