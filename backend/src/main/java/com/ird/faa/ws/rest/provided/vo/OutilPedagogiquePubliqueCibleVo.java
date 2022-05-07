package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiquePubliqueCibleVo {

    private String id ;



        private PubliqueCibleVo publiqueCibleVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public OutilPedagogiquePubliqueCibleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public PubliqueCibleVo getPubliqueCibleVo(){
        return this.publiqueCibleVo;
        }

        public void setPubliqueCibleVo(PubliqueCibleVo publiqueCibleVo){
        this.publiqueCibleVo = publiqueCibleVo;
        }
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
