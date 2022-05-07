package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueEvenementColloqueScientifiqueVo {

    private String id ;



        private EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public DisciplineScientifiqueEvenementColloqueScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EvenementColloqueScienntifiqueVo getEvenementColloqueScienntifiqueVo(){
        return this.evenementColloqueScienntifiqueVo;
        }

        public void setEvenementColloqueScienntifiqueVo(EvenementColloqueScienntifiqueVo evenementColloqueScienntifiqueVo){
        this.evenementColloqueScienntifiqueVo = evenementColloqueScienntifiqueVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
