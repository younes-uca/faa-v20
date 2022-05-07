package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiquePaysVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiquePaysChercheurService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifiquePays,Long,DeveloppementDeSavoirEtInnovationScientifiquePaysVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifiquePays from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifiquePays to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
