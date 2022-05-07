package com.ird.faa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.ird.faa.bean.TypeInstrumentIrdChercheur;


@Repository
public interface TypeInstrumentIrdChercheurDao extends JpaRepository<TypeInstrumentIrdChercheur,Long> {





    List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdCode(String code);
    int deleteByTypeInstrumentIrdCode(String code);

    List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);
    List<TypeInstrumentIrdChercheur> findByChercheurNumeroMatricule(String numeroMatricule);
    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<TypeInstrumentIrdChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);


}
