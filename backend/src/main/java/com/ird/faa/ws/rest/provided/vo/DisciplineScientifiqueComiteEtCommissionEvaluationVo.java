package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueComiteEtCommissionEvaluationVo {

    private String id ;



        private DisciplineScientifiqueVo disciplineScientifiqueVo ;
        private ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo ;


    public DisciplineScientifiqueComiteEtCommissionEvaluationVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }
        public ComiteEtCommissionEvaluationVo getComiteEtCommissionEvaluationVo(){
        return this.comiteEtCommissionEvaluationVo;
        }

        public void setComiteEtCommissionEvaluationVo(ComiteEtCommissionEvaluationVo comiteEtCommissionEvaluationVo){
        this.comiteEtCommissionEvaluationVo = comiteEtCommissionEvaluationVo;
        }


            }
