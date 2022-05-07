package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.VieInstitutionnelle;


@Repository
public interface VieInstitutionnelleDao extends JpaRepository<VieInstitutionnelle,Long> {





    List<VieInstitutionnelle> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<VieInstitutionnelle> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<VieInstitutionnelle> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<VieInstitutionnelle> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<VieInstitutionnelle> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<VieInstitutionnelle> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<VieInstitutionnelle> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<VieInstitutionnelle> findByChercheurUsername(String username);

}
