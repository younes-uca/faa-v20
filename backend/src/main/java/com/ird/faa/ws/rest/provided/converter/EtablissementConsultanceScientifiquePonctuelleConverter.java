package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EtablissementConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.EtablissementConsultanceScientifiquePonctuelleVo;

@Component
public class EtablissementConsultanceScientifiquePonctuelleConverter extends AbstractConverter<EtablissementConsultanceScientifiquePonctuelle,EtablissementConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private EtablissementConverter etablissementConverter ;
    private Boolean consultanceScientifiquePonctuelle;
    private Boolean etablissement;

public  EtablissementConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public EtablissementConsultanceScientifiquePonctuelle toItem(EtablissementConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
EtablissementConsultanceScientifiquePonctuelle item = new EtablissementConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;
    if(vo.getEtablissementVo()!=null && this.etablissement)
        item.setEtablissement(etablissementConverter.toItem(vo.getEtablissementVo())) ;


return item;
}
}

@Override
public EtablissementConsultanceScientifiquePonctuelleVo toVo(EtablissementConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
EtablissementConsultanceScientifiquePonctuelleVo vo = new EtablissementConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }
    if(item.getEtablissement()!=null && this.etablissement) {
        vo.setEtablissementVo(etablissementConverter.toVo(item.getEtablissement())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    consultanceScientifiquePonctuelle = value;
    etablissement = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public EtablissementConverter getEtablissementConverter(){
        return this.etablissementConverter;
        }
        public void setEtablissementConverter(EtablissementConverter etablissementConverter ){
        this.etablissementConverter = etablissementConverter;
        }

    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }
    public boolean  isEtablissement(){
    return this.etablissement;
    }
    public void  setEtablissement(boolean etablissement){
    this.etablissement = etablissement;
    }






}
