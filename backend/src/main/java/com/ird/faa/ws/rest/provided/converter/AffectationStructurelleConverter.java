package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.AffectationStructurelle;
import com.ird.faa.ws.rest.provided.vo.AffectationStructurelleVo;

@Component
public class AffectationStructurelleConverter extends AbstractConverter<AffectationStructurelle,AffectationStructurelleVo>{


public  AffectationStructurelleConverter(){
init(true);
}

@Override
public AffectationStructurelle toItem(AffectationStructurelleVo vo) {
if (vo == null) {
return null;
} else {
AffectationStructurelle item = new AffectationStructurelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getLibelleCourt()))
        item.setLibelleCourt(vo.getLibelleCourt());
        if(StringUtil.isNotEmpty(vo.getLibelleLong()))
        item.setLibelleLong(vo.getLibelleLong());


return item;
}
}

@Override
public AffectationStructurelleVo toVo(AffectationStructurelle item) {
if (item == null) {
return null;
} else {
AffectationStructurelleVo vo = new AffectationStructurelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(StringUtil.isNotEmpty(item.getLibelleCourt()))
        vo.setLibelleCourt(item.getLibelleCourt());

        if(StringUtil.isNotEmpty(item.getLibelleLong()))
        vo.setLibelleLong(item.getLibelleLong());


return vo;
}
}

public void init(Boolean value) {
}











}
