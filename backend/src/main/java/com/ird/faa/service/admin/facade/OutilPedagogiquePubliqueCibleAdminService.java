package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.OutilPedagogiquePubliqueCible;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePubliqueCibleVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface OutilPedagogiquePubliqueCibleAdminService extends AbstractService<OutilPedagogiquePubliqueCible,Long,OutilPedagogiquePubliqueCibleVo>{




/**
    * delete OutilPedagogiquePubliqueCible from database
    * @param id - id of OutilPedagogiquePubliqueCible to be deleted
    *
    */
    int deleteById(Long id);


    List<OutilPedagogiquePubliqueCible> findByPubliqueCibleCode(String code);

    int deleteByPubliqueCibleCode(String code);

    List<OutilPedagogiquePubliqueCible> findByPubliqueCibleId(Long id);

    int deleteByPubliqueCibleId(Long id);

    List<OutilPedagogiquePubliqueCible> findByOutilPedagogiqueId(Long id);

    int deleteByOutilPedagogiqueId(Long id);







}
