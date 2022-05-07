package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Grade;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface GradeDao extends JpaRepository<Grade,Long> {



    @Query("SELECT item FROM Grade item ORDER BY item.code ASC")
    List<Grade> findAll();

    Grade findByCode(String code);

    int deleteByCode(String code);



}
