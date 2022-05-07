package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.StatusContratEtConvention;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface StatusContratEtConventionDao extends JpaRepository<StatusContratEtConvention,Long> {



    @Query("SELECT item FROM StatusContratEtConvention item ORDER BY item.code ASC")
    List<StatusContratEtConvention> findAll();

    StatusContratEtConvention findByCode(String code);

    int deleteByCode(String code);



}
