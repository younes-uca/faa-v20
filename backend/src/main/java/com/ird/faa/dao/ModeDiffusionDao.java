package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ModeDiffusion;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface ModeDiffusionDao extends JpaRepository<ModeDiffusion,Long> {



    @Query("SELECT item FROM ModeDiffusion item ORDER BY item.code ASC")
    List<ModeDiffusion> findAll();

    ModeDiffusion findByCode(String code);

    int deleteByCode(String code);

    List<ModeDiffusion> findByTypeSavoirCode(String code);
    int deleteByTypeSavoirCode(String code);

    List<ModeDiffusion> findByTypeSavoirId(Long id);

    int deleteByTypeSavoirId(Long id);


}
