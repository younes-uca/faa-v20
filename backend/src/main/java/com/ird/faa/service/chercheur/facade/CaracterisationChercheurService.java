package com.ird.faa.service.chercheur.facade;

import java.util.List;
import com.ird.faa.bean.Caracterisation;
import com.ird.faa.ws.rest.provided.vo.CaracterisationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface CaracterisationChercheurService extends AbstractService<Caracterisation,Long,CaracterisationVo>{


    /**
    * find Caracterisation from database by code (reference)
    * @param code - reference of Caracterisation
    * @return the founded Caracterisation , If no Caracterisation were
    *         found in database return  null.
    */
    Caracterisation findByCode(String code);

    /**
    * find Caracterisation from database by id (PK) or code (reference)
    * @param id - id of Caracterisation
    * @param code - reference of Caracterisation
    * @return the founded Caracterisation , If no Caracterisation were
    *         found in database return  null.
    */
    Caracterisation findByIdOrCode(Caracterisation caracterisation);


/**
    * delete Caracterisation from database
    * @param id - id of Caracterisation to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete Caracterisation from database by code (reference)
    *
    * @param code - reference of Caracterisation to be deleted
    * @return 1 if Caracterisation deleted successfully
    */
    int deleteByCode(String code);





}
