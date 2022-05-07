package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NatureActiviteGrandPublique;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface NatureActiviteGrandPubliqueDao extends JpaRepository<NatureActiviteGrandPublique,Long> {



    @Query("SELECT item FROM NatureActiviteGrandPublique item ORDER BY item.code ASC")
    List<NatureActiviteGrandPublique> findAll();

    NatureActiviteGrandPublique findByCode(String code);

    int deleteByCode(String code);



}
