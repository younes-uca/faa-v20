package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Distinction;
import com.ird.faa.ws.rest.provided.vo.DistinctionVo;

@Component
public class DistinctionConverter extends AbstractConverter<Distinction,DistinctionVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private TypeParticipationConverter typeParticipationConverter ;
        @Autowired
        private DistinctionEtablissementPaysConverter distinctionEtablissementPaysConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean typeParticipation;
    private Boolean pays;
    private Boolean etatEtapeCampagne;
    private Boolean chercheur;
    private Boolean campagne;
        private Boolean distinctionEtablissementPayss;

public  DistinctionConverter(){
init(true);
}

@Override
public Distinction toItem(DistinctionVo vo) {
if (vo == null) {
return null;
} else {
Distinction item = new Distinction();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getDateObtention()))
        item.setDateObtention(DateUtil.parse(vo.getDateObtention()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
    if(vo.getTypeParticipationVo()!=null && this.typeParticipation)
        item.setTypeParticipation(typeParticipationConverter.toItem(vo.getTypeParticipationVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getDistinctionEtablissementPayssVo()) && this.distinctionEtablissementPayss)
        item.setDistinctionEtablissementPayss(distinctionEtablissementPaysConverter.toItem(vo.getDistinctionEtablissementPayssVo()));

return item;
}
}

@Override
public DistinctionVo toVo(Distinction item) {
if (item == null) {
return null;
} else {
DistinctionVo vo = new DistinctionVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getDateObtention()!=null)
        vo.setDateObtention(DateUtil.formateDate(item.getDateObtention()));
        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

    if(item.getTypeParticipation()!=null && this.typeParticipation) {
        vo.setTypeParticipationVo(typeParticipationConverter.toVo(item.getTypeParticipation())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getDistinctionEtablissementPayss()) && this.distinctionEtablissementPayss){
        distinctionEtablissementPaysConverter.init(true);
        distinctionEtablissementPaysConverter.setDistinction(false);
        vo.setDistinctionEtablissementPayssVo(distinctionEtablissementPaysConverter.toVo(item.getDistinctionEtablissementPayss()));
        distinctionEtablissementPaysConverter.setDistinction(true);
        }

return vo;
}
}

public void init(Boolean value) {
    typeParticipation = value;
    pays = value;
    etatEtapeCampagne = value;
    chercheur = value;
    campagne = value;
        distinctionEtablissementPayss = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public TypeParticipationConverter getTypeParticipationConverter(){
        return this.typeParticipationConverter;
        }
        public void setTypeParticipationConverter(TypeParticipationConverter typeParticipationConverter ){
        this.typeParticipationConverter = typeParticipationConverter;
        }
        public DistinctionEtablissementPaysConverter getDistinctionEtablissementPaysConverter(){
        return this.distinctionEtablissementPaysConverter;
        }
        public void setDistinctionEtablissementPaysConverter(DistinctionEtablissementPaysConverter distinctionEtablissementPaysConverter ){
        this.distinctionEtablissementPaysConverter = distinctionEtablissementPaysConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
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

    public boolean  isTypeParticipation(){
    return this.typeParticipation;
    }
    public void  setTypeParticipation(boolean typeParticipation){
    this.typeParticipation = typeParticipation;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }

















        public Boolean  isDistinctionEtablissementPayss(){
        return this.distinctionEtablissementPayss ;
        }
        public void  setDistinctionEtablissementPayss(Boolean distinctionEtablissementPayss ){
        this.distinctionEtablissementPayss  = distinctionEtablissementPayss ;
        }


}
