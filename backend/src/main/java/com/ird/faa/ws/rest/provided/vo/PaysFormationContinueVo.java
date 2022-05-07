package  com.ird.faa.ws.rest.provided.vo;


public class PaysFormationContinueVo {

    private String id ;



        private FormationContinueVo formationContinueVo ;
        private PaysVo paysVo ;


    public PaysFormationContinueVo(){
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
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
