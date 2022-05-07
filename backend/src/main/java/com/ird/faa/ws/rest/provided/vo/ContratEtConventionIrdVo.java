package  com.ird.faa.ws.rest.provided.vo;

    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class ContratEtConventionIrdVo {

    private String id ;
    private String numero ;
    private String dateContrat ;
    private String intitule ;
    private String description ;


            private String dateContratMax ;
            private String dateContratMin ;

        private StatusContratEtConventionVo statusContratEtConventionVo ;
        private SavoirEtInnovationVo savoirEtInnovationVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;


    public ContratEtConventionIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNumero(){
        return this.numero;
        }

        public void setNumero(String numero){
        this.numero = numero;
        }
        public String getDateContrat(){
        return this.dateContrat;
        }

        public void setDateContrat(String dateContrat){
        this.dateContrat = dateContrat;
        }
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }
        public String getDescription(){
        return this.description;
        }

        public void setDescription(String description){
        this.description = description;
        }


            public String getDateContratMax(){
            return this.dateContratMax;
            }

            public String getDateContratMin(){
            return this.dateContratMin;
            }

            public void setDateContratMax(String dateContratMax){
            this.dateContratMax = dateContratMax;
            }

            public void setDateContratMin(String dateContratMin){
            this.dateContratMin = dateContratMin;
            }


        public StatusContratEtConventionVo getStatusContratEtConventionVo(){
        return this.statusContratEtConventionVo;
        }

        public void setStatusContratEtConventionVo(StatusContratEtConventionVo statusContratEtConventionVo){
        this.statusContratEtConventionVo = statusContratEtConventionVo;
        }
        public SavoirEtInnovationVo getSavoirEtInnovationVo(){
        return this.savoirEtInnovationVo;
        }

        public void setSavoirEtInnovationVo(SavoirEtInnovationVo savoirEtInnovationVo){
        this.savoirEtInnovationVo = savoirEtInnovationVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


            }
