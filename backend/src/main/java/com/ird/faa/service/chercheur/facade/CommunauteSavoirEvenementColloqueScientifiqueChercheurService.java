package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CommunauteSavoirEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEvenementColloqueScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CommunauteSavoirEvenementColloqueScientifiqueChercheurService extends AbstractService<CommunauteSavoirEvenementColloqueScientifique,Long,CommunauteSavoirEvenementColloqueScientifiqueVo>{




/**
    * delete CommunauteSavoirEvenementColloqueScientifique from database
    * @param id - id of CommunauteSavoirEvenementColloqueScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<CommunauteSavoirEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);







}
