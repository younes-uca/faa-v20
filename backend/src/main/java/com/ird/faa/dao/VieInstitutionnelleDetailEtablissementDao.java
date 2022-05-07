package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.VieInstitutionnelleDetailEtablissement;


@Repository
public interface VieInstitutionnelleDetailEtablissementDao extends JpaRepository<VieInstitutionnelleDetailEtablissement,Long> {






    List<VieInstitutionnelleDetailEtablissement> findByVieInstitutionnelleDetailId(Long id);

    int deleteByVieInstitutionnelleDetailId(Long id);
    List<VieInstitutionnelleDetailEtablissement> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<VieInstitutionnelleDetailEtablissement> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);


}
