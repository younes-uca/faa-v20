package  com.ird.faa.ws.rest.provided.vo;


public class InstrumentIrdConsultanceScientifiquePonctuelleVo {

    private String id ;
    private Boolean existe ;



        private ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo ;
        private InstrumentIrdVo instrumentIrdVo ;


    public InstrumentIrdConsultanceScientifiquePonctuelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public Boolean getExiste(){
        return this.existe;
        }

        public void setExiste(Boolean existe){
        this.existe = existe;
        }



        public ConsultanceScientifiquePonctuelleVo getConsultanceScientifiquePonctuelleVo(){
        return this.consultanceScientifiquePonctuelleVo;
        }

        public void setConsultanceScientifiquePonctuelleVo(ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
        this.consultanceScientifiquePonctuelleVo = consultanceScientifiquePonctuelleVo;
        }
        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }


            }
