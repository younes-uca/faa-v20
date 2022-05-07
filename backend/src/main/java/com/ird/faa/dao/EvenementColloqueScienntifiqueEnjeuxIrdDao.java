package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EvenementColloqueScienntifiqueEnjeuxIrd;


@Repository
public interface EvenementColloqueScienntifiqueEnjeuxIrdDao extends JpaRepository<EvenementColloqueScienntifiqueEnjeuxIrd,Long> {






    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);


}
