package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CampagneRappelChercheur;


@Repository
public interface CampagneRappelChercheurDao extends JpaRepository<CampagneRappelChercheur,Long> {





    List<CampagneRappelChercheur> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CampagneRappelChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);

    List<CampagneRappelChercheur> findByCampagneRappelId(Long id);

    int deleteByCampagneRappelId(Long id);


}
