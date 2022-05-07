package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirEvenementColloqueScientifique;


@Repository
public interface CommunauteSavoirEvenementColloqueScientifiqueDao extends JpaRepository<CommunauteSavoirEvenementColloqueScientifique,Long> {






    List<CommunauteSavoirEvenementColloqueScientifique> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirEvenementColloqueScientifique> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);


}
