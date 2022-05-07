package  com.ird.faa.ws.rest.provided.vo;


public class FormationContinueObjetFormationGeneriqueVo {

    private String id ;



        private ObjetFormationGeneriqueVo objetFormationGeneriqueVo ;
        private FormationContinueVo formationContinueVo ;


    public FormationContinueObjetFormationGeneriqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ObjetFormationGeneriqueVo getObjetFormationGeneriqueVo(){
        return this.objetFormationGeneriqueVo;
        }

        public void setObjetFormationGeneriqueVo(ObjetFormationGeneriqueVo objetFormationGeneriqueVo){
        this.objetFormationGeneriqueVo = objetFormationGeneriqueVo;
        }
        public FormationContinueVo getFormationContinueVo(){
        return this.formationContinueVo;
        }

        public void setFormationContinueVo(FormationContinueVo formationContinueVo){
        this.formationContinueVo = formationContinueVo;
        }


            }
