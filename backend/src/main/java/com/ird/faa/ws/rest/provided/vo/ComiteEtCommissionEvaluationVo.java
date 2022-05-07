package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class ComiteEtCommissionEvaluationVo {

    private String id ;
    private String nom ;
    private String nomRevueOuEditeur ;
    private String role ;
    private String nombreJourDedie ;
    private Boolean relieeInstrumentsIrd ;
    private String commentaire ;


            private String nombreJourDedieMax ;
            private String nombreJourDedieMin ;

        private NatureExpertiseVo natureExpertiseVo ;
        private ExpertiseVo expertiseVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<TypeExpertiseEvaluationComiteEtCommissionEvaluationVo> typeExpertiseEvaluationComiteEtCommissionEvaluationsVo ;
    private List<EtablissementComiteEtCommissionEvaluationVo> etablissementComiteEtCommissionEvaluationsVo ;
    private List<RoleComiteEtCommissionEvaluationVo> roleComiteEtCommissionEvaluationsVo ;
    private List<DisciplineScientifiqueComiteEtCommissionEvaluationVo> disciplineScientifiqueComiteEtCommissionEvaluationsVo ;
    private List<EnjeuxIrdComiteEtCommissionEvaluationVo> enjeuxIrdComiteEtCommissionEvaluationsVo ;
    private List<InstrumentIrdComiteEtCommissionEvaluationVo> instrumentIrdComiteEtCommissionEvaluationsVo ;

    public ComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNom(){
        return this.nom;
        }

        public void setNom(String nom){
        this.nom = nom;
        }
        public String getNomRevueOuEditeur(){
        return this.nomRevueOuEditeur;
        }

        public void setNomRevueOuEditeur(String nomRevueOuEditeur){
        this.nomRevueOuEditeur = nomRevueOuEditeur;
        }
        public String getRole(){
        return this.role;
        }

        public void setRole(String role){
        this.role = role;
        }
        public String getNombreJourDedie(){
        return this.nombreJourDedie;
        }

        public void setNombreJourDedie(String nombreJourDedie){
        this.nombreJourDedie = nombreJourDedie;
        }
        public Boolean getRelieeInstrumentsIrd(){
        return this.relieeInstrumentsIrd;
        }

        public void setRelieeInstrumentsIrd(Boolean relieeInstrumentsIrd){
        this.relieeInstrumentsIrd = relieeInstrumentsIrd;
        }
        public String getCommentaire(){
        return this.commentaire;
        }

        public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
        }


            public String getNombreJourDedieMax(){
            return this.nombreJourDedieMax;
            }

            public String getNombreJourDedieMin(){
            return this.nombreJourDedieMin;
            }

            public void setNombreJourDedieMax(String nombreJourDedieMax){
            this.nombreJourDedieMax = nombreJourDedieMax;
            }

            public void setNombreJourDedieMin(String nombreJourDedieMin){
            this.nombreJourDedieMin = nombreJourDedieMin;
            }


        public NatureExpertiseVo getNatureExpertiseVo(){
        return this.natureExpertiseVo;
        }

        public void setNatureExpertiseVo(NatureExpertiseVo natureExpertiseVo){
        this.natureExpertiseVo = natureExpertiseVo;
        }
        public ExpertiseVo getExpertiseVo(){
        return this.expertiseVo;
        }

        public void setExpertiseVo(ExpertiseVo expertiseVo){
        this.expertiseVo = expertiseVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<TypeExpertiseEvaluationComiteEtCommissionEvaluationVo> getTypeExpertiseEvaluationComiteEtCommissionEvaluationsVo(){
        return this.typeExpertiseEvaluationComiteEtCommissionEvaluationsVo;
        }

        public void setTypeExpertiseEvaluationComiteEtCommissionEvaluationsVo(List<TypeExpertiseEvaluationComiteEtCommissionEvaluationVo> typeExpertiseEvaluationComiteEtCommissionEvaluationsVo){
            this.typeExpertiseEvaluationComiteEtCommissionEvaluationsVo = typeExpertiseEvaluationComiteEtCommissionEvaluationsVo;
            }

        public List<EtablissementComiteEtCommissionEvaluationVo> getEtablissementComiteEtCommissionEvaluationsVo(){
        return this.etablissementComiteEtCommissionEvaluationsVo;
        }

        public void setEtablissementComiteEtCommissionEvaluationsVo(List<EtablissementComiteEtCommissionEvaluationVo> etablissementComiteEtCommissionEvaluationsVo){
            this.etablissementComiteEtCommissionEvaluationsVo = etablissementComiteEtCommissionEvaluationsVo;
            }

        public List<RoleComiteEtCommissionEvaluationVo> getRoleComiteEtCommissionEvaluationsVo(){
        return this.roleComiteEtCommissionEvaluationsVo;
        }

        public void setRoleComiteEtCommissionEvaluationsVo(List<RoleComiteEtCommissionEvaluationVo> roleComiteEtCommissionEvaluationsVo){
            this.roleComiteEtCommissionEvaluationsVo = roleComiteEtCommissionEvaluationsVo;
            }

        public List<DisciplineScientifiqueComiteEtCommissionEvaluationVo> getDisciplineScientifiqueComiteEtCommissionEvaluationsVo(){
        return this.disciplineScientifiqueComiteEtCommissionEvaluationsVo;
        }

        public void setDisciplineScientifiqueComiteEtCommissionEvaluationsVo(List<DisciplineScientifiqueComiteEtCommissionEvaluationVo> disciplineScientifiqueComiteEtCommissionEvaluationsVo){
            this.disciplineScientifiqueComiteEtCommissionEvaluationsVo = disciplineScientifiqueComiteEtCommissionEvaluationsVo;
            }

        public List<EnjeuxIrdComiteEtCommissionEvaluationVo> getEnjeuxIrdComiteEtCommissionEvaluationsVo(){
        return this.enjeuxIrdComiteEtCommissionEvaluationsVo;
        }

        public void setEnjeuxIrdComiteEtCommissionEvaluationsVo(List<EnjeuxIrdComiteEtCommissionEvaluationVo> enjeuxIrdComiteEtCommissionEvaluationsVo){
            this.enjeuxIrdComiteEtCommissionEvaluationsVo = enjeuxIrdComiteEtCommissionEvaluationsVo;
            }

        public List<InstrumentIrdComiteEtCommissionEvaluationVo> getInstrumentIrdComiteEtCommissionEvaluationsVo(){
        return this.instrumentIrdComiteEtCommissionEvaluationsVo;
        }

        public void setInstrumentIrdComiteEtCommissionEvaluationsVo(List<InstrumentIrdComiteEtCommissionEvaluationVo> instrumentIrdComiteEtCommissionEvaluationsVo){
            this.instrumentIrdComiteEtCommissionEvaluationsVo = instrumentIrdComiteEtCommissionEvaluationsVo;
            }

            }
