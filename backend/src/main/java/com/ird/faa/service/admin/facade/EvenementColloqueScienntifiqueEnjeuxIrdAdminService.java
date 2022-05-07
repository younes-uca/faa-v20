package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.EvenementColloqueScienntifiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueEnjeuxIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface EvenementColloqueScienntifiqueEnjeuxIrdAdminService extends AbstractService<EvenementColloqueScienntifiqueEnjeuxIrd,Long,EvenementColloqueScienntifiqueEnjeuxIrdVo>{




/**
    * delete EvenementColloqueScienntifiqueEnjeuxIrd from database
    * @param id - id of EvenementColloqueScienntifiqueEnjeuxIrd to be deleted
    *
    */
    int deleteById(Long id);



    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEvenementColloqueScienntifiqueId(Long id);

    int deleteByEvenementColloqueScienntifiqueId(Long id);
    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdCode(String code);

    int deleteByEnjeuxIrdCode(String code);

    List<EvenementColloqueScienntifiqueEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);







}
