package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnjeuxIrdConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.EnjeuxIrdConsultanceScientifiquePonctuelleVo;

@Component
public class EnjeuxIrdConsultanceScientifiquePonctuelleConverter extends AbstractConverter<EnjeuxIrdConsultanceScientifiquePonctuelle,EnjeuxIrdConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
    private Boolean enjeuxIrd;
    private Boolean consultanceScientifiquePonctuelle;

public  EnjeuxIrdConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public EnjeuxIrdConsultanceScientifiquePonctuelle toItem(EnjeuxIrdConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
EnjeuxIrdConsultanceScientifiquePonctuelle item = new EnjeuxIrdConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;


return item;
}
}

@Override
public EnjeuxIrdConsultanceScientifiquePonctuelleVo toVo(EnjeuxIrdConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
EnjeuxIrdConsultanceScientifiquePonctuelleVo vo = new EnjeuxIrdConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    consultanceScientifiquePonctuelle = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
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
    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }






}
