package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.NiveauResponsabilitePedagogique;
import com.ird.faa.ws.rest.provided.vo.NiveauResponsabilitePedagogiqueVo;

@Component
public class NiveauResponsabilitePedagogiqueConverter extends AbstractConverter<NiveauResponsabilitePedagogique,NiveauResponsabilitePedagogiqueVo>{


public  NiveauResponsabilitePedagogiqueConverter(){
init(true);
}

@Override
public NiveauResponsabilitePedagogique toItem(NiveauResponsabilitePedagogiqueVo vo) {
if (vo == null) {
return null;
} else {
NiveauResponsabilitePedagogique item = new NiveauResponsabilitePedagogique();
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
public NiveauResponsabilitePedagogiqueVo toVo(NiveauResponsabilitePedagogique item) {
if (item == null) {
return null;
} else {
NiveauResponsabilitePedagogiqueVo vo = new NiveauResponsabilitePedagogiqueVo();
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
