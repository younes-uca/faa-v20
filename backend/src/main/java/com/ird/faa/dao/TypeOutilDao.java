package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeOutil;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeOutilDao extends JpaRepository<TypeOutil,Long> {



    @Query("SELECT item FROM TypeOutil item ORDER BY item.code ASC")
    List<TypeOutil> findAll();

    TypeOutil findByCode(String code);

    int deleteByCode(String code);



}
