package  com.ird.faa.ws.rest.provided.vo;


public class ZoneGeographiqueFormationContinueVo {

    private String id ;
    private String libelle ;



        private FormationContinueVo formationContinueVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;
        private PaysVo paysVo ;


    public ZoneGeographiqueFormationContinueVo(){
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



        public FormationContinueVo getFormationContinueVo(){
        return this.formationContinueVo;
        }

        public void setFormationContinueVo(FormationContinueVo formationContinueVo){
        this.formationContinueVo = formationContinueVo;
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
