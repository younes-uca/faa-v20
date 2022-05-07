package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ProjetActiviteRecherche;
import com.ird.faa.ws.rest.provided.vo.ProjetActiviteRechercheVo;

@Component
public class ProjetActiviteRechercheConverter extends AbstractConverter<ProjetActiviteRecherche,ProjetActiviteRechercheVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean etatEtapeCampagne;
    private Boolean chercheur;
    private Boolean campagne;
        private Boolean projetActiviteRechercheDetails;

public  ProjetActiviteRechercheConverter(){
init(true);
}

@Override
public ProjetActiviteRecherche toItem(ProjetActiviteRechercheVo vo) {
if (vo == null) {
return null;
} else {
ProjetActiviteRecherche item = new ProjetActiviteRecherche();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getProjetActiviteRechercheDetailsVo()) && this.projetActiviteRechercheDetails)
        item.setProjetActiviteRechercheDetails(projetActiviteRechercheDetailConverter.toItem(vo.getProjetActiviteRechercheDetailsVo()));

return item;
}
}

@Override
public ProjetActiviteRechercheVo toVo(ProjetActiviteRecherche item) {
if (item == null) {
return null;
} else {
ProjetActiviteRechercheVo vo = new ProjetActiviteRechercheVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getProjetActiviteRechercheDetails()) && this.projetActiviteRechercheDetails){
        projetActiviteRechercheDetailConverter.init(true);
        projetActiviteRechercheDetailConverter.setProjetActiviteRecherche(false);
        vo.setProjetActiviteRechercheDetailsVo(projetActiviteRechercheDetailConverter.toVo(item.getProjetActiviteRechercheDetails()));
        projetActiviteRechercheDetailConverter.setProjetActiviteRecherche(true);
        }

return vo;
}
}

public void init(Boolean value) {
    etatEtapeCampagne = value;
    chercheur = value;
    campagne = value;
        projetActiviteRechercheDetails = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public ProjetActiviteRechercheDetailConverter getProjetActiviteRechercheDetailConverter(){
        return this.projetActiviteRechercheDetailConverter;
        }
        public void setProjetActiviteRechercheDetailConverter(ProjetActiviteRechercheDetailConverter projetActiviteRechercheDetailConverter ){
        this.projetActiviteRechercheDetailConverter = projetActiviteRechercheDetailConverter;
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













        public Boolean  isProjetActiviteRechercheDetails(){
        return this.projetActiviteRechercheDetails ;
        }
        public void  setProjetActiviteRechercheDetails(Boolean projetActiviteRechercheDetails ){
        this.projetActiviteRechercheDetails  = projetActiviteRechercheDetails ;
        }


}
