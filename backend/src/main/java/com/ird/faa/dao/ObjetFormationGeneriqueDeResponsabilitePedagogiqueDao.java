package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ObjetFormationGeneriqueDeResponsabilitePedagogique;


@Repository
public interface ObjetFormationGeneriqueDeResponsabilitePedagogiqueDao extends JpaRepository<ObjetFormationGeneriqueDeResponsabilitePedagogique,Long> {





    List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueCode(String code);
    int deleteByObjetFormationGeneriqueCode(String code);

    List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByObjetFormationGeneriqueId(Long id);

    int deleteByObjetFormationGeneriqueId(Long id);

    List<ObjetFormationGeneriqueDeResponsabilitePedagogique> findByResponsabilitePedagogiqueId(Long id);

    int deleteByResponsabilitePedagogiqueId(Long id);


}
