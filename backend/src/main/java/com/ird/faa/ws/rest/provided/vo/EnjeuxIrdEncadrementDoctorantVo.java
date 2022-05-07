package  com.ird.faa.ws.rest.provided.vo;


public class EnjeuxIrdEncadrementDoctorantVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private EncadrementDoctorantVo encadrementDoctorantVo ;


    public EnjeuxIrdEncadrementDoctorantVo(){
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
        public EncadrementDoctorantVo getEncadrementDoctorantVo(){
        return this.encadrementDoctorantVo;
        }

        public void setEncadrementDoctorantVo(EncadrementDoctorantVo encadrementDoctorantVo){
        this.encadrementDoctorantVo = encadrementDoctorantVo;
        }


            }
