package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EnseignementEtFormation;
import com.ird.faa.ws.rest.provided.vo.EnseignementEtFormationVo;

@Component
public class EnseignementEtFormationConverter extends AbstractConverter<EnseignementEtFormation,EnseignementEtFormationVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private FormationContinueConverter formationContinueConverter ;
        @Autowired
        private EnseignementConverter enseignementConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean etatEtapeCampagne;
    private Boolean chercheur;
    private Boolean campagne;
        private Boolean enseignements;
        private Boolean formationContinues;
        private Boolean responsabilitePedagogiques;

public  EnseignementEtFormationConverter(){
init(true);
}

@Override
public EnseignementEtFormation toItem(EnseignementEtFormationVo vo) {
if (vo == null) {
return null;
} else {
EnseignementEtFormation item = new EnseignementEtFormation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getAnnee()))
        item.setAnnee(NumberUtil.toLong(vo.getAnnee()));
        if(StringUtil.isNotEmpty(vo.getTempsEstimePourCetteAnnne()))
        item.setTempsEstimePourCetteAnnne(NumberUtil.toBigDecimal(vo.getTempsEstimePourCetteAnnne()));
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;
    if(vo.getChercheurVo()!=null && this.chercheur)
        item.setChercheur(chercheurConverter.toItem(vo.getChercheurVo())) ;
    if(vo.getCampagneVo()!=null && this.campagne)
        item.setCampagne(campagneConverter.toItem(vo.getCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getEnseignementsVo()) && this.enseignements)
        item.setEnseignements(enseignementConverter.toItem(vo.getEnseignementsVo()));
    if(ListUtil.isNotEmpty(vo.getFormationContinuesVo()) && this.formationContinues)
        item.setFormationContinues(formationContinueConverter.toItem(vo.getFormationContinuesVo()));
    if(ListUtil.isNotEmpty(vo.getResponsabilitePedagogiquesVo()) && this.responsabilitePedagogiques)
        item.setResponsabilitePedagogiques(responsabilitePedagogiqueConverter.toItem(vo.getResponsabilitePedagogiquesVo()));

return item;
}
}

@Override
public EnseignementEtFormationVo toVo(EnseignementEtFormation item) {
if (item == null) {
return null;
} else {
EnseignementEtFormationVo vo = new EnseignementEtFormationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getAnnee()!=null)
        vo.setAnnee(NumberUtil.toString(item.getAnnee()));

        if(item.getTempsEstimePourCetteAnnne()!=null)
        vo.setTempsEstimePourCetteAnnne(NumberUtil.toString(item.getTempsEstimePourCetteAnnne()));

    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
    if(item.getChercheur()!=null && this.chercheur) {
        vo.setChercheurVo(chercheurConverter.toVo(item.getChercheur())) ;
    }
    if(item.getCampagne()!=null && this.campagne) {
        vo.setCampagneVo(campagneConverter.toVo(item.getCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getEnseignements()) && this.enseignements){
        enseignementConverter.init(true);
        enseignementConverter.setEnseignementEtFormation(false);
        vo.setEnseignementsVo(enseignementConverter.toVo(item.getEnseignements()));
        enseignementConverter.setEnseignementEtFormation(true);
        }
        if(ListUtil.isNotEmpty(item.getFormationContinues()) && this.formationContinues){
        formationContinueConverter.init(true);
        formationContinueConverter.setEnseignementEtFormation(false);
        vo.setFormationContinuesVo(formationContinueConverter.toVo(item.getFormationContinues()));
        formationContinueConverter.setEnseignementEtFormation(true);
        }
        if(ListUtil.isNotEmpty(item.getResponsabilitePedagogiques()) && this.responsabilitePedagogiques){
        responsabilitePedagogiqueConverter.init(true);
        responsabilitePedagogiqueConverter.setEnseignementEtFormation(false);
        vo.setResponsabilitePedagogiquesVo(responsabilitePedagogiqueConverter.toVo(item.getResponsabilitePedagogiques()));
        responsabilitePedagogiqueConverter.setEnseignementEtFormation(true);
        }

return vo;
}
}

public void init(Boolean value) {
    etatEtapeCampagne = value;
    chercheur = value;
    campagne = value;
        enseignements = value;
        formationContinues = value;
        responsabilitePedagogiques = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public FormationContinueConverter getFormationContinueConverter(){
        return this.formationContinueConverter;
        }
        public void setFormationContinueConverter(FormationContinueConverter formationContinueConverter ){
        this.formationContinueConverter = formationContinueConverter;
        }
        public EnseignementConverter getEnseignementConverter(){
        return this.enseignementConverter;
        }
        public void setEnseignementConverter(EnseignementConverter enseignementConverter ){
        this.enseignementConverter = enseignementConverter;
        }
        public CampagneConverter getCampagneConverter(){
        return this.campagneConverter;
        }
        public void setCampagneConverter(CampagneConverter campagneConverter ){
        this.campagneConverter = campagneConverter;
        }
        public ResponsabilitePedagogiqueConverter getResponsabilitePedagogiqueConverter(){
        return this.responsabilitePedagogiqueConverter;
        }
        public void setResponsabilitePedagogiqueConverter(ResponsabilitePedagogiqueConverter responsabilitePedagogiqueConverter ){
        this.responsabilitePedagogiqueConverter = responsabilitePedagogiqueConverter;
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













        public Boolean  isEnseignements(){
        return this.enseignements ;
        }
        public void  setEnseignements(Boolean enseignements ){
        this.enseignements  = enseignements ;
        }



        public Boolean  isFormationContinues(){
        return this.formationContinues ;
        }
        public void  setFormationContinues(Boolean formationContinues ){
        this.formationContinues  = formationContinues ;
        }



        public Boolean  isResponsabilitePedagogiques(){
        return this.responsabilitePedagogiques ;
        }
        public void  setResponsabilitePedagogiques(Boolean responsabilitePedagogiques ){
        this.responsabilitePedagogiques  = responsabilitePedagogiques ;
        }


}
