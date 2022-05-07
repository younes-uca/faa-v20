package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.AffectationStructurelle;


@Repository
public interface AffectationStructurelleDao extends JpaRepository<AffectationStructurelle,Long> {




    AffectationStructurelle findByCode(String code);

    int deleteByCode(String code);



}
