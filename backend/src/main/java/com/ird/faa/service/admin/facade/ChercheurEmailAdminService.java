package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.ChercheurEmail;
import com.ird.faa.ws.rest.provided.vo.ChercheurEmailVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ChercheurEmailAdminService extends AbstractService<ChercheurEmail,Long,ChercheurEmailVo>{




/**
    * delete ChercheurEmail from database
    * @param id - id of ChercheurEmail to be deleted
    *
    */
    int deleteById(Long id);


    List<ChercheurEmail> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<ChercheurEmail> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);







}
