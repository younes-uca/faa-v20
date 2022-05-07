package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EncadrementDoctorant;


@Repository
public interface EncadrementDoctorantDao extends JpaRepository<EncadrementDoctorant,Long> {





    List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantCode(String code);
    int deleteByResponsabiliteEncadrementDoctorantCode(String code);

    List<EncadrementDoctorant> findByResponsabiliteEncadrementDoctorantId(Long id);

    int deleteByResponsabiliteEncadrementDoctorantId(Long id);
    List<EncadrementDoctorant> findByFinancementDoctorantCode(String code);
    int deleteByFinancementDoctorantCode(String code);

    List<EncadrementDoctorant> findByFinancementDoctorantId(Long id);

    int deleteByFinancementDoctorantId(Long id);
    List<EncadrementDoctorant> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<EncadrementDoctorant> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);
    List<EncadrementDoctorant> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<EncadrementDoctorant> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<EncadrementDoctorant> findByDoctorantId(Long id);

    int deleteByDoctorantId(Long id);

    List<EncadrementDoctorant> findByEncadrementId(Long id);

    int deleteByEncadrementId(Long id);
    List<EncadrementDoctorant> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<EncadrementDoctorant> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
