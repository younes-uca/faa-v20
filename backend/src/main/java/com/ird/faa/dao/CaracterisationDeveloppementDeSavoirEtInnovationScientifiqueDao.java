package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CaracterisationDeveloppementDeSavoirEtInnovationScientifique;


@Repository
public interface CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueDao extends JpaRepository<CaracterisationDeveloppementDeSavoirEtInnovationScientifique,Long> {





    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationCode(String code);
    int deleteByCaracterisationCode(String code);

    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByCaracterisationId(Long id);

    int deleteByCaracterisationId(Long id);

    List<CaracterisationDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
