package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypePubliqueCultureScientifique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypePubliqueCultureScientifiqueDao extends JpaRepository<TypePubliqueCultureScientifique,Long> {



    @Query("SELECT item FROM TypePubliqueCultureScientifique item ORDER BY item.code ASC")
    List<TypePubliqueCultureScientifique> findAll();

    TypePubliqueCultureScientifique findByCode(String code);

    int deleteByCode(String code);



}
