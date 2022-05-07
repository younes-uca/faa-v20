package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;

public class ConseilsScientifiqueVo {

    private String id ;
    private String intitule ;
    private String nombreJoursConsacres ;


            private String nombreJoursConsacresMax ;
            private String nombreJoursConsacresMin ;

        private NatureExpertiseVo natureExpertiseVo ;
        private TypeExpertiseVo typeExpertiseVo ;
        private ExpertiseVo expertiseVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<EtablissementConseilsScientifiqueVo> etablissementConseilsScientifiquesVo ;
    private List<ZoneGeographiqueConseilsScientifiqueVo> zoneGeographiqueConseilsScientifiquesVo ;
    private List<EnjeuxIrdConseilsScientifiqueVo> enjeuxIrdConseilsScientifiquesVo ;
    private List<DisciplineScientifiqueConseilsScientifiqueVo> disciplineScientifiqueConseilsScientifiquesVo ;

    public ConseilsScientifiqueVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getIntitule(){
        return this.intitule;
        }

        public void setIntitule(String intitule){
        this.intitule = intitule;
        }
        public String getNombreJoursConsacres(){
        return this.nombreJoursConsacres;
        }

        public void setNombreJoursConsacres(String nombreJoursConsacres){
        this.nombreJoursConsacres = nombreJoursConsacres;
        }


            public String getNombreJoursConsacresMax(){
            return this.nombreJoursConsacresMax;
            }

            public String getNombreJoursConsacresMin(){
            return this.nombreJoursConsacresMin;
            }

            public void setNombreJoursConsacresMax(String nombreJoursConsacresMax){
            this.nombreJoursConsacresMax = nombreJoursConsacresMax;
            }

            public void setNombreJoursConsacresMin(String nombreJoursConsacresMin){
            this.nombreJoursConsacresMin = nombreJoursConsacresMin;
            }


        public NatureExpertiseVo getNatureExpertiseVo(){
        return this.natureExpertiseVo;
        }

        public void setNatureExpertiseVo(NatureExpertiseVo natureExpertiseVo){
        this.natureExpertiseVo = natureExpertiseVo;
        }
        public TypeExpertiseVo getTypeExpertiseVo(){
        return this.typeExpertiseVo;
        }

        public void setTypeExpertiseVo(TypeExpertiseVo typeExpertiseVo){
        this.typeExpertiseVo = typeExpertiseVo;
        }
        public ExpertiseVo getExpertiseVo(){
        return this.expertiseVo;
        }

        public void setExpertiseVo(ExpertiseVo expertiseVo){
        this.expertiseVo = expertiseVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<EtablissementConseilsScientifiqueVo> getEtablissementConseilsScientifiquesVo(){
        return this.etablissementConseilsScientifiquesVo;
        }

        public void setEtablissementConseilsScientifiquesVo(List<EtablissementConseilsScientifiqueVo> etablissementConseilsScientifiquesVo){
            this.etablissementConseilsScientifiquesVo = etablissementConseilsScientifiquesVo;
            }

        public List<ZoneGeographiqueConseilsScientifiqueVo> getZoneGeographiqueConseilsScientifiquesVo(){
        return this.zoneGeographiqueConseilsScientifiquesVo;
        }

        public void setZoneGeographiqueConseilsScientifiquesVo(List<ZoneGeographiqueConseilsScientifiqueVo> zoneGeographiqueConseilsScientifiquesVo){
            this.zoneGeographiqueConseilsScientifiquesVo = zoneGeographiqueConseilsScientifiquesVo;
            }

        public List<EnjeuxIrdConseilsScientifiqueVo> getEnjeuxIrdConseilsScientifiquesVo(){
        return this.enjeuxIrdConseilsScientifiquesVo;
        }

        public void setEnjeuxIrdConseilsScientifiquesVo(List<EnjeuxIrdConseilsScientifiqueVo> enjeuxIrdConseilsScientifiquesVo){
            this.enjeuxIrdConseilsScientifiquesVo = enjeuxIrdConseilsScientifiquesVo;
            }

        public List<DisciplineScientifiqueConseilsScientifiqueVo> getDisciplineScientifiqueConseilsScientifiquesVo(){
        return this.disciplineScientifiqueConseilsScientifiquesVo;
        }

        public void setDisciplineScientifiqueConseilsScientifiquesVo(List<DisciplineScientifiqueConseilsScientifiqueVo> disciplineScientifiqueConseilsScientifiquesVo){
            this.disciplineScientifiqueConseilsScientifiquesVo = disciplineScientifiqueConseilsScientifiquesVo;
            }

            }
