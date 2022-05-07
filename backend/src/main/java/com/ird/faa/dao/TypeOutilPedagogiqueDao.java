package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeOutilPedagogique;


@Repository
public interface TypeOutilPedagogiqueDao extends JpaRepository<TypeOutilPedagogique,Long> {





    List<TypeOutilPedagogique> findByTypeOutilCode(String code);
    int deleteByTypeOutilCode(String code);

    List<TypeOutilPedagogique> findByTypeOutilId(Long id);

    int deleteByTypeOutilId(Long id);

    List<TypeOutilPedagogique> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);


}
