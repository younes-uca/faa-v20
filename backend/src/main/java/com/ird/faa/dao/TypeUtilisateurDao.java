package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeUtilisateur;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeUtilisateurDao extends JpaRepository<TypeUtilisateur,Long> {



    @Query("SELECT item FROM TypeUtilisateur item ORDER BY item.code ASC")
    List<TypeUtilisateur> findAll();

    TypeUtilisateur findByCode(String code);

    int deleteByCode(String code);



}
