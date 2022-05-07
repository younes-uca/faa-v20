package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeSavoirDeveloppementDeSavoirEtInnovationScientifique;


@Repository
public interface TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueDao extends JpaRepository<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique,Long> {






    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);
    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirCode(String code);
    int deleteByTypeSavoirCode(String code);

    List<TypeSavoirDeveloppementDeSavoirEtInnovationScientifique> findByTypeSavoirId(Long id);

    int deleteByTypeSavoirId(Long id);


}
