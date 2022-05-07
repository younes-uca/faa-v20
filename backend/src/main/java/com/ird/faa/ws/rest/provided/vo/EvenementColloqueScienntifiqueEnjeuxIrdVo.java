package  com.ird.faa.ws.rest.provided.vo;


public class EvenementColloqueScienntifiqueEnjeuxIrdVo {

    private String id ;



        private EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo ;
        private EnjeuxIrdVo enjeuxIrdVo ;


    public EvenementColloqueScienntifiqueEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EvenementColloqueScienntifiqueVo getEvenementColloqueScienntifiqueVo(){
        return this.evenementColloqueScienntifiqueVo;
        }

        public void setEvenementColloqueScienntifiqueVo(EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo){
        this.evenementColloqueScienntifiqueVo = evenementColloqueScienntifiqueVo;
        }
        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }


            }
