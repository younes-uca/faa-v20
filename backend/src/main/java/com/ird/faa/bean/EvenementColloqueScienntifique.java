package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "evenement_colloque_scienntifique")
public class EvenementColloqueScienntifique   {

@Id
    @SequenceGenerator(name="evenement_colloque_scienntifique_seq",sequenceName="evenement_colloque_scienntifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="evenement_colloque_scienntifique_seq")
private Long id;

            @Column(length = 500)
            private String intitule;
            @Column(length = 500)
            private String typeDeParticipation;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateEvenement ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean diplomatieStategique = false;
            private BigDecimal volumeParticipant ;

    @ManyToOne
    private Modalite modalite ;
    @ManyToOne
    private ModaliteIntervention modaliteIntervention ;
    @ManyToOne
    private SavoirEtInnovation savoirEtInnovation ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "evenementColloqueScienntifique")
            private List<EvenementColloqueScienntifiqueEnjeuxIrd> evenementColloqueScienntifiqueEnjeuxIrds ;
                @OneToMany(mappedBy = "evenementColloqueScienntifique")
            private List<CommunauteSavoirEvenementColloqueScientifique> communauteSavoirEvenementColloqueScientifiques ;
                @OneToMany(mappedBy = "evenementColloqueScienntifique")
            private List<DisciplineScientifiqueEvenementColloqueScientifique> disciplineScientifiqueEvenementColloqueScientifiques ;
                @OneToMany(mappedBy = "evenementColloqueScienntifique")
            private List<EvenementColloqueScienntifiquePays> evenementColloqueScienntifiquePayss ;

public EvenementColloqueScienntifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
            }
            public Modalite getModalite(){
            return this.modalite;
            }
            public void setModalite(Modalite modalite){
            this.modalite = modalite;
            }
            public String getTypeDeParticipation(){
            return this.typeDeParticipation;
            }
            public void setTypeDeParticipation(String typeDeParticipation){
            this.typeDeParticipation = typeDeParticipation;
            }
            public Date getDateEvenement(){
            return this.dateEvenement;
            }
            public void setDateEvenement(Date dateEvenement){
            this.dateEvenement = dateEvenement;
            }
        public Boolean  getDiplomatieStategique(){
        return this.diplomatieStategique;
        }
        public void setDiplomatieStategique(Boolean diplomatieStategique){
        this.diplomatieStategique = diplomatieStategique;
        }
            public List<EvenementColloqueScienntifiqueEnjeuxIrd> getEvenementColloqueScienntifiqueEnjeuxIrds(){
            return this.evenementColloqueScienntifiqueEnjeuxIrds;
            }
            public void setEvenementColloqueScienntifiqueEnjeuxIrds(List<EvenementColloqueScienntifiqueEnjeuxIrd> evenementColloqueScienntifiqueEnjeuxIrds){
            this.evenementColloqueScienntifiqueEnjeuxIrds = evenementColloqueScienntifiqueEnjeuxIrds;
            }
            public List<CommunauteSavoirEvenementColloqueScientifique> getCommunauteSavoirEvenementColloqueScientifiques(){
            return this.communauteSavoirEvenementColloqueScientifiques;
            }
            public void setCommunauteSavoirEvenementColloqueScientifiques(List<CommunauteSavoirEvenementColloqueScientifique> communauteSavoirEvenementColloqueScientifiques){
            this.communauteSavoirEvenementColloqueScientifiques = communauteSavoirEvenementColloqueScientifiques;
            }
            public List<DisciplineScientifiqueEvenementColloqueScientifique> getDisciplineScientifiqueEvenementColloqueScientifiques(){
            return this.disciplineScientifiqueEvenementColloqueScientifiques;
            }
            public void setDisciplineScientifiqueEvenementColloqueScientifiques(List<DisciplineScientifiqueEvenementColloqueScientifique> disciplineScientifiqueEvenementColloqueScientifiques){
            this.disciplineScientifiqueEvenementColloqueScientifiques = disciplineScientifiqueEvenementColloqueScientifiques;
            }
            public ModaliteIntervention getModaliteIntervention(){
            return this.modaliteIntervention;
            }
            public void setModaliteIntervention(ModaliteIntervention modaliteIntervention){
            this.modaliteIntervention = modaliteIntervention;
            }
            public List<EvenementColloqueScienntifiquePays> getEvenementColloqueScienntifiquePayss(){
            return this.evenementColloqueScienntifiquePayss;
            }
            public void setEvenementColloqueScienntifiquePayss(List<EvenementColloqueScienntifiquePays> evenementColloqueScienntifiquePayss){
            this.evenementColloqueScienntifiquePayss = evenementColloqueScienntifiquePayss;
            }
            public BigDecimal getVolumeParticipant(){
            return this.volumeParticipant;
            }
            public void setVolumeParticipant(BigDecimal volumeParticipant){
            this.volumeParticipant = volumeParticipant;
            }
            public SavoirEtInnovation getSavoirEtInnovation(){
            return this.savoirEtInnovation;
            }
            public void setSavoirEtInnovation(SavoirEtInnovation savoirEtInnovation){
            this.savoirEtInnovation = savoirEtInnovation;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenementColloqueScienntifique evenementColloqueScienntifique = (EvenementColloqueScienntifique) o;
        return id != null && id.equals(evenementColloqueScienntifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

