package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeSavoir;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeSavoirDao extends JpaRepository<TypeSavoir,Long> {



    @Query("SELECT item FROM TypeSavoir item ORDER BY item.code ASC")
    List<TypeSavoir> findAll();

    TypeSavoir findByCode(String code);

    int deleteByCode(String code);



}
