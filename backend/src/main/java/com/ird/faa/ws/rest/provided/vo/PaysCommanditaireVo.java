package  com.ird.faa.ws.rest.provided.vo;


public class PaysCommanditaireVo {

    private String id ;



        private ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo ;
        private PaysVo paysVo ;


    public PaysCommanditaireVo(){
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
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
