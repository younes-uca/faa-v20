package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiqueTypeInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueTypeInstrumentIrdVo;

@Component
public class OutilPedagogiqueTypeInstrumentIrdConverter extends AbstractConverter<OutilPedagogiqueTypeInstrumentIrd,OutilPedagogiqueTypeInstrumentIrdVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private TypeInstrumentIrdConverter typeInstrumentIrdConverter ;
    private Boolean typeInstrumentIrd;
    private Boolean outilPedagogique;

public  OutilPedagogiqueTypeInstrumentIrdConverter(){
init(true);
}

@Override
public OutilPedagogiqueTypeInstrumentIrd toItem(OutilPedagogiqueTypeInstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiqueTypeInstrumentIrd item = new OutilPedagogiqueTypeInstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeInstrumentIrdVo()!=null && this.typeInstrumentIrd)
        item.setTypeInstrumentIrd(typeInstrumentIrdConverter.toItem(vo.getTypeInstrumentIrdVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiqueTypeInstrumentIrdVo toVo(OutilPedagogiqueTypeInstrumentIrd item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueTypeInstrumentIrdVo vo = new OutilPedagogiqueTypeInstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeInstrumentIrd()!=null && this.typeInstrumentIrd) {
        vo.setTypeInstrumentIrdVo(typeInstrumentIrdConverter.toVo(item.getTypeInstrumentIrd())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeInstrumentIrd = value;
    outilPedagogique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
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
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
