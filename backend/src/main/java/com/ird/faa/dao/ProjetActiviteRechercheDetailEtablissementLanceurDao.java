package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRechercheDetailEtablissementLanceur;


@Repository
public interface ProjetActiviteRechercheDetailEtablissementLanceurDao extends JpaRepository<ProjetActiviteRechercheDetailEtablissementLanceur,Long> {





    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<ProjetActiviteRechercheDetailEtablissementLanceur> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);


}
