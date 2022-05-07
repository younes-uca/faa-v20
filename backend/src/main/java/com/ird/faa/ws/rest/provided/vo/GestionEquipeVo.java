package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class GestionEquipeVo {

    private String id ;
    private String tempsEstimePourCetteAnnne ;


            private String tempsEstimePourCetteAnnneMax ;
            private String tempsEstimePourCetteAnnneMin ;

        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<GestionEquipeDetailVo> gestionEquipeDetailsVo ;

    public GestionEquipeVo(){
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


        public List<GestionEquipeDetailVo> getGestionEquipeDetailsVo(){
        return this.gestionEquipeDetailsVo;
        }

        public void setGestionEquipeDetailsVo(List<GestionEquipeDetailVo> gestionEquipeDetailsVo){
            this.gestionEquipeDetailsVo = gestionEquipeDetailsVo;
            }

            }
