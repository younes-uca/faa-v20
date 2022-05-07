package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.ModaliteEtude;
import com.ird.faa.ws.rest.provided.vo.ModaliteEtudeVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface ModaliteEtudeAdminService extends AbstractService<ModaliteEtude,Long,ModaliteEtudeVo>{


    /**
    * find ModaliteEtude from database by code (reference)
    * @param code - reference of ModaliteEtude
    * @return the founded ModaliteEtude , If no ModaliteEtude were
    *         found in database return  null.
    */
    ModaliteEtude findByCode(String code);

    /**
    * find ModaliteEtude from database by id (PK) or code (reference)
    * @param id - id of ModaliteEtude
    * @param code - reference of ModaliteEtude
    * @return the founded ModaliteEtude , If no ModaliteEtude were
    *         found in database return  null.
    */
    ModaliteEtude findByIdOrCode(ModaliteEtude modaliteEtude);


/**
    * delete ModaliteEtude from database
    * @param id - id of ModaliteEtude to be deleted
    *
    */
    int deleteById(Long id);




    /**
    * delete ModaliteEtude from database by code (reference)
    *
    * @param code - reference of ModaliteEtude to be deleted
    * @return 1 if ModaliteEtude deleted successfully
    */
    int deleteByCode(String code);




    ModaliteEtude archiver(ModaliteEtude modaliteEtude) ;
    ModaliteEtude desarchiver(ModaliteEtude modaliteEtude);

}
