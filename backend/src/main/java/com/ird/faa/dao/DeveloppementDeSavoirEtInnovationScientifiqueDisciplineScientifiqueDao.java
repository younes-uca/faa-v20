package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique;


@Repository
public interface DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifiqueDao extends JpaRepository<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique,Long> {





    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueDisciplineScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
