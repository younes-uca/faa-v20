package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EvenementColloqueScienntifiquePays;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiquePaysVo;

@Component
public class EvenementColloqueScienntifiquePaysConverter extends AbstractConverter<EvenementColloqueScienntifiquePays,EvenementColloqueScienntifiquePaysVo>{

        @Autowired
        private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean evenementColloqueScienntifique;
    private Boolean pays;

public  EvenementColloqueScienntifiquePaysConverter(){
init(true);
}

@Override
public EvenementColloqueScienntifiquePays toItem(EvenementColloqueScienntifiquePaysVo vo) {
if (vo == null) {
return null;
} else {
EvenementColloqueScienntifiquePays item = new EvenementColloqueScienntifiquePays();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEvenementColloqueScienntifiqueVo()!=null && this.evenementColloqueScienntifique)
        item.setEvenementColloqueScienntifique(evenementColloqueScienntifiqueConverter.toItem(vo.getEvenementColloqueScienntifiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public EvenementColloqueScienntifiquePaysVo toVo(EvenementColloqueScienntifiquePays item) {
if (item == null) {
return null;
} else {
EvenementColloqueScienntifiquePaysVo vo = new EvenementColloqueScienntifiquePaysVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEvenementColloqueScienntifique()!=null && this.evenementColloqueScienntifique) {
        vo.setEvenementColloqueScienntifiqueVo(evenementColloqueScienntifiqueConverter.toVo(item.getEvenementColloqueScienntifique())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    evenementColloqueScienntifique = value;
    pays = value;
}


        public EvenementColloqueScienntifiqueConverter getEvenementColloqueScienntifiqueConverter(){
        return this.evenementColloqueScienntifiqueConverter;
        }
        public void setEvenementColloqueScienntifiqueConverter(EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ){
        this.evenementColloqueScienntifiqueConverter = evenementColloqueScienntifiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isEvenementColloqueScienntifique(){
    return this.evenementColloqueScienntifique;
    }
    public void  setEvenementColloqueScienntifique(boolean evenementColloqueScienntifique){
    this.evenementColloqueScienntifique = evenementColloqueScienntifique;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }






}
