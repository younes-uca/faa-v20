package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;


@Repository
public interface DeveloppementDeSavoirEtInnovationScientifiquePaysDao extends JpaRepository<DeveloppementDeSavoirEtInnovationScientifiquePays,Long> {





    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiquePays> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
