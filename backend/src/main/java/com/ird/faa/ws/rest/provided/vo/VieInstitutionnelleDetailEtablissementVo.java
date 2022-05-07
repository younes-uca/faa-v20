package  com.ird.faa.ws.rest.provided.vo;


public class VieInstitutionnelleDetailEtablissementVo {

    private String id ;



        private VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo ;
        private EtablissementVo etablissementVo ;


    public VieInstitutionnelleDetailEtablissementVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public VieInstitutionnelleDetailVo getVieInstitutionnelleDetailVo(){
        return this.vieInstitutionnelleDetailVo;
        }

        public void setVieInstitutionnelleDetailVo(VieInstitutionnelleDetailVo vieInstitutionnelleDetailVo){
        this.vieInstitutionnelleDetailVo = vieInstitutionnelleDetailVo;
        }
        public EtablissementVo getEtablissementVo(){
        return this.etablissementVo;
        }

        public void setEtablissementVo(EtablissementVo etablissementVo){
        this.etablissementVo = etablissementVo;
        }


            }
