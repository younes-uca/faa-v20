package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.PaysRencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysRencontreGrandPubliqueJeunePubliqueChercheurService extends AbstractService<PaysRencontreGrandPubliqueJeunePublique,Long,PaysRencontreGrandPubliqueJeunePubliqueVo>{




/**
    * delete PaysRencontreGrandPubliqueJeunePublique from database
    * @param id - id of PaysRencontreGrandPubliqueJeunePublique to be deleted
    *
    */
    int deleteById(Long id);


    List<PaysRencontreGrandPubliqueJeunePublique> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysRencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<PaysRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);







}
