package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Expertise;


@Repository
public interface ExpertiseDao extends JpaRepository<Expertise,Long> {





    List<Expertise> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<Expertise> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<Expertise> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<Expertise> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<Expertise> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<Expertise> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);

    List<Expertise> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<Expertise> findByChercheurUsername(String username);

}
