package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CultureScientifique;


@Repository
public interface CultureScientifiqueDao extends JpaRepository<CultureScientifique,Long> {





    List<CultureScientifique> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<CultureScientifique> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CultureScientifique> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CultureScientifique> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<CultureScientifique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<CultureScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<CultureScientifique> findByNatureActiviteGrandPubliqueCode(String code);
    int deleteByNatureActiviteGrandPubliqueCode(String code);

    List<CultureScientifique> findByNatureActiviteGrandPubliqueId(Long id);

    int deleteByNatureActiviteGrandPubliqueId(Long id);

    List<CultureScientifique> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<CultureScientifique> findByChercheurUsername(String username);

}
