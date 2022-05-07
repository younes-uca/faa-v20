package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeInstance;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeInstanceDao extends JpaRepository<TypeInstance,Long> {



    @Query("SELECT item FROM TypeInstance item ORDER BY item.code ASC")
    List<TypeInstance> findAll();

    TypeInstance findByCode(String code);

    int deleteByCode(String code);



}
