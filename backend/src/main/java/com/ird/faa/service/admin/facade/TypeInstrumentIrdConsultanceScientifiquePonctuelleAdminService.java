package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdConsultanceScientifiquePonctuelleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeInstrumentIrdConsultanceScientifiquePonctuelleAdminService extends AbstractService<TypeInstrumentIrdConsultanceScientifiquePonctuelle,Long,TypeInstrumentIrdConsultanceScientifiquePonctuelleVo>{




/**
    * delete TypeInstrumentIrdConsultanceScientifiquePonctuelle from database
    * @param id - id of TypeInstrumentIrdConsultanceScientifiquePonctuelle to be deleted
    *
    */
    int deleteById(Long id);


    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdCode(String code);

    int deleteByTypeInstrumentIrdCode(String code);

    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByTypeInstrumentIrdId(Long id);

    int deleteByTypeInstrumentIrdId(Long id);

    List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> findByConsultanceScientifiquePonctuelleId(Long id);

    int deleteByConsultanceScientifiquePonctuelleId(Long id);







}
