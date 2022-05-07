package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiquePaysDiffusion;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePaysDiffusionVo;

@Component
public class OutilPedagogiquePaysDiffusionConverter extends AbstractConverter<OutilPedagogiquePaysDiffusion,OutilPedagogiquePaysDiffusionVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean outilPedagogique;

public  OutilPedagogiquePaysDiffusionConverter(){
init(true);
}

@Override
public OutilPedagogiquePaysDiffusion toItem(OutilPedagogiquePaysDiffusionVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiquePaysDiffusion item = new OutilPedagogiquePaysDiffusion();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiquePaysDiffusionVo toVo(OutilPedagogiquePaysDiffusion item) {
if (item == null) {
return null;
} else {
OutilPedagogiquePaysDiffusionVo vo = new OutilPedagogiquePaysDiffusionVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    outilPedagogique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
