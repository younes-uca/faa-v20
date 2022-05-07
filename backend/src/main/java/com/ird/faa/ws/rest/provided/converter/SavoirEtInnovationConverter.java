package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.SavoirEtInnovation;
import com.ird.faa.ws.rest.provided.vo.SavoirEtInnovationVo;

@Component
public class SavoirEtInnovationConverter extends AbstractConverter<SavoirEtInnovation,SavoirEtInnovationVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private ContratEtConventionIrdConverter contratEtConventionIrdConverter ;
        @Autowired
        private EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ;
        @Autowired
        private DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean campagne;
    private Boolean chercheur;
    private Boolean etatEtapeCampagne;
        private Boolean contratEtConventionIrds;
        private Boolean evenementColloqueScienntifiques;
        private Boolean developpementDeSavoirEtInnovationScientifiques;

public  SavoirEtInnovationConverter(){
init(true);
}

@Override
public SavoirEtInnovation toItem(SavoirEtInnovationVo vo) {
if (vo == null) {
return null;
} else {
SavoirEtInnovation item = new SavoirEtInnovation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getContratEtConventionIrdsVo()) && this.contratEtConventionIrds)
        item.setContratEtConventionIrds(contratEtConventionIrdConverter.toItem(vo.getContratEtConventionIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getEvenementColloqueScienntifiquesVo()) && this.evenementColloqueScienntifiques)
        item.setEvenementColloqueScienntifiques(evenementColloqueScienntifiqueConverter.toItem(vo.getEvenementColloqueScienntifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDeveloppementDeSavoirEtInnovationScientifiquesVo()) && this.developpementDeSavoirEtInnovationScientifiques)
        item.setDeveloppementDeSavoirEtInnovationScientifiques(developpementDeSavoirEtInnovationScientifiqueConverter.toItem(vo.getDeveloppementDeSavoirEtInnovationScientifiquesVo()));

return item;
}
}

@Override
public SavoirEtInnovationVo toVo(SavoirEtInnovation item) {
if (item == null) {
return null;
} else {
SavoirEtInnovationVo vo = new SavoirEtInnovationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getContratEtConventionIrds()) && this.contratEtConventionIrds){
        contratEtConventionIrdConverter.init(true);
        contratEtConventionIrdConverter.setSavoirEtInnovation(false);
        vo.setContratEtConventionIrdsVo(contratEtConventionIrdConverter.toVo(item.getContratEtConventionIrds()));
        contratEtConventionIrdConverter.setSavoirEtInnovation(true);
        }
        if(ListUtil.isNotEmpty(item.getEvenementColloqueScienntifiques()) && this.evenementColloqueScienntifiques){
        evenementColloqueScienntifiqueConverter.init(true);
        evenementColloqueScienntifiqueConverter.setSavoirEtInnovation(false);
        vo.setEvenementColloqueScienntifiquesVo(evenementColloqueScienntifiqueConverter.toVo(item.getEvenementColloqueScienntifiques()));
        evenementColloqueScienntifiqueConverter.setSavoirEtInnovation(true);
        }
        if(ListUtil.isNotEmpty(item.getDeveloppementDeSavoirEtInnovationScientifiques()) && this.developpementDeSavoirEtInnovationScientifiques){
        developpementDeSavoirEtInnovationScientifiqueConverter.init(true);
        developpementDeSavoirEtInnovationScientifiqueConverter.setSavoirEtInnovation(false);
        vo.setDeveloppementDeSavoirEtInnovationScientifiquesVo(developpementDeSavoirEtInnovationScientifiqueConverter.toVo(item.getDeveloppementDeSavoirEtInnovationScientifiques()));
        developpementDeSavoirEtInnovationScientifiqueConverter.setSavoirEtInnovation(true);
        }

return vo;
}
}

public void init(Boolean value) {
    campagne = value;
    chercheur = value;
    etatEtapeCampagne = value;
        contratEtConventionIrds = value;
        evenementColloqueScienntifiques = value;
        developpementDeSavoirEtInnovationScientifiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public ContratEtConventionIrdConverter getContratEtConventionIrdConverter(){
        return this.contratEtConventionIrdConverter;
        }
        public void setContratEtConventionIrdConverter(ContratEtConventionIrdConverter contratEtConventionIrdConverter ){
        this.contratEtConventionIrdConverter = contratEtConventionIrdConverter;
        }
        public EvenementColloqueScienntifiqueConverter getEvenementColloqueScienntifiqueConverter(){
        return this.evenementColloqueScienntifiqueConverter;
        }
        public void setEvenementColloqueScienntifiqueConverter(EvenementColloqueScienntifiqueConverter evenementColloqueScienntifiqueConverter ){
        this.evenementColloqueScienntifiqueConverter = evenementColloqueScienntifiqueConverter;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueConverter getDeveloppementDeSavoirEtInnovationScientifiqueConverter(){
        return this.developpementDeSavoirEtInnovationScientifiqueConverter;
        }
        public void setDeveloppementDeSavoirEtInnovationScientifiqueConverter(DeveloppementDeSavoirEtInnovationScientifiqueConverter developpementDeSavoirEtInnovationScientifiqueConverter ){
        this.developpementDeSavoirEtInnovationScientifiqueConverter = developpementDeSavoirEtInnovationScientifiqueConverter;
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













        public Boolean  isContratEtConventionIrds(){
        return this.contratEtConventionIrds ;
        }
        public void  setContratEtConventionIrds(Boolean contratEtConventionIrds ){
        this.contratEtConventionIrds  = contratEtConventionIrds ;
        }



        public Boolean  isEvenementColloqueScienntifiques(){
        return this.evenementColloqueScienntifiques ;
        }
        public void  setEvenementColloqueScienntifiques(Boolean evenementColloqueScienntifiques ){
        this.evenementColloqueScienntifiques  = evenementColloqueScienntifiques ;
        }



        public Boolean  isDeveloppementDeSavoirEtInnovationScientifiques(){
        return this.developpementDeSavoirEtInnovationScientifiques ;
        }
        public void  setDeveloppementDeSavoirEtInnovationScientifiques(Boolean developpementDeSavoirEtInnovationScientifiques ){
        this.developpementDeSavoirEtInnovationScientifiques  = developpementDeSavoirEtInnovationScientifiques ;
        }


}
