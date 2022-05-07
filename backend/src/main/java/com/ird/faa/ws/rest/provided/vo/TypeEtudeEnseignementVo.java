package  com.ird.faa.ws.rest.provided.vo;


public class TypeEtudeEnseignementVo {

    private String id ;



        private EnseignementVo enseignementVo ;
        private TypeEtudeVo typeEtudeVo ;


    public TypeEtudeEnseignementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }
        public TypeEtudeVo getTypeEtudeVo(){
        return this.typeEtudeVo;
        }

        public void setTypeEtudeVo(TypeEtudeVo typeEtudeVo){
        this.typeEtudeVo = typeEtudeVo;
        }


            }
