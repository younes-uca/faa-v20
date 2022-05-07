package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CategorieNotification;
import com.ird.faa.ws.rest.provided.vo.CategorieNotificationVo;

@Component
public class CategorieNotificationConverter extends AbstractConverter<CategorieNotification,CategorieNotificationVo>{


public  CategorieNotificationConverter(){
init(true);
}

@Override
public CategorieNotification toItem(CategorieNotificationVo vo) {
if (vo == null) {
return null;
} else {
CategorieNotification item = new CategorieNotification();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());


return item;
}
}

@Override
public CategorieNotificationVo toVo(CategorieNotification item) {
if (item == null) {
return null;
} else {
CategorieNotificationVo vo = new CategorieNotificationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());


return vo;
}
}

public void init(Boolean value) {
}









}
