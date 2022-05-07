package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeEtudeEnseignement;


@Repository
public interface TypeEtudeEnseignementDao extends JpaRepository<TypeEtudeEnseignement,Long> {






    List<TypeEtudeEnseignement> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);
    List<TypeEtudeEnseignement> findByTypeEtudeCode(String code);
    int deleteByTypeEtudeCode(String code);

    List<TypeEtudeEnseignement> findByTypeEtudeId(Long id);

    int deleteByTypeEtudeId(Long id);


}
