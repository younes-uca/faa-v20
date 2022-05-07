package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;
    import java.math.BigDecimal;

public class CampagneChercheurOuvertureVo {

    private String id ;
    private String objet ;
    private String message ;
    private Boolean envoye ;
    private String dateEnvoi ;
    private String avancement ;


            private String dateEnvoiMax ;
            private String dateEnvoiMin ;
            private String avancementMax ;
            private String avancementMin ;

        private ChercheurVo chercheurVo ;
        private CampagneVo campagneVo ;
        private EtatCampagneChercheurVo etatCampagneChercheurVo ;


    public CampagneChercheurOuvertureVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getObjet(){
        return this.objet;
        }

        public void setObjet(String objet){
        this.objet = objet;
        }
        public String getMessage(){
        return this.message;
        }

        public void setMessage(String message){
        this.message = message;
        }
        public Boolean getEnvoye(){
        return this.envoye;
        }

        public void setEnvoye(Boolean envoye){
        this.envoye = envoye;
        }
        public String getDateEnvoi(){
        return this.dateEnvoi;
        }

        public void setDateEnvoi(String dateEnvoi){
        this.dateEnvoi = dateEnvoi;
        }
        public String getAvancement(){
        return this.avancement;
        }

        public void setAvancement(String avancement){
        this.avancement = avancement;
        }


            public String getDateEnvoiMax(){
            return this.dateEnvoiMax;
            }

            public String getDateEnvoiMin(){
            return this.dateEnvoiMin;
            }

            public void setDateEnvoiMax(String dateEnvoiMax){
            this.dateEnvoiMax = dateEnvoiMax;
            }

            public void setDateEnvoiMin(String dateEnvoiMin){
            this.dateEnvoiMin = dateEnvoiMin;
            }

            public String getAvancementMax(){
            return this.avancementMax;
            }

            public String getAvancementMin(){
            return this.avancementMin;
            }

            public void setAvancementMax(String avancementMax){
            this.avancementMax = avancementMax;
            }

            public void setAvancementMin(String avancementMin){
            this.avancementMin = avancementMin;
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
        public EtatCampagneChercheurVo getEtatCampagneChercheurVo(){
        return this.etatCampagneChercheurVo;
        }

        public void setEtatCampagneChercheurVo(EtatCampagneChercheurVo etatCampagneChercheurVo){
        this.etatCampagneChercheurVo = etatCampagneChercheurVo;
        }


            }
