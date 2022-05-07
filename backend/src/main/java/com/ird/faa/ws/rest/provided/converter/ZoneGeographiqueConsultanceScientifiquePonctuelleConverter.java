package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ZoneGeographiqueConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueConsultanceScientifiquePonctuelleVo;

@Component
public class ZoneGeographiqueConsultanceScientifiquePonctuelleConverter extends AbstractConverter<ZoneGeographiqueConsultanceScientifiquePonctuelle,ZoneGeographiqueConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private ZoneGeographiqueConverter zoneGeographiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean consultanceScientifiquePonctuelle;
    private Boolean zoneGeographique;
    private Boolean pays;

public  ZoneGeographiqueConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public ZoneGeographiqueConsultanceScientifiquePonctuelle toItem(ZoneGeographiqueConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
ZoneGeographiqueConsultanceScientifiquePonctuelle item = new ZoneGeographiqueConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
    if(vo.getConsultanceScientifiquePonctuelleVo()!=null && this.consultanceScientifiquePonctuelle)
        item.setConsultanceScientifiquePonctuelle(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuelleVo())) ;
    if(vo.getZoneGeographiqueVo()!=null && this.zoneGeographique)
        item.setZoneGeographique(zoneGeographiqueConverter.toItem(vo.getZoneGeographiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public ZoneGeographiqueConsultanceScientifiquePonctuelleVo toVo(ZoneGeographiqueConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
ZoneGeographiqueConsultanceScientifiquePonctuelleVo vo = new ZoneGeographiqueConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

    if(item.getConsultanceScientifiquePonctuelle()!=null && this.consultanceScientifiquePonctuelle) {
        vo.setConsultanceScientifiquePonctuelleVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelle())) ;
    }
    if(item.getZoneGeographique()!=null && this.zoneGeographique) {
        vo.setZoneGeographiqueVo(zoneGeographiqueConverter.toVo(item.getZoneGeographique())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    consultanceScientifiquePonctuelle = value;
    zoneGeographique = value;
    pays = value;
}


        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public ZoneGeographiqueConverter getZoneGeographiqueConverter(){
        return this.zoneGeographiqueConverter;
        }
        public void setZoneGeographiqueConverter(ZoneGeographiqueConverter zoneGeographiqueConverter ){
        this.zoneGeographiqueConverter = zoneGeographiqueConverter;
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
    public boolean  isZoneGeographique(){
    return this.zoneGeographique;
    }
    public void  setZoneGeographique(boolean zoneGeographique){
    this.zoneGeographique = zoneGeographique;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }








}
