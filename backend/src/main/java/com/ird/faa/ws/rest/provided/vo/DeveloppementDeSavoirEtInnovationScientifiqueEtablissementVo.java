package  com.ird.faa.ws.rest.provided.vo;


public class DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo {

    private String id ;



        private EtablissementVo etablissementVo ;
        private DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo ;


    public DeveloppementDeSavoirEtInnovationScientifiqueEtablissementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public DeveloppementDeSavoirEtInnovationScientifiqueVo getDeveloppementDeSavoirEtInnovationScientifiqueVo(){
        return this.developpementDeSavoirEtInnovationScientifiqueVo;
        }

        public void setDeveloppementDeSavoirEtInnovationScientifiqueVo(DeveloppementDeSavoirEtInnovationScientifiqueVo developpementDeSavoirEtInnovationScientifiqueVo){
        this.developpementDeSavoirEtInnovationScientifiqueVo = developpementDeSavoirEtInnovationScientifiqueVo;
        }


            }
