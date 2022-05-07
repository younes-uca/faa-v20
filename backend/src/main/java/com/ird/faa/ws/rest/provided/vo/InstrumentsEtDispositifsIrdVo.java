package  com.ird.faa.ws.rest.provided.vo;


public class InstrumentsEtDispositifsIrdVo {

    private String id ;
    private String libelle ;
    private String code ;
    private String description ;
    private Boolean numerique ;



        private CampagneVo campagneVo ;
        private ChercheurVo chercheurVo ;


    public InstrumentsEtDispositifsIrdVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getLibelle(){
        return this.libelle;
        }

        public void setLibelle(String libelle){
        this.libelle = libelle;
        }
        public String getCode(){
        return this.code;
        }

        public void setCode(String code){
        this.code = code;
        }
        public String getDescription(){
        return this.description;
        }

        public void setDescription(String description){
        this.description = description;
        }
        public Boolean getNumerique(){
        return this.numerique;
        }

        public void setNumerique(Boolean numerique){
        this.numerique = numerique;
        }



        public CampagneVo getCampagneVo(){
        return this.campagneVo;
        }

        public void setCampagneVo(CampagneVo campagneVo){
        this.campagneVo = campagneVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
