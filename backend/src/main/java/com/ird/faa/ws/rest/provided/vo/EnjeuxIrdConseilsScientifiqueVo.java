package  com.ird.faa.ws.rest.provided.vo;


public class EnjeuxIrdConseilsScientifiqueVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private ConseilsScientifiqueVo conseilsScientifiqueVo ;


    public EnjeuxIrdConseilsScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }
        public ConseilsScientifiqueVo getConseilsScientifiqueVo(){
        return this.conseilsScientifiqueVo;
        }

        public void setConseilsScientifiqueVo(ConseilsScientifiqueVo conseilsScientifiqueVo){
        this.conseilsScientifiqueVo = conseilsScientifiqueVo;
        }


            }
