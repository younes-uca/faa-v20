package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo;

@Component
public class DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter extends AbstractConverter<DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir,DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo>{

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
        @Autowired
        private CommunauteSavoirConverter communauteSavoirConverter ;
    private Boolean communauteSavoir;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirConverter(){
init(true);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir toItem(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo vo) {
if (vo == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir item = new DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getCommunauteSavoirVo()!=null && this.communauteSavoir)
        item.setCommunauteSavoir(communauteSavoirConverter.toItem(vo.getCommunauteSavoirVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo toVo(DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoir item) {
if (item == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo vo = new DeveloppementDeSavoirEtInnovationScientifiqueCommunauteSavoirVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getCommunauteSavoir()!=null && this.communauteSavoir) {
        vo.setCommunauteSavoirVo(communauteSavoirConverter.toVo(item.getCommunauteSavoir())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    communauteSavoir = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
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
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
