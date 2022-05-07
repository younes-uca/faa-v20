package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class ConseilEtComiteScientifiqueVo {

    private String id ;
    private String tempsEstimePourCetteAnnne ;
    private String intitule ;
    private String nombreJoursParAnnee ;


            private String tempsEstimePourCetteAnnneMax ;
            private String tempsEstimePourCetteAnnneMin ;
            private String nombreJoursParAnneeMax ;
            private String nombreJoursParAnneeMin ;

        private PaysVo paysVo ;
        private EtablissementVo etablissementVo ;
        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<CommunauteSavoirConseilEtComiteScientifiqueVo> communauteSavoirConseilEtComiteScientifiquesVo ;
    private List<DisciplineScientifiqueConseilEtComiteScientifiqueVo> disciplineScientifiqueConseilEtComiteScientifiquesVo ;

    public ConseilEtComiteScientifiqueVo(){
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
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }
        public String getNombreJoursParAnnee(){
        return this.nombreJoursParAnnee;
        }

        public void setNombreJoursParAnnee(String nombreJoursParAnnee){
        this.nombreJoursParAnnee = nombreJoursParAnnee;
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

            public String getNombreJoursParAnneeMax(){
            return this.nombreJoursParAnneeMax;
            }

            public String getNombreJoursParAnneeMin(){
            return this.nombreJoursParAnneeMin;
            }

            public void setNombreJoursParAnneeMax(String nombreJoursParAnneeMax){
            this.nombreJoursParAnneeMax = nombreJoursParAnneeMax;
            }

            public void setNombreJoursParAnneeMin(String nombreJoursParAnneeMin){
            this.nombreJoursParAnneeMin = nombreJoursParAnneeMin;
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
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<CommunauteSavoirConseilEtComiteScientifiqueVo> getCommunauteSavoirConseilEtComiteScientifiquesVo(){
        return this.communauteSavoirConseilEtComiteScientifiquesVo;
        }

        public void setCommunauteSavoirConseilEtComiteScientifiquesVo(List<CommunauteSavoirConseilEtComiteScientifiqueVo> communauteSavoirConseilEtComiteScientifiquesVo){
            this.communauteSavoirConseilEtComiteScientifiquesVo = communauteSavoirConseilEtComiteScientifiquesVo;
            }

        public List<DisciplineScientifiqueConseilEtComiteScientifiqueVo> getDisciplineScientifiqueConseilEtComiteScientifiquesVo(){
        return this.disciplineScientifiqueConseilEtComiteScientifiquesVo;
        }

        public void setDisciplineScientifiqueConseilEtComiteScientifiquesVo(List<DisciplineScientifiqueConseilEtComiteScientifiqueVo> disciplineScientifiqueConseilEtComiteScientifiquesVo){
            this.disciplineScientifiqueConseilEtComiteScientifiquesVo = disciplineScientifiqueConseilEtComiteScientifiquesVo;
            }

            }
