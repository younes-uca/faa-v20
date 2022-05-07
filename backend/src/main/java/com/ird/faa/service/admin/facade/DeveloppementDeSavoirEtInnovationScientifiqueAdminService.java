package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DeveloppementDeSavoirEtInnovationScientifiqueAdminService extends AbstractService<DeveloppementDeSavoirEtInnovationScientifique,Long,DeveloppementDeSavoirEtInnovationScientifiqueVo>{




/**
    * delete DeveloppementDeSavoirEtInnovationScientifique from database
    * @param id - id of DeveloppementDeSavoirEtInnovationScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirCode(String code);

    int deleteByRoleDeveloppementDeSavoirCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirId(Long id);

    int deleteByRoleDeveloppementDeSavoirId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifique> findBySavoirEtInnovationId(Long id);

    int deleteBySavoirEtInnovationId(Long id);
    List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);







}
