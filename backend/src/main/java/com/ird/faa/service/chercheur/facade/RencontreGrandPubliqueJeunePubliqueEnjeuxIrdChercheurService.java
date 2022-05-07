package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliqueEnjeuxIrdChercheurService extends AbstractService<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd,Long,RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo>{




/**
    * delete RencontreGrandPubliqueJeunePubliqueEnjeuxIrd from database
    * @param id - id of RencontreGrandPubliqueJeunePubliqueEnjeuxIrd to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdCode(String code);

    int deleteByEnjeuxIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);







}
