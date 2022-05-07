package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;


@Repository
public interface TypePubliqueRencontreGrandPubliqueJeunePubliqueDao extends JpaRepository<TypePubliqueRencontreGrandPubliqueJeunePublique,Long> {






    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueCode(String code);
    int deleteByTypePubliqueCode(String code);

    List<TypePubliqueRencontreGrandPubliqueJeunePublique> findByTypePubliqueId(Long id);

    int deleteByTypePubliqueId(Long id);


}
