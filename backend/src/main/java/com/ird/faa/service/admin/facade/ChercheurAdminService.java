package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.ws.rest.provided.vo.ChercheurVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ChercheurAdminService extends AbstractService<Chercheur,Long,ChercheurVo>{

    Chercheur findByUsername(String username);

    /**
    * find Chercheur from database by numeroMatricule (reference)
    * @param numeroMatricule - reference of Chercheur
    * @return the founded Chercheur , If no Chercheur were
    *         found in database return  null.
    */
    Chercheur findByNumeroMatricule(String numeroMatricule);

    /**
    * find Chercheur from database by id (PK) or numeroMatricule (reference)
    * @param id - id of Chercheur
    * @param numeroMatricule - reference of Chercheur
    * @return the founded Chercheur , If no Chercheur were
    *         found in database return  null.
    */
    Chercheur findByIdOrNumeroMatricule(Chercheur chercheur);


/**
    * delete Chercheur from database
    * @param id - id of Chercheur to be deleted
    *
    */
    int deleteById(Long id);


    List<Chercheur> findByAffectationStructurelleCode(String code);

    int deleteByAffectationStructurelleCode(String code);

    List<Chercheur> findByAffectationStructurelleId(Long id);

    int deleteByAffectationStructurelleId(Long id);
    List<Chercheur> findByEntiteAdministrativeCode(String code);

    int deleteByEntiteAdministrativeCode(String code);

    List<Chercheur> findByEntiteAdministrativeId(Long id);

    int deleteByEntiteAdministrativeId(Long id);
    List<Chercheur> findByTypeEntiteAdministrativeCode(String code);

    int deleteByTypeEntiteAdministrativeCode(String code);

    List<Chercheur> findByTypeEntiteAdministrativeId(Long id);

    int deleteByTypeEntiteAdministrativeId(Long id);
    List<Chercheur> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<Chercheur> findByPaysId(Long id);

    int deleteByPaysId(Long id);
    List<Chercheur> findByVilleCode(String code);

    int deleteByVilleCode(String code);

    List<Chercheur> findByVilleId(Long id);

    int deleteByVilleId(Long id);
    List<Chercheur> findByDepartementScientifiqueCode(String code);

    int deleteByDepartementScientifiqueCode(String code);

    List<Chercheur> findByDepartementScientifiqueId(Long id);

    int deleteByDepartementScientifiqueId(Long id);
    List<Chercheur> findByCommissionScientifiqueCode(String code);

    int deleteByCommissionScientifiqueCode(String code);

    List<Chercheur> findByCommissionScientifiqueId(Long id);

    int deleteByCommissionScientifiqueId(Long id);
    List<Chercheur> findByGradeCode(String code);

    int deleteByGradeCode(String code);

    List<Chercheur> findByGradeId(Long id);

    int deleteByGradeId(Long id);
    List<Chercheur> findByCorpsCode(String code);

    int deleteByCorpsCode(String code);

    List<Chercheur> findByCorpsId(Long id);

    int deleteByCorpsId(Long id);
    List<Chercheur> findBySexeCode(String code);

    int deleteBySexeCode(String code);

    List<Chercheur> findBySexeId(Long id);

    int deleteBySexeId(Long id);


    /**
    * delete Chercheur from database by numeroMatricule (reference)
    *
    * @param numeroMatricule - reference of Chercheur to be deleted
    * @return 1 if Chercheur deleted successfully
    */
    int deleteByNumeroMatricule(String numeroMatricule);





}
