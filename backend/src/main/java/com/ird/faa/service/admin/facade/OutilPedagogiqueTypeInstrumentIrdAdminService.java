package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiqueTypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueTypeInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiqueTypeInstrumentIrdAdminService extends AbstractService<OutilPedagogiqueTypeInstrumentIrd,Long,OutilPedagogiqueTypeInstrumentIrdVo>{




/**
    * delete OutilPedagogiqueTypeInstrumentIrd from database
    * @param id - id of OutilPedagogiqueTypeInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);


    List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(String code);

    int deleteByTypeInstrumentIrdCode(String code);

    List<OutilPedagogiqueTypeInstrumentIrd> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<OutilPedagogiqueTypeInstrumentIrd> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
