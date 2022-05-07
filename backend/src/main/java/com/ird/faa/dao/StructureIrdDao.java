package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.StructureIrd;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface StructureIrdDao extends JpaRepository<StructureIrd,Long> {



    @Query("SELECT item FROM StructureIrd item ORDER BY item.code ASC")
    List<StructureIrd> findAll();

    StructureIrd findByCode(String code);

    int deleteByCode(String code);



}
