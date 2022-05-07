package  com.ird.faa.ws.rest.provided.vo;


public class TypePubliqueRencontreMediaVo {

    private String id ;



        private TypePubliqueVo typePubliqueVo ;
        private RencontreMediaVo rencontreMediaVo ;


    public TypePubliqueRencontreMediaVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public TypePubliqueVo getTypePubliqueVo(){
        return this.typePubliqueVo;
        }

        public void setTypePubliqueVo(TypePubliqueVo typePubliqueVo){
        this.typePubliqueVo = typePubliqueVo;
        }
        public RencontreMediaVo getRencontreMediaVo(){
        return this.rencontreMediaVo;
        }

        public void setRencontreMediaVo(RencontreMediaVo rencontreMediaVo){
        this.rencontreMediaVo = rencontreMediaVo;
        }


            }
