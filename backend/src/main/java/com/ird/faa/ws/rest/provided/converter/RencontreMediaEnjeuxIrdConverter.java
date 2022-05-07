package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.RencontreMediaEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.RencontreMediaEnjeuxIrdVo;

@Component
public class RencontreMediaEnjeuxIrdConverter extends AbstractConverter<RencontreMediaEnjeuxIrd,RencontreMediaEnjeuxIrdVo>{

        @Autowired
        private RencontreMediaConverter rencontreMediaConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean rencontreMedia;
    private Boolean enjeuxIrd;

public  RencontreMediaEnjeuxIrdConverter(){
init(true);
}

@Override
public RencontreMediaEnjeuxIrd toItem(RencontreMediaEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
RencontreMediaEnjeuxIrd item = new RencontreMediaEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getRencontreMediaVo()!=null && this.rencontreMedia)
        item.setRencontreMedia(rencontreMediaConverter.toItem(vo.getRencontreMediaVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public RencontreMediaEnjeuxIrdVo toVo(RencontreMediaEnjeuxIrd item) {
if (item == null) {
return null;
} else {
RencontreMediaEnjeuxIrdVo vo = new RencontreMediaEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getRencontreMedia()!=null && this.rencontreMedia) {
        vo.setRencontreMediaVo(rencontreMediaConverter.toVo(item.getRencontreMedia())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    rencontreMedia = value;
    enjeuxIrd = value;
}


        public RencontreMediaConverter getRencontreMediaConverter(){
        return this.rencontreMediaConverter;
        }
        public void setRencontreMediaConverter(RencontreMediaConverter rencontreMediaConverter ){
        this.rencontreMediaConverter = rencontreMediaConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isRencontreMedia(){
    return this.rencontreMedia;
    }
    public void  setRencontreMedia(boolean rencontreMedia){
    this.rencontreMedia = rencontreMedia;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
