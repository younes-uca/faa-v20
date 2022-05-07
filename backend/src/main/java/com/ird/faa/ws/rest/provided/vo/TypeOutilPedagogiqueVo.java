package  com.ird.faa.ws.rest.provided.vo;


public class TypeOutilPedagogiqueVo {

    private String id ;



        private TypeOutilVo typeOutilVo ;
        private OutilPedagogiqueVo outilPedagogiqueVo ;


    public TypeOutilPedagogiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public TypeOutilVo getTypeOutilVo(){
        return this.typeOutilVo;
        }

        public void setTypeOutilVo(TypeOutilVo typeOutilVo){
        this.typeOutilVo = typeOutilVo;
        }
        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }


            }
