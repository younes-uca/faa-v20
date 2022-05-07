package  com.ird.faa.ws.rest.provided.vo;


public class ZoneActiviteInteractionRechercheVo {

    private String id ;
    private String libelle ;



        private PaysVo paysVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;
        private ChercheurVo chercheurVo ;


    public ZoneActiviteInteractionRechercheVo(){
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



        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }
        public ZoneGeographiqueVo getZoneGeographiqueVo(){
        return this.zoneGeographiqueVo;
        }

        public void setZoneGeographiqueVo(ZoneGeographiqueVo zoneGeographiqueVo){
        this.zoneGeographiqueVo = zoneGeographiqueVo;
        }
        public ChercheurVo getChercheurVo(){
        return this.chercheurVo;
        }

        public void setChercheurVo(ChercheurVo chercheurVo){
        this.chercheurVo = chercheurVo;
        }


            }
