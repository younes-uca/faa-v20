package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreMediaDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaDisciplineScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreMediaDisciplineScientifiqueAdminService extends AbstractService<RencontreMediaDisciplineScientifique,Long,RencontreMediaDisciplineScientifiqueVo>{




/**
    * delete RencontreMediaDisciplineScientifique from database
    * @param id - id of RencontreMediaDisciplineScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreMediaDisciplineScientifique> findByRencontreMediaId(Long id);

    int deleteByRencontreMediaId(Long id);
    List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<RencontreMediaDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
