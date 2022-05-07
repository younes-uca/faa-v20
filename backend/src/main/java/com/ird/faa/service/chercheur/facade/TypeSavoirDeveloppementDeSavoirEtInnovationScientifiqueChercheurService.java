package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;
import com.ird.faa.ws.rest.provided.vo.TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueChercheurService extends AbstractService<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique,Long,TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo>{




/**
    * delete TypeSavoirDeveloppementDeSavoirEtInnovationScientifique from database
    * @param id - id of TypeSavoirDeveloppementDeSavoirEtInnovationScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);
    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirCode(String code);

    int deleteByTypeSavoirCode(String code);

    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirId(Long id);

    int deleteByTypeSavoirId(Long id);







}
