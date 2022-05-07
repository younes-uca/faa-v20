package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;


@Repository
public interface TypeInstrumentIrdConsultanceScientifiquePonctuelleDao extends JpaRepository<TypeInstrumentIrdConsultanceScientifiquePonctuelle,Long> {





    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdCode(String code);
    int deleteByTypeInstrumentIrdCode(String code);

    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);


}
