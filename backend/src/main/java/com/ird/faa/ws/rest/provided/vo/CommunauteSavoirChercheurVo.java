package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirChercheurVo {

    private String id ;



        private CommunauteSavoirVo communauteSavoirVo ;
        private ChercheurVo chercheurVo ;


    public CommunauteSavoirChercheurVo(){
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
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
