package  com.ird.faa.ws.rest.provided.vo;


public class DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo ;


    public DeveloppementDeSavoirEtInnovationScientifiqueEnjeuxIrdVo(){
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
        public DeveloppementDeSavoirEtInnovationScientifiqueVo getDeveloppementDeSavoirEtInnovationScientifiqueVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueVo(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        this.developpementDeSavoirEtInnovationScientifiqueVo = developpementDeSavoirEtInnovationScientifiqueVo;
        }


            }
