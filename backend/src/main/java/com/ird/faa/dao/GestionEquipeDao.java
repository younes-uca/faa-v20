package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.GestionEquipe;


@Repository
public interface GestionEquipeDao extends JpaRepository<GestionEquipe,Long> {





    List<GestionEquipe> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<GestionEquipe> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<GestionEquipe> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<GestionEquipe> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<GestionEquipe> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<GestionEquipe> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<GestionEquipe> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<GestionEquipe> findByChercheurUsername(String username);

}
