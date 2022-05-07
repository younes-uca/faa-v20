package  com.ird.faa.ws.rest.provided.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.ird.faa.service.util.*;


import com.ird.faa.bean.Chercheur;
import com.ird.faa.ws.rest.provided.vo.ChercheurVo;

@Component
public class ChercheurConverter extends AbstractConverter<Chercheur,ChercheurVo>{

        @Autowired
        private CommunauteSavoirChercheurConverter communauteSavoirChercheurConverter ;
        @Autowired
        private TypeEntiteAdministrativeConverter typeEntiteAdministrativeConverter ;
        @Autowired
        private DepartementScientifiqueConverter departementScientifiqueConverter ;
        @Autowired
        private ZoneActiviteInteractionRechercheConverter zoneActiviteInteractionRechercheConverter ;
        @Autowired
        private GradeConverter gradeConverter ;
        @Autowired
        private CorpsConverter corpsConverter ;
        @Autowired
        private CommissionScientifiqueConverter commissionScientifiqueConverter ;
        @Autowired
        private PaysConverter paysConverter ;
        @Autowired
        private ChercheurEmailConverter chercheurEmailConverter ;
        @Autowired
        private IdentifiantAuteurExpertConverter identifiantAuteurExpertConverter ;
        @Autowired
        private EnjeuxIrdChercheurConverter enjeuxIrdChercheurConverter ;
        @Autowired
        private EntiteAdministrativeConverter entiteAdministrativeConverter ;
        @Autowired
        private SexeConverter sexeConverter ;
        @Autowired
        private DisciplineScientifiqueChercheurConverter disciplineScientifiqueChercheurConverter ;
        @Autowired
        private VilleConverter villeConverter ;
        @Autowired
        private TypeInstrumentIrdChercheurConverter typeInstrumentIrdChercheurConverter ;
        @Autowired
        private AffectationStructurelleConverter affectationStructurelleConverter ;
        @Autowired
        private InstrumentIrdChercheurConverter instrumentIrdChercheurConverter ;
    private Boolean affectationStructurelle;
    private Boolean entiteAdministrative;
    private Boolean typeEntiteAdministrative;
    private Boolean pays;
    private Boolean ville;
    private Boolean departementScientifique;
    private Boolean commissionScientifique;
    private Boolean grade;
    private Boolean corps;
    private Boolean sexe;
        private Boolean chercheurEmails;
        private Boolean disciplineScientifiqueChercheurs;
        private Boolean zoneActiviteInteractionRecherches;
        private Boolean enjeuxIrdChercheurs;
        private Boolean communauteSavoirChercheurs;
        private Boolean instrumentIrdChercheurs;
        private Boolean typeInstrumentIrdChercheurs;
        private Boolean identifiantAuteurExperts;

public  ChercheurConverter(){
init(true);
}

@Override
public Chercheur toItem(ChercheurVo vo) {
if (vo == null) {
return null;
} else {
Chercheur item = new Chercheur();
        if(StringUtil.isNotEmpty(vo.getId()))
        item.setId(NumberUtil.toLong(vo.getId()));
            if(vo.getConsentementRgpd() != null)
            item.setConsentementRgpd(vo.getConsentementRgpd());
        if(StringUtil.isNotEmpty(vo.getNumeroMatricule()))
        item.setNumeroMatricule(vo.getNumeroMatricule());
        if(StringUtil.isNotEmpty(vo.getEmailPrincipale()))
        item.setEmailPrincipale(vo.getEmailPrincipale());
        if(StringUtil.isNotEmpty(vo.getResume()))
        item.setResume(vo.getResume());
        if(StringUtil.isNotEmpty(vo.getNatureImplication()))
        item.setNatureImplication(vo.getNatureImplication());
            if(vo.getFormationEnManagement() != null)
            item.setFormationEnManagement(vo.getFormationEnManagement());
            item.setCredentialsNonExpired(vo.getCredentialsNonExpired());
            item.setEnabled(vo.getEnabled());
            item.setAccountNonExpired(vo.getAccountNonExpired());
            item.setAccountNonLocked(vo.getAccountNonLocked());
            item.setPasswordChanged(vo.getPasswordChanged());
        if(StringUtil.isNotEmpty(vo.getCreatedAt()))
        item.setCreatedAt(DateUtil.parse(vo.getCreatedAt()));
        if(StringUtil.isNotEmpty(vo.getUpdatedAt()))
        item.setUpdatedAt(DateUtil.parse(vo.getUpdatedAt()));
        if(StringUtil.isNotEmpty(vo.getUsername()))
        item.setUsername(vo.getUsername());
        if(StringUtil.isNotEmpty(vo.getPassword()))
        item.setPassword(vo.getPassword());
        if(StringUtil.isNotEmpty(vo.getPrenom()))
        item.setPrenom(vo.getPrenom());
        if(StringUtil.isNotEmpty(vo.getNom()))
        item.setNom(vo.getNom());
        if(StringUtil.isNotEmpty(vo.getBaseHorizon()))
        item.setBaseHorizon(vo.getBaseHorizon());
        if(StringUtil.isNotEmpty(vo.getRole()))
        item.setRole(vo.getRole());
    if(vo.getAffectationStructurelleVo()!=null && this.affectationStructurelle)
        item.setAffectationStructurelle(affectationStructurelleConverter.toItem(vo.getAffectationStructurelleVo())) ;
    if(vo.getEntiteAdministrativeVo()!=null && this.entiteAdministrative)
        item.setEntiteAdministrative(entiteAdministrativeConverter.toItem(vo.getEntiteAdministrativeVo())) ;
    if(vo.getTypeEntiteAdministrativeVo()!=null && this.typeEntiteAdministrative)
        item.setTypeEntiteAdministrative(typeEntiteAdministrativeConverter.toItem(vo.getTypeEntiteAdministrativeVo())) ;
    if(vo.getPaysVo()!=null && this.pays)
        item.setPays(paysConverter.toItem(vo.getPaysVo())) ;
    if(vo.getVilleVo()!=null && this.ville)
        item.setVille(villeConverter.toItem(vo.getVilleVo())) ;
    if(vo.getDepartementScientifiqueVo()!=null && this.departementScientifique)
        item.setDepartementScientifique(departementScientifiqueConverter.toItem(vo.getDepartementScientifiqueVo())) ;
    if(vo.getCommissionScientifiqueVo()!=null && this.commissionScientifique)
        item.setCommissionScientifique(commissionScientifiqueConverter.toItem(vo.getCommissionScientifiqueVo())) ;
    if(vo.getGradeVo()!=null && this.grade)
        item.setGrade(gradeConverter.toItem(vo.getGradeVo())) ;
    if(vo.getCorpsVo()!=null && this.corps)
        item.setCorps(corpsConverter.toItem(vo.getCorpsVo())) ;
    if(vo.getSexeVo()!=null && this.sexe)
        item.setSexe(sexeConverter.toItem(vo.getSexeVo())) ;

    if(ListUtil.isNotEmpty(vo.getChercheurEmailsVo()) && this.chercheurEmails)
        item.setChercheurEmails(chercheurEmailConverter.toItem(vo.getChercheurEmailsVo()));
    if(ListUtil.isNotEmpty(vo.getDisciplineScientifiqueChercheursVo()) && this.disciplineScientifiqueChercheurs)
        item.setDisciplineScientifiqueChercheurs(disciplineScientifiqueChercheurConverter.toItem(vo.getDisciplineScientifiqueChercheursVo()));
    if(ListUtil.isNotEmpty(vo.getZoneActiviteInteractionRecherchesVo()) && this.zoneActiviteInteractionRecherches)
        item.setZoneActiviteInteractionRecherches(zoneActiviteInteractionRechercheConverter.toItem(vo.getZoneActiviteInteractionRecherchesVo()));
    if(ListUtil.isNotEmpty(vo.getEnjeuxIrdChercheursVo()) && this.enjeuxIrdChercheurs)
        item.setEnjeuxIrdChercheurs(enjeuxIrdChercheurConverter.toItem(vo.getEnjeuxIrdChercheursVo()));
    if(ListUtil.isNotEmpty(vo.getCommunauteSavoirChercheursVo()) && this.communauteSavoirChercheurs)
        item.setCommunauteSavoirChercheurs(communauteSavoirChercheurConverter.toItem(vo.getCommunauteSavoirChercheursVo()));
    if(ListUtil.isNotEmpty(vo.getInstrumentIrdChercheursVo()) && this.instrumentIrdChercheurs)
        item.setInstrumentIrdChercheurs(instrumentIrdChercheurConverter.toItem(vo.getInstrumentIrdChercheursVo()));
    if(ListUtil.isNotEmpty(vo.getTypeInstrumentIrdChercheursVo()) && this.typeInstrumentIrdChercheurs)
        item.setTypeInstrumentIrdChercheurs(typeInstrumentIrdChercheurConverter.toItem(vo.getTypeInstrumentIrdChercheursVo()));
    if(ListUtil.isNotEmpty(vo.getIdentifiantAuteurExpertsVo()) && this.identifiantAuteurExperts)
        item.setIdentifiantAuteurExperts(identifiantAuteurExpertConverter.toItem(vo.getIdentifiantAuteurExpertsVo()));

return item;
}
}

@Override
public ChercheurVo toVo(Chercheur item) {
if (item == null) {
return null;
} else {
ChercheurVo vo = new ChercheurVo();
        if(item.getId()!=null)
        vo.setId(NumberUtil.toString(item.getId()));

        if(item.getConsentementRgpd()!=null)
        vo.setConsentementRgpd(item.getConsentementRgpd());
        if(StringUtil.isNotEmpty(item.getNumeroMatricule()))
        vo.setNumeroMatricule(item.getNumeroMatricule());

        if(StringUtil.isNotEmpty(item.getEmailPrincipale()))
        vo.setEmailPrincipale(item.getEmailPrincipale());

        if(StringUtil.isNotEmpty(item.getResume()))
        vo.setResume(item.getResume());

        if(StringUtil.isNotEmpty(item.getNatureImplication()))
        vo.setNatureImplication(item.getNatureImplication());

        if(item.getFormationEnManagement()!=null)
        vo.setFormationEnManagement(item.getFormationEnManagement());
        vo.setCredentialsNonExpired(item.getCredentialsNonExpired());
        vo.setEnabled(item.getEnabled());
        vo.setAccountNonExpired(item.getAccountNonExpired());
        vo.setAccountNonLocked(item.getAccountNonLocked());
        vo.setPasswordChanged(item.getPasswordChanged());
        if(item.getCreatedAt()!=null)
        vo.setCreatedAt(DateUtil.formateDate(item.getCreatedAt()));
        if(item.getUpdatedAt()!=null)
        vo.setUpdatedAt(DateUtil.formateDate(item.getUpdatedAt()));
        if(StringUtil.isNotEmpty(item.getUsername()))
        vo.setUsername(item.getUsername());

        if(StringUtil.isNotEmpty(item.getPassword()))
        vo.setPassword(item.getPassword());

        if(StringUtil.isNotEmpty(item.getPrenom()))
        vo.setPrenom(item.getPrenom());

        if(StringUtil.isNotEmpty(item.getNom()))
        vo.setNom(item.getNom());

        if(StringUtil.isNotEmpty(item.getBaseHorizon()))
        vo.setBaseHorizon(item.getBaseHorizon());

        if(StringUtil.isNotEmpty(item.getRole()))
        vo.setRole(item.getRole());

    if(item.getAffectationStructurelle()!=null && this.affectationStructurelle) {
        vo.setAffectationStructurelleVo(affectationStructurelleConverter.toVo(item.getAffectationStructurelle())) ;
    }
    if(item.getEntiteAdministrative()!=null && this.entiteAdministrative) {
        vo.setEntiteAdministrativeVo(entiteAdministrativeConverter.toVo(item.getEntiteAdministrative())) ;
    }
    if(item.getTypeEntiteAdministrative()!=null && this.typeEntiteAdministrative) {
        vo.setTypeEntiteAdministrativeVo(typeEntiteAdministrativeConverter.toVo(item.getTypeEntiteAdministrative())) ;
    }
    if(item.getPays()!=null && this.pays) {
        vo.setPaysVo(paysConverter.toVo(item.getPays())) ;
    }
    if(item.getVille()!=null && this.ville) {
        vo.setVilleVo(villeConverter.toVo(item.getVille())) ;
    }
    if(item.getDepartementScientifique()!=null && this.departementScientifique) {
        vo.setDepartementScientifiqueVo(departementScientifiqueConverter.toVo(item.getDepartementScientifique())) ;
    }
    if(item.getCommissionScientifique()!=null && this.commissionScientifique) {
        vo.setCommissionScientifiqueVo(commissionScientifiqueConverter.toVo(item.getCommissionScientifique())) ;
    }
    if(item.getGrade()!=null && this.grade) {
        vo.setGradeVo(gradeConverter.toVo(item.getGrade())) ;
    }
    if(item.getCorps()!=null && this.corps) {
        vo.setCorpsVo(corpsConverter.toVo(item.getCorps())) ;
    }
    if(item.getSexe()!=null && this.sexe) {
        vo.setSexeVo(sexeConverter.toVo(item.getSexe())) ;
    }
        if(ListUtil.isNotEmpty(item.getChercheurEmails()) && this.chercheurEmails){
        chercheurEmailConverter.init(true);
        chercheurEmailConverter.setChercheur(false);
        vo.setChercheurEmailsVo(chercheurEmailConverter.toVo(item.getChercheurEmails()));
        chercheurEmailConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getDisciplineScientifiqueChercheurs()) && this.disciplineScientifiqueChercheurs){
        disciplineScientifiqueChercheurConverter.init(true);
        disciplineScientifiqueChercheurConverter.setChercheur(false);
        vo.setDisciplineScientifiqueChercheursVo(disciplineScientifiqueChercheurConverter.toVo(item.getDisciplineScientifiqueChercheurs()));
        disciplineScientifiqueChercheurConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getZoneActiviteInteractionRecherches()) && this.zoneActiviteInteractionRecherches){
        zoneActiviteInteractionRechercheConverter.init(true);
        zoneActiviteInteractionRechercheConverter.setChercheur(false);
        vo.setZoneActiviteInteractionRecherchesVo(zoneActiviteInteractionRechercheConverter.toVo(item.getZoneActiviteInteractionRecherches()));
        zoneActiviteInteractionRechercheConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getEnjeuxIrdChercheurs()) && this.enjeuxIrdChercheurs){
        enjeuxIrdChercheurConverter.init(true);
        enjeuxIrdChercheurConverter.setChercheur(false);
        vo.setEnjeuxIrdChercheursVo(enjeuxIrdChercheurConverter.toVo(item.getEnjeuxIrdChercheurs()));
        enjeuxIrdChercheurConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getCommunauteSavoirChercheurs()) && this.communauteSavoirChercheurs){
        communauteSavoirChercheurConverter.init(true);
        communauteSavoirChercheurConverter.setChercheur(false);
        vo.setCommunauteSavoirChercheursVo(communauteSavoirChercheurConverter.toVo(item.getCommunauteSavoirChercheurs()));
        communauteSavoirChercheurConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getInstrumentIrdChercheurs()) && this.instrumentIrdChercheurs){
        instrumentIrdChercheurConverter.init(true);
        instrumentIrdChercheurConverter.setChercheur(false);
        vo.setInstrumentIrdChercheursVo(instrumentIrdChercheurConverter.toVo(item.getInstrumentIrdChercheurs()));
        instrumentIrdChercheurConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getTypeInstrumentIrdChercheurs()) && this.typeInstrumentIrdChercheurs){
        typeInstrumentIrdChercheurConverter.init(true);
        typeInstrumentIrdChercheurConverter.setChercheur(false);
        vo.setTypeInstrumentIrdChercheursVo(typeInstrumentIrdChercheurConverter.toVo(item.getTypeInstrumentIrdChercheurs()));
        typeInstrumentIrdChercheurConverter.setChercheur(true);
        }
        if(ListUtil.isNotEmpty(item.getIdentifiantAuteurExperts()) && this.identifiantAuteurExperts){
        identifiantAuteurExpertConverter.init(true);
        identifiantAuteurExpertConverter.setChercheur(false);
        vo.setIdentifiantAuteurExpertsVo(identifiantAuteurExpertConverter.toVo(item.getIdentifiantAuteurExperts()));
        identifiantAuteurExpertConverter.setChercheur(true);
        }

return vo;
}
}

public void init(Boolean value) {
    affectationStructurelle = value;
    entiteAdministrative = value;
    typeEntiteAdministrative = value;
    pays = value;
    ville = value;
    departementScientifique = value;
    commissionScientifique = value;
    grade = value;
    corps = value;
    sexe = value;
        chercheurEmails = value;
        disciplineScientifiqueChercheurs = value;
        zoneActiviteInteractionRecherches = value;
        enjeuxIrdChercheurs = value;
        communauteSavoirChercheurs = value;
        instrumentIrdChercheurs = value;
        typeInstrumentIrdChercheurs = value;
        identifiantAuteurExperts = value;
}


        public CommunauteSavoirChercheurConverter getCommunauteSavoirChercheurConverter(){
        return this.communauteSavoirChercheurConverter;
        }
        public void setCommunauteSavoirChercheurConverter(CommunauteSavoirChercheurConverter communauteSavoirChercheurConverter ){
        this.communauteSavoirChercheurConverter = communauteSavoirChercheurConverter;
        }
        public TypeEntiteAdministrativeConverter getTypeEntiteAdministrativeConverter(){
        return this.typeEntiteAdministrativeConverter;
        }
        public void setTypeEntiteAdministrativeConverter(TypeEntiteAdministrativeConverter typeEntiteAdministrativeConverter ){
        this.typeEntiteAdministrativeConverter = typeEntiteAdministrativeConverter;
        }
        public DepartementScientifiqueConverter getDepartementScientifiqueConverter(){
        return this.departementScientifiqueConverter;
        }
        public void setDepartementScientifiqueConverter(DepartementScientifiqueConverter departementScientifiqueConverter ){
        this.departementScientifiqueConverter = departementScientifiqueConverter;
        }
        public ZoneActiviteInteractionRechercheConverter getZoneActiviteInteractionRechercheConverter(){
        return this.zoneActiviteInteractionRechercheConverter;
        }
        public void setZoneActiviteInteractionRechercheConverter(ZoneActiviteInteractionRechercheConverter zoneActiviteInteractionRechercheConverter ){
        this.zoneActiviteInteractionRechercheConverter = zoneActiviteInteractionRechercheConverter;
        }
        public GradeConverter getGradeConverter(){
        return this.gradeConverter;
        }
        public void setGradeConverter(GradeConverter gradeConverter ){
        this.gradeConverter = gradeConverter;
        }
        public CorpsConverter getCorpsConverter(){
        return this.corpsConverter;
        }
        public void setCorpsConverter(CorpsConverter corpsConverter ){
        this.corpsConverter = corpsConverter;
        }
        public CommissionScientifiqueConverter getCommissionScientifiqueConverter(){
        return this.commissionScientifiqueConverter;
        }
        public void setCommissionScientifiqueConverter(CommissionScientifiqueConverter commissionScientifiqueConverter ){
        this.commissionScientifiqueConverter = commissionScientifiqueConverter;
        }
        public PaysConverter getPaysConverter(){
        return this.paysConverter;
        }
        public void setPaysConverter(PaysConverter paysConverter ){
        this.paysConverter = paysConverter;
        }
        public ChercheurEmailConverter getChercheurEmailConverter(){
        return this.chercheurEmailConverter;
        }
        public void setChercheurEmailConverter(ChercheurEmailConverter chercheurEmailConverter ){
        this.chercheurEmailConverter = chercheurEmailConverter;
        }
        public IdentifiantAuteurExpertConverter getIdentifiantAuteurExpertConverter(){
        return this.identifiantAuteurExpertConverter;
        }
        public void setIdentifiantAuteurExpertConverter(IdentifiantAuteurExpertConverter identifiantAuteurExpertConverter ){
        this.identifiantAuteurExpertConverter = identifiantAuteurExpertConverter;
        }
        public EnjeuxIrdChercheurConverter getEnjeuxIrdChercheurConverter(){
        return this.enjeuxIrdChercheurConverter;
        }
        public void setEnjeuxIrdChercheurConverter(EnjeuxIrdChercheurConverter enjeuxIrdChercheurConverter ){
        this.enjeuxIrdChercheurConverter = enjeuxIrdChercheurConverter;
        }
        public EntiteAdministrativeConverter getEntiteAdministrativeConverter(){
        return this.entiteAdministrativeConverter;
        }
        public void setEntiteAdministrativeConverter(EntiteAdministrativeConverter entiteAdministrativeConverter ){
        this.entiteAdministrativeConverter = entiteAdministrativeConverter;
        }
        public SexeConverter getSexeConverter(){
        return this.sexeConverter;
        }
        public void setSexeConverter(SexeConverter sexeConverter ){
        this.sexeConverter = sexeConverter;
        }
        public DisciplineScientifiqueChercheurConverter getDisciplineScientifiqueChercheurConverter(){
        return this.disciplineScientifiqueChercheurConverter;
        }
        public void setDisciplineScientifiqueChercheurConverter(DisciplineScientifiqueChercheurConverter disciplineScientifiqueChercheurConverter ){
        this.disciplineScientifiqueChercheurConverter = disciplineScientifiqueChercheurConverter;
        }
        public VilleConverter getVilleConverter(){
        return this.villeConverter;
        }
        public void setVilleConverter(VilleConverter villeConverter ){
        this.villeConverter = villeConverter;
        }
        public TypeInstrumentIrdChercheurConverter getTypeInstrumentIrdChercheurConverter(){
        return this.typeInstrumentIrdChercheurConverter;
        }
        public void setTypeInstrumentIrdChercheurConverter(TypeInstrumentIrdChercheurConverter typeInstrumentIrdChercheurConverter ){
        this.typeInstrumentIrdChercheurConverter = typeInstrumentIrdChercheurConverter;
        }
        public AffectationStructurelleConverter getAffectationStructurelleConverter(){
        return this.affectationStructurelleConverter;
        }
        public void setAffectationStructurelleConverter(AffectationStructurelleConverter affectationStructurelleConverter ){
        this.affectationStructurelleConverter = affectationStructurelleConverter;
        }
        public InstrumentIrdChercheurConverter getInstrumentIrdChercheurConverter(){
        return this.instrumentIrdChercheurConverter;
        }
        public void setInstrumentIrdChercheurConverter(InstrumentIrdChercheurConverter instrumentIrdChercheurConverter ){
        this.instrumentIrdChercheurConverter = instrumentIrdChercheurConverter;
        }

    public boolean  isAffectationStructurelle(){
    return this.affectationStructurelle;
    }
    public void  setAffectationStructurelle(boolean affectationStructurelle){
    this.affectationStructurelle = affectationStructurelle;
    }
    public boolean  isEntiteAdministrative(){
    return this.entiteAdministrative;
    }
    public void  setEntiteAdministrative(boolean entiteAdministrative){
    this.entiteAdministrative = entiteAdministrative;
    }
    public boolean  isTypeEntiteAdministrative(){
    return this.typeEntiteAdministrative;
    }
    public void  setTypeEntiteAdministrative(boolean typeEntiteAdministrative){
    this.typeEntiteAdministrative = typeEntiteAdministrative;
    }
    public boolean  isPays(){
    return this.pays;
    }
    public void  setPays(boolean pays){
    this.pays = pays;
    }
    public boolean  isVille(){
    return this.ville;
    }
    public void  setVille(boolean ville){
    this.ville = ville;
    }
    public boolean  isDepartementScientifique(){
    return this.departementScientifique;
    }
    public void  setDepartementScientifique(boolean departementScientifique){
    this.departementScientifique = departementScientifique;
    }
    public boolean  isCommissionScientifique(){
    return this.commissionScientifique;
    }
    public void  setCommissionScientifique(boolean commissionScientifique){
    this.commissionScientifique = commissionScientifique;
    }
    public boolean  isGrade(){
    return this.grade;
    }
    public void  setGrade(boolean grade){
    this.grade = grade;
    }
    public boolean  isCorps(){
    return this.corps;
    }
    public void  setCorps(boolean corps){
    this.corps = corps;
    }
    public boolean  isSexe(){
    return this.sexe;
    }
    public void  setSexe(boolean sexe){
    this.sexe = sexe;
    }









        public Boolean  isChercheurEmails(){
        return this.chercheurEmails ;
        }
        public void  setChercheurEmails(Boolean chercheurEmails ){
        this.chercheurEmails  = chercheurEmails ;
        }























        public Boolean  isDisciplineScientifiqueChercheurs(){
        return this.disciplineScientifiqueChercheurs ;
        }
        public void  setDisciplineScientifiqueChercheurs(Boolean disciplineScientifiqueChercheurs ){
        this.disciplineScientifiqueChercheurs  = disciplineScientifiqueChercheurs ;
        }



        public Boolean  isZoneActiviteInteractionRecherches(){
        return this.zoneActiviteInteractionRecherches ;
        }
        public void  setZoneActiviteInteractionRecherches(Boolean zoneActiviteInteractionRecherches ){
        this.zoneActiviteInteractionRecherches  = zoneActiviteInteractionRecherches ;
        }



        public Boolean  isEnjeuxIrdChercheurs(){
        return this.enjeuxIrdChercheurs ;
        }
        public void  setEnjeuxIrdChercheurs(Boolean enjeuxIrdChercheurs ){
        this.enjeuxIrdChercheurs  = enjeuxIrdChercheurs ;
        }



        public Boolean  isCommunauteSavoirChercheurs(){
        return this.communauteSavoirChercheurs ;
        }
        public void  setCommunauteSavoirChercheurs(Boolean communauteSavoirChercheurs ){
        this.communauteSavoirChercheurs  = communauteSavoirChercheurs ;
        }



        public Boolean  isInstrumentIrdChercheurs(){
        return this.instrumentIrdChercheurs ;
        }
        public void  setInstrumentIrdChercheurs(Boolean instrumentIrdChercheurs ){
        this.instrumentIrdChercheurs  = instrumentIrdChercheurs ;
        }



        public Boolean  isTypeInstrumentIrdChercheurs(){
        return this.typeInstrumentIrdChercheurs ;
        }
        public void  setTypeInstrumentIrdChercheurs(Boolean typeInstrumentIrdChercheurs ){
        this.typeInstrumentIrdChercheurs  = typeInstrumentIrdChercheurs ;
        }



        public Boolean  isIdentifiantAuteurExperts(){
        return this.identifiantAuteurExperts ;
        }
        public void  setIdentifiantAuteurExperts(Boolean identifiantAuteurExperts ){
        this.identifiantAuteurExperts  = identifiantAuteurExperts ;
        }


































}
