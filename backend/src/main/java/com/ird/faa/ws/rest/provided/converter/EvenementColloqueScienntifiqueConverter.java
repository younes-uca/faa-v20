package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.EvenementColloqueScienntifique;
import com.ird.faa.ws.rest.provided.vo.EvenementColloqueScienntifiqueVo;

@Component
public class EvenementColloqueScienntifiqueConverter extends AbstractConverter<EvenementColloqueScienntifique,EvenementColloqueScienntifiqueVo>{

        @Autowired
        private ModaliteConverter modaliteConverter ;
        @Autowired
        private SavoirEtInnovationConverter savoirEtInnovationConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private EvenementColloqueScienntifiqueEnjeuxIrdConverter evenementColloqueScienntifiqueEnjeuxIrdConverter ;
        @Autowired
        private ModaliteInterventionConverter modaliteInterventionConverter ;
        @Autowired
        private DisciplineScientifiqueEvenementColloqueScientifiqueConverter disciplineScientifiqueEvenementColloqueScientifiqueConverter ;
        @Autowired
        private EvenementColloqueScienntifiquePaysConverter evenementColloqueScienntifiquePaysConverter ;
        @Autowired
        private CommunauteSavoirEvenementColloqueScientifiqueConverter communauteSavoirEvenementColloqueScientifiqueConverter ;
    private Boolean modalite;
    private Boolean modaliteIntervention;
    private Boolean savoirEtInnovation;
    private Boolean etatEtapeCampagne;
        private Boolean evenementColloqueScienntifiqueEnjeuxIrds;
        private Boolean communauteSavoirEvenementColloqueScientifiques;
        private Boolean disciplineScientifiqueEvenementColloqueScientifiques;
        private Boolean evenementColloqueScienntifiquePayss;

public  EvenementColloqueScienntifiqueConverter(){
init(true);
}

@Override
public EvenementColloqueScienntifique toItem(EvenementColloqueScienntifiqueVo vo) {
if (vo == null) {
return null;
} else {
EvenementColloqueScienntifique item = new EvenementColloqueScienntifique();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getIntitule()))
        item.setIntitule(vo.getIntitule());
        if(StringUtil.isNotEmpty(vo.getTypeDeParticipation()))
        item.setTypeDeParticipation(vo.getTypeDeParticipation());
        if(StringUtil.isNotEmpty(vo.getDateEvenement()))
        item.setDateEvenement(DateUtil.parse(vo.getDateEvenement()));
            if(vo.getDiplomatieStategique() != null)
            item.setDiplomatieStategique(vo.getDiplomatieStategique());
        if(StringUtil.isNotEmpty(vo.getVolumeParticipant()))
        item.setVolumeParticipant(NumberUtil.toBigDecimal(vo.getVolumeParticipant()));
    if(vo.getModaliteVo()!=null && this.modalite)
        item.setModalite(modaliteConverter.toItem(vo.getModaliteVo())) ;
    if(vo.getModaliteInterventionVo()!=null && this.modaliteIntervention)
        item.setModaliteIntervention(modaliteInterventionConverter.toItem(vo.getModaliteInterventionVo())) ;
    if(vo.getSavoirEtInnovationVo()!=null && this.savoirEtInnovation)
        item.setSavoirEtInnovation(savoirEtInnovationConverter.toItem(vo.getSavoirEtInnovationVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getEvenementColloqueScienntifiqueEnjeuxIrdsVo()) && this.evenementColloqueScienntifiqueEnjeuxIrds)
        item.setEvenementColloqueScienntifiqueEnjeuxIrds(evenementColloqueScienntifiqueEnjeuxIrdConverter.toItem(vo.getEvenementColloqueScienntifiqueEnjeuxIrdsVo()));
    if(ListUtil.isNotEmpty(vo.getCommunauteSavoirEvenementColloqueScientifiquesVo()) && this.communauteSavoirEvenementColloqueScientifiques)
        item.setCommunauteSavoirEvenementColloqueScientifiques(communauteSavoirEvenementColloqueScientifiqueConverter.toItem(vo.getCommunauteSavoirEvenementColloqueScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueEvenementColloqueScientifiquesVo()) && this.disciplineScientifiqueEvenementColloqueScientifiques)
        item.setDisciplineScientifiqueEvenementColloqueScientifiques(disciplineScientifiqueEvenementColloqueScientifiqueConverter.toItem(vo.getDisciplineScientifiqueEvenementColloqueScientifiquesVo()));
    if(ListUtil.isNotEmpty(vo.getEvenementColloqueScienntifiquePayssVo()) && this.evenementColloqueScienntifiquePayss)
        item.setEvenementColloqueScienntifiquePayss(evenementColloqueScienntifiquePaysConverter.toItem(vo.getEvenementColloqueScienntifiquePayssVo()));

return item;
}
}

@Override
public EvenementColloqueScienntifiqueVo toVo(EvenementColloqueScienntifique item) {
if (item == null) {
return null;
} else {
EvenementColloqueScienntifiqueVo vo = new EvenementColloqueScienntifiqueVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getIntitule()))
        vo.setIntitule(item.getIntitule());

        if(StringUtil.isNotEmpty(item.getTypeDeParticipation()))
        vo.setTypeDeParticipation(item.getTypeDeParticipation());

        if(item.getDateEvenement()!=null)
        vo.setDateEvenement(DateUtil.formateDate(item.getDateEvenement()));
        if(item.getDiplomatieStategique()!=null)
        vo.setDiplomatieStategique(item.getDiplomatieStategique());
        if(item.getVolumeParticipant()!=null)
        vo.setVolumeParticipant(NumberUtil.toString(item.getVolumeParticipant()));

    if(item.getModalite()!=null && this.modalite) {
        vo.setModaliteVo(modaliteConverter.toVo(item.getModalite())) ;
    }
    if(item.getModaliteIntervention()!=null && this.modaliteIntervention) {
        vo.setModaliteInterventionVo(modaliteInterventionConverter.toVo(item.getModaliteIntervention())) ;
    }
    if(item.getSavoirEtInnovation()!=null && this.savoirEtInnovation) {
        vo.setSavoirEtInnovationVo(savoirEtInnovationConverter.toVo(item.getSavoirEtInnovation())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getEvenementColloqueScienntifiqueEnjeuxIrds()) && this.evenementColloqueScienntifiqueEnjeuxIrds){
        evenementColloqueScienntifiqueEnjeuxIrdConverter.init(true);
        evenementColloqueScienntifiqueEnjeuxIrdConverter.setEvenementColloqueScienntifique(false);
        vo.setEvenementColloqueScienntifiqueEnjeuxIrdsVo(evenementColloqueScienntifiqueEnjeuxIrdConverter.toVo(item.getEvenementColloqueScienntifiqueEnjeuxIrds()));
        evenementColloqueScienntifiqueEnjeuxIrdConverter.setEvenementColloqueScienntifique(true);
        }
        if(ListUtil.isNotEmpty(item.getCommunauteSavoirEvenementColloqueScientifiques()) && this.communauteSavoirEvenementColloqueScientifiques){
        communauteSavoirEvenementColloqueScientifiqueConverter.init(true);
        communauteSavoirEvenementColloqueScientifiqueConverter.setEvenementColloqueScienntifique(false);
        vo.setCommunauteSavoirEvenementColloqueScientifiquesVo(communauteSavoirEvenementColloqueScientifiqueConverter.toVo(item.getCommunauteSavoirEvenementColloqueScientifiques()));
        communauteSavoirEvenementColloqueScientifiqueConverter.setEvenementColloqueScienntifique(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueEvenementColloqueScientifiques()) && this.disciplineScientifiqueEvenementColloqueScientifiques){
        disciplineScientifiqueEvenementColloqueScientifiqueConverter.init(true);
        disciplineScientifiqueEvenementColloqueScientifiqueConverter.setEvenementColloqueScienntifique(false);
        vo.setDisciplineScientifiqueEvenementColloqueScientifiquesVo(disciplineScientifiqueEvenementColloqueScientifiqueConverter.toVo(item.getDisciplineScientifiqueEvenementColloqueScientifiques()));
        disciplineScientifiqueEvenementColloqueScientifiqueConverter.setEvenementColloqueScienntifique(true);
        }
        if(ListUtil.isNotEmpty(item.getEvenementColloqueScienntifiquePayss()) && this.evenementColloqueScienntifiquePayss){
        evenementColloqueScienntifiquePaysConverter.init(true);
        evenementColloqueScienntifiquePaysConverter.setEvenementColloqueScienntifique(false);
        vo.setEvenementColloqueScienntifiquePayssVo(evenementColloqueScienntifiquePaysConverter.toVo(item.getEvenementColloqueScienntifiquePayss()));
        evenementColloqueScienntifiquePaysConverter.setEvenementColloqueScienntifique(true);
        }

return vo;
}
}

public void init(Boolean value) {
    modalite = value;
    modaliteIntervention = value;
    savoirEtInnovation = value;
    etatEtapeCampagne = value;
        evenementColloqueScienntifiqueEnjeuxIrds = value;
        communauteSavoirEvenementColloqueScientifiques = value;
        disciplineScientifiqueEvenementColloqueScientifiques = value;
        evenementColloqueScienntifiquePayss = value;
}


        public ModaliteConverter getModaliteConverter(){
        return this.modaliteConverter;
        }
        public void setModaliteConverter(ModaliteConverter modaliteConverter ){
        this.modaliteConverter = modaliteConverter;
        }
        public SavoirEtInnovationConverter getSavoirEtInnovationConverter(){
        return this.savoirEtInnovationConverter;
        }
        public void setSavoirEtInnovationConverter(SavoirEtInnovationConverter savoirEtInnovationConverter ){
        this.savoirEtInnovationConverter = savoirEtInnovationConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public EvenementColloqueScienntifiqueEnjeuxIrdConverter getEvenementColloqueScienntifiqueEnjeuxIrdConverter(){
        return this.evenementColloqueScienntifiqueEnjeuxIrdConverter;
        }
        public void setEvenementColloqueScienntifiqueEnjeuxIrdConverter(EvenementColloqueScienntifiqueEnjeuxIrdConverter evenementColloqueScienntifiqueEnjeuxIrdConverter ){
        this.evenementColloqueScienntifiqueEnjeuxIrdConverter = evenementColloqueScienntifiqueEnjeuxIrdConverter;
        }
        public ModaliteInterventionConverter getModaliteInterventionConverter(){
        return this.modaliteInterventionConverter;
        }
        public void setModaliteInterventionConverter(ModaliteInterventionConverter modaliteInterventionConverter ){
        this.modaliteInterventionConverter = modaliteInterventionConverter;
        }
        public DisciplineScientifiqueEvenementColloqueScientifiqueConverter getDisciplineScientifiqueEvenementColloqueScientifiqueConverter(){
        return this.disciplineScientifiqueEvenementColloqueScientifiqueConverter;
        }
        public void setDisciplineScientifiqueEvenementColloqueScientifiqueConverter(DisciplineScientifiqueEvenementColloqueScientifiqueConverter disciplineScientifiqueEvenementColloqueScientifiqueConverter ){
        this.disciplineScientifiqueEvenementColloqueScientifiqueConverter = disciplineScientifiqueEvenementColloqueScientifiqueConverter;
        }
        public EvenementColloqueScienntifiquePaysConverter getEvenementColloqueScienntifiquePaysConverter(){
        return this.evenementColloqueScienntifiquePaysConverter;
        }
        public void setEvenementColloqueScienntifiquePaysConverter(EvenementColloqueScienntifiquePaysConverter evenementColloqueScienntifiquePaysConverter ){
        this.evenementColloqueScienntifiquePaysConverter = evenementColloqueScienntifiquePaysConverter;
        }
        public CommunauteSavoirEvenementColloqueScientifiqueConverter getCommunauteSavoirEvenementColloqueScientifiqueConverter(){
        return this.communauteSavoirEvenementColloqueScientifiqueConverter;
        }
        public void setCommunauteSavoirEvenementColloqueScientifiqueConverter(CommunauteSavoirEvenementColloqueScientifiqueConverter communauteSavoirEvenementColloqueScientifiqueConverter ){
        this.communauteSavoirEvenementColloqueScientifiqueConverter = communauteSavoirEvenementColloqueScientifiqueConverter;
        }

    public boolean  isModalite(){
    return this.modalite;
    }
    public void  setModalite(boolean modalite){
    this.modalite = modalite;
    }
    public boolean  isModaliteIntervention(){
    return this.modaliteIntervention;
    }
    public void  setModaliteIntervention(boolean modaliteIntervention){
    this.modaliteIntervention = modaliteIntervention;
    }
    public boolean  isSavoirEtInnovation(){
    return this.savoirEtInnovation;
    }
    public void  setSavoirEtInnovation(boolean savoirEtInnovation){
    this.savoirEtInnovation = savoirEtInnovation;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }













        public Boolean  isEvenementColloqueScienntifiqueEnjeuxIrds(){
        return this.evenementColloqueScienntifiqueEnjeuxIrds ;
        }
        public void  setEvenementColloqueScienntifiqueEnjeuxIrds(Boolean evenementColloqueScienntifiqueEnjeuxIrds ){
        this.evenementColloqueScienntifiqueEnjeuxIrds  = evenementColloqueScienntifiqueEnjeuxIrds ;
        }



        public Boolean  isCommunauteSavoirEvenementColloqueScientifiques(){
        return this.communauteSavoirEvenementColloqueScientifiques ;
        }
        public void  setCommunauteSavoirEvenementColloqueScientifiques(Boolean communauteSavoirEvenementColloqueScientifiques ){
        this.communauteSavoirEvenementColloqueScientifiques  = communauteSavoirEvenementColloqueScientifiques ;
        }



        public Boolean  isDisciplineScientifiqueEvenementColloqueScientifiques(){
        return this.disciplineScientifiqueEvenementColloqueScientifiques ;
        }
        public void  setDisciplineScientifiqueEvenementColloqueScientifiques(Boolean disciplineScientifiqueEvenementColloqueScientifiques ){
        this.disciplineScientifiqueEvenementColloqueScientifiques  = disciplineScientifiqueEvenementColloqueScientifiques ;
        }





        public Boolean  isEvenementColloqueScienntifiquePayss(){
        return this.evenementColloqueScienntifiquePayss ;
        }
        public void  setEvenementColloqueScienntifiquePayss(Boolean evenementColloqueScienntifiquePayss ){
        this.evenementColloqueScienntifiquePayss  = evenementColloqueScienntifiquePayss ;
        }








}
