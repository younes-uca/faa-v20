package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Reclamation;


@Repository
public interface ReclamationDao extends JpaRepository<Reclamation,Long> {





    List<Reclamation> findByEtatReclamationCode(String code);
    int deleteByEtatReclamationCode(String code);

    List<Reclamation> findByEtatReclamationId(Long id);

    int deleteByEtatReclamationId(Long id);
    List<Reclamation> findByTypeReclamationCode(String code);
    int deleteByTypeReclamationCode(String code);

    List<Reclamation> findByTypeReclamationId(Long id);

    int deleteByTypeReclamationId(Long id);
    List<Reclamation> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<Reclamation> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);


}
