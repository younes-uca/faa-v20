package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.math.BigDecimal;

public class VieInstitutionnelleVo {

    private String id ;
    private String tempsEstime ;
    private String annee ;


            private String tempsEstimeMax ;
            private String tempsEstimeMin ;
            private String anneeMax ;
            private String anneeMin ;

        private CampagneVo campagneVo ;
        private ChercheurVo chercheurVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<VieInstitutionnelleDetailVo> vieInstitutionnelleDetailsVo ;

    public VieInstitutionnelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getTempsEstime(){
        return this.tempsEstime;
        }

        public void setTempsEstime(String tempsEstime){
        this.tempsEstime = tempsEstime;
        }
        public String getAnnee(){
        return this.annee;
        }

        public void setAnnee(String annee){
        this.annee = annee;
        }


            public String getTempsEstimeMax(){
            return this.tempsEstimeMax;
            }

            public String getTempsEstimeMin(){
            return this.tempsEstimeMin;
            }

            public void setTempsEstimeMax(String tempsEstimeMax){
            this.tempsEstimeMax = tempsEstimeMax;
            }

            public void setTempsEstimeMin(String tempsEstimeMin){
            this.tempsEstimeMin = tempsEstimeMin;
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


        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<VieInstitutionnelleDetailVo> getVieInstitutionnelleDetailsVo(){
        return this.vieInstitutionnelleDetailsVo;
        }

        public void setVieInstitutionnelleDetailsVo(List<VieInstitutionnelleDetailVo> vieInstitutionnelleDetailsVo){
            this.vieInstitutionnelleDetailsVo = vieInstitutionnelleDetailsVo;
            }

            }
