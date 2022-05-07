package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RoleDeveloppementDeSavoir;
import com.ird.faa.ws.rest.provided.vo.RoleDeveloppementDeSavoirVo;

@Component
public class RoleDeveloppementDeSavoirConverter extends AbstractConverter<RoleDeveloppementDeSavoir,RoleDeveloppementDeSavoirVo>{


public  RoleDeveloppementDeSavoirConverter(){
init(true);
}

@Override
public RoleDeveloppementDeSavoir toItem(RoleDeveloppementDeSavoirVo vo) {
if (vo == null) {
return null;
} else {
RoleDeveloppementDeSavoir item = new RoleDeveloppementDeSavoir();
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
public RoleDeveloppementDeSavoirVo toVo(RoleDeveloppementDeSavoir item) {
if (item == null) {
return null;
} else {
RoleDeveloppementDeSavoirVo vo = new RoleDeveloppementDeSavoirVo();
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
