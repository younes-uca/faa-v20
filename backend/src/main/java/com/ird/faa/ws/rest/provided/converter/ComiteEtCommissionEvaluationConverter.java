package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ComiteEtCommissionEvaluation;
import com.ird.faa.ws.rest.provided.vo.ComiteEtCommissionEvaluationVo;

@Component
public class ComiteEtCommissionEvaluationConverter extends AbstractConverter<ComiteEtCommissionEvaluation,ComiteEtCommissionEvaluationVo>{

        @Autowired
        private DisciplineScientifiqueComiteEtCommissionEvaluationConverter disciplineScientifiqueComiteEtCommissionEvaluationConverter ;
        @Autowired
        private InstrumentIrdComiteEtCommissionEvaluationConverter instrumentIrdComiteEtCommissionEvaluationConverter ;
        @Autowired
        private TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter typeExpertiseEvaluationComiteEtCommissionEvaluationConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private NatureExpertiseConverter natureExpertiseConverter ;
        @Autowired
        private RoleComiteEtCommissionEvaluationConverter roleComiteEtCommissionEvaluationConverter ;
        @Autowired
        private ExpertiseConverter expertiseConverter ;
        @Autowired
        private EtablissementComiteEtCommissionEvaluationConverter etablissementComiteEtCommissionEvaluationConverter ;
        @Autowired
        private EnjeuxIrdComiteEtCommissionEvaluationConverter enjeuxIrdComiteEtCommissionEvaluationConverter ;
    private Boolean natureExpertise;
    private Boolean expertise;
    private Boolean etatEtapeCampagne;
        private Boolean typeExpertiseEvaluationComiteEtCommissionEvaluations;
        private Boolean etablissementComiteEtCommissionEvaluations;
        private Boolean roleComiteEtCommissionEvaluations;
        private Boolean disciplineScientifiqueComiteEtCommissionEvaluations;
        private Boolean enjeuxIrdComiteEtCommissionEvaluations;
        private Boolean instrumentIrdComiteEtCommissionEvaluations;

public  ComiteEtCommissionEvaluationConverter(){
init(true);
}

@Override
public ComiteEtCommissionEvaluation toItem(ComiteEtCommissionEvaluationVo vo) {
if (vo == null) {
return null;
} else {
ComiteEtCommissionEvaluation item = new ComiteEtCommissionEvaluation();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getNom()))
        item.setNom(vo.getNom());
        if(StringUtil.isNotEmpty(vo.getNomRevueOuEditeur()))
        item.setNomRevueOuEditeur(vo.getNomRevueOuEditeur());
        if(StringUtil.isNotEmpty(vo.getRole()))
        item.setRole(vo.getRole());
        if(StringUtil.isNotEmpty(vo.getNombreJourDedie()))
        item.setNombreJourDedie(NumberUtil.toBigDecimal(vo.getNombreJourDedie()));
            if(vo.getRelieeInstrumentsIrd() != null)
            item.setRelieeInstrumentsIrd(vo.getRelieeInstrumentsIrd());
        if(StringUtil.isNotEmpty(vo.getCommentaire()))
        item.setCommentaire(vo.getCommentaire());
    if(vo.getNatureExpertiseVo()!=null && this.natureExpertise)
        item.setNatureExpertise(natureExpertiseConverter.toItem(vo.getNatureExpertiseVo())) ;
    if(vo.getExpertiseVo()!=null && this.expertise)
        item.setExpertise(expertiseConverter.toItem(vo.getExpertiseVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getTypeExpertiseEvaluationComiteEtCommissionEvaluationsVo()) && this.typeExpertiseEvaluationComiteEtCommissionEvaluations)
        item.setTypeExpertiseEvaluationComiteEtCommissionEvaluations(typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toItem(vo.getTypeExpertiseEvaluationComiteEtCommissionEvaluationsVo()));
    if(ListUtil.isNotEmpty(vo.getEtablissementComiteEtCommissionEvaluationsVo()) && this.etablissementComiteEtCommissionEvaluations)
        item.setEtablissementComiteEtCommissionEvaluations(etablissementComiteEtCommissionEvaluationConverter.toItem(vo.getEtablissementComiteEtCommissionEvaluationsVo()));
    if(ListUtil.isNotEmpty(vo.getRoleComiteEtCommissionEvaluationsVo()) && this.roleComiteEtCommissionEvaluations)
        item.setRoleComiteEtCommissionEvaluations(roleComiteEtCommissionEvaluationConverter.toItem(vo.getRoleComiteEtCommissionEvaluationsVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueComiteEtCommissionEvaluationsVo()) && this.disciplineScientifiqueComiteEtCommissionEvaluations)
        item.setDisciplineScientifiqueComiteEtCommissionEvaluations(disciplineScientifiqueComiteEtCommissionEvaluationConverter.toItem(vo.getDisciplineScientifiqueComiteEtCommissionEvaluationsVo()));
    if(ListUtil.isNotEmpty(vo.getEnjeuxIrdComiteEtCommissionEvaluationsVo()) && this.enjeuxIrdComiteEtCommissionEvaluations)
        item.setEnjeuxIrdComiteEtCommissionEvaluations(enjeuxIrdComiteEtCommissionEvaluationConverter.toItem(vo.getEnjeuxIrdComiteEtCommissionEvaluationsVo()));
    if(ListUtil.isNotEmpty(vo.getInstrumentIrdComiteEtCommissionEvaluationsVo()) && this.instrumentIrdComiteEtCommissionEvaluations)
        item.setInstrumentIrdComiteEtCommissionEvaluations(instrumentIrdComiteEtCommissionEvaluationConverter.toItem(vo.getInstrumentIrdComiteEtCommissionEvaluationsVo()));

return item;
}
}

@Override
public ComiteEtCommissionEvaluationVo toVo(ComiteEtCommissionEvaluation item) {
if (item == null) {
return null;
} else {
ComiteEtCommissionEvaluationVo vo = new ComiteEtCommissionEvaluationVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getNom()))
        vo.setNom(item.getNom());

        if(StringUtil.isNotEmpty(item.getNomRevueOuEditeur()))
        vo.setNomRevueOuEditeur(item.getNomRevueOuEditeur());

        if(StringUtil.isNotEmpty(item.getRole()))
        vo.setRole(item.getRole());

        if(item.getNombreJourDedie()!=null)
        vo.setNombreJourDedie(NumberUtil.toString(item.getNombreJourDedie()));

        if(item.getRelieeInstrumentsIrd()!=null)
        vo.setRelieeInstrumentsIrd(item.getRelieeInstrumentsIrd());
        if(StringUtil.isNotEmpty(item.getCommentaire()))
        vo.setCommentaire(item.getCommentaire());

    if(item.getNatureExpertise()!=null && this.natureExpertise) {
        vo.setNatureExpertiseVo(natureExpertiseConverter.toVo(item.getNatureExpertise())) ;
    }
    if(item.getExpertise()!=null && this.expertise) {
        vo.setExpertiseVo(expertiseConverter.toVo(item.getExpertise())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getTypeExpertiseEvaluationComiteEtCommissionEvaluations()) && this.typeExpertiseEvaluationComiteEtCommissionEvaluations){
        typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.init(true);
        typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setTypeExpertiseEvaluationComiteEtCommissionEvaluationsVo(typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.toVo(item.getTypeExpertiseEvaluationComiteEtCommissionEvaluations()));
        typeExpertiseEvaluationComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }
        if(ListUtil.isNotEmpty(item.getEtablissementComiteEtCommissionEvaluations()) && this.etablissementComiteEtCommissionEvaluations){
        etablissementComiteEtCommissionEvaluationConverter.init(true);
        etablissementComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setEtablissementComiteEtCommissionEvaluationsVo(etablissementComiteEtCommissionEvaluationConverter.toVo(item.getEtablissementComiteEtCommissionEvaluations()));
        etablissementComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }
        if(ListUtil.isNotEmpty(item.getRoleComiteEtCommissionEvaluations()) && this.roleComiteEtCommissionEvaluations){
        roleComiteEtCommissionEvaluationConverter.init(true);
        roleComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setRoleComiteEtCommissionEvaluationsVo(roleComiteEtCommissionEvaluationConverter.toVo(item.getRoleComiteEtCommissionEvaluations()));
        roleComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueComiteEtCommissionEvaluations()) && this.disciplineScientifiqueComiteEtCommissionEvaluations){
        disciplineScientifiqueComiteEtCommissionEvaluationConverter.init(true);
        disciplineScientifiqueComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setDisciplineScientifiqueComiteEtCommissionEvaluationsVo(disciplineScientifiqueComiteEtCommissionEvaluationConverter.toVo(item.getDisciplineScientifiqueComiteEtCommissionEvaluations()));
        disciplineScientifiqueComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }
        if(ListUtil.isNotEmpty(item.getEnjeuxIrdComiteEtCommissionEvaluations()) && this.enjeuxIrdComiteEtCommissionEvaluations){
        enjeuxIrdComiteEtCommissionEvaluationConverter.init(true);
        enjeuxIrdComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setEnjeuxIrdComiteEtCommissionEvaluationsVo(enjeuxIrdComiteEtCommissionEvaluationConverter.toVo(item.getEnjeuxIrdComiteEtCommissionEvaluations()));
        enjeuxIrdComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }
        if(ListUtil.isNotEmpty(item.getInstrumentIrdComiteEtCommissionEvaluations()) && this.instrumentIrdComiteEtCommissionEvaluations){
        instrumentIrdComiteEtCommissionEvaluationConverter.init(true);
        instrumentIrdComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(false);
        vo.setInstrumentIrdComiteEtCommissionEvaluationsVo(instrumentIrdComiteEtCommissionEvaluationConverter.toVo(item.getInstrumentIrdComiteEtCommissionEvaluations()));
        instrumentIrdComiteEtCommissionEvaluationConverter.setComiteEtCommissionEvaluation(true);
        }

return vo;
}
}

public void init(Boolean value) {
    natureExpertise = value;
    expertise = value;
    etatEtapeCampagne = value;
        typeExpertiseEvaluationComiteEtCommissionEvaluations = value;
        etablissementComiteEtCommissionEvaluations = value;
        roleComiteEtCommissionEvaluations = value;
        disciplineScientifiqueComiteEtCommissionEvaluations = value;
        enjeuxIrdComiteEtCommissionEvaluations = value;
        instrumentIrdComiteEtCommissionEvaluations = value;
}


        public DisciplineScientifiqueComiteEtCommissionEvaluationConverter getDisciplineScientifiqueComiteEtCommissionEvaluationConverter(){
        return this.disciplineScientifiqueComiteEtCommissionEvaluationConverter;
        }
        public void setDisciplineScientifiqueComiteEtCommissionEvaluationConverter(DisciplineScientifiqueComiteEtCommissionEvaluationConverter disciplineScientifiqueComiteEtCommissionEvaluationConverter ){
        this.disciplineScientifiqueComiteEtCommissionEvaluationConverter = disciplineScientifiqueComiteEtCommissionEvaluationConverter;
        }
        public InstrumentIrdComiteEtCommissionEvaluationConverter getInstrumentIrdComiteEtCommissionEvaluationConverter(){
        return this.instrumentIrdComiteEtCommissionEvaluationConverter;
        }
        public void setInstrumentIrdComiteEtCommissionEvaluationConverter(InstrumentIrdComiteEtCommissionEvaluationConverter instrumentIrdComiteEtCommissionEvaluationConverter ){
        this.instrumentIrdComiteEtCommissionEvaluationConverter = instrumentIrdComiteEtCommissionEvaluationConverter;
        }
        public TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter getTypeExpertiseEvaluationComiteEtCommissionEvaluationConverter(){
        return this.typeExpertiseEvaluationComiteEtCommissionEvaluationConverter;
        }
        public void setTypeExpertiseEvaluationComiteEtCommissionEvaluationConverter(TypeExpertiseEvaluationComiteEtCommissionEvaluationConverter typeExpertiseEvaluationComiteEtCommissionEvaluationConverter ){
        this.typeExpertiseEvaluationComiteEtCommissionEvaluationConverter = typeExpertiseEvaluationComiteEtCommissionEvaluationConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public NatureExpertiseConverter getNatureExpertiseConverter(){
        return this.natureExpertiseConverter;
        }
        public void setNatureExpertiseConverter(NatureExpertiseConverter natureExpertiseConverter ){
        this.natureExpertiseConverter = natureExpertiseConverter;
        }
        public RoleComiteEtCommissionEvaluationConverter getRoleComiteEtCommissionEvaluationConverter(){
        return this.roleComiteEtCommissionEvaluationConverter;
        }
        public void setRoleComiteEtCommissionEvaluationConverter(RoleComiteEtCommissionEvaluationConverter roleComiteEtCommissionEvaluationConverter ){
        this.roleComiteEtCommissionEvaluationConverter = roleComiteEtCommissionEvaluationConverter;
        }
        public ExpertiseConverter getExpertiseConverter(){
        return this.expertiseConverter;
        }
        public void setExpertiseConverter(ExpertiseConverter expertiseConverter ){
        this.expertiseConverter = expertiseConverter;
        }
        public EtablissementComiteEtCommissionEvaluationConverter getEtablissementComiteEtCommissionEvaluationConverter(){
        return this.etablissementComiteEtCommissionEvaluationConverter;
        }
        public void setEtablissementComiteEtCommissionEvaluationConverter(EtablissementComiteEtCommissionEvaluationConverter etablissementComiteEtCommissionEvaluationConverter ){
        this.etablissementComiteEtCommissionEvaluationConverter = etablissementComiteEtCommissionEvaluationConverter;
        }
        public EnjeuxIrdComiteEtCommissionEvaluationConverter getEnjeuxIrdComiteEtCommissionEvaluationConverter(){
        return this.enjeuxIrdComiteEtCommissionEvaluationConverter;
        }
        public void setEnjeuxIrdComiteEtCommissionEvaluationConverter(EnjeuxIrdComiteEtCommissionEvaluationConverter enjeuxIrdComiteEtCommissionEvaluationConverter ){
        this.enjeuxIrdComiteEtCommissionEvaluationConverter = enjeuxIrdComiteEtCommissionEvaluationConverter;
        }

    public boolean  isNatureExpertise(){
    return this.natureExpertise;
    }
    public void  setNatureExpertise(boolean natureExpertise){
    this.natureExpertise = natureExpertise;
    }
    public boolean  isExpertise(){
    return this.expertise;
    }
    public void  setExpertise(boolean expertise){
    this.expertise = expertise;
    }
    public boolean  isEtatEtapeCampagne(){
    return this.etatEtapeCampagne;
    }
    public void  setEtatEtapeCampagne(boolean etatEtapeCampagne){
    this.etatEtapeCampagne = etatEtapeCampagne;
    }



        public Boolean  isTypeExpertiseEvaluationComiteEtCommissionEvaluations(){
        return this.typeExpertiseEvaluationComiteEtCommissionEvaluations ;
        }
        public void  setTypeExpertiseEvaluationComiteEtCommissionEvaluations(Boolean typeExpertiseEvaluationComiteEtCommissionEvaluations ){
        this.typeExpertiseEvaluationComiteEtCommissionEvaluations  = typeExpertiseEvaluationComiteEtCommissionEvaluations ;
        }







        public Boolean  isEtablissementComiteEtCommissionEvaluations(){
        return this.etablissementComiteEtCommissionEvaluations ;
        }
        public void  setEtablissementComiteEtCommissionEvaluations(Boolean etablissementComiteEtCommissionEvaluations ){
        this.etablissementComiteEtCommissionEvaluations  = etablissementComiteEtCommissionEvaluations ;
        }





        public Boolean  isRoleComiteEtCommissionEvaluations(){
        return this.roleComiteEtCommissionEvaluations ;
        }
        public void  setRoleComiteEtCommissionEvaluations(Boolean roleComiteEtCommissionEvaluations ){
        this.roleComiteEtCommissionEvaluations  = roleComiteEtCommissionEvaluations ;
        }







        public Boolean  isDisciplineScientifiqueComiteEtCommissionEvaluations(){
        return this.disciplineScientifiqueComiteEtCommissionEvaluations ;
        }
        public void  setDisciplineScientifiqueComiteEtCommissionEvaluations(Boolean disciplineScientifiqueComiteEtCommissionEvaluations ){
        this.disciplineScientifiqueComiteEtCommissionEvaluations  = disciplineScientifiqueComiteEtCommissionEvaluations ;
        }



        public Boolean  isEnjeuxIrdComiteEtCommissionEvaluations(){
        return this.enjeuxIrdComiteEtCommissionEvaluations ;
        }
        public void  setEnjeuxIrdComiteEtCommissionEvaluations(Boolean enjeuxIrdComiteEtCommissionEvaluations ){
        this.enjeuxIrdComiteEtCommissionEvaluations  = enjeuxIrdComiteEtCommissionEvaluations ;
        }





        public Boolean  isInstrumentIrdComiteEtCommissionEvaluations(){
        return this.instrumentIrdComiteEtCommissionEvaluations ;
        }
        public void  setInstrumentIrdComiteEtCommissionEvaluations(Boolean instrumentIrdComiteEtCommissionEvaluations ){
        this.instrumentIrdComiteEtCommissionEvaluations  = instrumentIrdComiteEtCommissionEvaluations ;
        }








}
