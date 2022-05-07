package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinueEnjeuxIrd;


@Repository
public interface FormationContinueEnjeuxIrdDao extends JpaRepository<FormationContinueEnjeuxIrd,Long> {





    List<FormationContinueEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<FormationContinueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<FormationContinueEnjeuxIrd> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);


}
