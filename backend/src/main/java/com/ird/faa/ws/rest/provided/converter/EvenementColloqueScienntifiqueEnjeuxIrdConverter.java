package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EvenementColloqueScienntifiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueEnjeuxIrdVo;

@Component
public class EvenementColloqueScienntifiqueEnjeuxIrdConverter extends AbstractConverter<EvenementColloqueScienntifiqueEnjeuxIrd,EvenementColloqueScienntifiqueEnjeuxIrdVo>{

        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
        @Autowired
        private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ;
    private Boolean evenementColloqueScienntifique;
    private Boolean enjeuxIrd;

public  EvenementColloqueScienntifiqueEnjeuxIrdConverter(){
init(true);
}

@Override
public EvenementColloqueScienntifiqueEnjeuxIrd toItem(EvenementColloqueScienntifiqueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
EvenementColloqueScienntifiqueEnjeuxIrd item = new EvenementColloqueScienntifiqueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEvenementColloqueScienntifiqueVo()!=null && this.evenementColloqueScienntifique)
        item.setEvenementColloqueScienntifique(evenementColloqueScienntifiqueConverter.toItem(vo.getEvenementColloqueScienntifiqueVo())) ;
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;


return item;
}
}

@Override
public EvenementColloqueScienntifiqueEnjeuxIrdVo toVo(EvenementColloqueScienntifiqueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
EvenementColloqueScienntifiqueEnjeuxIrdVo vo = new EvenementColloqueScienntifiqueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEvenementColloqueScienntifique()!=null && this.evenementColloqueScienntifique) {
        vo.setEvenementColloqueScienntifiqueVo(evenementColloqueScienntifiqueConverter.toVo(item.getEvenementColloqueScienntifique())) ;
    }
    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    evenementColloqueScienntifique = value;
    enjeuxIrd = value;
}


        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }
        public EvenementColloqueScienntifiqueConverter getEvenementColloqueScienntifiqueConverter(){
        return this.evenementColloqueScienntifiqueConverter;
        }
        public void setEvenementColloqueScienntifiqueConverter(EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ){
        this.evenementColloqueScienntifiqueConverter = evenementColloqueScienntifiqueConverter;
        }

    public boolean  isEvenementColloqueScienntifique(){
    return this.evenementColloqueScienntifique;
    }
    public void  setEvenementColloqueScienntifique(boolean evenementColloqueScienntifique){
    this.evenementColloqueScienntifique = evenementColloqueScienntifique;
    }
    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }






}
