package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueAdminService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique,Long,DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);







}
