package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.EnseignementEnjeuxIrd;


@Repository
public interface EnseignementEnjeuxIrdDao extends JpaRepository<EnseignementEnjeuxIrd,Long> {






    List<EnseignementEnjeuxIrd> findByEnseignementId(Long id);

    int deleteByEnseignementId(Long id);
    List<EnseignementEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<EnseignementEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);


}
