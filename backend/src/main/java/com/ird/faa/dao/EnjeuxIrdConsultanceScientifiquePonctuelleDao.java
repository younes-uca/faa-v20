package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;


@Repository
public interface EnjeuxIrdConsultanceScientifiquePonctuelleDao extends JpaRepository<EnjeuxIrdConsultanceScientifiquePonctuelle,Long> {





    List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<EnjeuxIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);


}
