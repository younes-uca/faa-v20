package  com.ird.faa.ws.rest.provided.vo;


public class TypeInstrumentIrdConsultanceScientifiquePonctuelleVo {

    private String id ;



        private TypeInstrumentIrdVo typeInstrumentIrdVo ;
        private ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo ;


    public TypeInstrumentIrdConsultanceScientifiquePonctuelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public TypeInstrumentIrdVo getTypeInstrumentIrdVo(){
        return this.typeInstrumentIrdVo;
        }

        public void setTypeInstrumentIrdVo(TypeInstrumentIrdVo typeInstrumentIrdVo){
        this.typeInstrumentIrdVo = typeInstrumentIrdVo;
        }
        public ConsultanceScientifiquePonctuelleVo getConsultanceScientifiquePonctuelleVo(){
        return this.consultanceScientifiquePonctuelleVo;
        }

        public void setConsultanceScientifiquePonctuelleVo(ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
        this.consultanceScientifiquePonctuelleVo = consultanceScientifiquePonctuelleVo;
        }


            }
