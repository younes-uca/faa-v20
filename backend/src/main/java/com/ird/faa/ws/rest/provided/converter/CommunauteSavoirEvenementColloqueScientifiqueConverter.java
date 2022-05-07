package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirEvenementColloqueScientifique;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirEvenementColloqueScientifiqueVo;

@Component
public class CommunauteSavoirEvenementColloqueScientifiqueConverter extends AbstractConverter<CommunauteSavoirEvenementColloqueScientifique,CommunauteSavoirEvenementColloqueScientifiqueVo>{

        @Autowired
        private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean evenementColloqueScienntifique;
    private Boolean communauteSavoir;

public  CommunauteSavoirEvenementColloqueScientifiqueConverter(){
init(true);
}

@Override
public CommunauteSavoirEvenementColloqueScientifique toItem(CommunauteSavoirEvenementColloqueScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirEvenementColloqueScientifique item = new CommunauteSavoirEvenementColloqueScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEvenementColloqueScienntifiqueVo()!=null && this.evenementColloqueScienntifique)
        item.setEvenementColloqueScienntifique(evenementColloqueScienntifiqueConverter.toItem(vo.getEvenementColloqueScienntifiqueVo())) ;
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;


return item;
}
}

@Override
public CommunauteSavoirEvenementColloqueScientifiqueVo toVo(CommunauteSavoirEvenementColloqueScientifique item) {
if (item == null) {
return null;
} else {
CommunauteSavoirEvenementColloqueScientifiqueVo vo = new CommunauteSavoirEvenementColloqueScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEvenementColloqueScienntifique()!=null && this.evenementColloqueScienntifique) {
        vo.setEvenementColloqueScienntifiqueVo(evenementColloqueScienntifiqueConverter.toVo(item.getEvenementColloqueScienntifique())) ;
    }
    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    evenementColloqueScienntifique = value;
    communauteSavoir = value;
}


        public EvenementColloqueScienntifiqueConverter getEvenementColloqueScienntifiqueConverter(){
        return this.evenementColloqueScienntifiqueConverter;
        }
        public void setEvenementColloqueScienntifiqueConverter(EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ){
        this.evenementColloqueScienntifiqueConverter = evenementColloqueScienntifiqueConverter;
        }
        public CommunauteSavoirConverter getCommunauteSavoirConverter(){
        return this.communauteSavoirConverter;
        }
        public void setCommunauteSavoirConverter(CommunauteSavoirConverter communauteSavoirConverter ){
        this.communauteSavoirConverter = communauteSavoirConverter;
        }

    public boolean  isEvenementColloqueScienntifique(){
    return this.evenementColloqueScienntifique;
    }
    public void  setEvenementColloqueScienntifique(boolean evenementColloqueScienntifique){
    this.evenementColloqueScienntifique = evenementColloqueScienntifique;
    }
    public boolean  isCommunauteSavoir(){
    return this.communauteSavoir;
    }
    public void  setCommunauteSavoir(boolean communauteSavoir){
    this.communauteSavoir = communauteSavoir;
    }






}
