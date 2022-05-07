package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionAdminService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion,Long,DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionCode(String code);

    int deleteByModeDiffusionCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionId(Long id);

    int deleteByModeDiffusionId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
