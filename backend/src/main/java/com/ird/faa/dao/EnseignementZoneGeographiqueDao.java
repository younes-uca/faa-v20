package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnseignementZoneGeographique;


@Repository
public interface EnseignementZoneGeographiqueDao extends JpaRepository<EnseignementZoneGeographique,Long> {






    List<EnseignementZoneGeographique> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);
    List<EnseignementZoneGeographique> findByZoneGeographiqueCode(String code);
    int deleteByZoneGeographiqueCode(String code);

    List<EnseignementZoneGeographique> findByZoneGeographiqueId(Long id);

    int deleteByZoneGeographiqueId(Long id);
    List<EnseignementZoneGeographique> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<EnseignementZoneGeographique> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
