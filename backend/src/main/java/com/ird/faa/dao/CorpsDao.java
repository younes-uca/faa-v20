package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Corps;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CorpsDao extends JpaRepository<Corps,Long> {



    @Query("SELECT item FROM Corps item ORDER BY item.code ASC")
    List<Corps> findAll();

    Corps findByCode(String code);

    int deleteByCode(String code);



}
