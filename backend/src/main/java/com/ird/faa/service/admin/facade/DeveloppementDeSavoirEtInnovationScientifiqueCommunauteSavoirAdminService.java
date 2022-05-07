package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirAdminService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir,Long,DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
