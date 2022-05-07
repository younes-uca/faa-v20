package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeUtilisateurSavoirConcu;


@Repository
public interface TypeUtilisateurSavoirConcuDao extends JpaRepository<TypeUtilisateurSavoirConcu,Long> {





    List<TypeUtilisateurSavoirConcu> findByTypeUtilisateurCode(String code);
    int deleteByTypeUtilisateurCode(String code);

    List<TypeUtilisateurSavoirConcu> findByTypeUtilisateurId(Long id);

    int deleteByTypeUtilisateurId(Long id);

    List<TypeUtilisateurSavoirConcu> findByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);

    int deleteByDeveloppementDeSavoirEtInnovationScientifiqueId(Long id);


}
