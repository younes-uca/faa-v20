package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinueCommanditaire;


@Repository
public interface FormationContinueCommanditaireDao extends JpaRepository<FormationContinueCommanditaire,Long> {





    List<FormationContinueCommanditaire> findByCommanditaireCode(String code);
    int deleteByCommanditaireCode(String code);

    List<FormationContinueCommanditaire> findByCommanditaireId(Long id);

    int deleteByCommanditaireId(Long id);

    List<FormationContinueCommanditaire> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);
    List<FormationContinueCommanditaire> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<FormationContinueCommanditaire> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
