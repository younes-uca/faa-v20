package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;


@Repository
public interface InstrumentIrdConsultanceScientifiquePonctuelleDao extends JpaRepository<InstrumentIrdConsultanceScientifiquePonctuelle,Long> {






    List<InstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdCode(String code);
    int deleteByInstrumentIrdCode(String code);

    List<InstrumentIrdConsultanceScientifiquePonctuelle> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);


}
