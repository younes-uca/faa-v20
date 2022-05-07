package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CommunauteSavoirEncadrementEtudiant;


@Repository
public interface CommunauteSavoirEncadrementEtudiantDao extends JpaRepository<CommunauteSavoirEncadrementEtudiant,Long> {





    List<CommunauteSavoirEncadrementEtudiant> findByCommunauteSavoirCode(String code);
    int deleteByCommunauteSavoirCode(String code);

    List<CommunauteSavoirEncadrementEtudiant> findByCommunauteSavoirId(Long id);

    int deleteByCommunauteSavoirId(Long id);

    List<CommunauteSavoirEncadrementEtudiant> findByEncadrementEtudiantId(Long id);

    int deleteByEncadrementEtudiantId(Long id);


}
