package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliquePeriode;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliquePeriodeVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliquePeriodeAdminService extends AbstractService<RencontreGrandPubliqueJeunePubliquePeriode,Long,RencontreGrandPubliqueJeunePubliquePeriodeVo>{




/**
    * delete RencontreGrandPubliqueJeunePubliquePeriode from database
    * @param id - id of RencontreGrandPubliqueJeunePubliquePeriode to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreGrandPubliqueJeunePubliquePeriode> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);







}
