package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EvenementColloqueScienntifique;


@Repository
public interface EvenementColloqueScienntifiqueDao extends JpaRepository<EvenementColloqueScienntifique,Long> {





    List<EvenementColloqueScienntifique> findByModaliteCode(String code);
    int deleteByModaliteCode(String code);

    List<EvenementColloqueScienntifique> findByModaliteId(Long id);

    int deleteByModaliteId(Long id);
    List<EvenementColloqueScienntifique> findByModaliteInterventionCode(String code);
    int deleteByModaliteInterventionCode(String code);

    List<EvenementColloqueScienntifique> findByModaliteInterventionId(Long id);

    int deleteByModaliteInterventionId(Long id);

    List<EvenementColloqueScienntifique> findBySavoirEtInnovationId(Long id);

    int deleteBySavoirEtInnovationId(Long id);
    List<EvenementColloqueScienntifique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<EvenementColloqueScienntifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
