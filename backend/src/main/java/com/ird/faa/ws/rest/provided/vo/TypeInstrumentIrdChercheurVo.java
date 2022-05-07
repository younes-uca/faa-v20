package  com.ird.faa.ws.rest.provided.vo;


public class TypeInstrumentIrdChercheurVo {

    private String id ;



        private TypeInstrumentIrdVo typeInstrumentIrdVo ;
        private ChercheurVo chercheurVo ;


    public TypeInstrumentIrdChercheurVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public TypeInstrumentIrdVo getTypeInstrumentIrdVo(){
        return this.typeInstrumentIrdVo;
        }

        public void setTypeInstrumentIrdVo(TypeInstrumentIrdVo typeInstrumentIrdVo){
        this.typeInstrumentIrdVo = typeInstrumentIrdVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
