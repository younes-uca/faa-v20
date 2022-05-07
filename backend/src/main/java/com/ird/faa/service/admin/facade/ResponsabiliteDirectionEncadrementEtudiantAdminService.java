package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.ResponsabiliteDirectionEncadrementEtudiant;
import com.ird.faa.ws.rest.provided.vo.ResponsabiliteDirectionEncadrementEtudiantVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ResponsabiliteDirectionEncadrementEtudiantAdminService extends AbstractService<ResponsabiliteDirectionEncadrementEtudiant,Long,ResponsabiliteDirectionEncadrementEtudiantVo>{


    /**
    * find ResponsabiliteDirectionEncadrementEtudiant from database by code (reference)
    * @param code - reference of ResponsabiliteDirectionEncadrementEtudiant
    * @return the founded ResponsabiliteDirectionEncadrementEtudiant , If no ResponsabiliteDirectionEncadrementEtudiant were
    *         found in database return  null.
    */
    ResponsabiliteDirectionEncadrementEtudiant findByCode(String code);

    /**
    * find ResponsabiliteDirectionEncadrementEtudiant from database by id (PK) or code (reference)
    * @param id - id of ResponsabiliteDirectionEncadrementEtudiant
    * @param code - reference of ResponsabiliteDirectionEncadrementEtudiant
    * @return the founded ResponsabiliteDirectionEncadrementEtudiant , If no ResponsabiliteDirectionEncadrementEtudiant were
    *         found in database return  null.
    */
    ResponsabiliteDirectionEncadrementEtudiant findByIdOrCode(ResponsabiliteDirectionEncadrementEtudiant responsabiliteDirectionEncadrementEtudiant);


/**
    * delete ResponsabiliteDirectionEncadrementEtudiant from database
    * @param id - id of ResponsabiliteDirectionEncadrementEtudiant to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete ResponsabiliteDirectionEncadrementEtudiant from database by code (reference)
    *
    * @param code - reference of ResponsabiliteDirectionEncadrementEtudiant to be deleted
    * @return 1 if ResponsabiliteDirectionEncadrementEtudiant deleted successfully
    */
    int deleteByCode(String code);




    ResponsabiliteDirectionEncadrementEtudiant archiver(ResponsabiliteDirectionEncadrementEtudiant responsabiliteDirectionEncadrementEtudiant) ;
    ResponsabiliteDirectionEncadrementEtudiant desarchiver(ResponsabiliteDirectionEncadrementEtudiant responsabiliteDirectionEncadrementEtudiant);

}
