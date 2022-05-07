package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirConseilEtComiteScientifiqueVo {

    private String id ;



        private CommunauteSavoirVo communauteSavoirVo ;
        private ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo ;


    public CommunauteSavoirConseilEtComiteScientifiqueVo(){
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
        public ConseilEtComiteScientifiqueVo getConseilEtComiteScientifiqueVo(){
        return this.conseilEtComiteScientifiqueVo;
        }

        public void setConseilEtComiteScientifiqueVo(ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){
        this.conseilEtComiteScientifiqueVo = conseilEtComiteScientifiqueVo;
        }


            }
