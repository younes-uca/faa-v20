package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiqueLangue;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueLangueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiqueLangueChercheurService extends AbstractService<OutilPedagogiqueLangue,Long,OutilPedagogiqueLangueVo>{




/**
    * delete OutilPedagogiqueLangue from database
    * @param id - id of OutilPedagogiqueLangue to be deleted
    *
    */
    int deleteById(Long id);


    List<OutilPedagogiqueLangue> findByLangueCode(String code);

    int deleteByLangueCode(String code);

    List<OutilPedagogiqueLangue> findByLangueId(Long id);

    int deleteByLangueId(Long id);

    List<OutilPedagogiqueLangue> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
