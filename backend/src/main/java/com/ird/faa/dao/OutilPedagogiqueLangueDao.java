package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogiqueLangue;


@Repository
public interface OutilPedagogiqueLangueDao extends JpaRepository<OutilPedagogiqueLangue,Long> {





    List<OutilPedagogiqueLangue> findByLangueCode(String code);
    int deleteByLangueCode(String code);

    List<OutilPedagogiqueLangue> findByLangueId(Long id);

    int deleteByLangueId(Long id);

    List<OutilPedagogiqueLangue> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);


}
