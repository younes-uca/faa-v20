package  com.ird.faa.ws.rest.provided.vo;


public class RencontreMediaEnjeuxIrdVo {

    private String id ;



        private RencontreMediaVo rencontreMediaVo ;
        private EnjeuxIrdVo enjeuxIrdVo ;


    public RencontreMediaEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public RencontreMediaVo getRencontreMediaVo(){
        return this.rencontreMediaVo;
        }

        public void setRencontreMediaVo(RencontreMediaVo rencontreMediaVo){
        this.rencontreMediaVo = rencontreMediaVo;
        }
        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }


            }
