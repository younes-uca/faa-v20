package  com.ird.faa.ws.rest.provided.vo;


public class ZoneGeographiqueConsultanceScientifiquePonctuelleVo {

    private String id ;



        private ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo ;
        private ZoneGeographiqueVo zoneGeographiqueVo ;
        private PaysVo paysVo ;


    public ZoneGeographiqueConsultanceScientifiquePonctuelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }



        public ConsultanceScientifiquePonctuelleVo getConsultanceScientifiquePonctuelleVo(){
        return this.consultanceScientifiquePonctuelleVo;
        }

        public void setConsultanceScientifiquePonctuelleVo(ConsultanceScientifiquePonctuelleVo consultanceScientifiquePonctuelleVo){
        this.consultanceScientifiquePonctuelleVo = consultanceScientifiquePonctuelleVo;
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
