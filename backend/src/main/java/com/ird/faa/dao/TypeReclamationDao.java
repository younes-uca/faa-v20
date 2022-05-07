package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeReclamation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeReclamationDao extends JpaRepository<TypeReclamation,Long> {



    @Query("SELECT item FROM TypeReclamation item ORDER BY item.code ASC")
    List<TypeReclamation> findAll();

    TypeReclamation findByCode(String code);

    int deleteByCode(String code);



}
