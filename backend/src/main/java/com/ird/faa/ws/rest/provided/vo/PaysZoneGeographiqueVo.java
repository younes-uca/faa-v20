package  com.ird.faa.ws.rest.provided.vo;


public class PaysZoneGeographiqueVo {

    private String id ;



        private PaysVo paysVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;


    public PaysZoneGeographiqueVo(){
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
        public ZoneGeographiqueVo getZoneGeographiqueVo(){
        return this.zoneGeographiqueVo;
        }

        public void setZoneGeographiqueVo(ZoneGeographiqueVo zoneGeographiqueVo){
        this.zoneGeographiqueVo = zoneGeographiqueVo;
        }


            }
