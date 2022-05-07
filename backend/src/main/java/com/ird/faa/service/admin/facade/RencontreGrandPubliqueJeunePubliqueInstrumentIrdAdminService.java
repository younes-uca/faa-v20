package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliqueInstrumentIrdAdminService extends AbstractService<RencontreGrandPubliqueJeunePubliqueInstrumentIrd,Long,RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo>{




/**
    * delete RencontreGrandPubliqueJeunePubliqueInstrumentIrd from database
    * @param id - id of RencontreGrandPubliqueJeunePubliqueInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);


    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdCode(String code);

    int deleteByInstrumentIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);

    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);







}
