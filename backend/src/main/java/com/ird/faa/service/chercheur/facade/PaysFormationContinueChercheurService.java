package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysFormationContinue;
import com.ird.faa.ws.rest.provided.vo.PaysFormationContinueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysFormationContinueChercheurService extends AbstractService<PaysFormationContinue,Long,PaysFormationContinueVo>{




/**
    * delete PaysFormationContinue from database
    * @param id - id of PaysFormationContinue to be deleted
    *
    */
    int deleteById(Long id);



    List<PaysFormationContinue> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);
    List<PaysFormationContinue> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysFormationContinue> findByPaysId(Long id);

    int deleteByPaysId(Long id);







}
