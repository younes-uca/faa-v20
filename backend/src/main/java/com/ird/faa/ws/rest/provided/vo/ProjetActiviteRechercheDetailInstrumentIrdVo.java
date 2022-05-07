package  com.ird.faa.ws.rest.provided.vo;


public class ProjetActiviteRechercheDetailInstrumentIrdVo {

    private String id ;



        private ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo ;
        private InstrumentIrdVo instrumentIrdVo ;


    public ProjetActiviteRechercheDetailInstrumentIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ProjetActiviteRechercheDetailVo getProjetActiviteRechercheDetailVo(){
        return this.projetActiviteRechercheDetailVo;
        }

        public void setProjetActiviteRechercheDetailVo(ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
        this.projetActiviteRechercheDetailVo = projetActiviteRechercheDetailVo;
        }
        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }


            }
