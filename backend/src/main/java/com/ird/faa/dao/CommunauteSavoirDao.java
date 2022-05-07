package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoir;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CommunauteSavoirDao extends JpaRepository<CommunauteSavoir,Long> {



    @Query("SELECT item FROM CommunauteSavoir item ORDER BY item.code ASC")
    List<CommunauteSavoir> findAll();

    CommunauteSavoir findByCode(String code);

    int deleteByCode(String code);



}
