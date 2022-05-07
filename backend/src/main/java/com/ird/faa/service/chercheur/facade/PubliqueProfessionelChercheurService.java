package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.PubliqueProfessionel;
import com.ird.faa.ws.rest.provided.vo.PubliqueProfessionelVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface PubliqueProfessionelChercheurService extends AbstractService<PubliqueProfessionel,Long,PubliqueProfessionelVo>{




/**
    * delete PubliqueProfessionel from database
    * @param id - id of PubliqueProfessionel to be deleted
    *
    */
    int deleteById(Long id);









}
