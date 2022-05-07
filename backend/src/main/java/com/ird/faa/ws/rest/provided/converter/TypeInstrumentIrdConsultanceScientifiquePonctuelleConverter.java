package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeInstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.TypeInstrumentIrdConsultanceScientifiquePonctuelleVo;

@Component
public class TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter extends AbstractConverter<TypeInstrumentIrdConsultanceScientifiquePonctuelle,TypeInstrumentIrdConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private TypeInstrumentIrdConverter typeInstrumentIrdConverter ;
        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
    private Boolean typeInstrumentIrd;
    private Boolean consultanceScientifiquePonctuelle;

public  TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelle toItem(TypeInstrumentIrdConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
TypeInstrumentIrdConsultanceScientifiquePonctuelle item = new TypeInstrumentIrdConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeInstrumentIrdVo()!=null && this.typeInstrumentIrd)
        item.setTypeInstrumentIrd(typeInstrumentIrdConverter.toItem(vo.getTypeInstrumentIrdVo())) ;
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;


return item;
}
}

@Override
public TypeInstrumentIrdConsultanceScientifiquePonctuelleVo toVo(TypeInstrumentIrdConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
TypeInstrumentIrdConsultanceScientifiquePonctuelleVo vo = new TypeInstrumentIrdConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeInstrumentIrd()!=null && this.typeInstrumentIrd) {
        vo.setTypeInstrumentIrdVo(typeInstrumentIrdConverter.toVo(item.getTypeInstrumentIrd())) ;
    }
    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeInstrumentIrd = value;
    consultanceScientifiquePonctuelle = value;
}


        public TypeInstrumentIrdConverter getTypeInstrumentIrdConverter(){
        return this.typeInstrumentIrdConverter;
        }
        public void setTypeInstrumentIrdConverter(TypeInstrumentIrdConverter typeInstrumentIrdConverter ){
        this.typeInstrumentIrdConverter = typeInstrumentIrdConverter;
        }
        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }

    public boolean  isTypeInstrumentIrd(){
    return this.typeInstrumentIrd;
    }
    public void  setTypeInstrumentIrd(boolean typeInstrumentIrd){
    this.typeInstrumentIrd = typeInstrumentIrd;
    }
    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }






}
