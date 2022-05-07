package  com.ird.faa.ws.rest.provided.vo;


public class DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo {

    private String id ;



        private ModeDiffusionVo modeDiffusionVo ;
        private DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo ;


    public DeveloppementDeSavoirEtInnovationScientifiqueModeDiffusionVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ModeDiffusionVo getModeDiffusionVo(){
        return this.modeDiffusionVo;
        }

        public void setModeDiffusionVo(ModeDiffusionVo modeDiffusionVo){
        this.modeDiffusionVo = modeDiffusionVo;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueVo getDeveloppementDeSavoirEtInnovationScientifiqueVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueVo(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        this.developpementDeSavoirEtInnovationScientifiqueVo = developpementDeSavoirEtInnovationScientifiqueVo;
        }


            }
