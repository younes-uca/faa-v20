package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ZoneActiviteInteractionRecherche;


@Repository
public interface ZoneActiviteInteractionRechercheDao extends JpaRepository<ZoneActiviteInteractionRecherche,Long> {





    List<ZoneActiviteInteractionRecherche> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ZoneActiviteInteractionRecherche> findByPaysId(Long id);

    int deleteByPaysId(Long id);
    List<ZoneActiviteInteractionRecherche> findByZoneGeographiqueCode(String code);
    int deleteByZoneGeographiqueCode(String code);

    List<ZoneActiviteInteractionRecherche> findByZoneGeographiqueId(Long id);

    int deleteByZoneGeographiqueId(Long id);
    List<ZoneActiviteInteractionRecherche> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<ZoneActiviteInteractionRecherche> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);


}
