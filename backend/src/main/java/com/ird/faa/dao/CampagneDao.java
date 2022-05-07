package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Campagne;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface CampagneDao extends JpaRepository<Campagne,Long> {



    @Query("SELECT item FROM Campagne item ORDER BY item.dateDepart ASC")
    List<Campagne> findAll();

    Campagne findByCode(String code);

    int deleteByCode(String code);

    List<Campagne> findByEtatCampagneCode(String code);
    int deleteByEtatCampagneCode(String code);

    List<Campagne> findByEtatCampagneId(Long id);

    int deleteByEtatCampagneId(Long id);
    List<Campagne> findByTemplateOuvertureCode(String code);
    int deleteByTemplateOuvertureCode(String code);

    List<Campagne> findByTemplateOuvertureId(Long id);

    int deleteByTemplateOuvertureId(Long id);
    List<Campagne> findByTemplateClotureCode(String code);
    int deleteByTemplateClotureCode(String code);

    List<Campagne> findByTemplateClotureId(Long id);

    int deleteByTemplateClotureId(Long id);

    List<Campagne> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<Campagne> findByChercheurUsername(String username);

}
