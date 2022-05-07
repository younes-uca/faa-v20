package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Enseignement;


@Repository
public interface EnseignementDao extends JpaRepository<Enseignement,Long> {





    List<Enseignement> findByModaliteEtudeCode(String code);
    int deleteByModaliteEtudeCode(String code);

    List<Enseignement> findByModaliteEtudeId(Long id);

    int deleteByModaliteEtudeId(Long id);
    List<Enseignement> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<Enseignement> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<Enseignement> findByEnseignementEtFormationId(Long id);

    int deleteByEnseignementEtFormationId(Long id);


}
