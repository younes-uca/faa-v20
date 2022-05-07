package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TemplateOuverture;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TemplateOuvertureDao extends JpaRepository<TemplateOuverture,Long> {



    @Query("SELECT item FROM TemplateOuverture item ORDER BY item.code ASC")
    List<TemplateOuverture> findAll();

    TemplateOuverture findByCode(String code);

    int deleteByCode(String code);



}
