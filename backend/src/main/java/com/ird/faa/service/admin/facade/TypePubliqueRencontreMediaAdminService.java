package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreMediaVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface TypePubliqueRencontreMediaAdminService extends AbstractService<TypePubliqueRencontreMedia,Long,TypePubliqueRencontreMediaVo>{




/**
    * delete TypePubliqueRencontreMedia from database
    * @param id - id of TypePubliqueRencontreMedia to be deleted
    *
    */
    int deleteById(Long id);


    List<TypePubliqueRencontreMedia> findByTypePubliqueCode(String code);

    int deleteByTypePubliqueCode(String code);

    List<TypePubliqueRencontreMedia> findByTypePubliqueId(Long id);

    int deleteByTypePubliqueId(Long id);

    List<TypePubliqueRencontreMedia> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);







}
