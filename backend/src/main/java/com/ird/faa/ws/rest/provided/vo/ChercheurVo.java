package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class ChercheurVo {

    private String id ;
    private Boolean consentementRgpd ;
    private String numeroMatricule ;
    private String emailPrincipale ;
    private String resume ;
    private String natureImplication ;
    private Boolean formationEnManagement ;
    private Boolean credentialsNonExpired ;
    private Boolean enabled ;
    private Boolean accountNonExpired ;
    private Boolean accountNonLocked ;
    private Boolean passwordChanged ;
    private String createdAt ;
    private String updatedAt ;
    private String username ;
    private String password ;
    private String prenom ;
    private String nom ;
    private String baseHorizon ;
    private String role ;


            private String createdAtMax ;
            private String createdAtMin ;
            private String updatedAtMax ;
            private String updatedAtMin ;

        private AffectationStructurelleVo affectationStructurelleVo ;
        private EntiteAdministrativeVo entiteAdministrativeVo ;
        private TypeEntiteAdministrativeVo typeEntiteAdministrativeVo ;
        private PaysVo paysVo ;
        private VilleVo villeVo ;
        private DepartementScientifiqueVo departementScientifiqueVo ;
        private CommissionScientifiqueVo commissionScientifiqueVo ;
        private GradeVo gradeVo ;
        private CorpsVo corpsVo ;
        private SexeVo sexeVo ;

    private List<ChercheurEmailVo> chercheurEmailsVo ;
    private List<DisciplineScientifiqueChercheurVo> disciplineScientifiqueChercheursVo ;
    private List<ZoneActiviteInteractionRechercheVo> zoneActiviteInteractionRecherchesVo ;
    private List<EnjeuxIrdChercheurVo> enjeuxIrdChercheursVo ;
    private List<CommunauteSavoirChercheurVo> communauteSavoirChercheursVo ;
    private List<InstrumentIrdChercheurVo> instrumentIrdChercheursVo ;
    private List<TypeInstrumentIrdChercheurVo> typeInstrumentIrdChercheursVo ;
    private List<IdentifiantAuteurExpertVo> identifiantAuteurExpertsVo ;

    public ChercheurVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public Boolean getConsentementRgpd(){
        return this.consentementRgpd;
        }

        public void setConsentementRgpd(Boolean consentementRgpd){
        this.consentementRgpd = consentementRgpd;
        }
        public String getNumeroMatricule(){
        return this.numeroMatricule;
        }

        public void setNumeroMatricule(String numeroMatricule){
        this.numeroMatricule = numeroMatricule;
        }
        public String getEmailPrincipale(){
        return this.emailPrincipale;
        }

        public void setEmailPrincipale(String emailPrincipale){
        this.emailPrincipale = emailPrincipale;
        }
        public String getResume(){
        return this.resume;
        }

        public void setResume(String resume){
        this.resume = resume;
        }
        public String getNatureImplication(){
        return this.natureImplication;
        }

        public void setNatureImplication(String natureImplication){
        this.natureImplication = natureImplication;
        }
        public Boolean getFormationEnManagement(){
        return this.formationEnManagement;
        }

        public void setFormationEnManagement(Boolean formationEnManagement){
        this.formationEnManagement = formationEnManagement;
        }
        public Boolean getCredentialsNonExpired(){
        return this.credentialsNonExpired;
        }

        public void setCredentialsNonExpired(Boolean credentialsNonExpired){
        this.credentialsNonExpired = credentialsNonExpired;
        }
        public Boolean getEnabled(){
        return this.enabled;
        }

        public void setEnabled(Boolean enabled){
        this.enabled = enabled;
        }
        public Boolean getAccountNonExpired(){
        return this.accountNonExpired;
        }

        public void setAccountNonExpired(Boolean accountNonExpired){
        this.accountNonExpired = accountNonExpired;
        }
        public Boolean getAccountNonLocked(){
        return this.accountNonLocked;
        }

        public void setAccountNonLocked(Boolean accountNonLocked){
        this.accountNonLocked = accountNonLocked;
        }
        public Boolean getPasswordChanged(){
        return this.passwordChanged;
        }

        public void setPasswordChanged(Boolean passwordChanged){
        this.passwordChanged = passwordChanged;
        }
        public String getCreatedAt(){
        return this.createdAt;
        }

        public void setCreatedAt(String createdAt){
        this.createdAt = createdAt;
        }
        public String getUpdatedAt(){
        return this.updatedAt;
        }

        public void setUpdatedAt(String updatedAt){
        this.updatedAt = updatedAt;
        }
        public String getUsername(){
        return this.username;
        }

        public void setUsername(String username){
        this.username = username;
        }
        public String getPassword(){
        return this.password;
        }

        public void setPassword(String password){
        this.password = password;
        }
        public String getPrenom(){
        return this.prenom;
        }

        public void setPrenom(String prenom){
        this.prenom = prenom;
        }
        public String getNom(){
        return this.nom;
        }

        public void setNom(String nom){
        this.nom = nom;
        }
        public String getBaseHorizon(){
        return this.baseHorizon;
        }

        public void setBaseHorizon(String baseHorizon){
        this.baseHorizon = baseHorizon;
        }
        public String getRole(){
        return this.role;
        }

        public void setRole(String role){
        this.role = role;
        }


            public String getCreatedAtMax(){
            return this.createdAtMax;
            }

            public String getCreatedAtMin(){
            return this.createdAtMin;
            }

            public void setCreatedAtMax(String createdAtMax){
            this.createdAtMax = createdAtMax;
            }

            public void setCreatedAtMin(String createdAtMin){
            this.createdAtMin = createdAtMin;
            }

            public String getUpdatedAtMax(){
            return this.updatedAtMax;
            }

            public String getUpdatedAtMin(){
            return this.updatedAtMin;
            }

            public void setUpdatedAtMax(String updatedAtMax){
            this.updatedAtMax = updatedAtMax;
            }

            public void setUpdatedAtMin(String updatedAtMin){
            this.updatedAtMin = updatedAtMin;
            }


        public AffectationStructurelleVo getAffectationStructurelleVo(){
        return this.affectationStructurelleVo;
        }

        public void setAffectationStructurelleVo(AffectationStructurelleVo affectationStructurelleVo){
        this.affectationStructurelleVo = affectationStructurelleVo;
        }
        public EntiteAdministrativeVo getEntiteAdministrativeVo(){
        return this.entiteAdministrativeVo;
        }

        public void setEntiteAdministrativeVo(EntiteAdministrativeVo entiteAdministrativeVo){
        this.entiteAdministrativeVo = entiteAdministrativeVo;
        }
        public TypeEntiteAdministrativeVo getTypeEntiteAdministrativeVo(){
        return this.typeEntiteAdministrativeVo;
        }

        public void setTypeEntiteAdministrativeVo(TypeEntiteAdministrativeVo typeEntiteAdministrativeVo){
        this.typeEntiteAdministrativeVo = typeEntiteAdministrativeVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public VilleVo getVilleVo(){
        return this.villeVo;
        }

        public void setVilleVo(VilleVo villeVo){
        this.villeVo = villeVo;
        }
        public DepartementScientifiqueVo getDepartementScientifiqueVo(){
        return this.departementScientifiqueVo;
        }

        public void setDepartementScientifiqueVo(DepartementScientifiqueVo departementScientifiqueVo){
        this.departementScientifiqueVo = departementScientifiqueVo;
        }
        public CommissionScientifiqueVo getCommissionScientifiqueVo(){
        return this.commissionScientifiqueVo;
        }

        public void setCommissionScientifiqueVo(CommissionScientifiqueVo commissionScientifiqueVo){
        this.commissionScientifiqueVo = commissionScientifiqueVo;
        }
        public GradeVo getGradeVo(){
        return this.gradeVo;
        }

        public void setGradeVo(GradeVo gradeVo){
        this.gradeVo = gradeVo;
        }
        public CorpsVo getCorpsVo(){
        return this.corpsVo;
        }

        public void setCorpsVo(CorpsVo corpsVo){
        this.corpsVo = corpsVo;
        }
        public SexeVo getSexeVo(){
        return this.sexeVo;
        }

        public void setSexeVo(SexeVo sexeVo){
        this.sexeVo = sexeVo;
        }


        public List<ChercheurEmailVo> getChercheurEmailsVo(){
        return this.chercheurEmailsVo;
        }

        public void setChercheurEmailsVo(List<ChercheurEmailVo> chercheurEmailsVo){
            this.chercheurEmailsVo = chercheurEmailsVo;
            }

        public List<DisciplineScientifiqueChercheurVo> getDisciplineScientifiqueChercheursVo(){
        return this.disciplineScientifiqueChercheursVo;
        }

        public void setDisciplineScientifiqueChercheursVo(List<DisciplineScientifiqueChercheurVo> disciplineScientifiqueChercheursVo){
            this.disciplineScientifiqueChercheursVo = disciplineScientifiqueChercheursVo;
            }

        public List<ZoneActiviteInteractionRechercheVo> getZoneActiviteInteractionRecherchesVo(){
        return this.zoneActiviteInteractionRecherchesVo;
        }

        public void setZoneActiviteInteractionRecherchesVo(List<ZoneActiviteInteractionRechercheVo> zoneActiviteInteractionRecherchesVo){
            this.zoneActiviteInteractionRecherchesVo = zoneActiviteInteractionRecherchesVo;
            }

        public List<EnjeuxIrdChercheurVo> getEnjeuxIrdChercheursVo(){
        return this.enjeuxIrdChercheursVo;
        }

        public void setEnjeuxIrdChercheursVo(List<EnjeuxIrdChercheurVo> enjeuxIrdChercheursVo){
            this.enjeuxIrdChercheursVo = enjeuxIrdChercheursVo;
            }

        public List<CommunauteSavoirChercheurVo> getCommunauteSavoirChercheursVo(){
        return this.communauteSavoirChercheursVo;
        }

        public void setCommunauteSavoirChercheursVo(List<CommunauteSavoirChercheurVo> communauteSavoirChercheursVo){
            this.communauteSavoirChercheursVo = communauteSavoirChercheursVo;
            }

        public List<InstrumentIrdChercheurVo> getInstrumentIrdChercheursVo(){
        return this.instrumentIrdChercheursVo;
        }

        public void setInstrumentIrdChercheursVo(List<InstrumentIrdChercheurVo> instrumentIrdChercheursVo){
            this.instrumentIrdChercheursVo = instrumentIrdChercheursVo;
            }

        public List<TypeInstrumentIrdChercheurVo> getTypeInstrumentIrdChercheursVo(){
        return this.typeInstrumentIrdChercheursVo;
        }

        public void setTypeInstrumentIrdChercheursVo(List<TypeInstrumentIrdChercheurVo> typeInstrumentIrdChercheursVo){
            this.typeInstrumentIrdChercheursVo = typeInstrumentIrdChercheursVo;
            }

        public List<IdentifiantAuteurExpertVo> getIdentifiantAuteurExpertsVo(){
        return this.identifiantAuteurExpertsVo;
        }

        public void setIdentifiantAuteurExpertsVo(List<IdentifiantAuteurExpertVo> identifiantAuteurExpertsVo){
            this.identifiantAuteurExpertsVo = identifiantAuteurExpertsVo;
            }

            }
