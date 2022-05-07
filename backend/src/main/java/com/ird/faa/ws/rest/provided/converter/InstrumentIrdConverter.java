package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.InstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdVo;

@Component
public class InstrumentIrdConverter extends AbstractConverter<InstrumentIrd,InstrumentIrdVo>{

        @Autowired
        private TypeInstrumentIrdConverter typeInstrumentIrdConverter ;
    private Boolean typeInstrumentIrd;

public  InstrumentIrdConverter(){
init(true);
}

@Override
public InstrumentIrd toItem(InstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
InstrumentIrd item = new InstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getCode()))
        item.setCode(vo.getCode());
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
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
    if(vo.getTypeInstrumentIrdVo()!=null && this.typeInstrumentIrd)
        item.setTypeInstrumentIrd(typeInstrumentIrdConverter.toItem(vo.getTypeInstrumentIrdVo())) ;


return item;
}
}

@Override
public InstrumentIrdVo toVo(InstrumentIrd item) {
if (item == null) {
return null;
} else {
InstrumentIrdVo vo = new InstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getCode()))
        vo.setCode(item.getCode());

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

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

    if(item.getTypeInstrumentIrd()!=null && this.typeInstrumentIrd) {
        vo.setTypeInstrumentIrdVo(typeInstrumentIrdConverter.toVo(item.getTypeInstrumentIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeInstrumentIrd = value;
}


        public TypeInstrumentIrdConverter getTypeInstrumentIrdConverter(){
        return this.typeInstrumentIrdConverter;
        }
        public void setTypeInstrumentIrdConverter(TypeInstrumentIrdConverter typeInstrumentIrdConverter ){
        this.typeInstrumentIrdConverter = typeInstrumentIrdConverter;
        }

    public boolean  isTypeInstrumentIrd(){
    return this.typeInstrumentIrd;
    }
    public void  setTypeInstrumentIrd(boolean typeInstrumentIrd){
    this.typeInstrumentIrd = typeInstrumentIrd;
    }




















}
