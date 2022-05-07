package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnjeuxIrdConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConseilsScientifiqueVo;

@Component
public class EnjeuxIrdConseilsScientifiqueConverter extends AbstractConverter<EnjeuxIrdConseilsScientifique,EnjeuxIrdConseilsScientifiqueVo>{

        @Autowired
        private ConseilsScientifiqueConverter conseilsScientifiqueConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean enjeuxIrd;
    private Boolean conseilsScientifique;

public  EnjeuxIrdConseilsScientifiqueConverter(){
init(true);
}

@Override
public EnjeuxIrdConseilsScientifique toItem(EnjeuxIrdConseilsScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
EnjeuxIrdConseilsScientifique item = new EnjeuxIrdConseilsScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getConseilsScientifiqueVo()!=null && this.conseilsScientifique)
        item.setConseilsScientifique(conseilsScientifiqueConverter.toItem(vo.getConseilsScientifiqueVo())) ;


return item;
}
}

@Override
public EnjeuxIrdConseilsScientifiqueVo toVo(EnjeuxIrdConseilsScientifique item) {
if (item == null) {
return null;
} else {
EnjeuxIrdConseilsScientifiqueVo vo = new EnjeuxIrdConseilsScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getConseilsScientifique()!=null && this.conseilsScientifique) {
        vo.setConseilsScientifiqueVo(conseilsScientifiqueConverter.toVo(item.getConseilsScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    conseilsScientifique = value;
}


        public ConseilsScientifiqueConverter getConseilsScientifiqueConverter(){
        return this.conseilsScientifiqueConverter;
        }
        public void setConseilsScientifiqueConverter(ConseilsScientifiqueConverter conseilsScientifiqueConverter ){
        this.conseilsScientifiqueConverter = conseilsScientifiqueConverter;
        }
        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isConseilsScientifique(){
    return this.conseilsScientifique;
    }
    public void  setConseilsScientifique(boolean conseilsScientifique){
    this.conseilsScientifique = conseilsScientifique;
    }






}
