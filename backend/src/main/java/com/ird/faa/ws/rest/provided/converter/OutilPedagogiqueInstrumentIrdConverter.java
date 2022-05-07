package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueInstrumentIrdVo;

@Component
public class OutilPedagogiqueInstrumentIrdConverter extends AbstractConverter<OutilPedagogiqueInstrumentIrd,OutilPedagogiqueInstrumentIrdVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean instrumentIrd;
    private Boolean outilPedagogique;

public  OutilPedagogiqueInstrumentIrdConverter(){
init(true);
}

@Override
public OutilPedagogiqueInstrumentIrd toItem(OutilPedagogiqueInstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiqueInstrumentIrd item = new OutilPedagogiqueInstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiqueInstrumentIrdVo toVo(OutilPedagogiqueInstrumentIrd item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueInstrumentIrdVo vo = new OutilPedagogiqueInstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    instrumentIrd = value;
    outilPedagogique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }

    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
