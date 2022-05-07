package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiquePays;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiquePaysVo;

@Component
public class DeveloppementDeSavoirEtInnovationScientifiquePaysConverter extends AbstractConverter<DeveloppementDeSavoirEtInnovationScientifiquePays,DeveloppementDeSavoirEtInnovationScientifiquePaysVo>{

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean pays;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  DeveloppementDeSavoirEtInnovationScientifiquePaysConverter(){
init(true);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiquePays toItem(DeveloppementDeSavoirEtInnovationScientifiquePaysVo vo) {
if (vo == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiquePays item = new DeveloppementDeSavoirEtInnovationScientifiquePays();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiquePaysVo toVo(DeveloppementDeSavoirEtInnovationScientifiquePays item) {
if (item == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiquePaysVo vo = new DeveloppementDeSavoirEtInnovationScientifiquePaysVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
