package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.Doctorant;


@Repository
public interface DoctorantDao extends JpaRepository<Doctorant,Long> {





    List<Doctorant> findBySexeCode(String code);
    int deleteBySexeCode(String code);

    List<Doctorant> findBySexeId(Long id);

    int deleteBySexeId(Long id);
    List<Doctorant> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<Doctorant> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
