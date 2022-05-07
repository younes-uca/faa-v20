package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.VieInstitutionnelleDetailInstrumentIrd;


@Repository
public interface VieInstitutionnelleDetailInstrumentIrdDao extends JpaRepository<VieInstitutionnelleDetailInstrumentIrd,Long> {






    List<VieInstitutionnelleDetailInstrumentIrd> findByVieInstitutionnelleDetailId(Long id);

    int deleteByVieInstitutionnelleDetailId(Long id);
    List<VieInstitutionnelleDetailInstrumentIrd> findByInstrumentIrdCode(String code);
    int deleteByInstrumentIrdCode(String code);

    List<VieInstitutionnelleDetailInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);


}
