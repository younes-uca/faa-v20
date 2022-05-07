package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueDisciplineScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiqueDisciplineScientifiqueChercheurService extends AbstractService<OutilPedagogiqueDisciplineScientifique,Long,OutilPedagogiqueDisciplineScientifiqueVo>{




/**
    * delete OutilPedagogiqueDisciplineScientifique from database
    * @param id - id of OutilPedagogiqueDisciplineScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<OutilPedagogiqueDisciplineScientifique> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);
    List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<OutilPedagogiqueDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
