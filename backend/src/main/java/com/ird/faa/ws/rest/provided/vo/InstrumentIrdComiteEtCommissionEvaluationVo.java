package  com.ird.faa.ws.rest.provided.vo;


public class InstrumentIrdComiteEtCommissionEvaluationVo {

    private String id ;



        private InstrumentIrdVo instrumentIrdVo ;
        private TypeInstrumentIrdVo typeInstrumentIrdVo ;
        private ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo ;


    public InstrumentIrdComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }
        public TypeInstrumentIrdVo getTypeInstrumentIrdVo(){
        return this.typeInstrumentIrdVo;
        }

        public void setTypeInstrumentIrdVo(TypeInstrumentIrdVo typeInstrumentIrdVo){
        this.typeInstrumentIrdVo = typeInstrumentIrdVo;
        }
        public ComiteEtCommissionEvaluationVo getComiteEtCommissionEvaluationVo(){
        return this.comiteEtCommissionEvaluationVo;
        }

        public void setComiteEtCommissionEvaluationVo(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        this.comiteEtCommissionEvaluationVo = comiteEtCommissionEvaluationVo;
        }


            }
