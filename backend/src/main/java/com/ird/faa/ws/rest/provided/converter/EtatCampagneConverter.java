package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EtatCampagne;
import com.ird.faa.ws.rest.provided.vo.EtatCampagneVo;

@Component
public class EtatCampagneConverter extends AbstractConverter<EtatCampagne,EtatCampagneVo>{


public  EtatCampagneConverter(){
init(true);
}

@Override
public EtatCampagne toItem(EtatCampagneVo vo) {
if (vo == null) {
return null;
} else {
EtatCampagne item = new EtatCampagne();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getOrdre()))
        item.setOrdre(NumberUtil.toInt(vo.getOrdre()));


return item;
}
}

@Override
public EtatCampagneVo toVo(EtatCampagne item) {
if (item == null) {
return null;
} else {
EtatCampagneVo vo = new EtatCampagneVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(item.getOrdre()!=null)
        vo.setOrdre(NumberUtil.toString(item.getOrdre()));


return vo;
}
}

public void init(Boolean value) {
}











}
