package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TemplateCloture;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TemplateClotureDao extends JpaRepository<TemplateCloture,Long> {



    @Query("SELECT item FROM TemplateCloture item ORDER BY item.code ASC")
    List<TemplateCloture> findAll();

    TemplateCloture findByCode(String code);

    int deleteByCode(String code);



}
