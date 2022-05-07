package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;


@Repository
public interface RencontreGrandPubliqueJeunePubliqueDao extends JpaRepository<RencontreGrandPubliqueJeunePublique,Long> {





    List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreCode(String code);
    int deleteByFormatRencontreCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreId(Long id);

    int deleteByFormatRencontreId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByContexteCode(String code);
    int deleteByContexteCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByContexteId(Long id);

    int deleteByContexteId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<RencontreGrandPubliqueJeunePublique> findByCultureScientifiqueId(Long id);

    int deleteByCultureScientifiqueId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
