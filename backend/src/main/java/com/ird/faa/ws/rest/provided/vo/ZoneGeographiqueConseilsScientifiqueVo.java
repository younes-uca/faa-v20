package  com.ird.faa.ws.rest.provided.vo;


public class ZoneGeographiqueConseilsScientifiqueVo {

    private String id ;
    private String libelle ;



        private ConseilsScientifiqueVo conseilsScientifiqueVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;
        private PaysVo paysVo ;


    public ZoneGeographiqueConseilsScientifiqueVo(){
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



        public ConseilsScientifiqueVo getConseilsScientifiqueVo(){
        return this.conseilsScientifiqueVo;
        }

        public void setConseilsScientifiqueVo(ConseilsScientifiqueVo conseilsScientifiqueVo){
        this.conseilsScientifiqueVo = conseilsScientifiqueVo;
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
