package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypePublique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypePubliqueDao extends JpaRepository<TypePublique,Long> {



    @Query("SELECT item FROM TypePublique item ORDER BY item.code ASC")
    List<TypePublique> findAll();

    TypePublique findByCode(String code);

    int deleteByCode(String code);



}
