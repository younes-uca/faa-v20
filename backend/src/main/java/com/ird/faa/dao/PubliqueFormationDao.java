package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PubliqueFormation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface PubliqueFormationDao extends JpaRepository<PubliqueFormation,Long> {



    @Query("SELECT item FROM PubliqueFormation item ORDER BY item.code ASC")
    List<PubliqueFormation> findAll();

    PubliqueFormation findByCode(String code);

    int deleteByCode(String code);



}
