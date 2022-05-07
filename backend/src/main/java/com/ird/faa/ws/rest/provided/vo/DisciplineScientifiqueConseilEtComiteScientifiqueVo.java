package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueConseilEtComiteScientifiqueVo {

    private String id ;



        private DisciplineScientifiqueVo disciplineScientifiqueVo ;
        private ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo ;


    public DisciplineScientifiqueConseilEtComiteScientifiqueVo(){
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
        public ConseilEtComiteScientifiqueVo getConseilEtComiteScientifiqueVo(){
        return this.conseilEtComiteScientifiqueVo;
        }

        public void setConseilEtComiteScientifiqueVo(ConseilEtComiteScientifiqueVo conseilEtComiteScientifiqueVo){
        this.conseilEtComiteScientifiqueVo = conseilEtComiteScientifiqueVo;
        }


            }
