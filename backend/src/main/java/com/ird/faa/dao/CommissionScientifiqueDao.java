package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommissionScientifique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CommissionScientifiqueDao extends JpaRepository<CommissionScientifique,Long> {



    @Query("SELECT item FROM CommissionScientifique item ORDER BY item.code ASC")
    List<CommissionScientifique> findAll();

    CommissionScientifique findByCode(String code);

    int deleteByCode(String code);



}
