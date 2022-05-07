package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifique;


@Repository
public interface DeveloppementDeSavoirEtInnovationScientifiqueDao extends JpaRepository<DeveloppementDeSavoirEtInnovationScientifique,Long> {





    List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirCode(String code);
    int deleteByRoleDeveloppementDeSavoirCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifique> findByRoleDeveloppementDeSavoirId(Long id);

    int deleteByRoleDeveloppementDeSavoirId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifique> findBySavoirEtInnovationId(Long id);

    int deleteBySavoirEtInnovationId(Long id);
    List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
