package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RoleEvaluation;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface RoleEvaluationDao extends JpaRepository<RoleEvaluation,Long> {



    @Query("SELECT item FROM RoleEvaluation item ORDER BY item.code ASC")
    List<RoleEvaluation> findAll();

    RoleEvaluation findByCode(String code);

    int deleteByCode(String code);



}
