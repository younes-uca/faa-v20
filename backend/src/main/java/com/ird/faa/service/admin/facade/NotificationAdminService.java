package com.ird.faa.service.admin.facade;

import java.util.List;
import com.ird.faa.bean.Notification;
import com.ird.faa.ws.rest.provided.vo.NotificationVo;
import com.ird.faa.service.core.facade.AbstractService;

public interface NotificationAdminService extends AbstractService<Notification,Long,NotificationVo>{




/**
    * delete Notification from database
    * @param id - id of Notification to be deleted
    *
    */
    int deleteById(Long id);


    List<Notification> findByChercheurNumeroMatricule(String numeroMatricule);

    int deleteByChercheurNumeroMatricule(String numeroMatricule);

    List<Notification> findByChercheurId(Long id);

    int deleteByChercheurId(Long id);
    List<Notification> findByCategorieNotificationCode(String code);

    int deleteByCategorieNotificationCode(String code);

    List<Notification> findByCategorieNotificationId(Long id);

    int deleteByCategorieNotificationId(Long id);







}
