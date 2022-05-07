package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueDisciplineScientifique;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueAdminService extends AbstractService<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique,Long,RencontreGrandPubliqueJeunePubliqueDisciplineScientifiqueVo>{




/**
    * delete RencontreGrandPubliqueJeunePubliqueDisciplineScientifique from database
    * @param id - id of RencontreGrandPubliqueJeunePubliqueDisciplineScientifique to be deleted
    *
    */
    int deleteById(Long id);



    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByRencontreGrandPubliqueJeunePubliqueId(Long id);

    int deleteByRencontreGrandPubliqueJeunePubliqueId(Long id);
    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueCode(String code);

    int deleteByDisciplineScientifiqueCode(String code);

    List<RencontreGrandPubliqueJeunePubliqueDisciplineScientifique> findByDisciplineScientifiqueId(Long id);

    int deleteByDisciplineScientifiqueId(Long id);







}
