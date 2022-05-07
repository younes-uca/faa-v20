package  com.ird.faa.ws.rest.provided.vo;


public class FormationContinueEnjeuxIrdVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private FormationContinueVo formationContinueVo ;


    public FormationContinueEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }
        public FormationContinueVo getFormationContinueVo(){
        return this.formationContinueVo;
        }

        public void setFormationContinueVo(FormationContinueVo formationContinueVo){
        this.formationContinueVo = formationContinueVo;
        }


            }
