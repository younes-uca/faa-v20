package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Modalite;


@Repository
public interface ModaliteDao extends JpaRepository<Modalite,Long> {




    Modalite findByCode(String code);

    int deleteByCode(String code);



}
