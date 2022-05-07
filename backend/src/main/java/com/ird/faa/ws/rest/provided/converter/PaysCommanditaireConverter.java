package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.PaysCommanditaire;
import com.ird.faa.ws.rest.provided.vo.PaysCommanditaireVo;

@Component
public class PaysCommanditaireConverter extends AbstractConverter<PaysCommanditaire,PaysCommanditaireVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean consultanceScientifiquePonctuelle;
    private Boolean pays;

public  PaysCommanditaireConverter(){
init(true);
}

@Override
public PaysCommanditaire toItem(PaysCommanditaireVo vo) {
if (vo == null) {
return null;
} else {
PaysCommanditaire item = new PaysCommanditaire();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public PaysCommanditaireVo toVo(PaysCommanditaire item) {
if (item == null) {
return null;
} else {
PaysCommanditaireVo vo = new PaysCommanditaireVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    consultanceScientifiquePonctuelle = value;
    pays = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isConsultanceScientifiquePonctuelle(){
    return this.consultanceScientifiquePonctuelle;
    }
    public void  setConsultanceScientifiquePonctuelle(boolean consultanceScientifiquePonctuelle){
    this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }






}
