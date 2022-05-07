package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirChercheur;


@Repository
public interface CommunauteSavoirChercheurDao extends JpaRepository<CommunauteSavoirChercheur,Long> {





    List<CommunauteSavoirChercheur> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirChercheur> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);
    List<CommunauteSavoirChercheur> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<CommunauteSavoirChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);


}
