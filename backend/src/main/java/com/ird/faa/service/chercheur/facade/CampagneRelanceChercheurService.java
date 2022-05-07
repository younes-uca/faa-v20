package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CampagneRelance;
import com.ird.faa.ws.rest.provided.vo.CampagneRelanceVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CampagneRelanceChercheurService extends AbstractService<CampagneRelance,Long,CampagneRelanceVo>{




/**
    * delete CampagneRelance from database
    * @param id - id of CampagneRelance to be deleted
    *
    */
    int deleteById(Long id);


    List<CampagneRelance> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<CampagneRelance> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CampagneRelance> findByTemplateRelanceCode(String code);

    int deleteByTemplateRelanceCode(String code);

    List<CampagneRelance> findByTemplateRelanceId(Long id);

    int deleteByTemplateRelanceId(Long id);







}
