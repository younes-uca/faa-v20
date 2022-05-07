package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.EnseignementEtFormation;
import com.ird.faa.ws.rest.provided.vo.EnseignementEtFormationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EnseignementEtFormationChercheurService extends AbstractService<EnseignementEtFormation,Long,EnseignementEtFormationVo>{




/**
    * delete EnseignementEtFormation from database
    * @param id - id of EnseignementEtFormation to be deleted
    *
    */
    int deleteById(Long id);


    List<EnseignementEtFormation> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<EnseignementEtFormation> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<EnseignementEtFormation> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<EnseignementEtFormation> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<EnseignementEtFormation> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<EnseignementEtFormation> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);




   public List<EnseignementEtFormation> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
