package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EtablissementProjet;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface EtablissementProjetDao extends JpaRepository<EtablissementProjet,Long> {



    @Query("SELECT item FROM EtablissementProjet item ORDER BY item.code ASC")
    List<EtablissementProjet> findAll();

    EtablissementProjet findByCode(String code);

    int deleteByCode(String code);

    List<EtablissementProjet> findByVilleCode(String code);
    int deleteByVilleCode(String code);

    List<EtablissementProjet> findByVilleId(Long id);

    int deleteByVilleId(Long id);
    List<EtablissementProjet> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<EtablissementProjet> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
