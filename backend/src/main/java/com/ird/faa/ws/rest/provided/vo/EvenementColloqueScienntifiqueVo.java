package  com.ird.faa.ws.rest.provided.vo;

    import java.util.List;
    import java.util.Date;
    import javax.persistence.Temporal;
    import javax.persistence.TemporalType;
    import com.fasterxml.jackson.annotation.JsonFormat;
    import java.math.BigDecimal;

public class EvenementColloqueScienntifiqueVo {

    private String id ;
    private String intitule ;
    private String typeDeParticipation ;
    private String dateEvenement ;
    private Boolean diplomatieStategique ;
    private String volumeParticipant ;


            private String dateEvenementMax ;
            private String dateEvenementMin ;
            private String volumeParticipantMax ;
            private String volumeParticipantMin ;

        private ModaliteVo modaliteVo ;
        private ModaliteInterventionVo modaliteInterventionVo ;
        private SavoirEtInnovationVo savoirEtInnovationVo ;
        private EtatEtapeCampagneVo etatEtapeCampagneVo ;

    private List<EvenementColloqueScienntifiqueEnjeuxIrdVo> evenementColloqueScienntifiqueEnjeuxIrdsVo ;
    private List<CommunauteSavoirEvenementColloqueScientifiqueVo> communauteSavoirEvenementColloqueScientifiquesVo ;
    private List<DisciplineScientifiqueEvenementColloqueScientifiqueVo> disciplineScientifiqueEvenementColloqueScientifiquesVo ;
    private List<EvenementColloqueScienntifiquePaysVo> evenementColloqueScienntifiquePayssVo ;

    public EvenementColloqueScienntifiqueVo(){
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
        public String getTypeDeParticipation(){
        return this.typeDeParticipation;
        }

        public void setTypeDeParticipation(String typeDeParticipation){
        this.typeDeParticipation = typeDeParticipation;
        }
        public String getDateEvenement(){
        return this.dateEvenement;
        }

        public void setDateEvenement(String dateEvenement){
        this.dateEvenement = dateEvenement;
        }
        public Boolean getDiplomatieStategique(){
        return this.diplomatieStategique;
        }

        public void setDiplomatieStategique(Boolean diplomatieStategique){
        this.diplomatieStategique = diplomatieStategique;
        }
        public String getVolumeParticipant(){
        return this.volumeParticipant;
        }

        public void setVolumeParticipant(String volumeParticipant){
        this.volumeParticipant = volumeParticipant;
        }


            public String getDateEvenementMax(){
            return this.dateEvenementMax;
            }

            public String getDateEvenementMin(){
            return this.dateEvenementMin;
            }

            public void setDateEvenementMax(String dateEvenementMax){
            this.dateEvenementMax = dateEvenementMax;
            }

            public void setDateEvenementMin(String dateEvenementMin){
            this.dateEvenementMin = dateEvenementMin;
            }

            public String getVolumeParticipantMax(){
            return this.volumeParticipantMax;
            }

            public String getVolumeParticipantMin(){
            return this.volumeParticipantMin;
            }

            public void setVolumeParticipantMax(String volumeParticipantMax){
            this.volumeParticipantMax = volumeParticipantMax;
            }

            public void setVolumeParticipantMin(String volumeParticipantMin){
            this.volumeParticipantMin = volumeParticipantMin;
            }


        public ModaliteVo getModaliteVo(){
        return this.modaliteVo;
        }

        public void setModaliteVo(ModaliteVo modaliteVo){
        this.modaliteVo = modaliteVo;
        }
        public ModaliteInterventionVo getModaliteInterventionVo(){
        return this.modaliteInterventionVo;
        }

        public void setModaliteInterventionVo(ModaliteInterventionVo modaliteInterventionVo){
        this.modaliteInterventionVo = modaliteInterventionVo;
        }
        public SavoirEtInnovationVo getSavoirEtInnovationVo(){
        return this.savoirEtInnovationVo;
        }

        public void setSavoirEtInnovationVo(SavoirEtInnovationVo savoirEtInnovationVo){
        this.savoirEtInnovationVo = savoirEtInnovationVo;
        }
        public EtatEtapeCampagneVo getEtatEtapeCampagneVo(){
        return this.etatEtapeCampagneVo;
        }

        public void setEtatEtapeCampagneVo(EtatEtapeCampagneVo etatEtapeCampagneVo){
        this.etatEtapeCampagneVo = etatEtapeCampagneVo;
        }


        public List<EvenementColloqueScienntifiqueEnjeuxIrdVo> getEvenementColloqueScienntifiqueEnjeuxIrdsVo(){
        return this.evenementColloqueScienntifiqueEnjeuxIrdsVo;
        }

        public void setEvenementColloqueScienntifiqueEnjeuxIrdsVo(List<EvenementColloqueScienntifiqueEnjeuxIrdVo> evenementColloqueScienntifiqueEnjeuxIrdsVo){
            this.evenementColloqueScienntifiqueEnjeuxIrdsVo = evenementColloqueScienntifiqueEnjeuxIrdsVo;
            }

        public List<CommunauteSavoirEvenementColloqueScientifiqueVo> getCommunauteSavoirEvenementColloqueScientifiquesVo(){
        return this.communauteSavoirEvenementColloqueScientifiquesVo;
        }

        public void setCommunauteSavoirEvenementColloqueScientifiquesVo(List<CommunauteSavoirEvenementColloqueScientifiqueVo> communauteSavoirEvenementColloqueScientifiquesVo){
            this.communauteSavoirEvenementColloqueScientifiquesVo = communauteSavoirEvenementColloqueScientifiquesVo;
            }

        public List<DisciplineScientifiqueEvenementColloqueScientifiqueVo> getDisciplineScientifiqueEvenementColloqueScientifiquesVo(){
        return this.disciplineScientifiqueEvenementColloqueScientifiquesVo;
        }

        public void setDisciplineScientifiqueEvenementColloqueScientifiquesVo(List<DisciplineScientifiqueEvenementColloqueScientifiqueVo> disciplineScientifiqueEvenementColloqueScientifiquesVo){
            this.disciplineScientifiqueEvenementColloqueScientifiquesVo = disciplineScientifiqueEvenementColloqueScientifiquesVo;
            }

        public List<EvenementColloqueScienntifiquePaysVo> getEvenementColloqueScienntifiquePayssVo(){
        return this.evenementColloqueScienntifiquePayssVo;
        }

        public void setEvenementColloqueScienntifiquePayssVo(List<EvenementColloqueScienntifiquePaysVo> evenementColloqueScienntifiquePayssVo){
            this.evenementColloqueScienntifiquePayssVo = evenementColloqueScienntifiquePayssVo;
            }

            }
