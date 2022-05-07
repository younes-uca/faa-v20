package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NiveauResponsabilitePedagogique;


@Repository
public interface NiveauResponsabilitePedagogiqueDao extends JpaRepository<NiveauResponsabilitePedagogique,Long> {




    NiveauResponsabilitePedagogique findByCode(String code);

    int deleteByCode(String code);



}
