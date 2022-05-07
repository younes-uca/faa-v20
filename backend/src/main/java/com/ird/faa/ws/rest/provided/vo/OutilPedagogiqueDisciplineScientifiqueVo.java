package  com.ird.faa.ws.rest.provided.vo;


public class OutilPedagogiqueDisciplineScientifiqueVo {

    private String id ;



        private OutilPedagogiqueVo outilPedagogiqueVo ;
        private DisciplineScientifiqueVo disciplineScientifiqueVo ;


    public OutilPedagogiqueDisciplineScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public OutilPedagogiqueVo getOutilPedagogiqueVo(){
        return this.outilPedagogiqueVo;
        }

        public void setOutilPedagogiqueVo(OutilPedagogiqueVo outilPedagogiqueVo){
        this.outilPedagogiqueVo = outilPedagogiqueVo;
        }
        public DisciplineScientifiqueVo getDisciplineScientifiqueVo(){
        return this.disciplineScientifiqueVo;
        }

        public void setDisciplineScientifiqueVo(DisciplineScientifiqueVo disciplineScientifiqueVo){
        this.disciplineScientifiqueVo = disciplineScientifiqueVo;
        }


            }
