package  com.ird.faa.ws.rest.provided.vo;


public class TypePubliqueRencontreGrandPubliqueJeunePubliqueVo {

    private String id ;



        private RencontreGrandPubliqueJeunePubliqueVo rencontreGrandPubliqueJeunePubliqueVo ;
        private TypePubliqueVo typePubliqueVo ;


    public TypePubliqueRencontreGrandPubliqueJeunePubliqueVo(){
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
        public TypePubliqueVo getTypePubliqueVo(){
        return this.typePubliqueVo;
        }

        public void setTypePubliqueVo(TypePubliqueVo typePubliqueVo){
        this.typePubliqueVo = typePubliqueVo;
        }


            }
