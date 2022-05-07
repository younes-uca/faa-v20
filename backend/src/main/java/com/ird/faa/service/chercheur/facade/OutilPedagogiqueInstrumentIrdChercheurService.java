package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiqueInstrumentIrdChercheurService extends AbstractService<OutilPedagogiqueInstrumentIrd,Long,OutilPedagogiqueInstrumentIrdVo>{




/**
    * delete OutilPedagogiqueInstrumentIrd from database
    * @param id - id of OutilPedagogiqueInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);


    List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdCode(String code);

    int deleteByInstrumentIrdCode(String code);

    List<OutilPedagogiqueInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);

    List<OutilPedagogiqueInstrumentIrd> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
