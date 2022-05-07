package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo;

@Component
public class RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter extends AbstractConverter<RencontreGrandPubliqueJeunePubliqueInstrumentIrd,RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean instrumentIrd;
    private Boolean rencontreGrandPubliqueJeunePublique;

public  RencontreGrandPubliqueJeunePubliqueInstrumentIrdConverter(){
init(true);
}

@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrd toItem(RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliqueInstrumentIrd item = new RencontreGrandPubliqueJeunePubliqueInstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;


return item;
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo toVo(RencontreGrandPubliqueJeunePubliqueInstrumentIrd item) {
if (item == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo vo = new RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }
    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    instrumentIrd = value;
    rencontreGrandPubliqueJeunePublique = value;
}


        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
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
    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }






}
