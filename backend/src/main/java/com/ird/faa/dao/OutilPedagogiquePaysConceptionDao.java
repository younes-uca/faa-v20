package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogiquePaysConception;


@Repository
public interface OutilPedagogiquePaysConceptionDao extends JpaRepository<OutilPedagogiquePaysConception,Long> {





    List<OutilPedagogiquePaysConception> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<OutilPedagogiquePaysConception> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<OutilPedagogiquePaysConception> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);


}
