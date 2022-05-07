package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueExpertiseScientifiqueVo {

    private String id ;



        private DisciplineScientifiqueVo disciplineScientifiqueVo ;
        private ExpertiseScientifiqueVo expertiseScientifiqueVo ;


    public DisciplineScientifiqueExpertiseScientifiqueVo(){
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
        public ExpertiseScientifiqueVo getExpertiseScientifiqueVo(){
        return this.expertiseScientifiqueVo;
        }

        public void setExpertiseScientifiqueVo(ExpertiseScientifiqueVo expertiseScientifiqueVo){
        this.expertiseScientifiqueVo = expertiseScientifiqueVo;
        }


            }
