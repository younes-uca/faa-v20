package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Expertise;
import com.ird.faa.ws.rest.provided.vo.ExpertiseVo;

@Component
public class ExpertiseConverter extends AbstractConverter<Expertise,ExpertiseVo>{

        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ;
        @Autowired
        private ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ;
        @Autowired
        private ConseilsScientifiqueConverter conseilsScientifiqueConverter ;
        @Autowired
        private CampagneConverter campagneConverter ;
        @Autowired
        private ChercheurConverter chercheurConverter ;
    private Boolean etatEtapeCampagne;
    private Boolean chercheur;
    private Boolean campagne;
        private Boolean conseilsScientifiques;
        private Boolean consultanceScientifiquePonctuelles;
        private Boolean comiteEtCommissionEvaluations;

public  ExpertiseConverter(){
init(true);
}

@Override
public Expertise toItem(ExpertiseVo vo) {
if (vo == null) {
return null;
} else {
Expertise item = new Expertise();
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

    if(ListUtil.isNotEmpty(vo.getConseilsScientifiquesVo()) && this.conseilsScientifiques)
        item.setConseilsScientifiques(conseilsScientifiqueConverter.toItem(vo.getConseilsScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getConsultanceScientifiquePonctuellesVo()) && this.consultanceScientifiquePonctuelles)
        item.setConsultanceScientifiquePonctuelles(consultanceScientifiquePonctuelleConverter.toItem(vo.getConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getComiteEtCommissionEvaluationsVo()) && this.comiteEtCommissionEvaluations)
        item.setComiteEtCommissionEvaluations(comiteEtCommissionEvaluationConverter.toItem(vo.getComiteEtCommissionEvaluationsVo()));

return item;
}
}

@Override
public ExpertiseVo toVo(Expertise item) {
if (item == null) {
return null;
} else {
ExpertiseVo vo = new ExpertiseVo();
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
        if(ListUtil.isNotEmpty(item.getConseilsScientifiques()) && this.conseilsScientifiques){
        conseilsScientifiqueConverter.init(true);
        conseilsScientifiqueConverter.setExpertise(false);
        vo.setConseilsScientifiquesVo(conseilsScientifiqueConverter.toVo(item.getConseilsScientifiques()));
        conseilsScientifiqueConverter.setExpertise(true);
        }
        if(ListUtil.isNotEmpty(item.getConsultanceScientifiquePonctuelles()) && this.consultanceScientifiquePonctuelles){
        consultanceScientifiquePonctuelleConverter.init(true);
        consultanceScientifiquePonctuelleConverter.setExpertise(false);
        vo.setConsultanceScientifiquePonctuellesVo(consultanceScientifiquePonctuelleConverter.toVo(item.getConsultanceScientifiquePonctuelles()));
        consultanceScientifiquePonctuelleConverter.setExpertise(true);
        }
        if(ListUtil.isNotEmpty(item.getComiteEtCommissionEvaluations()) && this.comiteEtCommissionEvaluations){
        comiteEtCommissionEvaluationConverter.init(true);
        comiteEtCommissionEvaluationConverter.setExpertise(false);
        vo.setComiteEtCommissionEvaluationsVo(comiteEtCommissionEvaluationConverter.toVo(item.getComiteEtCommissionEvaluations()));
        comiteEtCommissionEvaluationConverter.setExpertise(true);
        }

return vo;
}
}

public void init(Boolean value) {
    etatEtapeCampagne = value;
    chercheur = value;
    campagne = value;
        conseilsScientifiques = value;
        consultanceScientifiquePonctuelles = value;
        comiteEtCommissionEvaluations = value;
}


        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public ConsultanceScientifiquePonctuelleConverter getConsultanceScientifiquePonctuelleConverter(){
        return this.consultanceScientifiquePonctuelleConverter;
        }
        public void setConsultanceScientifiquePonctuelleConverter(ConsultanceScientifiquePonctuelleConverter consultanceScientifiquePonctuelleConverter ){
        this.consultanceScientifiquePonctuelleConverter = consultanceScientifiquePonctuelleConverter;
        }
        public ComiteEtCommissionEvaluationConverter getComiteEtCommissionEvaluationConverter(){
        return this.comiteEtCommissionEvaluationConverter;
        }
        public void setComiteEtCommissionEvaluationConverter(ComiteEtCommissionEvaluationConverter comiteEtCommissionEvaluationConverter ){
        this.comiteEtCommissionEvaluationConverter = comiteEtCommissionEvaluationConverter;
        }
        public ConseilsScientifiqueConverter getConseilsScientifiqueConverter(){
        return this.conseilsScientifiqueConverter;
        }
        public void setConseilsScientifiqueConverter(ConseilsScientifiqueConverter conseilsScientifiqueConverter ){
        this.conseilsScientifiqueConverter = conseilsScientifiqueConverter;
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







        public Boolean  isConseilsScientifiques(){
        return this.conseilsScientifiques ;
        }
        public void  setConseilsScientifiques(Boolean conseilsScientifiques ){
        this.conseilsScientifiques  = conseilsScientifiques ;
        }



        public Boolean  isConsultanceScientifiquePonctuelles(){
        return this.consultanceScientifiquePonctuelles ;
        }
        public void  setConsultanceScientifiquePonctuelles(Boolean consultanceScientifiquePonctuelles ){
        this.consultanceScientifiquePonctuelles  = consultanceScientifiquePonctuelles ;
        }



        public Boolean  isComiteEtCommissionEvaluations(){
        return this.comiteEtCommissionEvaluations ;
        }
        public void  setComiteEtCommissionEvaluations(Boolean comiteEtCommissionEvaluations ){
        this.comiteEtCommissionEvaluations  = comiteEtCommissionEvaluations ;
        }








}
