package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.OutilPedagogiqueLangue;
import com.ird.faa.ws.rest.provided.vo.OutilPedagogiqueLangueVo;

@Component
public class OutilPedagogiqueLangueConverter extends AbstractConverter<OutilPedagogiqueLangue,OutilPedagogiqueLangueVo>{

        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
        @Autowired
        private LangueConverter langueConverter ;
    private Boolean langue;
    private Boolean outilPedagogique;

public  OutilPedagogiqueLangueConverter(){
init(true);
}

@Override
public OutilPedagogiqueLangue toItem(OutilPedagogiqueLangueVo vo) {
if (vo == null) {
return null;
} else {
OutilPedagogiqueLangue item = new OutilPedagogiqueLangue();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getLangueVo()!=null && this.langue)
        item.setLangue(langueConverter.toItem(vo.getLangueVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public OutilPedagogiqueLangueVo toVo(OutilPedagogiqueLangue item) {
if (item == null) {
return null;
} else {
OutilPedagogiqueLangueVo vo = new OutilPedagogiqueLangueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getLangue()!=null && this.langue) {
        vo.setLangueVo(langueConverter.toVo(item.getLangue())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    langue = value;
    outilPedagogique = value;
}


        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }
        public LangueConverter getLangueConverter(){
        return this.langueConverter;
        }
        public void setLangueConverter(LangueConverter langueConverter ){
        this.langueConverter = langueConverter;
        }

    public boolean  isLangue(){
    return this.langue;
    }
    public void  setLangue(boolean langue){
    this.langue = langue;
    }
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
