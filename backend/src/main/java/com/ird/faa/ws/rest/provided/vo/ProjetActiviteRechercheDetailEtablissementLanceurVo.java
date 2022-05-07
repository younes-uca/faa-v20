package  com.ird.faa.ws.rest.provided.vo;


public class ProjetActiviteRechercheDetailEtablissementLanceurVo {

    private String id ;



        private EtablissementVo etablissementVo ;
        private ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo ;


    public ProjetActiviteRechercheDetailEtablissementLanceurVo(){
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
        public ProjetActiviteRechercheDetailVo getProjetActiviteRechercheDetailVo(){
        return this.projetActiviteRechercheDetailVo;
        }

        public void setProjetActiviteRechercheDetailVo(ProjetActiviteRechercheDetailVo projetActiviteRechercheDetailVo){
        this.projetActiviteRechercheDetailVo = projetActiviteRechercheDetailVo;
        }


            }
