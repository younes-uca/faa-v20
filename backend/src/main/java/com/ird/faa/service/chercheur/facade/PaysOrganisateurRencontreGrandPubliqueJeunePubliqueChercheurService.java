package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PaysOrganisateurRencontreGrandPubliqueJeunePubliqueChercheurService extends AbstractService<PaysOrganisateurRencontreGrandPubliqueJeunePublique,Long,PaysOrganisateurRencontreGrandPubliqueJeunePubliqueVo>{




/**
    * delete PaysOrganisateurRencontreGrandPubliqueJeunePublique from database
    * @param id - id of PaysOrganisateurRencontreGrandPubliqueJeunePublique to be deleted
    *
    */
    int deleteById(Long id);



    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);







}
