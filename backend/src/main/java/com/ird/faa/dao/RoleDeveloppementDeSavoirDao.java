package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RoleDeveloppementDeSavoir;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface RoleDeveloppementDeSavoirDao extends JpaRepository<RoleDeveloppementDeSavoir,Long> {



    @Query("SELECT item FROM RoleDeveloppementDeSavoir item ORDER BY item.code ASC")
    List<RoleDeveloppementDeSavoir> findAll();

    RoleDeveloppementDeSavoir findByCode(String code);

    int deleteByCode(String code);



}
