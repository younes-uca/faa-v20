package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Etablissement;


@Repository
public interface EtablissementDao extends JpaRepository<Etablissement,Long> {




    Etablissement findByCode(String code);

    int deleteByCode(String code);

    List<Etablissement> findByVilleCode(String code);
    int deleteByVilleCode(String code);

    List<Etablissement> findByVilleId(Long id);

    int deleteByVilleId(Long id);
    List<Etablissement> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<Etablissement> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
