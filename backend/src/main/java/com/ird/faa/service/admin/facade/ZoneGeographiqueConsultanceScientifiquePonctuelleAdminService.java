package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ZoneGeographiqueConsultanceScientifiquePonctuelleAdminService extends AbstractService<ZoneGeographiqueConsultanceScientifiquePonctuelle,Long,ZoneGeographiqueConsultanceScientifiquePonctuelleVo>{




/**
    * delete ZoneGeographiqueConsultanceScientifiquePonctuelle from database
    * @param id - id of ZoneGeographiqueConsultanceScientifiquePonctuelle to be deleted
    *
    */
    int deleteById(Long id);



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
