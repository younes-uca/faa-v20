package  com.ird.faa.ws.rest.provided.vo;


public class InstrumentIrdChercheurVo {

    private String id ;
    private String natureImplication ;



        private InstrumentIrdVo instrumentIrdVo ;
        private ChercheurVo chercheurVo ;


    public InstrumentIrdChercheurVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getNatureImplication(){
        return this.natureImplication;
        }

        public void setNatureImplication(String natureImplication){
        this.natureImplication = natureImplication;
        }



        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
