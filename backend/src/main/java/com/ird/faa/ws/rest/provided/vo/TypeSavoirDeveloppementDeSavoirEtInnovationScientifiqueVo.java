package  com.ird.faa.ws.rest.provided.vo;


public class TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo {

    private String id ;



        private DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo ;
        private TypeSavoirVo typeSavoirVo ;


    public TypeSavoirDeveloppementDeSavoirEtInnovationScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public DeveloppementDeSavoirEtInnovationScientifiqueVo getDeveloppementDeSavoirEtInnovationScientifiqueVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueVo(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        this.developpementDeSavoirEtInnovationScientifiqueVo = developpementDeSavoirEtInnovationScientifiqueVo;
        }
        public TypeSavoirVo getTypeSavoirVo(){
        return this.typeSavoirVo;
        }

        public void setTypeSavoirVo(TypeSavoirVo typeSavoirVo){
        this.typeSavoirVo = typeSavoirVo;
        }


            }
