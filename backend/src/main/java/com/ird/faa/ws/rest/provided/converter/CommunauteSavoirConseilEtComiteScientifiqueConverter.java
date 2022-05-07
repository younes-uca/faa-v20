package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirConseilEtComiteScientifique;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirConseilEtComiteScientifiqueVo;

@Component
public class CommunauteSavoirConseilEtComiteScientifiqueConverter extends AbstractConverter<CommunauteSavoirConseilEtComiteScientifique,CommunauteSavoirConseilEtComiteScientifiqueVo>{

        @Autowired
        private ConseilEtComiteScientifiqueConverter conseilEtComiteScientifiqueConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean communauteSavoir;
    private Boolean conseilEtComiteScientifique;

public  CommunauteSavoirConseilEtComiteScientifiqueConverter(){
init(true);
}

@Override
public CommunauteSavoirConseilEtComiteScientifique toItem(CommunauteSavoirConseilEtComiteScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirConseilEtComiteScientifique item = new CommunauteSavoirConseilEtComiteScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getConseilEtComiteScientifiqueVo()!=null && this.conseilEtComiteScientifique)
        item.setConseilEtComiteScientifique(conseilEtComiteScientifiqueConverter.toItem(vo.getConseilEtComiteScientifiqueVo())) ;


return item;
}
}

@Override
public CommunauteSavoirConseilEtComiteScientifiqueVo toVo(CommunauteSavoirConseilEtComiteScientifique item) {
if (item == null) {
return null;
} else {
CommunauteSavoirConseilEtComiteScientifiqueVo vo = new CommunauteSavoirConseilEtComiteScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getConseilEtComiteScientifique()!=null && this.conseilEtComiteScientifique) {
        vo.setConseilEtComiteScientifiqueVo(conseilEtComiteScientifiqueConverter.toVo(item.getConseilEtComiteScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    conseilEtComiteScientifique = value;
}


        public ConseilEtComiteScientifiqueConverter getConseilEtComiteScientifiqueConverter(){
        return this.conseilEtComiteScientifiqueConverter;
        }
        public void setConseilEtComiteScientifiqueConverter(ConseilEtComiteScientifiqueConverter conseilEtComiteScientifiqueConverter ){
        this.conseilEtComiteScientifiqueConverter = conseilEtComiteScientifiqueConverter;
        }
        public CommunauteSavoirConverter getCommunauteSavoirConverter(){
        return this.communauteSavoirConverter;
        }
        public void setCommunauteSavoirConverter(CommunauteSavoirConverter communauteSavoirConverter ){
        this.communauteSavoirConverter = communauteSavoirConverter;
        }

    public boolean  isCommunauteSavoir(){
    return this.communauteSavoir;
    }
    public void  setCommunauteSavoir(boolean communauteSavoir){
    this.communauteSavoir = communauteSavoir;
    }
    public boolean  isConseilEtComiteScientifique(){
    return this.conseilEtComiteScientifique;
    }
    public void  setConseilEtComiteScientifique(boolean conseilEtComiteScientifique){
    this.conseilEtComiteScientifique = conseilEtComiteScientifique;
    }






}
