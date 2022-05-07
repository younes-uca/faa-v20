package  com.ird.faa.ws.rest.provided.vo;


public class ProjetActiviteRechercheDetailEnjeuxIrdVo {

    private String id ;



        private EnjeuxIrdVo enjeuxIrdVo ;
        private ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo ;


    public ProjetActiviteRechercheDetailEnjeuxIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public EnjeuxIrdVo getEnjeuxIrdVo(){
        return this.enjeuxIrdVo;
        }

        public void setEnjeuxIrdVo(EnjeuxIrdVo enjeuxIrdVo){
        this.enjeuxIrdVo = enjeuxIrdVo;
        }
        public ProjetActiviteRechercheDetailVo getProjetActiviteRechercheDetailVo(){
        return this.projetActiviteRechercheDetailVo;
        }

        public void setProjetActiviteRechercheDetailVo(ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
        this.projetActiviteRechercheDetailVo = projetActiviteRechercheDetailVo;
        }


            }
