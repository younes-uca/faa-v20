package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CampagneRelance;


@Repository
public interface CampagneRelanceDao extends JpaRepository<CampagneRelance,Long> {





    List<CampagneRelance> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<CampagneRelance> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CampagneRelance> findByTemplateRelanceCode(String code);
    int deleteByTemplateRelanceCode(String code);

    List<CampagneRelance> findByTemplateRelanceId(Long id);

    int deleteByTemplateRelanceId(Long id);


}
