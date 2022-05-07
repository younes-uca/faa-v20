package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.VieInstitutionnelle;
import com.ird.faa.ws.rest.provided.vo.VieInstitutionnelleVo;

@Component
public class VieInstitutionnelleConverter extends AbstractConverter<VieInstitutionnelle,VieInstitutionnelleVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean campagne;
    private Boolean chercheur;
    private Boolean etatEtapeCampagne;
        private Boolean vieInstitutionnelleDetails;

public  VieInstitutionnelleConverter(){
init(true);
}

@Override
public VieInstitutionnelle toItem(VieInstitutionnelleVo vo) {
if (vo == null) {
return null;
} else {
VieInstitutionnelle item = new VieInstitutionnelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getTempsEstime()))
        item.setTempsEstime(NumberUtil.toBigDecimal(vo.getTempsEstime()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getVieInstitutionnelleDetailsVo()) && this.vieInstitutionnelleDetails)
        item.setVieInstitutionnelleDetails(vieInstitutionnelleDetailConverter.toItem(vo.getVieInstitutionnelleDetailsVo()));

return item;
}
}

@Override
public VieInstitutionnelleVo toVo(VieInstitutionnelle item) {
if (item == null) {
return null;
} else {
VieInstitutionnelleVo vo = new VieInstitutionnelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getTempsEstime()!=null)
        vo.setTempsEstime(NumberUtil.toString(item.getTempsEstime()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getVieInstitutionnelleDetails()) && this.vieInstitutionnelleDetails){
        vieInstitutionnelleDetailConverter.init(true);
        vieInstitutionnelleDetailConverter.setVieInstitutionnelle(false);
        vo.setVieInstitutionnelleDetailsVo(vieInstitutionnelleDetailConverter.toVo(item.getVieInstitutionnelleDetails()));
        vieInstitutionnelleDetailConverter.setVieInstitutionnelle(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    chercheur = value;
    etatEtapeCampagne = value;
        vieInstitutionnelleDetails = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public VieInstitutionnelleDetailConverter getVieInstitutionnelleDetailConverter(){
        return this.vieInstitutionnelleDetailConverter;
        }
        public void setVieInstitutionnelleDetailConverter(VieInstitutionnelleDetailConverter vieInstitutionnelleDetailConverter ){
        this.vieInstitutionnelleDetailConverter = vieInstitutionnelleDetailConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }
        public ChercheurConverter getChercheurConverter(){
        return this.chercheurConverter;
        }
        public void setChercheurConverter(ChercheurConverter chercheurConverter ){
        this.chercheurConverter = chercheurConverter;
        }

    public boolean  isCampagne(){
    return this.campagne;
    }
    public void  setCampagne(boolean campagne){
    this.campagne = campagne;
    }
    public boolean  isChercheur(){
    return this.chercheur;
    }
    public void  setChercheur(boolean chercheur){
    this.chercheur = chercheur;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }













        public Boolean  isVieInstitutionnelleDetails(){
        return this.vieInstitutionnelleDetails ;
        }
        public void  setVieInstitutionnelleDetails(Boolean vieInstitutionnelleDetails ){
        this.vieInstitutionnelleDetails  = vieInstitutionnelleDetails ;
        }


}
