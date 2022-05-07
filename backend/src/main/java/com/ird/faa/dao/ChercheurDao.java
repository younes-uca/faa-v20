package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Chercheur;


@Repository
public interface ChercheurDao extends JpaRepository<Chercheur,Long> {

    Chercheur findByUsername(String username);



    Chercheur findByNumeroMatricule(String numeroMatricule);

    int deleteByNumeroMatricule(String numeroMatricule);

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


}
