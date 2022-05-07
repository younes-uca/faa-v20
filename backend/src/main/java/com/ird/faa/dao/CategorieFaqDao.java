package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CategorieFaq;


@Repository
public interface CategorieFaqDao extends JpaRepository<CategorieFaq,Long> {




    CategorieFaq findByOrdre(Integer ordre);

    int deleteByOrdre(Integer ordre);



}
