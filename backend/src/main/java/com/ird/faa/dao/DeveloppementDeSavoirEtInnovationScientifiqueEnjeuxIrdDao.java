package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd;


@Repository
public interface DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdDao extends JpaRepository<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd,Long> {





    List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
