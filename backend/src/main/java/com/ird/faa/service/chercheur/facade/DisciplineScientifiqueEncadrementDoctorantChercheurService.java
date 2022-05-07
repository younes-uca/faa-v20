package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.DisciplineScientifiqueEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.DisciplineScientifiqueEncadrementDoctorantVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface DisciplineScientifiqueEncadrementDoctorantChercheurService extends AbstractService<DisciplineScientifiqueEncadrementDoctorant,Long,DisciplineScientifiqueEncadrementDoctorantVo>{




/**
    * delete DisciplineScientifiqueEncadrementDoctorant from database
    * @param id - id of DisciplineScientifiqueEncadrementDoctorant to be deleted
    *
    */
    int deleteById(Long id);



    List<DisciplineScientifiqueEncadrementDoctorant> findByEncadrementDoctorantId(Long id);

    int deleteByEncadrementDoctorantId(Long id);
    List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<DisciplineScientifiqueEncadrementDoctorant> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
