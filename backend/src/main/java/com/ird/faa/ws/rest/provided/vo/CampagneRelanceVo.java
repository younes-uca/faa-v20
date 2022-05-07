package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;

public class CampagneRelanceVo {

    private String id ;
    private String dateRelance ;
    private String objetRelance ;
    private String messageRelance ;


            private String dateRelanceMax ;
            private String dateRelanceMin ;

        private CampagneVo campagneVo ;
        private TemplateRelanceVo templateRelanceVo ;

    private List<CampagneRelanceChercheurVo> campagneRelanceChercheursVo ;

    public CampagneRelanceVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getDateRelance(){
        return this.dateRelance;
        }

        public void setDateRelance(String dateRelance){
        this.dateRelance = dateRelance;
        }
        public String getObjetRelance(){
        return this.objetRelance;
        }

        public void setObjetRelance(String objetRelance){
        this.objetRelance = objetRelance;
        }
        public String getMessageRelance(){
        return this.messageRelance;
        }

        public void setMessageRelance(String messageRelance){
        this.messageRelance = messageRelance;
        }


            public String getDateRelanceMax(){
            return this.dateRelanceMax;
            }

            public String getDateRelanceMin(){
            return this.dateRelanceMin;
            }

            public void setDateRelanceMax(String dateRelanceMax){
            this.dateRelanceMax = dateRelanceMax;
            }

            public void setDateRelanceMin(String dateRelanceMin){
            this.dateRelanceMin = dateRelanceMin;
            }


        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }
        public TemplateRelanceVo getTemplateRelanceVo(){
        return this.templateRelanceVo;
        }

        public void setTemplateRelanceVo(TemplateRelanceVo templateRelanceVo){
        this.templateRelanceVo = templateRelanceVo;
        }


        public List<CampagneRelanceChercheurVo> getCampagneRelanceChercheursVo(){
        return this.campagneRelanceChercheursVo;
        }

        public void setCampagneRelanceChercheursVo(List<CampagneRelanceChercheurVo> campagneRelanceChercheursVo){
            this.campagneRelanceChercheursVo = campagneRelanceChercheursVo;
            }

            }
