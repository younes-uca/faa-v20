package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabiliteEncadrementDoctorant;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ResponsabiliteEncadrementDoctorantDao extends JpaRepository<ResponsabiliteEncadrementDoctorant,Long> {



    @Query("SELECT item FROM ResponsabiliteEncadrementDoctorant item ORDER BY item.code ASC")
    List<ResponsabiliteEncadrementDoctorant> findAll();

    ResponsabiliteEncadrementDoctorant findByCode(String code);

    int deleteByCode(String code);



}
