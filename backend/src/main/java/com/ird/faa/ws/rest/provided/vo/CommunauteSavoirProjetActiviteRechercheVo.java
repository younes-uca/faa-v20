package  com.ird.faa.ws.rest.provided.vo;


public class CommunauteSavoirProjetActiviteRechercheVo {

    private String id ;



        private ProjetActiviteRechercheVo projetActiviteRechercheVo ;
        private CommunauteSavoirVo communauteSavoirVo ;


    public CommunauteSavoirProjetActiviteRechercheVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ProjetActiviteRechercheVo getProjetActiviteRechercheVo(){
        return this.projetActiviteRechercheVo;
        }

        public void setProjetActiviteRechercheVo(ProjetActiviteRechercheVo projetActiviteRechercheVo){
        this.projetActiviteRechercheVo = projetActiviteRechercheVo;
        }
        public CommunauteSavoirVo getCommunauteSavoirVo(){
        return this.communauteSavoirVo;
        }

        public void setCommunauteSavoirVo(CommunauteSavoirVo communauteSavoirVo){
        this.communauteSavoirVo = communauteSavoirVo;
        }


            }
