package  com.ird.faa.ws.rest.provided.vo;


public class ResponsabilitePedagogiqueEnjeuxIrdVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo ;


    public ResponsabilitePedagogiqueEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }
        public ResponsabilitePedagogiqueVo getResponsabilitePedagogiqueVo(){
        return this.responsabilitePedagogiqueVo;
        }

        public void setResponsabilitePedagogiqueVo(ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
        this.responsabilitePedagogiqueVo = responsabilitePedagogiqueVo;
        }


            }
