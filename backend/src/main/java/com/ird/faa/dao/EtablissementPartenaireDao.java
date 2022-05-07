package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtablissementPartenaire;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EtablissementPartenaireDao extends JpaRepository<EtablissementPartenaire,Long> {



    @Query("SELECT item FROM EtablissementPartenaire item ORDER BY item.code ASC")
    List<EtablissementPartenaire> findAll();

    EtablissementPartenaire findByCode(String code);

    int deleteByCode(String code);



}
