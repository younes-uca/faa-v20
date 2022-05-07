package  com.ird.faa.ws.rest.provided.vo;


public class EvenementColloqueScienntifiquePaysVo {

    private String id ;



        private EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo ;
        private PaysVo paysVo ;


    public EvenementColloqueScienntifiquePaysVo(){
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
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
