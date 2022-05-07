package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;


@Repository
public interface RencontreGrandPubliqueJeunePubliqueEnjeuxIrdDao extends JpaRepository<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd,Long> {






    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);


}
