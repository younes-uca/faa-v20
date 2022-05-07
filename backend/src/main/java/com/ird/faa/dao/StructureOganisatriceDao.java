package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.StructureOganisatrice;


@Repository
public interface StructureOganisatriceDao extends JpaRepository<StructureOganisatrice,Long> {






    List<StructureOganisatrice> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<StructureOganisatrice> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<StructureOganisatrice> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);


}
