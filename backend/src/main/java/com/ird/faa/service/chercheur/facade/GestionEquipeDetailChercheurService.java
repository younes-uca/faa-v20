package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.GestionEquipeDetail;
import com.ird.faa.ws.rest.provided.vo.GestionEquipeDetailVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface GestionEquipeDetailChercheurService extends AbstractService<GestionEquipeDetail,Long,GestionEquipeDetailVo>{




/**
    * delete GestionEquipeDetail from database
    * @param id - id of GestionEquipeDetail to be deleted
    *
    */
    int deleteById(Long id);



    List<GestionEquipeDetail> findByGestionEquipeId(Long id);

    int deleteByGestionEquipeId(Long id);







}
