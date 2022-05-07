package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class ExpertiseScientifiqueVo {

    private String id ;
    private String annee ;
    private String intitule ;
    private String nombreJourConsacrePourCetteAnnee ;
    private String periodeRemiseRapportMois ;
    private String periodeRemiseRapportAnnee ;
    private String commentairesEventuels ;


            private String anneeMax ;
            private String anneeMin ;
            private String nombreJourConsacrePourCetteAnneeMax ;
            private String nombreJourConsacrePourCetteAnneeMin ;
            private String periodeRemiseRapportMoisMax ;
            private String periodeRemiseRapportMoisMin ;
            private String periodeRemiseRapportAnneeMax ;
            private String periodeRemiseRapportAnneeMin ;

        private TypeExpertiseVo typeExpertiseVo ;
        private PaysVo paysVo ;
        private EtablissementVo etablissementVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;
        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;

    private List<CommunauteSavoirExpertiseScientifiqueVo> communauteSavoirExpertiseScientifiquesVo ;
    private List<DisciplineScientifiqueExpertiseScientifiqueVo> disciplineScientifiqueExpertiseScientifiquesVo ;

    public ExpertiseScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getAnnee(){
        return this.annee;
        }

        public void setAnnee(String annee){
        this.annee = annee;
        }
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }
        public String getNombreJourConsacrePourCetteAnnee(){
        return this.nombreJourConsacrePourCetteAnnee;
        }

        public void setNombreJourConsacrePourCetteAnnee(String nombreJourConsacrePourCetteAnnee){
        this.nombreJourConsacrePourCetteAnnee = nombreJourConsacrePourCetteAnnee;
        }
        public String getPeriodeRemiseRapportMois(){
        return this.periodeRemiseRapportMois;
        }

        public void setPeriodeRemiseRapportMois(String periodeRemiseRapportMois){
        this.periodeRemiseRapportMois = periodeRemiseRapportMois;
        }
        public String getPeriodeRemiseRapportAnnee(){
        return this.periodeRemiseRapportAnnee;
        }

        public void setPeriodeRemiseRapportAnnee(String periodeRemiseRapportAnnee){
        this.periodeRemiseRapportAnnee = periodeRemiseRapportAnnee;
        }
        public String getCommentairesEventuels(){
        return this.commentairesEventuels;
        }

        public void setCommentairesEventuels(String commentairesEventuels){
        this.commentairesEventuels = commentairesEventuels;
        }


            public String getAnneeMax(){
            return this.anneeMax;
            }

            public String getAnneeMin(){
            return this.anneeMin;
            }

            public void setAnneeMax(String anneeMax){
            this.anneeMax = anneeMax;
            }

            public void setAnneeMin(String anneeMin){
            this.anneeMin = anneeMin;
            }

            public String getNombreJourConsacrePourCetteAnneeMax(){
            return this.nombreJourConsacrePourCetteAnneeMax;
            }

            public String getNombreJourConsacrePourCetteAnneeMin(){
            return this.nombreJourConsacrePourCetteAnneeMin;
            }

            public void setNombreJourConsacrePourCetteAnneeMax(String nombreJourConsacrePourCetteAnneeMax){
            this.nombreJourConsacrePourCetteAnneeMax = nombreJourConsacrePourCetteAnneeMax;
            }

            public void setNombreJourConsacrePourCetteAnneeMin(String nombreJourConsacrePourCetteAnneeMin){
            this.nombreJourConsacrePourCetteAnneeMin = nombreJourConsacrePourCetteAnneeMin;
            }

            public String getPeriodeRemiseRapportMoisMax(){
            return this.periodeRemiseRapportMoisMax;
            }

            public String getPeriodeRemiseRapportMoisMin(){
            return this.periodeRemiseRapportMoisMin;
            }

            public void setPeriodeRemiseRapportMoisMax(String periodeRemiseRapportMoisMax){
            this.periodeRemiseRapportMoisMax = periodeRemiseRapportMoisMax;
            }

            public void setPeriodeRemiseRapportMoisMin(String periodeRemiseRapportMoisMin){
            this.periodeRemiseRapportMoisMin = periodeRemiseRapportMoisMin;
            }

            public String getPeriodeRemiseRapportAnneeMax(){
            return this.periodeRemiseRapportAnneeMax;
            }

            public String getPeriodeRemiseRapportAnneeMin(){
            return this.periodeRemiseRapportAnneeMin;
            }

            public void setPeriodeRemiseRapportAnneeMax(String periodeRemiseRapportAnneeMax){
            this.periodeRemiseRapportAnneeMax = periodeRemiseRapportAnneeMax;
            }

            public void setPeriodeRemiseRapportAnneeMin(String periodeRemiseRapportAnneeMin){
            this.periodeRemiseRapportAnneeMin = periodeRemiseRapportAnneeMin;
            }


        public TypeExpertiseVo getTypeExpertiseVo(){
        return this.typeExpertiseVo;
        }

        public void setTypeExpertiseVo(TypeExpertiseVo typeExpertiseVo){
        this.typeExpertiseVo = typeExpertiseVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }
        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }


        public List<CommunauteSavoirExpertiseScientifiqueVo> getCommunauteSavoirExpertiseScientifiquesVo(){
        return this.communauteSavoirExpertiseScientifiquesVo;
        }

        public void setCommunauteSavoirExpertiseScientifiquesVo(List<CommunauteSavoirExpertiseScientifiqueVo> communauteSavoirExpertiseScientifiquesVo){
            this.communauteSavoirExpertiseScientifiquesVo = communauteSavoirExpertiseScientifiquesVo;
            }

        public List<DisciplineScientifiqueExpertiseScientifiqueVo> getDisciplineScientifiqueExpertiseScientifiquesVo(){
        return this.disciplineScientifiqueExpertiseScientifiquesVo;
        }

        public void setDisciplineScientifiqueExpertiseScientifiquesVo(List<DisciplineScientifiqueExpertiseScientifiqueVo> disciplineScientifiqueExpertiseScientifiquesVo){
            this.disciplineScientifiqueExpertiseScientifiquesVo = disciplineScientifiqueExpertiseScientifiquesVo;
            }

            }
