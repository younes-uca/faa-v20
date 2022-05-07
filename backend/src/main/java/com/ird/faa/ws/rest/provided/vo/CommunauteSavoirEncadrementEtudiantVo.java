package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirEncadrementEtudiantVo {

    private String id ;



        private CommunauteSavoirVo communauteSavoirVo ;
        private EncadrementEtudiantVo encadrementEtudiantVo ;


    public CommunauteSavoirEncadrementEtudiantVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public CommunauteSavoirVo getCommunauteSavoirVo(){
        return this.communauteSavoirVo;
        }

        public void setCommunauteSavoirVo(CommunauteSavoirVo communauteSavoirVo){
        this.communauteSavoirVo = communauteSavoirVo;
        }
        public EncadrementEtudiantVo getEncadrementEtudiantVo(){
        return this.encadrementEtudiantVo;
        }

        public void setEncadrementEtudiantVo(EncadrementEtudiantVo encadrementEtudiantVo){
        this.encadrementEtudiantVo = encadrementEtudiantVo;
        }


            }
