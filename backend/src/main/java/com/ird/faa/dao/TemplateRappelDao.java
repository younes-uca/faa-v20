package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TemplateRappel;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TemplateRappelDao extends JpaRepository<TemplateRappel,Long> {



    @Query("SELECT item FROM TemplateRappel item ORDER BY item.code ASC")
    List<TemplateRappel> findAll();

    TemplateRappel findByCode(String code);

    int deleteByCode(String code);



}
