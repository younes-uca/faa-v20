package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ResponsabilitePedagogiquePays;


@Repository
public interface ResponsabilitePedagogiquePaysDao extends JpaRepository<ResponsabilitePedagogiquePays,Long> {





    List<ResponsabilitePedagogiquePays> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<ResponsabilitePedagogiquePays> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<ResponsabilitePedagogiquePays> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);


}
