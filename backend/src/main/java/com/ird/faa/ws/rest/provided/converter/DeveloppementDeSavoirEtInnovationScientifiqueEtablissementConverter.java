package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.DeveloppementDeSavoirEtInnovationScientifiqueEtablissement;
import com.ird.faa.ws.rest.provided.vo.DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo;

@Component
public class DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter extends AbstractConverter<DeveloppementDeSavoirEtInnovationScientifiqueEtablissement,DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo>{

        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean etablissement;
    private Boolean developpementDeSavoirEtInnovationScientifique;

public  DeveloppementDeSavoirEtInnovationScientifiqueEtablissementConverter(){
init(true);
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissement toItem(DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo vo) {
if (vo == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueEtablissement item = new DeveloppementDeSavoirEtInnovationScientifiqueEtablissement();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;
    if(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo()!=null && this.developpementDeSavoirEtInnovationScientifique)
        item.setDeveloppementDeSavoirEtInnovationScientifique(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiqueVo())) ;


return item;
}
}

@Override
public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo toVo(DeveloppementDeSavoirEtInnovationScientifiqueEtablissement item) {
if (item == null) {
return null;
} else {
DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo vo = new DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }
    if(item.getDeveloppementDeSavoirEtInnovationScientifique()!=null && this.developpementDeSavoirEtInnovationScientifique) {
        vo.setDeveloppementDeSavoirEtInnovationScientifiqueVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifique())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    etablissement = value;
    developpementDeSavoirEtInnovationScientifique = value;
}


        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }
    public boolean  isDeveloppementDeSavoirEtInnovationScientifique(){
    return this.developpementDeSavoirEtInnovationScientifique;
    }
    public void  setDeveloppementDeSavoirEtInnovationScientifique(boolean developpementDeSavoirEtInnovationScientifique){
    this.developpementDeSavoirEtInnovationScientifique = developpementDeSavoirEtInnovationScientifique;
    }






}
