package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ContratEtConventionIrd;


@Repository
public interface ContratEtConventionIrdDao extends JpaRepository<ContratEtConventionIrd,Long> {





    List<ContratEtConventionIrd> findByStatusContratEtConventionCode(String code);
    int deleteByStatusContratEtConventionCode(String code);

    List<ContratEtConventionIrd> findByStatusContratEtConventionId(Long id);

    int deleteByStatusContratEtConventionId(Long id);

    List<ContratEtConventionIrd> findBySavoirEtInnovationId(Long id);

    int deleteBySavoirEtInnovationId(Long id);
    List<ContratEtConventionIrd> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<ContratEtConventionIrd> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);


}
