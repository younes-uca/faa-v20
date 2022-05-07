package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysZoneGeographique;
import com.ird.faa.ws.rest.provided.vo.PaysZoneGeographiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysZoneGeographiqueChercheurService extends AbstractService<PaysZoneGeographique,Long,PaysZoneGeographiqueVo>{




/**
    * delete PaysZoneGeographique from database
    * @param id - id of PaysZoneGeographique to be deleted
    *
    */
    int deleteById(Long id);


    List<PaysZoneGeographique> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysZoneGeographique> findByPaysId(Long id);

    int deleteByPaysId(Long id);
    List<PaysZoneGeographique> findByZoneGeographiqueCode(String code);

    int deleteByZoneGeographiqueCode(String code);

    List<PaysZoneGeographique> findByZoneGeographiqueId(Long id);

    int deleteByZoneGeographiqueId(Long id);







}
