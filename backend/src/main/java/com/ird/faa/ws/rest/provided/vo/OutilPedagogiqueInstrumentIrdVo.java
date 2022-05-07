package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiqueInstrumentIrdVo {

    private String id ;



        private InstrumentIrdVo instrumentIrdVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public OutilPedagogiqueInstrumentIrdVo(){
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
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
