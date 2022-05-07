package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiqueTypeInstrumentIrdVo {

    private String id ;



        private TypeInstrumentIrdVo typeInstrumentIrdVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public OutilPedagogiqueTypeInstrumentIrdVo(){
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
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
