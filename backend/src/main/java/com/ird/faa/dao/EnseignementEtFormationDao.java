package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnseignementEtFormation;


@Repository
public interface EnseignementEtFormationDao extends JpaRepository<EnseignementEtFormation,Long> {





    List<EnseignementEtFormation> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<EnseignementEtFormation> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<EnseignementEtFormation> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<EnseignementEtFormation> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<EnseignementEtFormation> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<EnseignementEtFormation> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);

    List<EnseignementEtFormation> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<EnseignementEtFormation> findByChercheurUsername(String username);

}
