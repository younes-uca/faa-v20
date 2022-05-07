package  com.ird.faa.ws.rest.provided.vo;


public class EtablissementEnseignementVo {

    private String id ;



        private EtablissementVo etablissementVo ;
        private EnseignementVo enseignementVo ;


    public EtablissementEnseignementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }
        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }


            }
