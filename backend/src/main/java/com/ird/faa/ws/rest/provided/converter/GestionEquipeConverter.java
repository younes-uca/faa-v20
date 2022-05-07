package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.GestionEquipe;
import com.ird.faa.ws.rest.provided.vo.GestionEquipeVo;

@Component
public class GestionEquipeConverter extends AbstractConverter<GestionEquipe,GestionEquipeVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private GestionEquipeDetailConverter gestionEquipeDetailConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean chercheur;
    private Boolean campagne;
    private Boolean etatEtapeCampagne;
        private Boolean gestionEquipeDetails;

public  GestionEquipeConverter(){
init(true);
}

@Override
public GestionEquipe toItem(GestionEquipeVo vo) {
if (vo == null) {
return null;
} else {
GestionEquipe item = new GestionEquipe();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getGestionEquipeDetailsVo()) && this.gestionEquipeDetails)
        item.setGestionEquipeDetails(gestionEquipeDetailConverter.toItem(vo.getGestionEquipeDetailsVo()));

return item;
}
}

@Override
public GestionEquipeVo toVo(GestionEquipe item) {
if (item == null) {
return null;
} else {
GestionEquipeVo vo = new GestionEquipeVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getGestionEquipeDetails()) && this.gestionEquipeDetails){
        gestionEquipeDetailConverter.init(true);
        gestionEquipeDetailConverter.setGestionEquipe(false);
        vo.setGestionEquipeDetailsVo(gestionEquipeDetailConverter.toVo(item.getGestionEquipeDetails()));
        gestionEquipeDetailConverter.setGestionEquipe(true);
        }

return vo;
}
}

public void init(Boolean value) {
    chercheur = value;
    campagne = value;
    etatEtapeCampagne = value;
        gestionEquipeDetails = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public GestionEquipeDetailConverter getGestionEquipeDetailConverter(){
        return this.gestionEquipeDetailConverter;
        }
        public void setGestionEquipeDetailConverter(GestionEquipeDetailConverter gestionEquipeDetailConverter ){
        this.gestionEquipeDetailConverter = gestionEquipeDetailConverter;
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
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }





        public Boolean  isGestionEquipeDetails(){
        return this.gestionEquipeDetails ;
        }
        public void  setGestionEquipeDetails(Boolean gestionEquipeDetails ){
        this.gestionEquipeDetails  = gestionEquipeDetails ;
        }








}
