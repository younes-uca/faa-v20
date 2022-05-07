package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreGrandPubliqueJeunePubliqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo;

@Component
public class RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter extends AbstractConverter<RencontreGrandPubliqueJeunePubliqueEnjeuxIrd,RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo>{

        @Autowired
        private RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean rencontreGrandPubliqueJeunePublique;
    private Boolean enjeuxIrd;

public  RencontreGrandPubliqueJeunePubliqueEnjeuxIrdConverter(){
init(true);
}

@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrd toItem(RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliqueEnjeuxIrd item = new RencontreGrandPubliqueJeunePubliqueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRencontreGrandPubliqueJeunePubliqueVo()!=null && this.rencontreGrandPubliqueJeunePublique)
        item.setRencontreGrandPubliqueJeunePublique(rencontreGrandPubliqueJeunePubliqueConverter.toItem(vo.getRencontreGrandPubliqueJeunePubliqueVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo toVo(RencontreGrandPubliqueJeunePubliqueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo vo = new RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRencontreGrandPubliqueJeunePublique()!=null && this.rencontreGrandPubliqueJeunePublique) {
        vo.setRencontreGrandPubliqueJeunePubliqueVo(rencontreGrandPubliqueJeunePubliqueConverter.toVo(item.getRencontreGrandPubliqueJeunePublique())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreGrandPubliqueJeunePublique = value;
    enjeuxIrd = value;
}


        public RencontreGrandPubliqueJeunePubliqueConverter getRencontreGrandPubliqueJeunePubliqueConverter(){
        return this.rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public void setRencontreGrandPubliqueJeunePubliqueConverter(RencontreGrandPubliqueJeunePubliqueConverter rencontreGrandPubliqueJeunePubliqueConverter ){
        this.rencontreGrandPubliqueJeunePubliqueConverter = rencontreGrandPubliqueJeunePubliqueConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isRencontreGrandPubliqueJeunePublique(){
    return this.rencontreGrandPubliqueJeunePublique;
    }
    public void  setRencontreGrandPubliqueJeunePublique(boolean rencontreGrandPubliqueJeunePublique){
    this.rencontreGrandPubliqueJeunePublique = rencontreGrandPubliqueJeunePublique;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
