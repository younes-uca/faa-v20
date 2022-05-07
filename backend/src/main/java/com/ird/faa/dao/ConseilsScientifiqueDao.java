package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ConseilsScientifique;


@Repository
public interface ConseilsScientifiqueDao extends JpaRepository<ConseilsScientifique,Long> {





    List<ConseilsScientifique> findByNatureExpertiseCode(String code);
    int deleteByNatureExpertiseCode(String code);

    List<ConseilsScientifique> findByNatureExpertiseId(Long id);

    int deleteByNatureExpertiseId(Long id);
    List<ConseilsScientifique> findByTypeExpertiseCode(String code);
    int deleteByTypeExpertiseCode(String code);

    List<ConseilsScientifique> findByTypeExpertiseId(Long id);

    int deleteByTypeExpertiseId(Long id);

    List<ConseilsScientifique> findByExpertiseId(Long id);

    int deleteByExpertiseId(Long id);
    List<ConseilsScientifique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<ConseilsScientifique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
