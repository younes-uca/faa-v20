package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypeInstrumentIrdChercheur;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdChercheurVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeInstrumentIrdChercheurChercheurService extends AbstractService<TypeInstrumentIrdChercheur,Long,TypeInstrumentIrdChercheurVo>{




/**
    * delete TypeInstrumentIrdChercheur from database
    * @param id - id of TypeInstrumentIrdChercheur to be deleted
    *
    */
    int deleteById(Long id);


    List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdCode(String code);

    int deleteByTypeInstrumentIrdCode(String code);

    List<TypeInstrumentIrdChercheur> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);
    List<TypeInstrumentIrdChercheur> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<TypeInstrumentIrdChercheur> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);







}
