package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;
    import java.math.BigDecimal;

public class ConsultanceScientifiquePonctuelleVo {

    private String id ;
    private String sujetExpertise ;
    private String nombreJourDedie ;
    private String dateFin ;
    private Boolean relieeInstrumentsIrd ;
    private String commentaire ;


            private String nombreJourDedieMax ;
            private String nombreJourDedieMin ;
            private String dateFinMax ;
            private String dateFinMin ;

        private TypeExpertiseVo typeExpertiseVo ;
        private NatureExpertiseVo natureExpertiseVo ;
        private ExpertiseVo expertiseVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<ZoneGeographiqueConsultanceScientifiquePonctuelleVo> zoneGeographiqueConsultanceScientifiquePonctuellesVo ;
    private List<PaysCommanditaireVo> paysCommanditairesVo ;
    private List<EtablissementConsultanceScientifiquePonctuelleVo> etablissementConsultanceScientifiquePonctuellesVo ;
    private List<DisciplineScientifiqueConsultanceScientifiquePonctuelleVo> disciplineScientifiqueConsultanceScientifiquePonctuellesVo ;
    private List<EnjeuxIrdConsultanceScientifiquePonctuelleVo> enjeuxIrdConsultanceScientifiquePonctuellesVo ;
    private List<InstrumentIrdConsultanceScientifiquePonctuelleVo> instrumentIrdConsultanceScientifiquePonctuellesVo ;
    private List<TypeInstrumentIrdConsultanceScientifiquePonctuelleVo> typeInstrumentIrdConsultanceScientifiquePonctuellesVo ;

    public ConsultanceScientifiquePonctuelleVo(){
    super();
    }

        public String getId(){
        return this.id;
        }

        public void setId(String id){
        this.id = id;
        }
        public String getSujetExpertise(){
        return this.sujetExpertise;
        }

        public void setSujetExpertise(String sujetExpertise){
        this.sujetExpertise = sujetExpertise;
        }
        public String getNombreJourDedie(){
        return this.nombreJourDedie;
        }

        public void setNombreJourDedie(String nombreJourDedie){
        this.nombreJourDedie = nombreJourDedie;
        }
        public String getDateFin(){
        return this.dateFin;
        }

        public void setDateFin(String dateFin){
        this.dateFin = dateFin;
        }
        public Boolean getRelieeInstrumentsIrd(){
        return this.relieeInstrumentsIrd;
        }

        public void setRelieeInstrumentsIrd(Boolean relieeInstrumentsIrd){
        this.relieeInstrumentsIrd = relieeInstrumentsIrd;
        }
        public String getCommentaire(){
        return this.commentaire;
        }

        public void setCommentaire(String commentaire){
        this.commentaire = commentaire;
        }


            public String getNombreJourDedieMax(){
            return this.nombreJourDedieMax;
            }

            public String getNombreJourDedieMin(){
            return this.nombreJourDedieMin;
            }

            public void setNombreJourDedieMax(String nombreJourDedieMax){
            this.nombreJourDedieMax = nombreJourDedieMax;
            }

            public void setNombreJourDedieMin(String nombreJourDedieMin){
            this.nombreJourDedieMin = nombreJourDedieMin;
            }

            public String getDateFinMax(){
            return this.dateFinMax;
            }

            public String getDateFinMin(){
            return this.dateFinMin;
            }

            public void setDateFinMax(String dateFinMax){
            this.dateFinMax = dateFinMax;
            }

            public void setDateFinMin(String dateFinMin){
            this.dateFinMin = dateFinMin;
            }


        public TypeExpertiseVo getTypeExpertiseVo(){
        return this.typeExpertiseVo;
        }

        public void setTypeExpertiseVo(TypeExpertiseVo typeExpertiseVo){
        this.typeExpertiseVo = typeExpertiseVo;
        }
        public NatureExpertiseVo getNatureExpertiseVo(){
        return this.natureExpertiseVo;
        }

        public void setNatureExpertiseVo(NatureExpertiseVo natureExpertiseVo){
        this.natureExpertiseVo = natureExpertiseVo;
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


        public List<ZoneGeographiqueConsultanceScientifiquePonctuelleVo> getZoneGeographiqueConsultanceScientifiquePonctuellesVo(){
        return this.zoneGeographiqueConsultanceScientifiquePonctuellesVo;
        }

        public void setZoneGeographiqueConsultanceScientifiquePonctuellesVo(List<ZoneGeographiqueConsultanceScientifiquePonctuelleVo> zoneGeographiqueConsultanceScientifiquePonctuellesVo){
            this.zoneGeographiqueConsultanceScientifiquePonctuellesVo = zoneGeographiqueConsultanceScientifiquePonctuellesVo;
            }

        public List<PaysCommanditaireVo> getPaysCommanditairesVo(){
        return this.paysCommanditairesVo;
        }

        public void setPaysCommanditairesVo(List<PaysCommanditaireVo> paysCommanditairesVo){
            this.paysCommanditairesVo = paysCommanditairesVo;
            }

        public List<EtablissementConsultanceScientifiquePonctuelleVo> getEtablissementConsultanceScientifiquePonctuellesVo(){
        return this.etablissementConsultanceScientifiquePonctuellesVo;
        }

        public void setEtablissementConsultanceScientifiquePonctuellesVo(List<EtablissementConsultanceScientifiquePonctuelleVo> etablissementConsultanceScientifiquePonctuellesVo){
            this.etablissementConsultanceScientifiquePonctuellesVo = etablissementConsultanceScientifiquePonctuellesVo;
            }

        public List<DisciplineScientifiqueConsultanceScientifiquePonctuelleVo> getDisciplineScientifiqueConsultanceScientifiquePonctuellesVo(){
        return this.disciplineScientifiqueConsultanceScientifiquePonctuellesVo;
        }

        public void setDisciplineScientifiqueConsultanceScientifiquePonctuellesVo(List<DisciplineScientifiqueConsultanceScientifiquePonctuelleVo> disciplineScientifiqueConsultanceScientifiquePonctuellesVo){
            this.disciplineScientifiqueConsultanceScientifiquePonctuellesVo = disciplineScientifiqueConsultanceScientifiquePonctuellesVo;
            }

        public List<EnjeuxIrdConsultanceScientifiquePonctuelleVo> getEnjeuxIrdConsultanceScientifiquePonctuellesVo(){
        return this.enjeuxIrdConsultanceScientifiquePonctuellesVo;
        }

        public void setEnjeuxIrdConsultanceScientifiquePonctuellesVo(List<EnjeuxIrdConsultanceScientifiquePonctuelleVo> enjeuxIrdConsultanceScientifiquePonctuellesVo){
            this.enjeuxIrdConsultanceScientifiquePonctuellesVo = enjeuxIrdConsultanceScientifiquePonctuellesVo;
            }

        public List<InstrumentIrdConsultanceScientifiquePonctuelleVo> getInstrumentIrdConsultanceScientifiquePonctuellesVo(){
        return this.instrumentIrdConsultanceScientifiquePonctuellesVo;
        }

        public void setInstrumentIrdConsultanceScientifiquePonctuellesVo(List<InstrumentIrdConsultanceScientifiquePonctuelleVo> instrumentIrdConsultanceScientifiquePonctuellesVo){
            this.instrumentIrdConsultanceScientifiquePonctuellesVo = instrumentIrdConsultanceScientifiquePonctuellesVo;
            }

        public List<TypeInstrumentIrdConsultanceScientifiquePonctuelleVo> getTypeInstrumentIrdConsultanceScientifiquePonctuellesVo(){
        return this.typeInstrumentIrdConsultanceScientifiquePonctuellesVo;
        }

        public void setTypeInstrumentIrdConsultanceScientifiquePonctuellesVo(List<TypeInstrumentIrdConsultanceScientifiquePonctuelleVo> typeInstrumentIrdConsultanceScientifiquePonctuellesVo){
            this.typeInstrumentIrdConsultanceScientifiquePonctuellesVo = typeInstrumentIrdConsultanceScientifiquePonctuellesVo;
            }

            }
