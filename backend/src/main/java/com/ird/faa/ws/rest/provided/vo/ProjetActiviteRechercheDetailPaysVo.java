package  com.ird.faa.ws.rest.provided.vo;


public class ProjetActiviteRechercheDetailPaysVo {

    private String id ;



        private PaysVo paysVo ;
        private ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo ;


    public ProjetActiviteRechercheDetailPaysVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public ProjetActiviteRechercheDetailVo getProjetActiviteRechercheDetailVo(){
        return this.projetActiviteRechercheDetailVo;
        }

        public void setProjetActiviteRechercheDetailVo(ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
        this.projetActiviteRechercheDetailVo = projetActiviteRechercheDetailVo;
        }


            }
