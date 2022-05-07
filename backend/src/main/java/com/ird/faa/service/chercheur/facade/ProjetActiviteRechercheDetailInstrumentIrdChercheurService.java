package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.ProjetActiviteRechercheDetailInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstrumentIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ProjetActiviteRechercheDetailInstrumentIrdChercheurService extends AbstractService<ProjetActiviteRechercheDetailInstrumentIrd,Long,ProjetActiviteRechercheDetailInstrumentIrdVo>{




/**
    * delete ProjetActiviteRechercheDetailInstrumentIrd from database
    * @param id - id of ProjetActiviteRechercheDetailInstrumentIrd to be deleted
    *
    */
    int deleteById(Long id);



    List<ProjetActiviteRechercheDetailInstrumentIrd> findByProjetActiviteRechercheDetailId(Long id);

    int deleteByProjetActiviteRechercheDetailId(Long id);
    List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdCode(String code);

    int deleteByInstrumentIrdCode(String code);

    List<ProjetActiviteRechercheDetailInstrumentIrd> findByInstrumentIrdId(Long id);

    int deleteByInstrumentIrdId(Long id);







}
