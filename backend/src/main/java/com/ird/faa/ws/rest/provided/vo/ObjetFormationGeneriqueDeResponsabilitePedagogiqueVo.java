package  com.ird.faa.ws.rest.provided.vo;


public class ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo {

    private String id ;



        private ObjetFormationGeneriqueVo objetFormationGeneriqueVo ;
        private ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo ;


    public ObjetFormationGeneriqueDeResponsabilitePedagogiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ObjetFormationGeneriqueVo getObjetFormationGeneriqueVo(){
        return this.objetFormationGeneriqueVo;
        }

        public void setObjetFormationGeneriqueVo(ObjetFormationGeneriqueVo objetFormationGeneriqueVo){
        this.objetFormationGeneriqueVo = objetFormationGeneriqueVo;
        }
        public ResponsabilitePedagogiqueVo getResponsabilitePedagogiqueVo(){
        return this.responsabilitePedagogiqueVo;
        }

        public void setResponsabilitePedagogiqueVo(ResponsabilitePedagogiqueVo responsabilitePedagogiqueVo){
        this.responsabilitePedagogiqueVo = responsabilitePedagogiqueVo;
        }


            }
