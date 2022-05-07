package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.ProjetActiviteRechercheDetailInstrumentIrd;


@Repository
public interface ProjetActiviteRechercheDetailInstrumentIrdDao extends JpaRepository<ProjetActiviteRechercheDetailInstrumentIrd,Long> {






    List<ProjetActiviteRechercheDetailInstrumentIrd> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);
    List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdCode(String code);
    int deleteByInstrumentIrdCode(String code);

    List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);


}
