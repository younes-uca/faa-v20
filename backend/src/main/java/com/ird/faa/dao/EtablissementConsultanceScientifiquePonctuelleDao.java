package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;


@Repository
public interface EtablissementConsultanceScientifiquePonctuelleDao extends JpaRepository<EtablissementConsultanceScientifiquePonctuelle,Long> {






    List<EtablissementConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);


}
