package  com.ird.faa.ws.rest.provided.vo;


public class ResponsabilitePedagogiquePaysVo {

    private String id ;



        private PaysVo paysVo ;
        private ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo ;


    public ResponsabilitePedagogiquePaysVo(){
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
        public ResponsabilitePedagogiqueVo getResponsabilitePedagogiqueVo(){
        return this.responsabilitePedagogiqueVo;
        }

        public void setResponsabilitePedagogiqueVo(ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
        this.responsabilitePedagogiqueVo = responsabilitePedagogiqueVo;
        }


            }
