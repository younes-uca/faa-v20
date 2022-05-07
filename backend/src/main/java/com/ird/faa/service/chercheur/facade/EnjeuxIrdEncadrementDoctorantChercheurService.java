package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdEncadrementDoctorantVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EnjeuxIrdEncadrementDoctorantChercheurService extends AbstractService<EnjeuxIrdEncadrementDoctorant,Long,EnjeuxIrdEncadrementDoctorantVo>{




/**
    * delete EnjeuxIrdEncadrementDoctorant from database
    * @param id - id of EnjeuxIrdEncadrementDoctorant to be deleted
    *
    */
    int deleteById(Long id);


    List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdCode(String code);

    int deleteByEnjeuxIrdCode(String code);

    List<EnjeuxIrdEncadrementDoctorant> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);

    List<EnjeuxIrdEncadrementDoctorant> findByEncadrementDoctorantId(Long id);

    int deleteByEncadrementDoctorantId(Long id);







}
