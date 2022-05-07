package  com.ird.faa.ws.rest.provided.vo;


public class EnseignementNatureVo {

    private String id ;



        private NatureEnseignementVo natureEnseignementVo ;
        private EnseignementVo enseignementVo ;


    public EnseignementNatureVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public NatureEnseignementVo getNatureEnseignementVo(){
        return this.natureEnseignementVo;
        }

        public void setNatureEnseignementVo(NatureEnseignementVo natureEnseignementVo){
        this.natureEnseignementVo = natureEnseignementVo;
        }
        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }


            }
