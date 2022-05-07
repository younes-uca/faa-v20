package  com.ird.faa.ws.rest.provided.vo;


public class EtablissementConsultanceScientifiquePonctuelleVo {

    private String id ;



        private ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo ;
        private EtablissementVo etablissementVo ;


    public EtablissementConsultanceScientifiquePonctuelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ConsultanceScientifiquePonctuelleVo getConsultanceScientifiquePonctuelleVo(){
        return this.consultanceScientifiquePonctuelleVo;
        }

        public void setConsultanceScientifiquePonctuelleVo(ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
        this.consultanceScientifiquePonctuelleVo = consultanceScientifiquePonctuelleVo;
        }
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }


            }
