package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Encadrement;


@Repository
public interface EncadrementDao extends JpaRepository<Encadrement,Long> {





    List<Encadrement> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<Encadrement> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<Encadrement> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<Encadrement> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<Encadrement> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<Encadrement> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<Encadrement> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<Encadrement> findByChercheurUsername(String username);

}
