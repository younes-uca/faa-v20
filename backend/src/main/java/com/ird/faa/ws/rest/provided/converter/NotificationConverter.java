package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Notification;
import com.ird.faa.ws.rest.provided.vo.NotificationVo;

@Component
public class NotificationConverter extends AbstractConverter<Notification,NotificationVo>{

        @Autowired
        private CategorieNotificationConverter categorieNotificationConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean chercheur;
    private Boolean categorieNotification;

public  NotificationConverter(){
init(true);
}

@Override
public Notification toItem(NotificationVo vo) {
if (vo == null) {
return null;
} else {
Notification item = new Notification();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());
            if(vo.getVu() != null)
            item.setVu(vo.getVu());
        if(StringUtil.isNotEmpty(vo.getDateNotification()))
        item.setDateNotification(DateUtil.parse(vo.getDateNotification()));
        if(StringUtil.isNotEmpty(vo.getDateLecture()))
        item.setDateLecture(DateUtil.parse(vo.getDateLecture()));
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCategorieNotificationVo()!=null && this.categorieNotification)
        item.setCategorieNotification(categorieNotificationConverter.toItem(vo.getCategorieNotificationVo())) ;


return item;
}
}

@Override
public NotificationVo toVo(Notification item) {
if (item == null) {
return null;
} else {
NotificationVo vo = new NotificationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());

        if(item.getVu()!=null)
        vo.setVu(item.getVu());
        if(item.getDateNotification()!=null)
        vo.setDateNotification(DateUtil.formateDate(item.getDateNotification()));
        if(item.getDateLecture()!=null)
        vo.setDateLecture(DateUtil.formateDate(item.getDateLecture()));
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCategorieNotification()!=null && this.categorieNotification) {
        vo.setCategorieNotificationVo(categorieNotificationConverter.toVo(item.getCategorieNotification())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    chercheur = value;
    categorieNotification = value;
}


        public CategorieNotificationConverter getCategorieNotificationConverter(){
        return this.categorieNotificationConverter;
        }
        public void setCategorieNotificationConverter(CategorieNotificationConverter categorieNotificationConverter ){
        this.categorieNotificationConverter = categorieNotificationConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isCategorieNotification(){
    return this.categorieNotification;
    }
    public void  setCategorieNotification(boolean categorieNotification){
    this.categorieNotification = categorieNotification;
    }
















}
