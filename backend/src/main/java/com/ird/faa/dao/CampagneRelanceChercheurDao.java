package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CampagneRelanceChercheur;


@Repository
public interface CampagneRelanceChercheurDao extends JpaRepository<CampagneRelanceChercheur,Long> {





    List<CampagneRelanceChercheur> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CampagneRelanceChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);

    List<CampagneRelanceChercheur> findByCampagneRelanceId(Long id);

    int deleteByCampagneRelanceId(Long id);


}
