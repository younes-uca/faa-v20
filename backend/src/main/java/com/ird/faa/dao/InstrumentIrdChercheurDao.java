package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.InstrumentIrdChercheur;


@Repository
public interface InstrumentIrdChercheurDao extends JpaRepository<InstrumentIrdChercheur,Long> {





    List<InstrumentIrdChercheur> findByInstrumentIrdCode(String code);
    int deleteByInstrumentIrdCode(String code);

    List<InstrumentIrdChercheur> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);
    List<InstrumentIrdChercheur> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<InstrumentIrdChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);


}
