package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.CampagneChercheurOuverture;
import com.ird.faa.ws.rest.provided.vo.CampagneChercheurOuvertureVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CampagneChercheurOuvertureAdminService extends AbstractService<CampagneChercheurOuverture,Long,CampagneChercheurOuvertureVo>{




/**
    * delete CampagneChercheurOuverture from database
    * @param id - id of CampagneChercheurOuverture to be deleted
    *
    */
    int deleteById(Long id);


    List<CampagneChercheurOuverture> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CampagneChercheurOuverture> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<CampagneChercheurOuverture> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<CampagneChercheurOuverture> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CampagneChercheurOuverture> findByEtatCampagneChercheurCode(String code);

    int deleteByEtatCampagneChercheurCode(String code);

    List<CampagneChercheurOuverture> findByEtatCampagneChercheurId(Long id);

    int deleteByEtatCampagneChercheurId(Long id);







}
