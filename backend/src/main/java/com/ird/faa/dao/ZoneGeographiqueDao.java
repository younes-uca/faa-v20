package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ZoneGeographique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ZoneGeographiqueDao extends JpaRepository<ZoneGeographique,Long> {



    @Query("SELECT item FROM ZoneGeographique item ORDER BY item.code ASC")
    List<ZoneGeographique> findAll();

    ZoneGeographique findByCode(String code);

    int deleteByCode(String code);



}
