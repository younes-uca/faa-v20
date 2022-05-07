package  com.ird.faa.ws.rest.provided.vo;


public class EnseignementZoneGeographiqueVo {

    private String id ;
    private String libelle ;



        private EnseignementVo enseignementVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;
        private PaysVo paysVo ;


    public EnseignementZoneGeographiqueVo(){
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



        public EnseignementVo getEnseignementVo(){
        return this.enseignementVo;
        }

        public void setEnseignementVo(EnseignementVo enseignementVo){
        this.enseignementVo = enseignementVo;
        }
        public ZoneGeographiqueVo getZoneGeographiqueVo(){
        return this.zoneGeographiqueVo;
        }

        public void setZoneGeographiqueVo(ZoneGeographiqueVo zoneGeographiqueVo){
        this.zoneGeographiqueVo = zoneGeographiqueVo;
        }
        public PaysVo getPaysVo(){
        return this.paysVo;
        }

        public void setPaysVo(PaysVo paysVo){
        this.paysVo = paysVo;
        }


            }
