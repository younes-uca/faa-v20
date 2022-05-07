package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PubliqueProfessionel;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface PubliqueProfessionelDao extends JpaRepository<PubliqueProfessionel,Long> {



    @Query("SELECT item FROM PubliqueProfessionel item ORDER BY item.code ASC")
    List<PubliqueProfessionel> findAll();




}
