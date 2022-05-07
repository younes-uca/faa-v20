package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CommunauteSavoirProjetActiviteRecherche;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirProjetActiviteRechercheVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CommunauteSavoirProjetActiviteRechercheChercheurService extends AbstractService<CommunauteSavoirProjetActiviteRecherche,Long,CommunauteSavoirProjetActiviteRechercheVo>{




/**
    * delete CommunauteSavoirProjetActiviteRecherche from database
    * @param id - id of CommunauteSavoirProjetActiviteRecherche to be deleted
    *
    */
    int deleteById(Long id);



    List<CommunauteSavoirProjetActiviteRecherche> findByProjetActiviteRechercheId(Long id);

    int deleteByProjetActiviteRechercheId(Long id);
    List<CommunauteSavoirProjetActiviteRecherche> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirProjetActiviteRecherche> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);







}
