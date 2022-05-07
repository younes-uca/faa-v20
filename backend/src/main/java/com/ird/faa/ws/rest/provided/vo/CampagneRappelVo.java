package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class CampagneRappelVo {

    private String id ;
    private String dateRappel ;
    private String objetRappel ;
    private String messageRappel ;


            private String dateRappelMax ;
            private String dateRappelMin ;

        private CampagneVo campagneVo ;
        private TemplateRappelVo templateRappelVo ;

    private List<CampagneRappelChercheurVo> campagneRappelChercheursVo ;

    public CampagneRappelVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getDateRappel(){
        return this.dateRappel;
        }

        public void setDateRappel(String dateRappel){
        this.dateRappel = dateRappel;
        }
        public String getObjetRappel(){
        return this.objetRappel;
        }

        public void setObjetRappel(String objetRappel){
        this.objetRappel = objetRappel;
        }
        public String getMessageRappel(){
        return this.messageRappel;
        }

        public void setMessageRappel(String messageRappel){
        this.messageRappel = messageRappel;
        }


            public String getDateRappelMax(){
            return this.dateRappelMax;
            }

            public String getDateRappelMin(){
            return this.dateRappelMin;
            }

            public void setDateRappelMax(String dateRappelMax){
            this.dateRappelMax = dateRappelMax;
            }

            public void setDateRappelMin(String dateRappelMin){
            this.dateRappelMin = dateRappelMin;
            }


        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }
        public TemplateRappelVo getTemplateRappelVo(){
        return this.templateRappelVo;
        }

        public void setTemplateRappelVo(TemplateRappelVo templateRappelVo){
        this.templateRappelVo = templateRappelVo;
        }


        public List<CampagneRappelChercheurVo> getCampagneRappelChercheursVo(){
        return this.campagneRappelChercheursVo;
        }

        public void setCampagneRappelChercheursVo(List<CampagneRappelChercheurVo> campagneRappelChercheursVo){
            this.campagneRappelChercheursVo = campagneRappelChercheursVo;
            }

            }
