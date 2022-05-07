package  com.ird.faa.ws.rest.provided.vo;


public class ChercheurEmailVo {

    private String id ;
    private String email ;
    private Boolean principale ;



        private ChercheurVo chercheurVo ;


    public ChercheurEmailVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getEmail(){
        return this.email;
        }

        public void setEmail(String email){
        this.email = email;
        }
        public Boolean getPrincipale(){
        return this.principale;
        }

        public void setPrincipale(Boolean principale){
        this.principale = principale;
        }



        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
