package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeExpertise;
import com.ird.faa.ws.rest.provided.vo.TypeExpertiseVo;

@Component
public class TypeExpertiseConverter extends AbstractConverter<TypeExpertise,TypeExpertiseVo>{


public  TypeExpertiseConverter(){
init(true);
}

@Override
public TypeExpertise toItem(TypeExpertiseVo vo) {
if (vo == null) {
return null;
} else {
TypeExpertise item = new TypeExpertise();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
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
public TypeExpertiseVo toVo(TypeExpertise item) {
if (item == null) {
return null;
} else {
TypeExpertiseVo vo = new TypeExpertiseVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

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
