package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinuePubliqueProfessionel;


@Repository
public interface FormationContinuePubliqueProfessionelDao extends JpaRepository<FormationContinuePubliqueProfessionel,Long> {






    List<FormationContinuePubliqueProfessionel> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);

    List<FormationContinuePubliqueProfessionel> findByPubliqueProfessionelId(Long id);

    int deleteByPubliqueProfessionelId(Long id);


}
