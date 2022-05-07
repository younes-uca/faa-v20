package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CaracterisationDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueChercheurService extends AbstractService<CaracterisationDeveloppementDeSavoirEtInnovationScientifique,Long,CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo>{




/**
    * delete CaracterisationDeveloppementDeSavoirEtInnovationScientifique from database
    * @param id - id of CaracterisationDeveloppementDeSavoirEtInnovationScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationCode(String code);

    int deleteByCaracterisationCode(String code);

    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationId(Long id);

    int deleteByCaracterisationId(Long id);

    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
