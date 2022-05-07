package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypePubliqueRencontreMedia;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreMediaVo;

@Component
public class TypePubliqueRencontreMediaConverter extends AbstractConverter<TypePubliqueRencontreMedia,TypePubliqueRencontreMediaVo>{

        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
        @Autowired
        private TypePubliqueConverter typePubliqueConverter ;
    private Boolean typePublique;
    private Boolean rencontreMedia;

public  TypePubliqueRencontreMediaConverter(){
init(true);
}

@Override
public TypePubliqueRencontreMedia toItem(TypePubliqueRencontreMediaVo vo) {
if (vo == null) {
return null;
} else {
TypePubliqueRencontreMedia item = new TypePubliqueRencontreMedia();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getTypePubliqueVo()!=null && this.typePublique)
        item.setTypePublique(typePubliqueConverter.toItem(vo.getTypePubliqueVo())) ;
    if(vo.getRencontreMediaVo()!=null && this.rencontreMedia)
        item.setRencontreMedia(rencontreMediaConverter.toItem(vo.getRencontreMediaVo())) ;


return item;
}
}

@Override
public TypePubliqueRencontreMediaVo toVo(TypePubliqueRencontreMedia item) {
if (item == null) {
return null;
} else {
TypePubliqueRencontreMediaVo vo = new TypePubliqueRencontreMediaVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getTypePublique()!=null && this.typePublique) {
        vo.setTypePubliqueVo(typePubliqueConverter.toVo(item.getTypePublique())) ;
    }
    if(item.getRencontreMedia()!=null && this.rencontreMedia) {
        vo.setRencontreMediaVo(rencontreMediaConverter.toVo(item.getRencontreMedia())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    typePublique = value;
    rencontreMedia = value;
}


        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }
        public TypePubliqueConverter getTypePubliqueConverter(){
        return this.typePubliqueConverter;
        }
        public void setTypePubliqueConverter(TypePubliqueConverter typePubliqueConverter ){
        this.typePubliqueConverter = typePubliqueConverter;
        }

    public boolean  isTypePublique(){
    return this.typePublique;
    }
    public void  setTypePublique(boolean typePublique){
    this.typePublique = typePublique;
    }
    public boolean  isRencontreMedia(){
    return this.rencontreMedia;
    }
    public void  setRencontreMedia(boolean rencontreMedia){
    this.rencontreMedia = rencontreMedia;
    }






}
