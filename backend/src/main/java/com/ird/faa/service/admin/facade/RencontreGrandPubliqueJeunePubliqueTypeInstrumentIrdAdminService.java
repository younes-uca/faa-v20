package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdAdminService extends AbstractService<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd,Long,RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdVo>{




/**
    * delete RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd from database
    * @param id - id of RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);


    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(String code);

    int deleteByTypeInstrumentIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);







}
