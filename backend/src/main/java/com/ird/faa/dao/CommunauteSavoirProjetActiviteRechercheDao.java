package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirProjetActiviteRecherche;


@Repository
public interface CommunauteSavoirProjetActiviteRechercheDao extends JpaRepository<CommunauteSavoirProjetActiviteRecherche,Long> {






    List<CommunauteSavoirProjetActiviteRecherche> findByProjetActiviteRechercheId(Long id);

    int deleteByProjetActiviteRechercheId(Long id);
    List<CommunauteSavoirProjetActiviteRecherche> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirProjetActiviteRecherche> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);


}
