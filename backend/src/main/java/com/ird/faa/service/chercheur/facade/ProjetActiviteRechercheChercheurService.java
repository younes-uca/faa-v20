package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ProjetActiviteRechercheChercheurService extends AbstractService<ProjetActiviteRecherche,Long,ProjetActiviteRechercheVo>{




/**
    * delete ProjetActiviteRecherche from database
    * @param id - id of ProjetActiviteRecherche to be deleted
    *
    */
    int deleteById(Long id);


    List<ProjetActiviteRecherche> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<ProjetActiviteRecherche> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<ProjetActiviteRecherche> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<ProjetActiviteRecherche> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<ProjetActiviteRecherche> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<ProjetActiviteRecherche> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);




   public List<ProjetActiviteRecherche> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
