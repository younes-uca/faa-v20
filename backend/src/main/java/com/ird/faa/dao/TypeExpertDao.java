package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeExpert;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeExpertDao extends JpaRepository<TypeExpert,Long> {



    @Query("SELECT item FROM TypeExpert item ORDER BY item.code ASC")
    List<TypeExpert> findAll();

    TypeExpert findByCode(String code);

    int deleteByCode(String code);



}
