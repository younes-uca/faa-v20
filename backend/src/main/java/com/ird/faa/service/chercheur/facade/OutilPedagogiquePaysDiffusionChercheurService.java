package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiquePaysDiffusion;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePaysDiffusionVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiquePaysDiffusionChercheurService extends AbstractService<OutilPedagogiquePaysDiffusion,Long,OutilPedagogiquePaysDiffusionVo>{




/**
    * delete OutilPedagogiquePaysDiffusion from database
    * @param id - id of OutilPedagogiquePaysDiffusion to be deleted
    *
    */
    int deleteById(Long id);


    List<OutilPedagogiquePaysDiffusion> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<OutilPedagogiquePaysDiffusion> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<OutilPedagogiquePaysDiffusion> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
