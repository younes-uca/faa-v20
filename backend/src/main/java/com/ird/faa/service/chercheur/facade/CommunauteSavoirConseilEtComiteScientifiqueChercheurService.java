package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirConseilEtComiteScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CommunauteSavoirConseilEtComiteScientifiqueChercheurService extends AbstractService<CommunauteSavoirConseilEtComiteScientifique,Long,CommunauteSavoirConseilEtComiteScientifiqueVo>{




/**
    * delete CommunauteSavoirConseilEtComiteScientifique from database
    * @param id - id of CommunauteSavoirConseilEtComiteScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<CommunauteSavoirConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id);

    int deleteByConseilEtComiteScientifiqueId(Long id);







}
