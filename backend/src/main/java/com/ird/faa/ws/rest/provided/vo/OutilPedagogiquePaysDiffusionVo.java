package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiquePaysDiffusionVo {

    private String id ;



        private PaysVo paysVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public OutilPedagogiquePaysDiffusionVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
