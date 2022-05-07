package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo;

@Component
public class DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter extends AbstractConverter<DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd,DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo>{

        @Autowired
        private EnjeuxIrdConverter enjeuxIrdConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
    private Boolean enjeuxIrd;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdConverter(){
init(true);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd toItem(DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo vo) {
if (vo == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd item = new DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEnjeuxIrdVo()!=null && this.enjeuxIrd)
        item.setEnjeuxIrd(enjeuxIrdConverter.toItem(vo.getEnjeuxIrdVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo toVo(DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrd item) {
if (item == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo vo = new DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEnjeuxIrd()!=null && this.enjeuxIrd) {
        vo.setEnjeuxIrdVo(enjeuxIrdConverter.toVo(item.getEnjeuxIrd())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    enjeuxIrd = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public EnjeuxIrdConverter getEnjeuxIrdConverter(){
        return this.enjeuxIrdConverter;
        }
        public void setEnjeuxIrdConverter(EnjeuxIrdConverter enjeuxIrdConverter ){
        this.enjeuxIrdConverter = enjeuxIrdConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }

    public boolean  isEnjeuxIrd(){
    return this.enjeuxIrd;
    }
    public void  setEnjeuxIrd(boolean enjeuxIrd){
    this.enjeuxIrd = enjeuxIrd;
    }
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
