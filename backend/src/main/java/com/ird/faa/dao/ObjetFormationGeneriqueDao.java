package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ObjetFormationGenerique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ObjetFormationGeneriqueDao extends JpaRepository<ObjetFormationGenerique,Long> {



    @Query("SELECT item FROM ObjetFormationGenerique item ORDER BY item.code ASC")
    List<ObjetFormationGenerique> findAll();

    ObjetFormationGenerique findByCode(String code);

    int deleteByCode(String code);



}
