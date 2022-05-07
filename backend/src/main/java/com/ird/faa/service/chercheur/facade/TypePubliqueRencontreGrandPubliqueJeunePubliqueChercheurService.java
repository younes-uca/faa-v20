package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypePubliqueRencontreGrandPubliqueJeunePubliqueChercheurService extends AbstractService<TypePubliqueRencontreGrandPubliqueJeunePublique,Long,TypePubliqueRencontreGrandPubliqueJeunePubliqueVo>{




/**
    * delete TypePubliqueRencontreGrandPubliqueJeunePublique from database
    * @param id - id of TypePubliqueRencontreGrandPubliqueJeunePublique to be deleted
    *
    */
    int deleteById(Long id);



    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueCode(String code);

    int deleteByTypePubliqueCode(String code);

    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueId(Long id);

    int deleteByTypePubliqueId(Long id);







}
