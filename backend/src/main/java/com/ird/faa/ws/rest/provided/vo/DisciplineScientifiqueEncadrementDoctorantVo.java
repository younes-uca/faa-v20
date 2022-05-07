package  com.ird.faa.ws.rest.provided.vo;


public class DisciplineScientifiqueEncadrementDoctorantVo {

    private String id ;



        private EncadrementDoctorantVo encadrementDoctorantVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public DisciplineScientifiqueEncadrementDoctorantVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EncadrementDoctorantVo getEncadrementDoctorantVo(){
        return this.encadrementDoctorantVo;
        }

        public void setEncadrementDoctorantVo(EncadrementDoctorantVo encadrementDoctorantVo){
        this.encadrementDoctorantVo = encadrementDoctorantVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
