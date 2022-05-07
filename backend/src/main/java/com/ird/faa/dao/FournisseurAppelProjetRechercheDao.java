package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FournisseurAppelProjetRecherche;

import org.springframework.data.jpa.repository.Query;

@Repository
public interface FournisseurAppelProjetRechercheDao extends JpaRepository<FournisseurAppelProjetRecherche,Long> {



    @Query("SELECT item FROM FournisseurAppelProjetRecherche item ORDER BY item.code ASC")
    List<FournisseurAppelProjetRecherche> findAll();

    FournisseurAppelProjetRecherche findByCode(String code);

    int deleteByCode(String code);

    List<FournisseurAppelProjetRecherche> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<FournisseurAppelProjetRecherche> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
