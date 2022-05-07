package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.EtablissementEnseignement;
import com.ird.faa.ws.rest.provided.vo.EtablissementEnseignementVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EtablissementEnseignementAdminService extends AbstractService<EtablissementEnseignement,Long,EtablissementEnseignementVo>{




/**
    * delete EtablissementEnseignement from database
    * @param id - id of EtablissementEnseignement to be deleted
    *
    */
    int deleteById(Long id);


    List<EtablissementEnseignement> findByEtablissementCode(String code);

    int deleteByEtablissementCode(String code);

    List<EtablissementEnseignement> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<EtablissementEnseignement> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);







}
