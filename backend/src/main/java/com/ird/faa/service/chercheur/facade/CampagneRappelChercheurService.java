package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CampagneRappel;
import com.ird.faa.ws.rest.provided.vo.CampagneRappelVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CampagneRappelChercheurService extends AbstractService<CampagneRappel,Long,CampagneRappelVo>{




/**
    * delete CampagneRappel from database
    * @param id - id of CampagneRappel to be deleted
    *
    */
    int deleteById(Long id);


    List<CampagneRappel> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<CampagneRappel> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CampagneRappel> findByTemplateRappelCode(String code);

    int deleteByTemplateRappelCode(String code);

    List<CampagneRappel> findByTemplateRappelId(Long id);

    int deleteByTemplateRappelId(Long id);







}
