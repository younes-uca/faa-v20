package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabiliteDirectionEncadrementEtudiant;


@Repository
public interface ResponsabiliteDirectionEncadrementEtudiantDao extends JpaRepository<ResponsabiliteDirectionEncadrementEtudiant,Long> {




    ResponsabiliteDirectionEncadrementEtudiant findByCode(String code);

    int deleteByCode(String code);



}
