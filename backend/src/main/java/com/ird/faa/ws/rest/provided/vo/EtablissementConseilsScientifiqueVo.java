package  com.ird.faa.ws.rest.provided.vo;


public class EtablissementConseilsScientifiqueVo {

    private String id ;



        private ConseilsScientifiqueVo conseilsScientifiqueVo ;
        private EtablissementVo etablissementVo ;


    public EtablissementConseilsScientifiqueVo(){
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
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }


            }
