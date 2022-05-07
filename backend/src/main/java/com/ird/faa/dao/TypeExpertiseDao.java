package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeExpertise;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeExpertiseDao extends JpaRepository<TypeExpertise,Long> {



    @Query("SELECT item FROM TypeExpertise item ORDER BY item.code ASC")
    List<TypeExpertise> findAll();

    TypeExpertise findByCode(String code);

    int deleteByCode(String code);



}
