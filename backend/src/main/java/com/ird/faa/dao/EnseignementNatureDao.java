package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnseignementNature;


@Repository
public interface EnseignementNatureDao extends JpaRepository<EnseignementNature,Long> {





    List<EnseignementNature> findByNatureEnseignementCode(String code);
    int deleteByNatureEnseignementCode(String code);

    List<EnseignementNature> findByNatureEnseignementId(Long id);

    int deleteByNatureEnseignementId(Long id);

    List<EnseignementNature> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);


}
