package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaEnjeuxIrdVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreMediaEnjeuxIrdAdminService extends AbstractService<RencontreMediaEnjeuxIrd,Long,RencontreMediaEnjeuxIrdVo>{




/**
    * delete RencontreMediaEnjeuxIrd from database
    * @param id - id of RencontreMediaEnjeuxIrd to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreMediaEnjeuxIrd> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);
    List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdCode(String code);

    int deleteByEnjeuxIrdCode(String code);

    List<RencontreMediaEnjeuxIrd> findByEnjeuxIrdId(Long id);

    int deleteByEnjeuxIrdId(Long id);







}
