package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ResponsabilitePedagogiqueEtablissement;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueEtablissementVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ResponsabilitePedagogiqueEtablissementChercheurService extends AbstractService<ResponsabilitePedagogiqueEtablissement,Long,ResponsabilitePedagogiqueEtablissementVo>{




/**
    * delete ResponsabilitePedagogiqueEtablissement from database
    * @param id - id of ResponsabilitePedagogiqueEtablissement to be deleted
    *
    */
    int deleteById(Long id);


    List<ResponsabilitePedagogiqueEtablissement> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<ResponsabilitePedagogiqueEtablissement> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<ResponsabilitePedagogiqueEtablissement> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);
    List<ResponsabilitePedagogiqueEtablissement> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<ResponsabilitePedagogiqueEtablissement> findByPaysId(Long id);

    int deleteByPaysId(Long id);







}
