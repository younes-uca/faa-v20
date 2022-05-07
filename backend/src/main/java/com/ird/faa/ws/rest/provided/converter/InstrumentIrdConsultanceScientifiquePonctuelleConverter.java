package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.InstrumentIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdConsultanceScientifiquePonctuelleVo;

@Component
public class InstrumentIrdConsultanceScientifiquePonctuelleConverter extends AbstractConverter<InstrumentIrdConsultanceScientifiquePonctuelle,InstrumentIrdConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean consultanceScientifiquePonctuelle;
    private Boolean instrumentIrd;

public  InstrumentIrdConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public InstrumentIrdConsultanceScientifiquePonctuelle toItem(InstrumentIrdConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
InstrumentIrdConsultanceScientifiquePonctuelle item = new InstrumentIrdConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
            if(vo.getExiste() != null)
            item.setExiste(vo.getExiste());
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;


return item;
}
}

@Override
public InstrumentIrdConsultanceScientifiquePonctuelleVo toVo(InstrumentIrdConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
InstrumentIrdConsultanceScientifiquePonctuelleVo vo = new InstrumentIrdConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getExiste()!=null)
        vo.setExiste(item.getExiste());
    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }
    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    consultanceScientifiquePonctuelle = value;
    instrumentIrd = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }

    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }
    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }








}
