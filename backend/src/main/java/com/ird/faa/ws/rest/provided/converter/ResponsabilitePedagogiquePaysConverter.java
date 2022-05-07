package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ResponsabilitePedagogiquePays;
import com.ird.faa.ws.rest.provided.vo.ResponsabilitePedagogiquePaysVo;

@Component
public class ResponsabilitePedagogiquePaysConverter extends AbstractConverter<ResponsabilitePedagogiquePays,ResponsabilitePedagogiquePaysVo>{

        @Autowired
        private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean responsabilitePedagogique;

public  ResponsabilitePedagogiquePaysConverter(){
init(true);
}

@Override
public ResponsabilitePedagogiquePays toItem(ResponsabilitePedagogiquePaysVo vo) {
if (vo == null) {
return null;
} else {
ResponsabilitePedagogiquePays item = new ResponsabilitePedagogiquePays();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getResponsabilitePedagogiqueVo()!=null && this.responsabilitePedagogique)
        item.setResponsabilitePedagogique(responsabilitePedagogiqueConverter.toItem(vo.getResponsabilitePedagogiqueVo())) ;


return item;
}
}

@Override
public ResponsabilitePedagogiquePaysVo toVo(ResponsabilitePedagogiquePays item) {
if (item == null) {
return null;
} else {
ResponsabilitePedagogiquePaysVo vo = new ResponsabilitePedagogiquePaysVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getResponsabilitePedagogique()!=null && this.responsabilitePedagogique) {
        vo.setResponsabilitePedagogiqueVo(responsabilitePedagogiqueConverter.toVo(item.getResponsabilitePedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    responsabilitePedagogique = value;
}


        public ResponsabilitePedagogiqueConverter getResponsabilitePedagogiqueConverter(){
        return this.responsabilitePedagogiqueConverter;
        }
        public void setResponsabilitePedagogiqueConverter(ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ){
        this.responsabilitePedagogiqueConverter = responsabilitePedagogiqueConverter;
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
    public boolean  isResponsabilitePedagogique(){
    return this.responsabilitePedagogique;
    }
    public void  setResponsabilitePedagogique(boolean responsabilitePedagogique){
    this.responsabilitePedagogique = responsabilitePedagogique;
    }






}
