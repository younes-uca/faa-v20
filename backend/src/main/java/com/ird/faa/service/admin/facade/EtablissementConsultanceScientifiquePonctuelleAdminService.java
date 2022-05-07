package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.EtablissementConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EtablissementConsultanceScientifiquePonctuelleAdminService extends AbstractService<EtablissementConsultanceScientifiquePonctuelle,Long,EtablissementConsultanceScientifiquePonctuelleVo>{




/**
    * delete EtablissementConsultanceScientifiquePonctuelle from database
    * @param id - id of EtablissementConsultanceScientifiquePonctuelle to be deleted
    *
    */
    int deleteById(Long id);



    List<EtablissementConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);
    List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<EtablissementConsultanceScientifiquePonctuelle> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);







}
