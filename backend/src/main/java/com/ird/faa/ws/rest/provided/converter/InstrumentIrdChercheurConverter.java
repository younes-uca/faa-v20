package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.InstrumentIrdChercheur;
import com.ird.faa.ws.rest.provided.vo.InstrumentIrdChercheurVo;

@Component
public class InstrumentIrdChercheurConverter extends AbstractConverter<InstrumentIrdChercheur,InstrumentIrdChercheurVo>{

        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean instrumentIrd;
    private Boolean chercheur;

public  InstrumentIrdChercheurConverter(){
init(true);
}

@Override
public InstrumentIrdChercheur toItem(InstrumentIrdChercheurVo vo) {
if (vo == null) {
return null;
} else {
InstrumentIrdChercheur item = new InstrumentIrdChercheur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getNatureImplication()))
        item.setNatureImplication(vo.getNatureImplication());
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public InstrumentIrdChercheurVo toVo(InstrumentIrdChercheur item) {
if (item == null) {
return null;
} else {
InstrumentIrdChercheurVo vo = new InstrumentIrdChercheurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getNatureImplication()))
        vo.setNatureImplication(item.getNatureImplication());

    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    instrumentIrd = value;
    chercheur = value;
}


        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }








}
