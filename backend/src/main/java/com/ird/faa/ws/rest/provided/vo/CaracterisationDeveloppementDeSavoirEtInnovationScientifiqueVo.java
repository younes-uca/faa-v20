package  com.ird.faa.ws.rest.provided.vo;


public class CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo {

    private String id ;



        private CaracterisationVo caracterisationVo ;
        private DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo ;


    public CaracterisationDeveloppementDeSavoirEtInnovationScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public CaracterisationVo getCaracterisationVo(){
        return this.caracterisationVo;
        }

        public void setCaracterisationVo(CaracterisationVo caracterisationVo){
        this.caracterisationVo = caracterisationVo;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueVo getDeveloppementDeSavoirEtInnovationScientifiqueVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueVo(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        this.developpementDeSavoirEtInnovationScientifiqueVo = developpementDeSavoirEtInnovationScientifiqueVo;
        }


            }
