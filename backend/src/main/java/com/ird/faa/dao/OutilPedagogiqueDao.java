package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.OutilPedagogique;


@Repository
public interface OutilPedagogiqueDao extends JpaRepository<OutilPedagogique,Long> {






    List<OutilPedagogique> findByCultureScientifiqueId(Long id);

    int deleteByCultureScientifiqueId(Long id);
    List<OutilPedagogique> findByEtatEtapeCampagneCode(String code);
    int deleteByEtatEtapeCampagneCode(String code);

    List<OutilPedagogique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);

    List<OutilPedagogique> findByChercheurUsernameAndCampagneId(String username, Long compagneId);
    List<OutilPedagogique> findByChercheurUsername(String username);

}
