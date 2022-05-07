package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CommunauteSavoirEncadrementEtudiant;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEncadrementEtudiantVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CommunauteSavoirEncadrementEtudiantChercheurService extends AbstractService<CommunauteSavoirEncadrementEtudiant,Long,CommunauteSavoirEncadrementEtudiantVo>{




/**
    * delete CommunauteSavoirEncadrementEtudiant from database
    * @param id - id of CommunauteSavoirEncadrementEtudiant to be deleted
    *
    */
    int deleteById(Long id);


    List<CommunauteSavoirEncadrementEtudiant> findByCommunauteSavoirCode(String code);

    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirEncadrementEtudiant> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<CommunauteSavoirEncadrementEtudiant> findByEncadrementEtudiantId(Long id);

    int deleteByEncadrementEtudiantId(Long id);







}
