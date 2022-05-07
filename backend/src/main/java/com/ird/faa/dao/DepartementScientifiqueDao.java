package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DepartementScientifique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface DepartementScientifiqueDao extends JpaRepository<DepartementScientifique,Long> {



    @Query("SELECT item FROM DepartementScientifique item ORDER BY item.code ASC")
    List<DepartementScientifique> findAll();

    DepartementScientifique findByCode(String code);

    int deleteByCode(String code);



}
