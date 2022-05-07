package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EntiteAdministrative;
import com.ird.faa.ws.rest.provided.vo.EntiteAdministrativeVo;

@Component
public class EntiteAdministrativeConverter extends AbstractConverter<EntiteAdministrative,EntiteAdministrativeVo>{

        @Autowired
        private TypeEntiteAdministrativeConverter typeEntiteAdministrativeConverter ;
    private Boolean typeEntiteAdministrative;

public  EntiteAdministrativeConverter(){
init(true);
}

@Override
public EntiteAdministrative toItem(EntiteAdministrativeVo vo) {
if (vo == null) {
return null;
} else {
EntiteAdministrative item = new EntiteAdministrative();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getIdentifiantNational()))
        item.setIdentifiantNational(vo.getIdentifiantNational());
        if(StringUtil.isNotEmpty(vo.getSiteWeb()))
        item.setSiteWeb(vo.getSiteWeb());
        if(StringUtil.isNotEmpty(vo.getLibelleCourt()))
        item.setLibelleCourt(vo.getLibelleCourt());
        if(StringUtil.isNotEmpty(vo.getLibelleLong()))
        item.setLibelleLong(vo.getLibelleLong());
        if(StringUtil.isNotEmpty(vo.getDescription()))
        item.setDescription(vo.getDescription());
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
    if(vo.getTypeEntiteAdministrativeVo()!=null && this.typeEntiteAdministrative)
        item.setTypeEntiteAdministrative(typeEntiteAdministrativeConverter.toItem(vo.getTypeEntiteAdministrativeVo())) ;


return item;
}
}

@Override
public EntiteAdministrativeVo toVo(EntiteAdministrative item) {
if (item == null) {
return null;
} else {
EntiteAdministrativeVo vo = new EntiteAdministrativeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(StringUtil.isNotEmpty(item.getIdentifiantNational()))
        vo.setIdentifiantNational(item.getIdentifiantNational());

        if(StringUtil.isNotEmpty(item.getSiteWeb()))
        vo.setSiteWeb(item.getSiteWeb());

        if(StringUtil.isNotEmpty(item.getLibelleCourt()))
        vo.setLibelleCourt(item.getLibelleCourt());

        if(StringUtil.isNotEmpty(item.getLibelleLong()))
        vo.setLibelleLong(item.getLibelleLong());

        if(StringUtil.isNotEmpty(item.getDescription()))
        vo.setDescription(item.getDescription());

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

    if(item.getTypeEntiteAdministrative()!=null && this.typeEntiteAdministrative) {
        vo.setTypeEntiteAdministrativeVo(typeEntiteAdministrativeConverter.toVo(item.getTypeEntiteAdministrative())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeEntiteAdministrative = value;
}


        public TypeEntiteAdministrativeConverter getTypeEntiteAdministrativeConverter(){
        return this.typeEntiteAdministrativeConverter;
        }
        public void setTypeEntiteAdministrativeConverter(TypeEntiteAdministrativeConverter typeEntiteAdministrativeConverter ){
        this.typeEntiteAdministrativeConverter = typeEntiteAdministrativeConverter;
        }

    public boolean  isTypeEntiteAdministrative(){
    return this.typeEntiteAdministrative;
    }
    public void  setTypeEntiteAdministrative(boolean typeEntiteAdministrative){
    this.typeEntiteAdministrative = typeEntiteAdministrative;
    }






























}
