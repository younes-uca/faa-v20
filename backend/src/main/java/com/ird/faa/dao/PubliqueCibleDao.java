package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PubliqueCible;


@Repository
public interface PubliqueCibleDao extends JpaRepository<PubliqueCible,Long> {




    PubliqueCible findByCode(String code);

    int deleteByCode(String code);



}
