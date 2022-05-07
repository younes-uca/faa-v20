package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirExpertiseScientifique;


@Repository
public interface CommunauteSavoirExpertiseScientifiqueDao extends JpaRepository<CommunauteSavoirExpertiseScientifique,Long> {





    List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirExpertiseScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<CommunauteSavoirExpertiseScientifique> findByExpertiseScientifiqueId(Long id);

    int deleteByExpertiseScientifiqueId(Long id);


}
