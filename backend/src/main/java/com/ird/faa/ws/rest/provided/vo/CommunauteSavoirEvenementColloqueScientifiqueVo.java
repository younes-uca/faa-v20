package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirEvenementColloqueScientifiqueVo {

    private String id ;



        private EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo ;
        private CommunauteSavoirVo communauteSavoirVo ;


    public CommunauteSavoirEvenementColloqueScientifiqueVo(){
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
        public CommunauteSavoirVo getCommunauteSavoirVo(){
        return this.communauteSavoirVo;
        }

        public void setCommunauteSavoirVo(CommunauteSavoirVo communauteSavoirVo){
        this.communauteSavoirVo = communauteSavoirVo;
        }


            }
