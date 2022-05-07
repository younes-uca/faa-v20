package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ZoneGeographiqueFormationContinue;


@Repository
public interface ZoneGeographiqueFormationContinueDao extends JpaRepository<ZoneGeographiqueFormationContinue,Long> {






    List<ZoneGeographiqueFormationContinue> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);
    List<ZoneGeographiqueFormationContinue> findByZoneGeographiqueCode(String code);
    int deleteByZoneGeographiqueCode(String code);

    List<ZoneGeographiqueFormationContinue> findByZoneGeographiqueId(Long id);

    int deleteByZoneGeographiqueId(Long id);
    List<ZoneGeographiqueFormationContinue> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ZoneGeographiqueFormationContinue> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
