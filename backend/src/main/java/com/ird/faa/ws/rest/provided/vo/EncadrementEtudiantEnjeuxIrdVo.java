package  com.ird.faa.ws.rest.provided.vo;


public class EncadrementEtudiantEnjeuxIrdVo {

    private String id ;



        private EncadrementEtudiantVo encadrementEtudiantVo ;
        private EnjeuxIrdVo enjeuxIrdVo ;


    public EncadrementEtudiantEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EncadrementEtudiantVo getEncadrementEtudiantVo(){
        return this.encadrementEtudiantVo;
        }

        public void setEncadrementEtudiantVo(EncadrementEtudiantVo encadrementEtudiantVo){
        this.encadrementEtudiantVo = encadrementEtudiantVo;
        }
        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }


            }
