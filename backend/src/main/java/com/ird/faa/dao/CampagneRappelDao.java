package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.CampagneRappel;


@Repository
public interface CampagneRappelDao extends JpaRepository<CampagneRappel,Long> {





    List<CampagneRappel> findByCampagneCode(String code);
    int deleteByCampagneCode(String code);

    List<CampagneRappel> findByCampagneId(Long id);

    int deleteByCampagneId(Long id);
    List<CampagneRappel> findByTemplateRappelCode(String code);
    int deleteByTemplateRappelCode(String code);

    List<CampagneRappel> findByTemplateRappelId(Long id);

    int deleteByTemplateRappelId(Long id);


}
