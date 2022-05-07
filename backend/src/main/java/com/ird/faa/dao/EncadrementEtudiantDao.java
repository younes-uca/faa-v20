package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EncadrementEtudiant;


@Repository
public interface EncadrementEtudiantDao extends JpaRepository<EncadrementEtudiant,Long> {





    List<EncadrementEtudiant> findByNiveauFormationPostBacCode(String code);
    int deleteByNiveauFormationPostBacCode(String code);

    List<EncadrementEtudiant> findByNiveauFormationPostBacId(Long id);

    int deleteByNiveauFormationPostBacId(Long id);
    List<EncadrementEtudiant> findByResponsabiliteDirectionEncadrementEtudiantCode(String code);
    int deleteByResponsabiliteDirectionEncadrementEtudiantCode(String code);

    List<EncadrementEtudiant> findByResponsabiliteDirectionEncadrementEtudiantId(Long id);

    int deleteByResponsabiliteDirectionEncadrementEtudiantId(Long id);

    List<EncadrementEtudiant> findByEtudiantId(Long id);

    int deleteByEtudiantId(Long id);
    List<EncadrementEtudiant> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<EncadrementEtudiant> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);
    List<EncadrementEtudiant> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<EncadrementEtudiant> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<EncadrementEtudiant> findByEncadrementId(Long id);

    int deleteByEncadrementId(Long id);
    List<EncadrementEtudiant> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<EncadrementEtudiant> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
