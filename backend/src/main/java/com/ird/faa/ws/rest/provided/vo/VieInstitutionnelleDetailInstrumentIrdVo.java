package  com.ird.faa.ws.rest.provided.vo;


public class VieInstitutionnelleDetailInstrumentIrdVo {

    private String id ;



        private VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo ;
        private InstrumentIrdVo instrumentIrdVo ;


    public VieInstitutionnelleDetailInstrumentIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public VieInstitutionnelleDetailVo getVieInstitutionnelleDetailVo(){
        return this.vieInstitutionnelleDetailVo;
        }

        public void setVieInstitutionnelleDetailVo(VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){
        this.vieInstitutionnelleDetailVo = vieInstitutionnelleDetailVo;
        }
        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }


            }
