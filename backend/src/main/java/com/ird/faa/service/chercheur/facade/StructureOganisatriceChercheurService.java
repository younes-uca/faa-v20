package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.StructureOganisatrice;
import com.ird.faa.ws.rest.provided.vo.StructureOganisatriceVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface StructureOganisatriceChercheurService extends AbstractService<StructureOganisatrice,Long,StructureOganisatriceVo>{




/**
    * delete StructureOganisatrice from database
    * @param id - id of StructureOganisatrice to be deleted
    *
    */
    int deleteById(Long id);



    List<StructureOganisatrice> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<StructureOganisatrice> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<StructureOganisatrice> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);







}
