package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueEnjeuxIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiqueEnjeuxIrdChercheurService extends AbstractService<OutilPedagogiqueEnjeuxIrd,Long,OutilPedagogiqueEnjeuxIrdVo>{




/**
    * delete OutilPedagogiqueEnjeuxIrd from database
    * @param id - id of OutilPedagogiqueEnjeuxIrd to be deleted
    *
    */
    int deleteById(Long id);



    List<OutilPedagogiqueEnjeuxIrd> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);
    List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdCode(String code);

    int deleteByEnjeuxIrdCode(String code);

    List<OutilPedagogiqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);







}
