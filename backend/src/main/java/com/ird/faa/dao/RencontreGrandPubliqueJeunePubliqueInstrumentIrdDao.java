package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;


@Repository
public interface RencontreGrandPubliqueJeunePubliqueInstrumentIrdDao extends JpaRepository<RencontreGrandPubliqueJeunePubliqueInstrumentIrd,Long> {





    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdCode(String code);
    int deleteByInstrumentIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);

    List<RencontreGrandPubliqueJeunePubliqueInstrumentIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);


}
