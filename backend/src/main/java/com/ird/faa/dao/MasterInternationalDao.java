package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.MasterInternational;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface MasterInternationalDao extends JpaRepository<MasterInternational,Long> {



    @Query("SELECT item FROM MasterInternational item ORDER BY item.code ASC")
    List<MasterInternational> findAll();

    MasterInternational findByCode(String code);

    int deleteByCode(String code);



}
