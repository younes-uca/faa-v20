package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnseignementZoneGeographique;
import com.ird.faa.ws.rest.provided.vo.EnseignementZoneGeographiqueVo;

@Component
public class EnseignementZoneGeographiqueConverter extends AbstractConverter<EnseignementZoneGeographique,EnseignementZoneGeographiqueVo>{

        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private ZoneGeographiqueConverter zoneGeographiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
    private Boolean enseignement;
    private Boolean zoneGeographique;
    private Boolean pays;

public  EnseignementZoneGeographiqueConverter(){
init(true);
}

@Override
public EnseignementZoneGeographique toItem(EnseignementZoneGeographiqueVo vo) {
if (vo == null) {
return null;
} else {
EnseignementZoneGeographique item = new EnseignementZoneGeographique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
    if(vo.getEnseignementVo()!=null && this.enseignement)
        item.setEnseignement(enseignementConverter.toItem(vo.getEnseignementVo())) ;
    if(vo.getZoneGeographiqueVo()!=null && this.zoneGeographique)
        item.setZoneGeographique(zoneGeographiqueConverter.toItem(vo.getZoneGeographiqueVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;


return item;
}
}

@Override
public EnseignementZoneGeographiqueVo toVo(EnseignementZoneGeographique item) {
if (item == null) {
return null;
} else {
EnseignementZoneGeographiqueVo vo = new EnseignementZoneGeographiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

    if(item.getEnseignement()!=null && this.enseignement) {
        vo.setEnseignementVo(enseignementConverter.toVo(item.getEnseignement())) ;
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
    enseignement = value;
    zoneGeographique = value;
    pays = value;
}


        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
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

    public boolean  isEnseignement(){
    return this.enseignement;
    }
    public void  setEnseignement(boolean enseignement){
    this.enseignement = enseignement;
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
