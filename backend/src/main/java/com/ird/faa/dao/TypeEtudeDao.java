package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeEtude;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeEtudeDao extends JpaRepository<TypeEtude,Long> {



    @Query("SELECT item FROM TypeEtude item ORDER BY item.code ASC")
    List<TypeEtude> findAll();

    TypeEtude findByCode(String code);

    int deleteByCode(String code);



}
