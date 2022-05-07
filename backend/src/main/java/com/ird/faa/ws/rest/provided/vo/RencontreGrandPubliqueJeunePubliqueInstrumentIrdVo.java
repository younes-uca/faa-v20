package  com.ird.faa.ws.rest.provided.vo;


public class RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo {

    private String id ;



        private InstrumentIrdVo instrumentIrdVo ;
        private RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo ;


    public RencontreGrandPubliqueJeunePubliqueInstrumentIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public InstrumentIrdVo getInstrumentIrdVo(){
        return this.instrumentIrdVo;
        }

        public void setInstrumentIrdVo(InstrumentIrdVo instrumentIrdVo){
        this.instrumentIrdVo = instrumentIrdVo;
        }
        public RencontreGrandPubliqueJeunePubliqueVo getRencontreGrandPubliqueJeunePubliqueVo(){
        return this.rencontreGrandPubliqueJeunePubliqueVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueVo(RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
        this.rencontreGrandPubliqueJeunePubliqueVo = rencontreGrandPubliqueJeunePubliqueVo;
        }


            }
