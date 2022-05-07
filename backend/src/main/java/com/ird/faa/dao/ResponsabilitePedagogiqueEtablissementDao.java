package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabilitePedagogiqueEtablissement;


@Repository
public interface ResponsabilitePedagogiqueEtablissementDao extends JpaRepository<ResponsabilitePedagogiqueEtablissement,Long> {





    List<ResponsabilitePedagogiqueEtablissement> findByEtablissementCode(String code);
    int deleteByEtablissementCode(String code);

    List<ResponsabilitePedagogiqueEtablissement> findByEtablissementId(Long id);

    int deleteByEtablissementId(Long id);

    List<ResponsabilitePedagogiqueEtablissement> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);
    List<ResponsabilitePedagogiqueEtablissement> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ResponsabilitePedagogiqueEtablissement> findByPaysId(Long id);

    int deleteByPaysId(Long id);


}
