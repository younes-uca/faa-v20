package  com.ird.faa.ws.rest.provided.vo;


public class PaysRencontreGrandPubliqueJeunePubliqueVo {

    private String id ;



        private PaysVo paysVo ;
        private RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo ;


    public PaysRencontreGrandPubliqueJeunePubliqueVo(){
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
        public RencontreGrandPubliqueJeunePubliqueVo getRencontreGrandPubliqueJeunePubliqueVo(){
        return this.rencontreGrandPubliqueJeunePubliqueVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueVo(RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
        this.rencontreGrandPubliqueJeunePubliqueVo = rencontreGrandPubliqueJeunePubliqueVo;
        }


            }
