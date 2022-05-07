package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.PaysOrganisateurRencontreGrandPubliqueJeunePublique;


@Repository
public interface PaysOrganisateurRencontreGrandPubliqueJeunePubliqueDao extends JpaRepository<PaysOrganisateurRencontreGrandPubliqueJeunePublique,Long> {






    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<PaysOrganisateurRencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
