package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.ConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.ConseilsScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ConseilsScientifiqueAdminService extends AbstractService<ConseilsScientifique,Long,ConseilsScientifiqueVo>{




/**
    * delete ConseilsScientifique from database
    * @param id - id of ConseilsScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<ConseilsScientifique> findByNatureExpertiseCode(String code);

    int deleteByNatureExpertiseCode(String code);

    List<ConseilsScientifique> findByNatureExpertiseId(Long id);

    int deleteByNatureExpertiseId(Long id);
    List<ConseilsScientifique> findByTypeExpertiseCode(String code);

    int deleteByTypeExpertiseCode(String code);

    List<ConseilsScientifique> findByTypeExpertiseId(Long id);

    int deleteByTypeExpertiseId(Long id);

    List<ConseilsScientifique> findByExpertiseId(Long id);

    int deleteByExpertiseId(Long id);
    List<ConseilsScientifique> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<ConseilsScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);







}
