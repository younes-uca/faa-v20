package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinue;


@Repository
public interface FormationContinueDao extends JpaRepository<FormationContinue,Long> {





    List<FormationContinue> findByModaliteFormationContinueCode(String code);
    int deleteByModaliteFormationContinueCode(String code);

    List<FormationContinue> findByModaliteFormationContinueId(Long id);

    int deleteByModaliteFormationContinueId(Long id);

    List<FormationContinue> findByEnseignementEtFormationId(Long id);

    int deleteByEnseignementEtFormationId(Long id);
    List<FormationContinue> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<FormationContinue> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
