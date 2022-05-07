package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysRencontreMedia;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreMediaVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysRencontreMediaChercheurService extends AbstractService<PaysRencontreMedia,Long,PaysRencontreMediaVo>{




/**
    * delete PaysRencontreMedia from database
    * @param id - id of PaysRencontreMedia to be deleted
    *
    */
    int deleteById(Long id);


    List<PaysRencontreMedia> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysRencontreMedia> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<PaysRencontreMedia> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);







}
