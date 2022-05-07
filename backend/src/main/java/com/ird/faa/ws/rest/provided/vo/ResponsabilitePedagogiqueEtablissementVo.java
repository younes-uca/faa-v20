package  com.ird.faa.ws.rest.provided.vo;


public class ResponsabilitePedagogiqueEtablissementVo {

    private String id ;



        private EtablissementVo etablissementVo ;
        private ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo ;
        private PaysVo paysVo ;


    public ResponsabilitePedagogiqueEtablissementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public ResponsabilitePedagogiqueVo getResponsabilitePedagogiqueVo(){
        return this.responsabilitePedagogiqueVo;
        }

        public void setResponsabilitePedagogiqueVo(ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
        this.responsabilitePedagogiqueVo = responsabilitePedagogiqueVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
