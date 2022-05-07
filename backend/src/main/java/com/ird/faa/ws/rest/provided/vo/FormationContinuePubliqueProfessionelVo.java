package  com.ird.faa.ws.rest.provided.vo;


public class FormationContinuePubliqueProfessionelVo {

    private String id ;



        private FormationContinueVo formationContinueVo ;
        private PubliqueProfessionelVo publiqueProfessionelVo ;


    public FormationContinuePubliqueProfessionelVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public FormationContinueVo getFormationContinueVo(){
        return this.formationContinueVo;
        }

        public void setFormationContinueVo(FormationContinueVo formationContinueVo){
        this.formationContinueVo = formationContinueVo;
        }
        public PubliqueProfessionelVo getPubliqueProfessionelVo(){
        return this.publiqueProfessionelVo;
        }

        public void setPubliqueProfessionelVo(PubliqueProfessionelVo publiqueProfessionelVo){
        this.publiqueProfessionelVo = publiqueProfessionelVo;
        }


            }
