package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class ExpertiseVo {

    private String id ;
    private String tempsEstimePourCetteAnnne ;
    private String annee ;


            private String tempsEstimePourCetteAnnneMax ;
            private String tempsEstimePourCetteAnnneMin ;
            private String anneeMax ;
            private String anneeMin ;

        private EtatEtapeCampagneVo etatEtapeCampagneVo ;
        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;

    private List<ConseilsScientifiqueVo> conseilsScientifiquesVo ;
    private List<ConsultanceScientifiquePonctuelleVo> consultanceScientifiquePonctuellesVo ;
    private List<ComiteEtCommissionEvaluationVo> comiteEtCommissionEvaluationsVo ;

    public ExpertiseVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getTempsEstimePourCetteAnnne(){
        return this.tempsEstimePourCetteAnnne;
        }

        public void setTempsEstimePourCetteAnnne(String tempsEstimePourCetteAnnne){
        this.tempsEstimePourCetteAnnne = tempsEstimePourCetteAnnne;
        }
        public String getAnnee(){
        return this.annee;
        }

        public void setAnnee(String annee){
        this.annee = annee;
        }


            public String getTempsEstimePourCetteAnnneMax(){
            return this.tempsEstimePourCetteAnnneMax;
            }

            public String getTempsEstimePourCetteAnnneMin(){
            return this.tempsEstimePourCetteAnnneMin;
            }

            public void setTempsEstimePourCetteAnnneMax(String tempsEstimePourCetteAnnneMax){
            this.tempsEstimePourCetteAnnneMax = tempsEstimePourCetteAnnneMax;
            }

            public void setTempsEstimePourCetteAnnneMin(String tempsEstimePourCetteAnnneMin){
            this.tempsEstimePourCetteAnnneMin = tempsEstimePourCetteAnnneMin;
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


        public List<ConseilsScientifiqueVo> getConseilsScientifiquesVo(){
        return this.conseilsScientifiquesVo;
        }

        public void setConseilsScientifiquesVo(List<ConseilsScientifiqueVo> conseilsScientifiquesVo){
            this.conseilsScientifiquesVo = conseilsScientifiquesVo;
            }

        public List<ConsultanceScientifiquePonctuelleVo> getConsultanceScientifiquePonctuellesVo(){
        return this.consultanceScientifiquePonctuellesVo;
        }

        public void setConsultanceScientifiquePonctuellesVo(List<ConsultanceScientifiquePonctuelleVo> consultanceScientifiquePonctuellesVo){
            this.consultanceScientifiquePonctuellesVo = consultanceScientifiquePonctuellesVo;
            }

        public List<ComiteEtCommissionEvaluationVo> getComiteEtCommissionEvaluationsVo(){
        return this.comiteEtCommissionEvaluationsVo;
        }

        public void setComiteEtCommissionEvaluationsVo(List<ComiteEtCommissionEvaluationVo> comiteEtCommissionEvaluationsVo){
            this.comiteEtCommissionEvaluationsVo = comiteEtCommissionEvaluationsVo;
            }

            }
