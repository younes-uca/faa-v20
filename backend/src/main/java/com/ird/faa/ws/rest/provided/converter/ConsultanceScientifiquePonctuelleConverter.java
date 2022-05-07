package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.ConsultanceScientifiquePonctuelle;
import com.ird.faa.ws.rest.provided.vo.ConsultanceScientifiquePonctuelleVo;

@Component
public class ConsultanceScientifiquePonctuelleConverter extends AbstractConverter<ConsultanceScientifiquePonctuelle,ConsultanceScientifiquePonctuelleVo>{

        @Autowired
        private TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter typeInstrumentIrdConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private EtatEtapeCampagneConverter etatEtapeCampagneConverter ;
        @Autowired
        private EtablissementConsultanceScientifiquePonctuelleConverter etablissementConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private InstrumentIrdConsultanceScientifiquePonctuelleConverter instrumentIrdConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private PaysCommanditaireConverter paysCommanditaireConverter ;
        @Autowired
        private DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter disciplineScientifiqueConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private TypeExpertiseConverter typeExpertiseConverter ;
        @Autowired
        private NatureExpertiseConverter natureExpertiseConverter ;
        @Autowired
        private EnjeuxIrdConsultanceScientifiquePonctuelleConverter enjeuxIrdConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private ZoneGeographiqueConsultanceScientifiquePonctuelleConverter zoneGeographiqueConsultanceScientifiquePonctuelleConverter ;
        @Autowired
        private ExpertiseConverter expertiseConverter ;
    private Boolean typeExpertise;
    private Boolean natureExpertise;
    private Boolean expertise;
    private Boolean etatEtapeCampagne;
        private Boolean zoneGeographiqueConsultanceScientifiquePonctuelles;
        private Boolean paysCommanditaires;
        private Boolean etablissementConsultanceScientifiquePonctuelles;
        private Boolean disciplineScientifiqueConsultanceScientifiquePonctuelles;
        private Boolean enjeuxIrdConsultanceScientifiquePonctuelles;
        private Boolean instrumentIrdConsultanceScientifiquePonctuelles;
        private Boolean typeInstrumentIrdConsultanceScientifiquePonctuelles;

public  ConsultanceScientifiquePonctuelleConverter(){
init(true);
}

@Override
public ConsultanceScientifiquePonctuelle toItem(ConsultanceScientifiquePonctuelleVo vo) {
if (vo == null) {
return null;
} else {
ConsultanceScientifiquePonctuelle item = new ConsultanceScientifiquePonctuelle();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
        if(StringUtil.isNotEmpty(vo.getSujetExpertise()))
        item.setSujetExpertise(vo.getSujetExpertise());
        if(StringUtil.isNotEmpty(vo.getNombreJourDedie()))
        item.setNombreJourDedie(NumberUtil.toBigDecimal(vo.getNombreJourDedie()));
        if(StringUtil.isNotEmpty(vo.getDateFin()))
        item.setDateFin(DateUtil.parse(vo.getDateFin()));
            if(vo.getRelieeInstrumentsIrd() != null)
            item.setRelieeInstrumentsIrd(vo.getRelieeInstrumentsIrd());
        if(StringUtil.isNotEmpty(vo.getCommentaire()))
        item.setCommentaire(vo.getCommentaire());
    if(vo.getTypeExpertiseVo()!=null && this.typeExpertise)
        item.setTypeExpertise(typeExpertiseConverter.toItem(vo.getTypeExpertiseVo())) ;
    if(vo.getNatureExpertiseVo()!=null && this.natureExpertise)
        item.setNatureExpertise(natureExpertiseConverter.toItem(vo.getNatureExpertiseVo())) ;
    if(vo.getExpertiseVo()!=null && this.expertise)
        item.setExpertise(expertiseConverter.toItem(vo.getExpertiseVo())) ;
    if(vo.getEtatEtapeCampagneVo()!=null && this.etatEtapeCampagne)
        item.setEtatEtapeCampagne(etatEtapeCampagneConverter.toItem(vo.getEtatEtapeCampagneVo())) ;

    if(ListUtil.isNotEmpty(vo.getZoneGeographiqueConsultanceScientifiquePonctuellesVo()) && this.zoneGeographiqueConsultanceScientifiquePonctuelles)
        item.setZoneGeographiqueConsultanceScientifiquePonctuelles(zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toItem(vo.getZoneGeographiqueConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getPaysCommanditairesVo()) && this.paysCommanditaires)
        item.setPaysCommanditaires(paysCommanditaireConverter.toItem(vo.getPaysCommanditairesVo()));
    if(ListUtil.isNotEmpty(vo.getEtablissementConsultanceScientifiquePonctuellesVo()) && this.etablissementConsultanceScientifiquePonctuelles)
        item.setEtablissementConsultanceScientifiquePonctuelles(etablissementConsultanceScientifiquePonctuelleConverter.toItem(vo.getEtablissementConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueConsultanceScientifiquePonctuellesVo()) && this.disciplineScientifiqueConsultanceScientifiquePonctuelles)
        item.setDisciplineScientifiqueConsultanceScientifiquePonctuelles(disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toItem(vo.getDisciplineScientifiqueConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getEnjeuxIrdConsultanceScientifiquePonctuellesVo()) && this.enjeuxIrdConsultanceScientifiquePonctuelles)
        item.setEnjeuxIrdConsultanceScientifiquePonctuelles(enjeuxIrdConsultanceScientifiquePonctuelleConverter.toItem(vo.getEnjeuxIrdConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getInstrumentIrdConsultanceScientifiquePonctuellesVo()) && this.instrumentIrdConsultanceScientifiquePonctuelles)
        item.setInstrumentIrdConsultanceScientifiquePonctuelles(instrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(vo.getInstrumentIrdConsultanceScientifiquePonctuellesVo()));
    if(ListUtil.isNotEmpty(vo.getTypeInstrumentIrdConsultanceScientifiquePonctuellesVo()) && this.typeInstrumentIrdConsultanceScientifiquePonctuelles)
        item.setTypeInstrumentIrdConsultanceScientifiquePonctuelles(typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toItem(vo.getTypeInstrumentIrdConsultanceScientifiquePonctuellesVo()));

return item;
}
}

@Override
public ConsultanceScientifiquePonctuelleVo toVo(ConsultanceScientifiquePonctuelle item) {
if (item == null) {
return null;
} else {
ConsultanceScientifiquePonctuelleVo vo = new ConsultanceScientifiquePonctuelleVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(StringUtil.isNotEmpty(item.getSujetExpertise()))
        vo.setSujetExpertise(item.getSujetExpertise());

        if(item.getNombreJourDedie()!=null)
        vo.setNombreJourDedie(NumberUtil.toString(item.getNombreJourDedie()));

        if(item.getDateFin()!=null)
        vo.setDateFin(DateUtil.formateDate(item.getDateFin()));
        if(item.getRelieeInstrumentsIrd()!=null)
        vo.setRelieeInstrumentsIrd(item.getRelieeInstrumentsIrd());
        if(StringUtil.isNotEmpty(item.getCommentaire()))
        vo.setCommentaire(item.getCommentaire());

    if(item.getTypeExpertise()!=null && this.typeExpertise) {
        vo.setTypeExpertiseVo(typeExpertiseConverter.toVo(item.getTypeExpertise())) ;
    }
    if(item.getNatureExpertise()!=null && this.natureExpertise) {
        vo.setNatureExpertiseVo(natureExpertiseConverter.toVo(item.getNatureExpertise())) ;
    }
    if(item.getExpertise()!=null && this.expertise) {
        vo.setExpertiseVo(expertiseConverter.toVo(item.getExpertise())) ;
    }
    if(item.getEtatEtapeCampagne()!=null && this.etatEtapeCampagne) {
        vo.setEtatEtapeCampagneVo(etatEtapeCampagneConverter.toVo(item.getEtatEtapeCampagne())) ;
    }
        if(ListUtil.isNotEmpty(item.getZoneGeographiqueConsultanceScientifiquePonctuelles()) && this.zoneGeographiqueConsultanceScientifiquePonctuelles){
        zoneGeographiqueConsultanceScientifiquePonctuelleConverter.init(true);
        zoneGeographiqueConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setZoneGeographiqueConsultanceScientifiquePonctuellesVo(zoneGeographiqueConsultanceScientifiquePonctuelleConverter.toVo(item.getZoneGeographiqueConsultanceScientifiquePonctuelles()));
        zoneGeographiqueConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getPaysCommanditaires()) && this.paysCommanditaires){
        paysCommanditaireConverter.init(true);
        paysCommanditaireConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setPaysCommanditairesVo(paysCommanditaireConverter.toVo(item.getPaysCommanditaires()));
        paysCommanditaireConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getEtablissementConsultanceScientifiquePonctuelles()) && this.etablissementConsultanceScientifiquePonctuelles){
        etablissementConsultanceScientifiquePonctuelleConverter.init(true);
        etablissementConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setEtablissementConsultanceScientifiquePonctuellesVo(etablissementConsultanceScientifiquePonctuelleConverter.toVo(item.getEtablissementConsultanceScientifiquePonctuelles()));
        etablissementConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueConsultanceScientifiquePonctuelles()) && this.disciplineScientifiqueConsultanceScientifiquePonctuelles){
        disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.init(true);
        disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setDisciplineScientifiqueConsultanceScientifiquePonctuellesVo(disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.toVo(item.getDisciplineScientifiqueConsultanceScientifiquePonctuelles()));
        disciplineScientifiqueConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getEnjeuxIrdConsultanceScientifiquePonctuelles()) && this.enjeuxIrdConsultanceScientifiquePonctuelles){
        enjeuxIrdConsultanceScientifiquePonctuelleConverter.init(true);
        enjeuxIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setEnjeuxIrdConsultanceScientifiquePonctuellesVo(enjeuxIrdConsultanceScientifiquePonctuelleConverter.toVo(item.getEnjeuxIrdConsultanceScientifiquePonctuelles()));
        enjeuxIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getInstrumentIrdConsultanceScientifiquePonctuelles()) && this.instrumentIrdConsultanceScientifiquePonctuelles){
        instrumentIrdConsultanceScientifiquePonctuelleConverter.init(true);
        instrumentIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setInstrumentIrdConsultanceScientifiquePonctuellesVo(instrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(item.getInstrumentIrdConsultanceScientifiquePonctuelles()));
        instrumentIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }
        if(ListUtil.isNotEmpty(item.getTypeInstrumentIrdConsultanceScientifiquePonctuelles()) && this.typeInstrumentIrdConsultanceScientifiquePonctuelles){
        typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.init(true);
        typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(false);
        vo.setTypeInstrumentIrdConsultanceScientifiquePonctuellesVo(typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.toVo(item.getTypeInstrumentIrdConsultanceScientifiquePonctuelles()));
        typeInstrumentIrdConsultanceScientifiquePonctuelleConverter.setConsultanceScientifiquePonctuelle(true);
        }

return vo;
}
}

public void init(Boolean value) {
    typeExpertise = value;
    natureExpertise = value;
    expertise = value;
    etatEtapeCampagne = value;
        zoneGeographiqueConsultanceScientifiquePonctuelles = value;
        paysCommanditaires = value;
        etablissementConsultanceScientifiquePonctuelles = value;
        disciplineScientifiqueConsultanceScientifiquePonctuelles = value;
        enjeuxIrdConsultanceScientifiquePonctuelles = value;
        instrumentIrdConsultanceScientifiquePonctuelles = value;
        typeInstrumentIrdConsultanceScientifiquePonctuelles = value;
}


        public TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter getTypeInstrumentIrdConsultanceScientifiquePonctuelleConverter(){
        return this.typeInstrumentIrdConsultanceScientifiquePonctuelleConverter;
        }
        public void setTypeInstrumentIrdConsultanceScientifiquePonctuelleConverter(TypeInstrumentIrdConsultanceScientifiquePonctuelleConverter typeInstrumentIrdConsultanceScientifiquePonctuelleConverter ){
        this.typeInstrumentIrdConsultanceScientifiquePonctuelleConverter = typeInstrumentIrdConsultanceScientifiquePonctuelleConverter;
        }
        public EtatEtapeCampagneConverter getEtatEtapeCampagneConverter(){
        return this.etatEtapeCampagneConverter;
        }
        public void setEtatEtapeCampagneConverter(EtatEtapeCampagneConverter etatEtapeCampagneConverter ){
        this.etatEtapeCampagneConverter = etatEtapeCampagneConverter;
        }
        public EtablissementConsultanceScientifiquePonctuelleConverter getEtablissementConsultanceScientifiquePonctuelleConverter(){
        return this.etablissementConsultanceScientifiquePonctuelleConverter;
        }
        public void setEtablissementConsultanceScientifiquePonctuelleConverter(EtablissementConsultanceScientifiquePonctuelleConverter etablissementConsultanceScientifiquePonctuelleConverter ){
        this.etablissementConsultanceScientifiquePonctuelleConverter = etablissementConsultanceScientifiquePonctuelleConverter;
        }
        public InstrumentIrdConsultanceScientifiquePonctuelleConverter getInstrumentIrdConsultanceScientifiquePonctuelleConverter(){
        return this.instrumentIrdConsultanceScientifiquePonctuelleConverter;
        }
        public void setInstrumentIrdConsultanceScientifiquePonctuelleConverter(InstrumentIrdConsultanceScientifiquePonctuelleConverter instrumentIrdConsultanceScientifiquePonctuelleConverter ){
        this.instrumentIrdConsultanceScientifiquePonctuelleConverter = instrumentIrdConsultanceScientifiquePonctuelleConverter;
        }
        public PaysCommanditaireConverter getPaysCommanditaireConverter(){
        return this.paysCommanditaireConverter;
        }
        public void setPaysCommanditaireConverter(PaysCommanditaireConverter paysCommanditaireConverter ){
        this.paysCommanditaireConverter = paysCommanditaireConverter;
        }
        public DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter getDisciplineScientifiqueConsultanceScientifiquePonctuelleConverter(){
        return this.disciplineScientifiqueConsultanceScientifiquePonctuelleConverter;
        }
        public void setDisciplineScientifiqueConsultanceScientifiquePonctuelleConverter(DisciplineScientifiqueConsultanceScientifiquePonctuelleConverter disciplineScientifiqueConsultanceScientifiquePonctuelleConverter ){
        this.disciplineScientifiqueConsultanceScientifiquePonctuelleConverter = disciplineScientifiqueConsultanceScientifiquePonctuelleConverter;
        }
        public TypeExpertiseConverter getTypeExpertiseConverter(){
        return this.typeExpertiseConverter;
        }
        public void setTypeExpertiseConverter(TypeExpertiseConverter typeExpertiseConverter ){
        this.typeExpertiseConverter = typeExpertiseConverter;
        }
        public NatureExpertiseConverter getNatureExpertiseConverter(){
        return this.natureExpertiseConverter;
        }
        public void setNatureExpertiseConverter(NatureExpertiseConverter natureExpertiseConverter ){
        this.natureExpertiseConverter = natureExpertiseConverter;
        }
        public EnjeuxIrdConsultanceScientifiquePonctuelleConverter getEnjeuxIrdConsultanceScientifiquePonctuelleConverter(){
        return this.enjeuxIrdConsultanceScientifiquePonctuelleConverter;
        }
        public void setEnjeuxIrdConsultanceScientifiquePonctuelleConverter(EnjeuxIrdConsultanceScientifiquePonctuelleConverter enjeuxIrdConsultanceScientifiquePonctuelleConverter ){
        this.enjeuxIrdConsultanceScientifiquePonctuelleConverter = enjeuxIrdConsultanceScientifiquePonctuelleConverter;
        }
        public ZoneGeographiqueConsultanceScientifiquePonctuelleConverter getZoneGeographiqueConsultanceScientifiquePonctuelleConverter(){
        return this.zoneGeographiqueConsultanceScientifiquePonctuelleConverter;
        }
        public void setZoneGeographiqueConsultanceScientifiquePonctuelleConverter(ZoneGeographiqueConsultanceScientifiquePonctuelleConverter zoneGeographiqueConsultanceScientifiquePonctuelleConverter ){
        this.zoneGeographiqueConsultanceScientifiquePonctuelleConverter = zoneGeographiqueConsultanceScientifiquePonctuelleConverter;
        }
        public ExpertiseConverter getExpertiseConverter(){
        return this.expertiseConverter;
        }
        public void setExpertiseConverter(ExpertiseConverter expertiseConverter ){
        this.expertiseConverter = expertiseConverter;
        }

    public boolean  isTypeExpertise(){
    return this.typeExpertise;
    }
    public void  setTypeExpertise(boolean typeExpertise){
    this.typeExpertise = typeExpertise;
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









        public Boolean  isZoneGeographiqueConsultanceScientifiquePonctuelles(){
        return this.zoneGeographiqueConsultanceScientifiquePonctuelles ;
        }
        public void  setZoneGeographiqueConsultanceScientifiquePonctuelles(Boolean zoneGeographiqueConsultanceScientifiquePonctuelles ){
        this.zoneGeographiqueConsultanceScientifiquePonctuelles  = zoneGeographiqueConsultanceScientifiquePonctuelles ;
        }



        public Boolean  isPaysCommanditaires(){
        return this.paysCommanditaires ;
        }
        public void  setPaysCommanditaires(Boolean paysCommanditaires ){
        this.paysCommanditaires  = paysCommanditaires ;
        }



        public Boolean  isEtablissementConsultanceScientifiquePonctuelles(){
        return this.etablissementConsultanceScientifiquePonctuelles ;
        }
        public void  setEtablissementConsultanceScientifiquePonctuelles(Boolean etablissementConsultanceScientifiquePonctuelles ){
        this.etablissementConsultanceScientifiquePonctuelles  = etablissementConsultanceScientifiquePonctuelles ;
        }







        public Boolean  isDisciplineScientifiqueConsultanceScientifiquePonctuelles(){
        return this.disciplineScientifiqueConsultanceScientifiquePonctuelles ;
        }
        public void  setDisciplineScientifiqueConsultanceScientifiquePonctuelles(Boolean disciplineScientifiqueConsultanceScientifiquePonctuelles ){
        this.disciplineScientifiqueConsultanceScientifiquePonctuelles  = disciplineScientifiqueConsultanceScientifiquePonctuelles ;
        }



        public Boolean  isEnjeuxIrdConsultanceScientifiquePonctuelles(){
        return this.enjeuxIrdConsultanceScientifiquePonctuelles ;
        }
        public void  setEnjeuxIrdConsultanceScientifiquePonctuelles(Boolean enjeuxIrdConsultanceScientifiquePonctuelles ){
        this.enjeuxIrdConsultanceScientifiquePonctuelles  = enjeuxIrdConsultanceScientifiquePonctuelles ;
        }





        public Boolean  isInstrumentIrdConsultanceScientifiquePonctuelles(){
        return this.instrumentIrdConsultanceScientifiquePonctuelles ;
        }
        public void  setInstrumentIrdConsultanceScientifiquePonctuelles(Boolean instrumentIrdConsultanceScientifiquePonctuelles ){
        this.instrumentIrdConsultanceScientifiquePonctuelles  = instrumentIrdConsultanceScientifiquePonctuelles ;
        }



        public Boolean  isTypeInstrumentIrdConsultanceScientifiquePonctuelles(){
        return this.typeInstrumentIrdConsultanceScientifiquePonctuelles ;
        }
        public void  setTypeInstrumentIrdConsultanceScientifiquePonctuelles(Boolean typeInstrumentIrdConsultanceScientifiquePonctuelles ){
        this.typeInstrumentIrdConsultanceScientifiquePonctuelles  = typeInstrumentIrdConsultanceScientifiquePonctuelles ;
        }








}
