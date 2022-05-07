package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd;


@Repository
public interface RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrdDao extends JpaRepository<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd,Long> {





    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdCode(String code);
    int deleteByTypeInstrumentIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<RencontreGrandPubliqueJeunePubliqueTypeInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);


}
