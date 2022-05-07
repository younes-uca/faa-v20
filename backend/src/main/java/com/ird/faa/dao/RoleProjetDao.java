package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RoleProjet;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface RoleProjetDao extends JpaRepository<RoleProjet,Long> {



    @Query("SELECT item FROM RoleProjet item ORDER BY item.code ASC")
    List<RoleProjet> findAll();

    RoleProjet findByCode(String code);

    int deleteByCode(String code);



}
