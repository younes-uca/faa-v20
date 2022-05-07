package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreMediaPeriode;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaPeriodeVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreMediaPeriodeAdminService extends AbstractService<RencontreMediaPeriode,Long,RencontreMediaPeriodeVo>{




/**
    * delete RencontreMediaPeriode from database
    * @param id - id of RencontreMediaPeriode to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreMediaPeriode> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);







}
