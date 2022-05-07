package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ModaliteEtude;


@Repository
public interface ModaliteEtudeDao extends JpaRepository<ModaliteEtude,Long> {




    ModaliteEtude findByCode(String code);

    int deleteByCode(String code);



}
