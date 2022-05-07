package  com.ird.faa.ws.rest.provided.vo;


public class RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo {

    private String id ;



        private RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo ;
        private EnjeuxIrdVo enjeuxIrdVo ;


    public RencontreGrandPubliqueJeunePubliqueEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public RencontreGrandPubliqueJeunePubliqueVo getRencontreGrandPubliqueJeunePubliqueVo(){
        return this.rencontreGrandPubliqueJeunePubliqueVo;
        }

        public void setRencontreGrandPubliqueJeunePubliqueVo(RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo){
        this.rencontreGrandPubliqueJeunePubliqueVo = rencontreGrandPubliqueJeunePubliqueVo;
        }
        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }


            }
