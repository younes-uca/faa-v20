package  com.ird.faa.ws.rest.provided.vo;


public class PaysRencontreMediaVo {

    private String id ;



        private PaysVo paysVo ;
        private RencontreMediaVo rencontreMediaVo ;


    public PaysRencontreMediaVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public RencontreMediaVo getRencontreMediaVo(){
        return this.rencontreMediaVo;
        }

        public void setRencontreMediaVo(RencontreMediaVo rencontreMediaVo){
        this.rencontreMediaVo = rencontreMediaVo;
        }


            }
