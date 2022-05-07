package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ZoneGeographiqueFormationContinue;
import com.ird.faa.ws.rest.provided.vo.ZoneGeographiqueFormationContinueVo;

@Component
public class ZoneGeographiqueFormationContinueConverter extends AbstractConverter<ZoneGeographiqueFormationContinue,ZoneGeographiqueFormationContinueVo>{

        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private ZoneGeographiqueConverter zoneGeographiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean formationContinue;
    private Boolean zoneGeographique;
    private Boolean pays;

public  ZoneGeographiqueFormationContinueConverter(){
init(true);
}

@Override
public ZoneGeographiqueFormationContinue toItem(ZoneGeographiqueFormationContinueVo vo) {
if (vo == null) {
return null;
} else {
ZoneGeographiqueFormationContinue item = new ZoneGeographiqueFormationContinue();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
    if(vo.getFormationContinueVo()!=null && this.formationContinue)
        item.setFormationContinue(formationContinueConverter.toItem(vo.getFormationContinueVo())) ;
    if(vo.getZoneGeographiqueVo()!=null && this.zoneGeographique)
        item.setZoneGeographique(zoneGeographiqueConverter.toItem(vo.getZoneGeographiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public ZoneGeographiqueFormationContinueVo toVo(ZoneGeographiqueFormationContinue item) {
if (item == null) {
return null;
} else {
ZoneGeographiqueFormationContinueVo vo = new ZoneGeographiqueFormationContinueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

    if(item.getFormationContinue()!=null && this.formationContinue) {
        vo.setFormationContinueVo(formationContinueConverter.toVo(item.getFormationContinue())) ;
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
    formationContinue = value;
    zoneGeographique = value;
    pays = value;
}


        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
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

    public boolean  isFormationContinue(){
    return this.formationContinue;
    }
    public void  setFormationContinue(boolean formationContinue){
    this.formationContinue = formationContinue;
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
