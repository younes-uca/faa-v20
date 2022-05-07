package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.FormationContinueObjetFormationGenerique;


@Repository
public interface FormationContinueObjetFormationGeneriqueDao extends JpaRepository<FormationContinueObjetFormationGenerique,Long> {





    List<FormationContinueObjetFormationGenerique> findByObjetFormationGeneriqueCode(String code);
    int deleteByObjetFormationGeneriqueCode(String code);

    List<FormationContinueObjetFormationGenerique> findByObjetFormationGeneriqueId(Long id);

    int deleteByObjetFormationGeneriqueId(Long id);

    List<FormationContinueObjetFormationGenerique> findByFormationContinueId(Long id);

    int deleteByFormationContinueId(Long id);


}
