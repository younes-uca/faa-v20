package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.DistinctionEtablissementPays;


@Repository
public interface DistinctionEtablissementPaysDao extends JpaRepository<DistinctionEtablissementPays,Long> {





    List<DistinctionEtablissementPays> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<DistinctionEtablissementPays> findByPaysId(Long id);

    int deleteByPaysId(Long id);
    List<DistinctionEtablissementPays> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<DistinctionEtablissementPays> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<DistinctionEtablissementPays> findByDistinctionId(Long id);

    int deleteByDistinctionId(Long id);


}
