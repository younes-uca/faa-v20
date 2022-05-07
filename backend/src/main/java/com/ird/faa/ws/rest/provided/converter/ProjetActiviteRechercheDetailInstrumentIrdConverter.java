package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRechercheDetailInstrumentIrd;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheDetailInstrumentIrdVo;

@Component
public class ProjetActiviteRechercheDetailInstrumentIrdConverter extends AbstractConverter<ProjetActiviteRechercheDetailInstrumentIrd,ProjetActiviteRechercheDetailInstrumentIrdVo>{

        @Autowired
        private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ;
        @Autowired
        private InstrumentIrdConverter instrumentIrdConverter ;
    private Boolean projetActiviteRechercheDetail;
    private Boolean instrumentIrd;

public  ProjetActiviteRechercheDetailInstrumentIrdConverter(){
init(true);
}

@Override
public ProjetActiviteRechercheDetailInstrumentIrd toItem(ProjetActiviteRechercheDetailInstrumentIrdVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRechercheDetailInstrumentIrd item = new ProjetActiviteRechercheDetailInstrumentIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getProjetActiviteRechercheDetailVo()!=null && this.projetActiviteRechercheDetail)
        item.setProjetActiviteRechercheDetail(projetActiviteRechercheDetailConverter.toItem(vo.getProjetActiviteRechercheDetailVo())) ;
    if(vo.getInstrumentIrdVo()!=null && this.instrumentIrd)
        item.setInstrumentIrd(instrumentIrdConverter.toItem(vo.getInstrumentIrdVo())) ;


return item;
}
}

@Override
public ProjetActiviteRechercheDetailInstrumentIrdVo toVo(ProjetActiviteRechercheDetailInstrumentIrd item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheDetailInstrumentIrdVo vo = new ProjetActiviteRechercheDetailInstrumentIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getProjetActiviteRechercheDetail()!=null && this.projetActiviteRechercheDetail) {
        vo.setProjetActiviteRechercheDetailVo(projetActiviteRechercheDetailConverter.toVo(item.getProjetActiviteRechercheDetail())) ;
    }
    if(item.getInstrumentIrd()!=null && this.instrumentIrd) {
        vo.setInstrumentIrdVo(instrumentIrdConverter.toVo(item.getInstrumentIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    projetActiviteRechercheDetail = value;
    instrumentIrd = value;
}


        public ProjetActiviteRechercheDetailConverter getProjetActiviteRechercheDetailConverter(){
        return this.projetActiviteRechercheDetailConverter;
        }
        public void setProjetActiviteRechercheDetailConverter(ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ){
        this.projetActiviteRechercheDetailConverter = projetActiviteRechercheDetailConverter;
        }
        public InstrumentIrdConverter getInstrumentIrdConverter(){
        return this.instrumentIrdConverter;
        }
        public void setInstrumentIrdConverter(InstrumentIrdConverter instrumentIrdConverter ){
        this.instrumentIrdConverter = instrumentIrdConverter;
        }

    public boolean  isProjetActiviteRechercheDetail(){
    return this.projetActiviteRechercheDetail;
    }
    public void  setProjetActiviteRechercheDetail(boolean projetActiviteRechercheDetail){
    this.projetActiviteRechercheDetail = projetActiviteRechercheDetail;
    }
    public boolean  isInstrumentIrd(){
    return this.instrumentIrd;
    }
    public void  setInstrumentIrd(boolean instrumentIrd){
    this.instrumentIrd = instrumentIrd;
    }






}
