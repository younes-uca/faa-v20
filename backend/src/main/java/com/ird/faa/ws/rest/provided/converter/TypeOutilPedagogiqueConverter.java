package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypeOutilPedagogique;
import com.ird.faa.ws.rest.provided.vo.TypeOutilPedagogiqueVo;

@Component
public class TypeOutilPedagogiqueConverter extends AbstractConverter<TypeOutilPedagogique,TypeOutilPedagogiqueVo>{

        @Autowired
        private TypeOutilConverter typeOutilConverter ;
        @Autowired
        private OutilPedagogiqueConverter outilPedagogiqueConverter ;
    private Boolean typeOutil;
    private Boolean outilPedagogique;

public  TypeOutilPedagogiqueConverter(){
init(true);
}

@Override
public TypeOutilPedagogique toItem(TypeOutilPedagogiqueVo vo) {
if (vo == null) {
return null;
} else {
TypeOutilPedagogique item = new TypeOutilPedagogique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypeOutilVo()!=null && this.typeOutil)
        item.setTypeOutil(typeOutilConverter.toItem(vo.getTypeOutilVo())) ;
    if(vo.getOutilPedagogiqueVo()!=null && this.outilPedagogique)
        item.setOutilPedagogique(outilPedagogiqueConverter.toItem(vo.getOutilPedagogiqueVo())) ;


return item;
}
}

@Override
public TypeOutilPedagogiqueVo toVo(TypeOutilPedagogique item) {
if (item == null) {
return null;
} else {
TypeOutilPedagogiqueVo vo = new TypeOutilPedagogiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypeOutil()!=null && this.typeOutil) {
        vo.setTypeOutilVo(typeOutilConverter.toVo(item.getTypeOutil())) ;
    }
    if(item.getOutilPedagogique()!=null && this.outilPedagogique) {
        vo.setOutilPedagogiqueVo(outilPedagogiqueConverter.toVo(item.getOutilPedagogique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typeOutil = value;
    outilPedagogique = value;
}


        public TypeOutilConverter getTypeOutilConverter(){
        return this.typeOutilConverter;
        }
        public void setTypeOutilConverter(TypeOutilConverter typeOutilConverter ){
        this.typeOutilConverter = typeOutilConverter;
        }
        public OutilPedagogiqueConverter getOutilPedagogiqueConverter(){
        return this.outilPedagogiqueConverter;
        }
        public void setOutilPedagogiqueConverter(OutilPedagogiqueConverter outilPedagogiqueConverter ){
        this.outilPedagogiqueConverter = outilPedagogiqueConverter;
        }

    public boolean  isTypeOutil(){
    return this.typeOutil;
    }
    public void  setTypeOutil(boolean typeOutil){
    this.typeOutil = typeOutil;
    }
    public boolean  isOutilPedagogique(){
    return this.outilPedagogique;
    }
    public void  setOutilPedagogique(boolean outilPedagogique){
    this.outilPedagogique = outilPedagogique;
    }






}
