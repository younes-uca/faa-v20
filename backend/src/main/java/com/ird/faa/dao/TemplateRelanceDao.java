package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TemplateRelance;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TemplateRelanceDao extends JpaRepository<TemplateRelance,Long> {



    @Query("SELECT item FROM TemplateRelance item ORDER BY item.code ASC")
    List<TemplateRelance> findAll();

    TemplateRelance findByCode(String code);

    int deleteByCode(String code);



}
