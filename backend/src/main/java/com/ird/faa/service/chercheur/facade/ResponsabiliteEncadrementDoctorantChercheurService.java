package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ResponsabiliteEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.ResponsabiliteEncadrementDoctorantVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ResponsabiliteEncadrementDoctorantChercheurService extends AbstractService<ResponsabiliteEncadrementDoctorant,Long,ResponsabiliteEncadrementDoctorantVo>{


    /**
    * find ResponsabiliteEncadrementDoctorant from database by code (reference)
    * @param code - reference of ResponsabiliteEncadrementDoctorant
    * @return the founded ResponsabiliteEncadrementDoctorant , If no ResponsabiliteEncadrementDoctorant were
    *         found in database return  null.
    */
    ResponsabiliteEncadrementDoctorant findByCode(String code);

    /**
    * find ResponsabiliteEncadrementDoctorant from database by id (PK) or code (reference)
    * @param id - id of ResponsabiliteEncadrementDoctorant
    * @param code - reference of ResponsabiliteEncadrementDoctorant
    * @return the founded ResponsabiliteEncadrementDoctorant , If no ResponsabiliteEncadrementDoctorant were
    *         found in database return  null.
    */
    ResponsabiliteEncadrementDoctorant findByIdOrCode(ResponsabiliteEncadrementDoctorant responsabiliteEncadrementDoctorant);


/**
    * delete ResponsabiliteEncadrementDoctorant from database
    * @param id - id of ResponsabiliteEncadrementDoctorant to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete ResponsabiliteEncadrementDoctorant from database by code (reference)
    *
    * @param code - reference of ResponsabiliteEncadrementDoctorant to be deleted
    * @return 1 if ResponsabiliteEncadrementDoctorant deleted successfully
    */
    int deleteByCode(String code);





}
