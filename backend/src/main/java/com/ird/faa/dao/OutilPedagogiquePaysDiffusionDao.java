package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogiquePaysDiffusion;


@Repository
public interface OutilPedagogiquePaysDiffusionDao extends JpaRepository<OutilPedagogiquePaysDiffusion,Long> {





    List<OutilPedagogiquePaysDiffusion> findByPaysCode(String code);
    int deleteByPaysCode(String code);

    List<OutilPedagogiquePaysDiffusion> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<OutilPedagogiquePaysDiffusion> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);


}
