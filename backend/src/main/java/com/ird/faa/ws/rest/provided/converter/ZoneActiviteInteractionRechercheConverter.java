package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ZoneActiviteInteractionRecherche;
import com.ird.faa.ws.rest.provided.vo.ZoneActiviteInteractionRechercheVo;

@Component
public class ZoneActiviteInteractionRechercheConverter extends AbstractConverter<ZoneActiviteInteractionRecherche,ZoneActiviteInteractionRechercheVo>{

        @Autowired
        private ZoneGeographiqueConverter zoneGeographiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean pays;
    private Boolean zoneGeographique;
    private Boolean chercheur;

public  ZoneActiviteInteractionRechercheConverter(){
init(true);
}

@Override
public ZoneActiviteInteractionRecherche toItem(ZoneActiviteInteractionRechercheVo vo) {
if (vo == null) {
return null;
} else {
ZoneActiviteInteractionRecherche item = new ZoneActiviteInteractionRecherche();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getLibelle()))
        item.setLibelle(vo.getLibelle());
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getZoneGeographiqueVo()!=null && this.zoneGeographique)
        item.setZoneGeographique(zoneGeographiqueConverter.toItem(vo.getZoneGeographiqueVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;


return item;
}
}

@Override
public ZoneActiviteInteractionRechercheVo toVo(ZoneActiviteInteractionRecherche item) {
if (item == null) {
return null;
} else {
ZoneActiviteInteractionRechercheVo vo = new ZoneActiviteInteractionRechercheVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getLibelle()))
        vo.setLibelle(item.getLibelle());

    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getZoneGeographique()!=null && this.zoneGeographique) {
        vo.setZoneGeographiqueVo(zoneGeographiqueConverter.toVo(item.getZoneGeographique())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }

return vo;
}
}

public void init(Boolean value) {
    pays = value;
    zoneGeographique = value;
    chercheur = value;
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
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isZoneGeographique(){
    return this.zoneGeographique;
    }
    public void  setZoneGeographique(boolean zoneGeographique){
    this.zoneGeographique = zoneGeographique;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }










}
