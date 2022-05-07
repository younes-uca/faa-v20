package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogiquePubliqueCible;


@Repository
public interface OutilPedagogiquePubliqueCibleDao extends JpaRepository<OutilPedagogiquePubliqueCible,Long> {





    List<OutilPedagogiquePubliqueCible> findByPubliqueCibleCode(String code);
    int deleteByPubliqueCibleCode(String code);

    List<OutilPedagogiquePubliqueCible> findByPubliqueCibleId(Long id);

    int deleteByPubliqueCibleId(Long id);

    List<OutilPedagogiquePubliqueCible> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);


}
