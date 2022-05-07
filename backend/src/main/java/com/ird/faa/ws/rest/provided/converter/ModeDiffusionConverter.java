package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ModeDiffusion;
import com.ird.faa.ws.rest.provided.vo.ModeDiffusionVo;

@Component
public class ModeDiffusionConverter extends AbstractConverter<ModeDiffusion,ModeDiffusionVo>{

        @Autowired
        private TypeSavoirConverter typeSavoirConverter ;
    private Boolean typeSavoir;

public  ModeDiffusionConverter(){
init(true);
}

@Override
public ModeDiffusion toItem(ModeDiffusionVo vo) {
if (vo == null) {
return null;
} else {
ModeDiffusion item = new ModeDiffusion();
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
    if(vo.getTypeSavoirVo()!=null && this.typeSavoir)
        item.setTypeSavoir(typeSavoirConverter.toItem(vo.getTypeSavoirVo())) ;


return item;
}
}

@Override
public ModeDiffusionVo toVo(ModeDiffusion item) {
if (item == null) {
return null;
} else {
ModeDiffusionVo vo = new ModeDiffusionVo();
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

    if(item.getTypeSavoir()!=null && this.typeSavoir) {
        vo.setTypeSavoirVo(typeSavoirConverter.toVo(item.getTypeSavoir())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeSavoir = value;
}


        public TypeSavoirConverter getTypeSavoirConverter(){
        return this.typeSavoirConverter;
        }
        public void setTypeSavoirConverter(TypeSavoirConverter typeSavoirConverter ){
        this.typeSavoirConverter = typeSavoirConverter;
        }

    public boolean  isTypeSavoir(){
    return this.typeSavoir;
    }
    public void  setTypeSavoir(boolean typeSavoir){
    this.typeSavoir = typeSavoir;
    }




















}
