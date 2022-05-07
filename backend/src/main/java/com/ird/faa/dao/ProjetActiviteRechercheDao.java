package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRecherche;


@Repository
public interface ProjetActiviteRechercheDao extends JpaRepository<ProjetActiviteRecherche,Long> {





    List<ProjetActiviteRecherche> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<ProjetActiviteRecherche> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<ProjetActiviteRecherche> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<ProjetActiviteRecherche> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<ProjetActiviteRecherche> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<ProjetActiviteRecherche> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);

    List<ProjetActiviteRecherche> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<ProjetActiviteRecherche> findByChercheurUsername(String username);

}
