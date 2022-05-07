package  com.ird.faa.ws.rest.provided.vo;


public class EnseignementDisciplineScientifiqueVo {

    private String id ;



        private DisciplineScientifiqueVo disciplineScientifiqueVo ;
        private EnseignementVo enseignementVo ;


    public EnseignementDisciplineScientifiqueVo(){
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
        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }


            }
