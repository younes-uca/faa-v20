package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirExpertiseScientifiqueVo {

    private String id ;



        private CommunauteSavoirVo communauteSavoirVo ;
        private ExpertiseScientifiqueVo expertiseScientifiqueVo ;


    public CommunauteSavoirExpertiseScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public CommunauteSavoirVo getCommunauteSavoirVo(){
        return this.communauteSavoirVo;
        }

        public void setCommunauteSavoirVo(CommunauteSavoirVo communauteSavoirVo){
        this.communauteSavoirVo = communauteSavoirVo;
        }
        public ExpertiseScientifiqueVo getExpertiseScientifiqueVo(){
        return this.expertiseScientifiqueVo;
        }

        public void setExpertiseScientifiqueVo(ExpertiseScientifiqueVo expertiseScientifiqueVo){
        this.expertiseScientifiqueVo = expertiseScientifiqueVo;
        }


            }
