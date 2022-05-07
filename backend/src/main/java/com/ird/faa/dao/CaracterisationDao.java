package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Caracterisation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CaracterisationDao extends JpaRepository<Caracterisation,Long> {



    @Query("SELECT item FROM Caracterisation item ORDER BY item.code ASC")
    List<Caracterisation> findAll();

    Caracterisation findByCode(String code);

    int deleteByCode(String code);



}
