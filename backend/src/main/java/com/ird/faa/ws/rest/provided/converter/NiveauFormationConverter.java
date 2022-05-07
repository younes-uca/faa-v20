package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.NiveauFormation;
import com.ird.faa.ws.rest.provided.vo.NiveauFormationVo;

@Component
public class NiveauFormationConverter extends AbstractConverter<NiveauFormation,NiveauFormationVo>{


public  NiveauFormationConverter(){
init(true);
}

@Override
public NiveauFormation toItem(NiveauFormationVo vo) {
if (vo == null) {
return null;
} else {
NiveauFormation item = new NiveauFormation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelleMicro()))
        item.setLibelleMicro(vo.getLibelleMicro());
        if(StringUtil.isNotEmpty(vo.getLibelleMacro()))
        item.setLibelleMacro(vo.getLibelleMacro());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
            if(vo.getArchive() != null)
            item.setArchive(vo.getArchive());
        if(StringUtil.isNotEmpty(vo.getDateArchivage()))
        item.setDateArchivage(DateUtil.parse(vo.getDateArchivage()));
        if(StringUtil.isNotEmpty(vo.getDateCreation()))
        item.setDateCreation(DateUtil.parse(vo.getDateCreation()));
            if(vo.getAdmin() != null)
            item.setAdmin(vo.getAdmin());
            if(vo.getVisible() != null)
            item.setVisible(vo.getVisible());
        if(StringUtil.isNotEmpty(vo.getUsername()))
        item.setUsername(vo.getUsername());


return item;
}
}

@Override
public NiveauFormationVo toVo(NiveauFormation item) {
if (item == null) {
return null;
} else {
NiveauFormationVo vo = new NiveauFormationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelleMicro()))
        vo.setLibelleMicro(item.getLibelleMicro());

        if(StringUtil.isNotEmpty(item.getLibelleMacro()))
        vo.setLibelleMacro(item.getLibelleMacro());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(item.getArchive()!=null)
        vo.setArchive(item.getArchive());
        if(item.getDateArchivage()!=null)
        vo.setDateArchivage(DateUtil.formateDate(item.getDateArchivage()));
        if(item.getDateCreation()!=null)
        vo.setDateCreation(DateUtil.formateDate(item.getDateCreation()));
        if(item.getAdmin()!=null)
        vo.setAdmin(item.getAdmin());
        if(item.getVisible()!=null)
        vo.setVisible(item.getVisible());
        if(StringUtil.isNotEmpty(item.getUsername()))
        vo.setUsername(item.getUsername());


return vo;
}
}

public void init(Boolean value) {
}























}
