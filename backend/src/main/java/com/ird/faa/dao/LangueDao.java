package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Langue;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface LangueDao extends JpaRepository<Langue,Long> {



    @Query("SELECT item FROM Langue item ORDER BY item.code ASC")
    List<Langue> findAll();

    Langue findByCode(String code);

    int deleteByCode(String code);



}
