package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysCommanditaire;
import com.ird.faa.ws.rest.provided.vo.PaysCommanditaireVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysCommanditaireChercheurService extends AbstractService<PaysCommanditaire,Long,PaysCommanditaireVo>{




/**
    * delete PaysCommanditaire from database
    * @param id - id of PaysCommanditaire to be deleted
    *
    */
    int deleteById(Long id);



    List<PaysCommanditaire> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<PaysCommanditaire> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysCommanditaire> findByPaysId(Long id);

    int deleteByPaysId(Long id);







}
