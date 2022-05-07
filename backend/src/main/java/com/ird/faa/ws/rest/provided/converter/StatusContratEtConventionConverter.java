package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.StatusContratEtConvention;
import com.ird.faa.ws.rest.provided.vo.StatusContratEtConventionVo;

@Component
public class StatusContratEtConventionConverter extends AbstractConverter<StatusContratEtConvention,StatusContratEtConventionVo>{


public  StatusContratEtConventionConverter(){
init(true);
}

@Override
public StatusContratEtConvention toItem(StatusContratEtConventionVo vo) {
if (vo == null) {
return null;
} else {
StatusContratEtConvention item = new StatusContratEtConvention();
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
public StatusContratEtConventionVo toVo(StatusContratEtConvention item) {
if (item == null) {
return null;
} else {
StatusContratEtConventionVo vo = new StatusContratEtConventionVo();
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
