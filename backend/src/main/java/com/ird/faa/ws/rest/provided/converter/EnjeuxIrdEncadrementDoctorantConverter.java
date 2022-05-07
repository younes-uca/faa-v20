package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnjeuxIrdEncadrementDoctorant;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdEncadrementDoctorantVo;

@Component
public class EnjeuxIrdEncadrementDoctorantConverter extends AbstractConverter<EnjeuxIrdEncadrementDoctorant,EnjeuxIrdEncadrementDoctorantVo>{

        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
        @Autowired
        private EncadrementDoctorantConverter encadrementDoctorantConverter ;
    private Boolean enjeuxIrd;
    private Boolean encadrementDoctorant;

public  EnjeuxIrdEncadrementDoctorantConverter(){
init(true);
}

@Override
public EnjeuxIrdEncadrementDoctorant toItem(EnjeuxIrdEncadrementDoctorantVo vo) {
if (vo == null) {
return null;
} else {
EnjeuxIrdEncadrementDoctorant item = new EnjeuxIrdEncadrementDoctorant();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getEncadrementDoctorantVo()!=null && this.encadrementDoctorant)
        item.setEncadrementDoctorant(encadrementDoctorantConverter.toItem(vo.getEncadrementDoctorantVo())) ;


return item;
}
}

@Override
public EnjeuxIrdEncadrementDoctorantVo toVo(EnjeuxIrdEncadrementDoctorant item) {
if (item == null) {
return null;
} else {
EnjeuxIrdEncadrementDoctorantVo vo = new EnjeuxIrdEncadrementDoctorantVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getEncadrementDoctorant()!=null && this.encadrementDoctorant) {
        vo.setEncadrementDoctorantVo(encadrementDoctorantConverter.toVo(item.getEncadrementDoctorant())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    encadrementDoctorant = value;
}


        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }
        public EncadrementDoctorantConverter getEncadrementDoctorantConverter(){
        return this.encadrementDoctorantConverter;
        }
        public void setEncadrementDoctorantConverter(EncadrementDoctorantConverter encadrementDoctorantConverter ){
        this.encadrementDoctorantConverter = encadrementDoctorantConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isEncadrementDoctorant(){
    return this.encadrementDoctorant;
    }
    public void  setEncadrementDoctorant(boolean encadrementDoctorant){
    this.encadrementDoctorant = encadrementDoctorant;
    }






}
