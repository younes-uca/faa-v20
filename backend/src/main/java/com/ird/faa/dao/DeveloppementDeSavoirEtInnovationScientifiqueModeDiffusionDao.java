package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion;


@Repository
public interface DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionDao extends JpaRepository<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion,Long> {





    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionCode(String code);
    int deleteByModeDiffusionCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByModeDiffusionId(Long id);

    int deleteByModeDiffusionId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusion> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
