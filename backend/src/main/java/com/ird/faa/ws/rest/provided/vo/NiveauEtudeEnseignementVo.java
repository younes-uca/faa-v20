package  com.ird.faa.ws.rest.provided.vo;


public class NiveauEtudeEnseignementVo {

    private String id ;



        private NiveauEtudeVo niveauEtudeVo ;
        private EnseignementVo enseignementVo ;


    public NiveauEtudeEnseignementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public NiveauEtudeVo getNiveauEtudeVo(){
        return this.niveauEtudeVo;
        }

        public void setNiveauEtudeVo(NiveauEtudeVo niveauEtudeVo){
        this.niveauEtudeVo = niveauEtudeVo;
        }
        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }


            }
