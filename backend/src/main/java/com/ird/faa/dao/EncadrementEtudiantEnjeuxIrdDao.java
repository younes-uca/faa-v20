package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EncadrementEtudiantEnjeuxIrd;


@Repository
public interface EncadrementEtudiantEnjeuxIrdDao extends JpaRepository<EncadrementEtudiantEnjeuxIrd,Long> {






    List<EncadrementEtudiantEnjeuxIrd> findByEncadrementEtudiantId(Long id);

    int deleteByEncadrementEtudiantId(Long id);
    List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<EncadrementEtudiantEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);


}
