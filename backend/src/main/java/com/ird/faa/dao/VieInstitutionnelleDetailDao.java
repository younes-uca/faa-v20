package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.VieInstitutionnelleDetail;


@Repository
public interface VieInstitutionnelleDetailDao extends JpaRepository<VieInstitutionnelleDetail,Long> {





    List<VieInstitutionnelleDetail> findByTypeInstanceCode(String code);
    int deleteByTypeInstanceCode(String code);

    List<VieInstitutionnelleDetail> findByTypeInstanceId(Long id);

    int deleteByTypeInstanceId(Long id);
    List<VieInstitutionnelleDetail> findByStructureIrdCode(String code);
    int deleteByStructureIrdCode(String code);

    List<VieInstitutionnelleDetail> findByStructureIrdId(Long id);

    int deleteByStructureIrdId(Long id);
    List<VieInstitutionnelleDetail> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<VieInstitutionnelleDetail> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<VieInstitutionnelleDetail> findByVieInstitutionnelleId(Long id);

    int deleteByVieInstitutionnelleId(Long id);


}
