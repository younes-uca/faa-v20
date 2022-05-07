package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabilitePedagogiqueEnjeuxIrd;


@Repository
public interface ResponsabilitePedagogiqueEnjeuxIrdDao extends JpaRepository<ResponsabilitePedagogiqueEnjeuxIrd,Long> {





    List<ResponsabilitePedagogiqueEnjeuxIrd> findByEnjeuxIrdCode(String code);
    int deleteByEnjeuxIrdCode(String code);

    List<ResponsabilitePedagogiqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<ResponsabilitePedagogiqueEnjeuxIrd> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);


}
