package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiqueEtablissementAdminService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement,Long,DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifiqueEtablissement from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifiqueEtablissement to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
