package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.CommunauteSavoirExpertiseScientifique;
import com.ird.faa.ws.rest.provided.vo.CommunauteSavoirExpertiseScientifiqueVo;

@Component
public class CommunauteSavoirExpertiseScientifiqueConverter extends AbstractConverter<CommunauteSavoirExpertiseScientifique,CommunauteSavoirExpertiseScientifiqueVo>{

        @Autowired
        private ExpertiseScientifiqueConverter expertiseScientifiqueConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean communauteSavoir;
    private Boolean expertiseScientifique;

public  CommunauteSavoirExpertiseScientifiqueConverter(){
init(true);
}

@Override
public CommunauteSavoirExpertiseScientifique toItem(CommunauteSavoirExpertiseScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
CommunauteSavoirExpertiseScientifique item = new CommunauteSavoirExpertiseScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getExpertiseScientifiqueVo()!=null && this.expertiseScientifique)
        item.setExpertiseScientifique(expertiseScientifiqueConverter.toItem(vo.getExpertiseScientifiqueVo())) ;


return item;
}
}

@Override
public CommunauteSavoirExpertiseScientifiqueVo toVo(CommunauteSavoirExpertiseScientifique item) {
if (item == null) {
return null;
} else {
CommunauteSavoirExpertiseScientifiqueVo vo = new CommunauteSavoirExpertiseScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getExpertiseScientifique()!=null && this.expertiseScientifique) {
        vo.setExpertiseScientifiqueVo(expertiseScientifiqueConverter.toVo(item.getExpertiseScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    expertiseScientifique = value;
}


        public ExpertiseScientifiqueConverter getExpertiseScientifiqueConverter(){
        return this.expertiseScientifiqueConverter;
        }
        public void setExpertiseScientifiqueConverter(ExpertiseScientifiqueConverter expertiseScientifiqueConverter ){
        this.expertiseScientifiqueConverter = expertiseScientifiqueConverter;
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
    public boolean  isExpertiseScientifique(){
    return this.expertiseScientifique;
    }
    public void  setExpertiseScientifique(boolean expertiseScientifique){
    this.expertiseScientifique = expertiseScientifique;
    }






}
