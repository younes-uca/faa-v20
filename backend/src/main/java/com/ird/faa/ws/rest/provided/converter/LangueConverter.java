package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Langue;
import com.ird.faa.ws.rest.provided.vo.LangueVo;

@Component
public class LangueConverter extends AbstractConverter<Langue,LangueVo>{


public  LangueConverter(){
init(true);
}

@Override
public Langue toItem(LangueVo vo) {
if (vo == null) {
return null;
} else {
Langue item = new Langue();
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
public LangueVo toVo(Langue item) {
if (item == null) {
return null;
} else {
LangueVo vo = new LangueVo();
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
