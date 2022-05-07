package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ResponsabilitePedagogiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiqueEnjeuxIrdVo;

@Component
public class ResponsabilitePedagogiqueEnjeuxIrdConverter extends AbstractConverter<ResponsabilitePedagogiqueEnjeuxIrd,ResponsabilitePedagogiqueEnjeuxIrdVo>{

        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
        @Autowired
        private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ;
    private Boolean enjeuxIrd;
    private Boolean responsabilitePedagogique;

public  ResponsabilitePedagogiqueEnjeuxIrdConverter(){
init(true);
}

@Override
public ResponsabilitePedagogiqueEnjeuxIrd toItem(ResponsabilitePedagogiqueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
ResponsabilitePedagogiqueEnjeuxIrd item = new ResponsabilitePedagogiqueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getResponsabilitePedagogiqueVo()!=null && this.responsabilitePedagogique)
        item.setResponsabilitePedagogique(responsabilitePedagogiqueConverter.toItem(vo.getResponsabilitePedagogiqueVo())) ;


return item;
}
}

@Override
public ResponsabilitePedagogiqueEnjeuxIrdVo toVo(ResponsabilitePedagogiqueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
ResponsabilitePedagogiqueEnjeuxIrdVo vo = new ResponsabilitePedagogiqueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getResponsabilitePedagogique()!=null && this.responsabilitePedagogique) {
        vo.setResponsabilitePedagogiqueVo(responsabilitePedagogiqueConverter.toVo(item.getResponsabilitePedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    responsabilitePedagogique = value;
}


        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }
        public ResponsabilitePedagogiqueConverter getResponsabilitePedagogiqueConverter(){
        return this.responsabilitePedagogiqueConverter;
        }
        public void setResponsabilitePedagogiqueConverter(ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ){
        this.responsabilitePedagogiqueConverter = responsabilitePedagogiqueConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isResponsabilitePedagogique(){
    return this.responsabilitePedagogique;
    }
    public void  setResponsabilitePedagogique(boolean responsabilitePedagogique){
    this.responsabilitePedagogique = responsabilitePedagogique;
    }






}
