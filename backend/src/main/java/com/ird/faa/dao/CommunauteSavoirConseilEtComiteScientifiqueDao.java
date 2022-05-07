package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;


@Repository
public interface CommunauteSavoirConseilEtComiteScientifiqueDao extends JpaRepository<CommunauteSavoirConseilEtComiteScientifique,Long> {





    List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirConseilEtComiteScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<CommunauteSavoirConseilEtComiteScientifique> findByConseilEtComiteScientifiqueId(Long id);

    int deleteByConseilEtComiteScientifiqueId(Long id);


}
