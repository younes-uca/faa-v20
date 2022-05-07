package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.VieInstitutionnelleDetailInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleDetailInstrumentIrdVo;

@Component
public class VieInstitutionnelleDetailInstrumentIrdConverter extends AbstractConverter<VieInstitutionnelleDetailInstrumentIrd,VieInstitutionnelleDetailInstrumentIrdVo>{

        @Autowired
        private VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean vieInstitutionnelleDetail;
    private Boolean instrumentIrd;

public  VieInstitutionnelleDetailInstrumentIrdConverter(){
init(true);
}

@Override
public VieInstitutionnelleDetailInstrumentIrd toItem(VieInstitutionnelleDetailInstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
VieInstitutionnelleDetailInstrumentIrd item = new VieInstitutionnelleDetailInstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getVieInstitutionnelleDetailVo()!=null && this.vieInstitutionnelleDetail)
        item.setVieInstitutionnelleDetail(vieInstitutionnelleDetailConverter.toItem(vo.getVieInstitutionnelleDetailVo())) ;
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;


return item;
}
}

@Override
public VieInstitutionnelleDetailInstrumentIrdVo toVo(VieInstitutionnelleDetailInstrumentIrd item) {
if (item == null) {
return null;
} else {
VieInstitutionnelleDetailInstrumentIrdVo vo = new VieInstitutionnelleDetailInstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getVieInstitutionnelleDetail()!=null && this.vieInstitutionnelleDetail) {
        vo.setVieInstitutionnelleDetailVo(vieInstitutionnelleDetailConverter.toVo(item.getVieInstitutionnelleDetail())) ;
    }
    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    vieInstitutionnelleDetail = value;
    instrumentIrd = value;
}


        public VieInstitutionnelleDetailConverter getVieInstitutionnelleDetailConverter(){
        return this.vieInstitutionnelleDetailConverter;
        }
        public void setVieInstitutionnelleDetailConverter(VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ){
        this.vieInstitutionnelleDetailConverter = vieInstitutionnelleDetailConverter;
        }
        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }

    public boolean  isVieInstitutionnelleDetail(){
    return this.vieInstitutionnelleDetail;
    }
    public void  setVieInstitutionnelleDetail(boolean vieInstitutionnelleDetail){
    this.vieInstitutionnelleDetail = vieInstitutionnelleDetail;
    }
    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }






}
