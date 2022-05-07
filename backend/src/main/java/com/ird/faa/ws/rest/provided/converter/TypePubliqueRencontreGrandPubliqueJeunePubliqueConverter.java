package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.TypePubliqueRencontreGrandPubliqueJeunePublique;
import com.ird.faa.ws.rest.provided.vo.TypePubliqueRencontreGrandPubliqueJeunePubliqueVo;

@Component
public class TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter extends AbstractConverter<TypePubliqueRencontreGrandPubliqueJeunePublique,TypePubliqueRencontreGrandPubliqueJeunePubliqueVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private TypePubliqueConverter typePubliqueConverter ;
    private Boolean rencontreGrandPubliqueJeunePublique;
    private Boolean typePublique;

public  TypePubliqueRencontreGrandPubliqueJeunePubliqueConverter(){
init(true);
}

@Override
public TypePubliqueRencontreGrandPubliqueJeunePublique toItem(TypePubliqueRencontreGrandPubliqueJeunePubliqueVo vo) {
if (vo == null) {
return null;
} else {
TypePubliqueRencontreGrandPubliqueJeunePublique item = new TypePubliqueRencontreGrandPubliqueJeunePublique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;
    if(vo.getTypePubliqueVo()!=null && this.typePublique)
        item.setTypePublique(typePubliqueConverter.toItem(vo.getTypePubliqueVo())) ;


return item;
}
}

@Override
public TypePubliqueRencontreGrandPubliqueJeunePubliqueVo toVo(TypePubliqueRencontreGrandPubliqueJeunePublique item) {
if (item == null) {
return null;
} else {
TypePubliqueRencontreGrandPubliqueJeunePubliqueVo vo = new TypePubliqueRencontreGrandPubliqueJeunePubliqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }
    if(item.getTypePublique()!=null && this.typePublique) {
        vo.setTypePubliqueVo(typePubliqueConverter.toVo(item.getTypePublique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreGrandPubliqueJeunePublique = value;
    typePublique = value;
}


        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public TypePubliqueConverter getTypePubliqueConverter(){
        return this.typePubliqueConverter;
        }
        public void setTypePubliqueConverter(TypePubliqueConverter typePubliqueConverter ){
        this.typePubliqueConverter = typePubliqueConverter;
        }

    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }
    public boolean  isTypePublique(){
    return this.typePublique;
    }
    public void  setTypePublique(boolean typePublique){
    this.typePublique = typePublique;
    }






}
