package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ResponsabilitePedagogiquePays;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiquePaysVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ResponsabilitePedagogiquePaysChercheurService extends AbstractService<ResponsabilitePedagogiquePays,Long,ResponsabilitePedagogiquePaysVo>{




/**
    * delete ResponsabilitePedagogiquePays from database
    * @param id - id of ResponsabilitePedagogiquePays to be deleted
    *
    */
    int deleteById(Long id);


    List<ResponsabilitePedagogiquePays> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<ResponsabilitePedagogiquePays> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<ResponsabilitePedagogiquePays> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);







}
