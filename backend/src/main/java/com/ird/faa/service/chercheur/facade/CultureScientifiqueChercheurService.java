package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.CultureScientifique;
import com.ird.faa.ws.rest.provided.vo.CultureScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CultureScientifiqueChercheurService extends AbstractService<CultureScientifique,Long,CultureScientifiqueVo>{




/**
    * delete CultureScientifique from database
    * @param id - id of CultureScientifique to be deleted
    *
    */
    int deleteById(Long id);


    List<CultureScientifique> findByCampagneCode(String code);

    int deleteByCampagneCode(String code);

    List<CultureScientifique> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CultureScientifique> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CultureScientifique> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<CultureScientifique> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<CultureScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);
    List<CultureScientifique> findByNatureActiviteGrandPubliqueCode(String code);

    int deleteByNatureActiviteGrandPubliqueCode(String code);

    List<CultureScientifique> findByNatureActiviteGrandPubliqueId(Long id);

    int deleteByNatureActiviteGrandPubliqueId(Long id);




   public List<CultureScientifique> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
