package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.StatusProjet;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface StatusProjetDao extends JpaRepository<StatusProjet,Long> {



    @Query("SELECT item FROM StatusProjet item ORDER BY item.code ASC")
    List<StatusProjet> findAll();

    StatusProjet findByCode(String code);

    int deleteByCode(String code);



}
