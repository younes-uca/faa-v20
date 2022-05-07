package  com.ird.faa.ws.rest.provided.vo;


public class RencontreMediaDisciplineScientifiqueVo {

    private String id ;



        private RencontreMediaVo rencontreMediaVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public RencontreMediaDisciplineScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public RencontreMediaVo getRencontreMediaVo(){
        return this.rencontreMediaVo;
        }

        public void setRencontreMediaVo(RencontreMediaVo rencontreMediaVo){
        this.rencontreMediaVo = rencontreMediaVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
