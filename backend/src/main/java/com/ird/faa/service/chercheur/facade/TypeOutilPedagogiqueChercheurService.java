package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.TypeOutilPedagogique;
import com.ird.faa.ws.rest.provided.vo.TypeOutilPedagogiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypeOutilPedagogiqueChercheurService extends AbstractService<TypeOutilPedagogique,Long,TypeOutilPedagogiqueVo>{




/**
    * delete TypeOutilPedagogique from database
    * @param id - id of TypeOutilPedagogique to be deleted
    *
    */
    int deleteById(Long id);


    List<TypeOutilPedagogique> findByTypeOutilCode(String code);

    int deleteByTypeOutilCode(String code);

    List<TypeOutilPedagogique> findByTypeOutilId(Long id);

    int deleteByTypeOutilId(Long id);

    List<TypeOutilPedagogique> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
