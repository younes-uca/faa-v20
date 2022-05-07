package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.RencontreMedia;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface RencontreMediaChercheurService extends AbstractService<RencontreMedia,Long,RencontreMediaVo>{




/**
    * delete RencontreMedia from database
    * @param id - id of RencontreMedia to be deleted
    *
    */
    int deleteById(Long id);


    List<RencontreMedia> findByFormatRencontreCode(String code);

    int deleteByFormatRencontreCode(String code);

    List<RencontreMedia> findByFormatRencontreId(Long id);

    int deleteByFormatRencontreId(Long id);

    List<RencontreMedia> findByCultureScientifiqueId(Long id);

    int deleteByCultureScientifiqueId(Long id);
    List<RencontreMedia> findByEtatEtapeCampagneCode(String code);

    int deleteByEtatEtapeCampagneCode(String code);

    List<RencontreMedia> findByEtatEtapeCampagneId(Long id);

    int deleteByEtatEtapeCampagneId(Long id);




   public List<RencontreMedia> findByChercheurUsernameAndCampagneId(String username, Long compagneId);



}
