package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;


@Repository
public interface ZoneGeographiqueConsultanceScientifiquePonctuelleDao extends JpaRepository<ZoneGeographiqueConsultanceScientifiquePonctuelle,Long> {






    List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByZoneGeographiqueCode(String code);
    int deleteByZoneGeographiqueCode(String code);

    List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByZoneGeographiqueId(Long id);

    int deleteByZoneGeographiqueId(Long id);
    List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ZoneGeographiqueConsultanceScientifiquePonctuelle> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
