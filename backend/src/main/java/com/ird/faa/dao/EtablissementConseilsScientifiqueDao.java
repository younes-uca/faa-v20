package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtablissementConseilsScientifique;


@Repository
public interface EtablissementConseilsScientifiqueDao extends JpaRepository<EtablissementConseilsScientifique,Long> {






    List<EtablissementConseilsScientifique> findByConseilsScientifiqueId(Long id);

    int deleteByConseilsScientifiqueId(Long id);
    List<EtablissementConseilsScientifique> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<EtablissementConseilsScientifique> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);


}
