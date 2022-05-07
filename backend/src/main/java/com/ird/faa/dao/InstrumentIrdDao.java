package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.InstrumentIrd;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface InstrumentIrdDao extends JpaRepository<InstrumentIrd,Long> {



    @Query("SELECT item FROM InstrumentIrd item ORDER BY item.code ASC")
    List<InstrumentIrd> findAll();

    InstrumentIrd findByCode(String code);

    int deleteByCode(String code);

    List<InstrumentIrd> findByTypeInstrumentIrdCode(String code);
    int deleteByTypeInstrumentIrdCode(String code);

    List<InstrumentIrd> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);


}
