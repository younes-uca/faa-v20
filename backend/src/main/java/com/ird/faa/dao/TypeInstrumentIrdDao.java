package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeInstrumentIrd;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface TypeInstrumentIrdDao extends JpaRepository<TypeInstrumentIrd,Long> {



    @Query("SELECT item FROM TypeInstrumentIrd item ORDER BY item.code ASC")
    List<TypeInstrumentIrd> findAll();

    TypeInstrumentIrd findByCode(String code);

    int deleteByCode(String code);



}
