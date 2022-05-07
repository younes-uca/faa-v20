package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.NiveauResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.vo.NiveauResponsabilitePedagogiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface NiveauResponsabilitePedagogiqueChercheurService extends AbstractService<NiveauResponsabilitePedagogique,Long,NiveauResponsabilitePedagogiqueVo>{


    /**
    * find NiveauResponsabilitePedagogique from database by code (reference)
    * @param code - reference of NiveauResponsabilitePedagogique
    * @return the founded NiveauResponsabilitePedagogique , If no NiveauResponsabilitePedagogique were
    *         found in database return  null.
    */
    NiveauResponsabilitePedagogique findByCode(String code);

    /**
    * find NiveauResponsabilitePedagogique from database by id (PK) or code (reference)
    * @param id - id of NiveauResponsabilitePedagogique
    * @param code - reference of NiveauResponsabilitePedagogique
    * @return the founded NiveauResponsabilitePedagogique , If no NiveauResponsabilitePedagogique were
    *         found in database return  null.
    */
    NiveauResponsabilitePedagogique findByIdOrCode(NiveauResponsabilitePedagogique niveauResponsabilitePedagogique);


/**
    * delete NiveauResponsabilitePedagogique from database
    * @param id - id of NiveauResponsabilitePedagogique to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete NiveauResponsabilitePedagogique from database by code (reference)
    *
    * @param code - reference of NiveauResponsabilitePedagogique to be deleted
    * @return 1 if NiveauResponsabilitePedagogique deleted successfully
    */
    int deleteByCode(String code);





}
