package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueEncadrementEtudiantVo {

    private String id ;



        private DisciplineScientifiqueVo disciplineScientifiqueVo ;
        private EncadrementEtudiantVo encadrementEtudiantVo ;


    public DisciplineScientifiqueEncadrementEtudiantVo(){
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
        public EncadrementEtudiantVo getEncadrementEtudiantVo(){
        return this.encadrementEtudiantVo;
        }

        public void setEncadrementEtudiantVo(EncadrementEtudiantVo encadrementEtudiantVo){
        this.encadrementEtudiantVo = encadrementEtudiantVo;
        }


            }
