package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeEnseignement;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeEnseignementDao extends JpaRepository<TypeEnseignement,Long> {



    @Query("SELECT item FROM TypeEnseignement item ORDER BY item.code ASC")
    List<TypeEnseignement> findAll();

    TypeEnseignement findByCode(String code);

    int deleteByCode(String code);



}
