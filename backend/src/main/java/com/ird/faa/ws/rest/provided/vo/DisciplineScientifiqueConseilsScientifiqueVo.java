package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueConseilsScientifiqueVo {

    private String id ;



        private ConseilsScientifiqueVo conseilsScientifiqueVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public DisciplineScientifiqueConseilsScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ConseilsScientifiqueVo getConseilsScientifiqueVo(){
        return this.conseilsScientifiqueVo;
        }

        public void setConseilsScientifiqueVo(ConseilsScientifiqueVo conseilsScientifiqueVo){
        this.conseilsScientifiqueVo = conseilsScientifiqueVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
