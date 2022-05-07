package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiqueLangueVo {

    private String id ;



        private LangueVo langueVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public OutilPedagogiqueLangueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public LangueVo getLangueVo(){
        return this.langueVo;
        }

        public void setLangueVo(LangueVo langueVo){
        this.langueVo = langueVo;
        }
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
