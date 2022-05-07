package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogiqueDisciplineScientifique;


@Repository
public interface OutilPedagogiqueDisciplineScientifiqueDao extends JpaRepository<OutilPedagogiqueDisciplineScientifique,Long> {






    List<OutilPedagogiqueDisciplineScientifique> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);
    List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueCode(String code);
    int deleteByDisciplineScientifiqueCode(String code);

    List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);


}
