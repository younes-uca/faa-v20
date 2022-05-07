package com.ird.faa.service.chercheur.impl;

import java.util.List;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import com.ird.faa.bean.Notification;
import com.ird.faa.bean.Chercheur;
import com.ird.faa.bean.CategorieNotification;
import com.ird.faa.dao.NotificationDao;
import com.ird.faa.service.chercheur.facade.NotificationChercheurService;
import com.ird.faa.service.chercheur.facade.CategorieNotificationChercheurService;
import com.ird.faa.service.chercheur.facade.ChercheurChercheurService;

import com.ird.faa.ws.rest.provided.vo.NotificationVo;
import com.ird.faa.service.util.*;

import com.ird.faa.service.core.impl.AbstractServiceImpl;

@Service
public class NotificationChercheurServiceImpl extends AbstractServiceImpl<Notification> implements NotificationChercheurService {

@Autowired
private NotificationDao notificationDao;

        @Autowired
        private CategorieNotificationChercheurService categorieNotificationService ;
        @Autowired
        private ChercheurChercheurService chercheurService ;


@Autowired
private EntityManager entityManager;


@Override
public List<Notification> findAll(){
        String query = "SELECT o FROM Notification o where 1=1 ";
        query+= " ORDER BY o.dateNotification";
        return entityManager.createQuery(query).getResultList();
}

        @Override
        public List<Notification> findByChercheurNumeroMatricule(String numeroMatricule){
        return notificationDao.findByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        @Transactional
        public int deleteByChercheurNumeroMatricule(String numeroMatricule){
        return notificationDao.deleteByChercheurNumeroMatricule(numeroMatricule);
        }

        @Override
        public List<Notification> findByChercheurId(Long id){
        return notificationDao.findByChercheurId(id);
        }

        @Override
        @Transactional
        public int deleteByChercheurId(Long id){
        return notificationDao.deleteByChercheurId(id);
        }


        @Override
        public List<Notification> findByCategorieNotificationCode(String code){
        return notificationDao.findByCategorieNotificationCode(code);
        }

        @Override
        @Transactional
        public int deleteByCategorieNotificationCode(String code){
        return notificationDao.deleteByCategorieNotificationCode(code);
        }

        @Override
        public List<Notification> findByCategorieNotificationId(Long id){
        return notificationDao.findByCategorieNotificationId(id);
        }

        @Override
        @Transactional
        public int deleteByCategorieNotificationId(Long id){
        return notificationDao.deleteByCategorieNotificationId(id);
        }


@Override
public Notification findById(Long id){
if(id==null) return null;
return notificationDao.getOne(id);
}

@Override
public Notification findByIdWithAssociatedList(Long id){
return findById(id);
}


@Transactional
public int deleteById(Long id){
int res=0;
if(notificationDao.findById(id).isPresent())  {
notificationDao.deleteById(id);
res = 1;
}
return res;
}


@Override
public Notification update(Notification notification){
Notification foundedNotification = findById(notification.getId());
if(foundedNotification==null) return null;
else{
return  notificationDao.save(notification);
}
}
private void prepareSave(Notification notification){
if(notification.getVu() == null)
  notification.setVu(false);



}

@Override
public Notification save (Notification notification){
prepareSave(notification);



    findChercheur(notification);
    findCategorieNotification(notification);

return notificationDao.save(notification);


}

@Override
public List<Notification> save(List<Notification> notifications){
List<Notification> list = new ArrayList<>();
for(Notification notification: notifications){
list.add(save(notification));
}
return list;
}



@Override
@Transactional
public int delete(Notification notification){
    if(notification.getId()==null) return -1;
    Notification foundedNotification = findById(notification.getId());
    if(foundedNotification==null) return -1;
notificationDao.delete(foundedNotification);
return 1;
}


public List<Notification> findByCriteria(NotificationVo notificationVo){

String query = "SELECT o FROM Notification o where 1=1 ";

            query += SearchUtil.addConstraint( "o", "id","=",notificationVo.getId());
            query += SearchUtil.addConstraint( "o", "libelle","LIKE",notificationVo.getLibelle());
            query += SearchUtil.addConstraint( "o", "description","LIKE",notificationVo.getDescription());
            query += SearchUtil.addConstraint( "o", "vu","=",notificationVo.getVu());
        query += SearchUtil.addConstraintDate( "o", "dateNotification","=",notificationVo.getDateNotification());
        query += SearchUtil.addConstraintDate( "o", "dateLecture","=",notificationVo.getDateLecture());
            query += SearchUtil.addConstraintMinMaxDate("o","dateNotification",notificationVo.getDateNotificationMin(),notificationVo.getDateNotificationMax());
            query += SearchUtil.addConstraintMinMaxDate("o","dateLecture",notificationVo.getDateLectureMin(),notificationVo.getDateLectureMax());
    if(notificationVo.getChercheurVo()!=null){
        query += SearchUtil.addConstraint( "o", "chercheur.id","=",notificationVo.getChercheurVo().getId());
            query += SearchUtil.addConstraint( "o", "chercheur.numeroMatricule","LIKE",notificationVo.getChercheurVo().getNumeroMatricule());
    }

    if(notificationVo.getCategorieNotificationVo()!=null){
        query += SearchUtil.addConstraint( "o", "categorieNotification.id","=",notificationVo.getCategorieNotificationVo().getId());
            query += SearchUtil.addConstraint( "o", "categorieNotification.code","LIKE",notificationVo.getCategorieNotificationVo().getCode());
    }

query+= " ORDER BY o.dateNotification";
return entityManager.createQuery(query).getResultList();
}

    private void findChercheur(Notification notification){
        Chercheur loadedChercheur =chercheurService.findByIdOrNumeroMatricule(notification.getChercheur());

    if(loadedChercheur==null ) {
        return;
    }
    notification.setChercheur(loadedChercheur);
    }
    private void findCategorieNotification(Notification notification){
        CategorieNotification loadedCategorieNotification =categorieNotificationService.findByIdOrCode(notification.getCategorieNotification());

    if(loadedCategorieNotification==null ) {
        return;
    }
    notification.setCategorieNotification(loadedCategorieNotification);
    }

@Override
@Transactional
public void delete(List<Notification> notifications){
        if(ListUtil.isNotEmpty(notifications)){
        notifications.forEach(e->notificationDao.delete(e));
        }
}
@Override
public void update(List<Notification> notifications){
if(ListUtil.isNotEmpty(notifications)){
notifications.forEach(e->notificationDao.save(e));
}
}



}
