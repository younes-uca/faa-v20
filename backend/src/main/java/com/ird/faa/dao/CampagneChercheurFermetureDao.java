package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CampagneChercheurFermeture;


@Repository
public interface CampagneChercheurFermetureDao extends JpaRepository<CampagneChercheurFermeture,Long> {





    List<CampagneChercheurFermeture> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CampagneChercheurFermeture> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<CampagneChercheurFermeture> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<CampagneChercheurFermeture> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);


}
