package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.RencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreGrandPubliqueJeunePubliqueChercheurService extends AbstractService<RencontreGrandPubliqueJeunePublique,Long,RencontreGrandPubliqueJeunePubliqueVo>{




/**
    * delete RencontreGrandPubliqueJeunePublique from database
    * @param id - id of RencontreGrandPubliqueJeunePublique to be deleted
    *
    */
    int deleteById(Long id);


    List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreCode(String code);

    int deleteByFormatRencontreCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByFormatRencontreId(Long id);

    int deleteByFormatRencontreId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByContexteCode(String code);

    int deleteByContexteCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByContexteId(Long id);

    int deleteByContexteId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByPaysCode(String code);

    int deleteByPaysCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByPaysId(Long id);

    int deleteByPaysId(Long id);

    List<RencontreGrandPubliqueJeunePublique> findByCultureScientifiqueId(Long id);

    int deleteByCultureScientifiqueId(Long id);
    List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<RencontreGrandPubliqueJeunePublique> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);







}
