package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiquePubliqueCible;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiquePubliqueCibleVo;

@Component
public class OutilPedagogiquePubliqueCibleConverter extends AbstractConverter<OutilPedagogiquePubliqueCible,OutilPedagogiquePubliqueCibleVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private PubliqueCibleConverter publiqueCibleConverter ;
    private Boolean publiqueCible;
    private Boolean outilPedagogique;

public  OutilPedagogiquePubliqueCibleConverter(){
init(true);
}

@Override
public OutilPedagogiquePubliqueCible toItem(OutilPedagogiquePubliqueCibleVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiquePubliqueCible item = new OutilPedagogiquePubliqueCible();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPubliqueCibleVo()!=null && this.publiqueCible)
        item.setPubliqueCible(publiqueCibleConverter.toItem(vo.getPubliqueCibleVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiquePubliqueCibleVo toVo(OutilPedagogiquePubliqueCible item) {
if (item == null) {
return null;
} else {
OutilPedagogiquePubliqueCibleVo vo = new OutilPedagogiquePubliqueCibleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPubliqueCible()!=null && this.publiqueCible) {
        vo.setPubliqueCibleVo(publiqueCibleConverter.toVo(item.getPubliqueCible())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    publiqueCible = value;
    outilPedagogique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public PubliqueCibleConverter getPubliqueCibleConverter(){
        return this.publiqueCibleConverter;
        }
        public void setPubliqueCibleConverter(PubliqueCibleConverter publiqueCibleConverter ){
        this.publiqueCibleConverter = publiqueCibleConverter;
        }

    public boolean  isPubliqueCible(){
    return this.publiqueCible;
    }
    public void  setPubliqueCible(boolean publiqueCible){
    this.publiqueCible = publiqueCible;
    }
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
