package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Institution;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface InstitutionDao extends JpaRepository<Institution,Long> {



    @Query("SELECT item FROM Institution item ORDER BY item.code ASC")
    List<Institution> findAll();

    Institution findByCode(String code);

    int deleteByCode(String code);



}
