package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.StatusCursus;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface StatusCursusDao extends JpaRepository<StatusCursus,Long> {



    @Query("SELECT item FROM StatusCursus item ORDER BY item.code ASC")
    List<StatusCursus> findAll();

    StatusCursus findByCode(String code);

    int deleteByCode(String code);



}
