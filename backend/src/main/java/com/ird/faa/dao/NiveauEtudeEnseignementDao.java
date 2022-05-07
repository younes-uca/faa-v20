package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.NiveauEtudeEnseignement;


@Repository
public interface NiveauEtudeEnseignementDao extends JpaRepository<NiveauEtudeEnseignement,Long> {





    List<NiveauEtudeEnseignement> findByNiveauEtudeCode(String code);
    int deleteByNiveauEtudeCode(String code);

    List<NiveauEtudeEnseignement> findByNiveauEtudeId(Long id);

    int deleteByNiveauEtudeId(Long id);

    List<NiveauEtudeEnseignement> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);


}
