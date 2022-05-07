package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ZoneGeographiqueConseilsScientifique;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueConseilsScientifiqueVo;

@Component
public class ZoneGeographiqueConseilsScientifiqueConverter extends AbstractConverter<ZoneGeographiqueConseilsScientifique,ZoneGeographiqueConseilsScientifiqueVo>{

        @Autowired
        private ZoneGeographiqueConverter zoneGeographiqueConverter ;
        @Autowired
        private ConseilsScientifiqueConverter conseilsScientifiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean conseilsScientifique;
    private Boolean zoneGeographique;
    private Boolean pays;

public  ZoneGeographiqueConseilsScientifiqueConverter(){
init(true);
}

@Override
public ZoneGeographiqueConseilsScientifique toItem(ZoneGeographiqueConseilsScientifiqueVo vo) {
if (vo == null) {
return null;
} else {
ZoneGeographiqueConseilsScientifique item = new ZoneGeographiqueConseilsScientifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
    if(vo.getConseilsScientifiqueVo()!=null && this.conseilsScientifique)
        item.setConseilsScientifique(conseilsScientifiqueConverter.toItem(vo.getConseilsScientifiqueVo())) ;
    if(vo.getZoneGeographiqueVo()!=null && this.zoneGeographique)
        item.setZoneGeographique(zoneGeographiqueConverter.toItem(vo.getZoneGeographiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public ZoneGeographiqueConseilsScientifiqueVo toVo(ZoneGeographiqueConseilsScientifique item) {
if (item == null) {
return null;
} else {
ZoneGeographiqueConseilsScientifiqueVo vo = new ZoneGeographiqueConseilsScientifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

    if(item.getConseilsScientifique()!=null && this.conseilsScientifique) {
        vo.setConseilsScientifiqueVo(conseilsScientifiqueConverter.toVo(item.getConseilsScientifique())) ;
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
    conseilsScientifique = value;
    zoneGeographique = value;
    pays = value;
}


        public ZoneGeographiqueConverter getZoneGeographiqueConverter(){
        return this.zoneGeographiqueConverter;
        }
        public void setZoneGeographiqueConverter(ZoneGeographiqueConverter zoneGeographiqueConverter ){
        this.zoneGeographiqueConverter = zoneGeographiqueConverter;
        }
        public ConseilsScientifiqueConverter getConseilsScientifiqueConverter(){
        return this.conseilsScientifiqueConverter;
        }
        public void setConseilsScientifiqueConverter(ConseilsScientifiqueConverter conseilsScientifiqueConverter ){
        this.conseilsScientifiqueConverter = conseilsScientifiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }

    public boolean  isConseilsScientifique(){
    return this.conseilsScientifique;
    }
    public void  setConseilsScientifique(boolean conseilsScientifique){
    this.conseilsScientifique = conseilsScientifique;
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
