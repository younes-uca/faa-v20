package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueEnjeuxIrdVo;

@Component
public class OutilPedagogiqueEnjeuxIrdConverter extends AbstractConverter<OutilPedagogiqueEnjeuxIrd,OutilPedagogiqueEnjeuxIrdVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean outilPedagogique;
    private Boolean enjeuxIrd;

public  OutilPedagogiqueEnjeuxIrdConverter(){
init(true);
}

@Override
public OutilPedagogiqueEnjeuxIrd toItem(OutilPedagogiqueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiqueEnjeuxIrd item = new OutilPedagogiqueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public OutilPedagogiqueEnjeuxIrdVo toVo(OutilPedagogiqueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueEnjeuxIrdVo vo = new OutilPedagogiqueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    outilPedagogique = value;
    enjeuxIrd = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
