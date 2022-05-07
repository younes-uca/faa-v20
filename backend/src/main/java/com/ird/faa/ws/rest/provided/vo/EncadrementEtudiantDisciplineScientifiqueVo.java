package  com.ird.faa.ws.rest.provided.vo;


public class EncadrementEtudiantDisciplineScientifiqueVo {

    private String id ;



        private EncadrementEtudiantVo encadrementEtudiantVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public EncadrementEtudiantDisciplineScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EncadrementEtudiantVo getEncadrementEtudiantVo(){
        return this.encadrementEtudiantVo;
        }

        public void setEncadrementEtudiantVo(EncadrementEtudiantVo encadrementEtudiantVo){
        this.encadrementEtudiantVo = encadrementEtudiantVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
