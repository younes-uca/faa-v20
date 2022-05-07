package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.NatureActiviteGrandPublique;
import com.ird.faa.ws.rest.provided.vo.NatureActiviteGrandPubliqueVo;

@Component
public class NatureActiviteGrandPubliqueConverter extends AbstractConverter<NatureActiviteGrandPublique,NatureActiviteGrandPubliqueVo>{


public  NatureActiviteGrandPubliqueConverter(){
init(true);
}

@Override
public NatureActiviteGrandPublique toItem(NatureActiviteGrandPubliqueVo vo) {
if (vo == null) {
return null;
} else {
NatureActiviteGrandPublique item = new NatureActiviteGrandPublique();
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
public NatureActiviteGrandPubliqueVo toVo(NatureActiviteGrandPublique item) {
if (item == null) {
return null;
} else {
NatureActiviteGrandPubliqueVo vo = new NatureActiviteGrandPubliqueVo();
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
