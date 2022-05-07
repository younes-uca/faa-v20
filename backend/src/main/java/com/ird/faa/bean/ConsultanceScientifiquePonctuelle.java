package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;


    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "consultance_scientifique_ponctuelle")
public class ConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="consultance_scientifique_ponctuelle_seq",sequenceName="consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="consultance_scientifique_ponctuelle_seq")
private Long id;

            @Column(length = 500)
            private String sujetExpertise;
            private BigDecimal nombreJourDedie ;
            @JsonFormat(pattern="yyyy-MM-dd")
            @Temporal(TemporalType.DATE)
            private Date dateFin ;
            @Column(columnDefinition = "boolean default false")
                 private Boolean relieeInstrumentsIrd = false;
            @Lob
            @Column(columnDefinition="TEXT")
            private String commentaire;

    @ManyToOne
    private TypeExpertise typeExpertise ;
    @ManyToOne
    private NatureExpertise natureExpertise ;
    @ManyToOne
    private Expertise expertise ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelles ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<PaysCommanditaire> paysCommanditaires ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelles ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles ;
                @OneToMany(mappedBy = "consultanceScientifiquePonctuelle")
            private List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles ;

public ConsultanceScientifiquePonctuelle(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public TypeExpertise getTypeExpertise(){
            return this.typeExpertise;
            }
            public void setTypeExpertise(TypeExpertise typeExpertise){
            this.typeExpertise = typeExpertise;
            }
            public NatureExpertise getNatureExpertise(){
            return this.natureExpertise;
            }
            public void setNatureExpertise(NatureExpertise natureExpertise){
            this.natureExpertise = natureExpertise;
            }
            public String getSujetExpertise(){
            return this.sujetExpertise;
            }
            public void setSujetExpertise(String sujetExpertise){
            this.sujetExpertise = sujetExpertise;
            }
            public List<ZoneGeographiqueConsultanceScientifiquePonctuelle> getZoneGeographiqueConsultanceScientifiquePonctuelles(){
            return this.zoneGeographiqueConsultanceScientifiquePonctuelles;
            }
            public void setZoneGeographiqueConsultanceScientifiquePonctuelles(List<ZoneGeographiqueConsultanceScientifiquePonctuelle> zoneGeographiqueConsultanceScientifiquePonctuelles){
            this.zoneGeographiqueConsultanceScientifiquePonctuelles = zoneGeographiqueConsultanceScientifiquePonctuelles;
            }
            public List<PaysCommanditaire> getPaysCommanditaires(){
            return this.paysCommanditaires;
            }
            public void setPaysCommanditaires(List<PaysCommanditaire> paysCommanditaires){
            this.paysCommanditaires = paysCommanditaires;
            }
            public List<EtablissementConsultanceScientifiquePonctuelle> getEtablissementConsultanceScientifiquePonctuelles(){
            return this.etablissementConsultanceScientifiquePonctuelles;
            }
            public void setEtablissementConsultanceScientifiquePonctuelles(List<EtablissementConsultanceScientifiquePonctuelle> etablissementConsultanceScientifiquePonctuelles){
            this.etablissementConsultanceScientifiquePonctuelles = etablissementConsultanceScientifiquePonctuelles;
            }
            public BigDecimal getNombreJourDedie(){
            return this.nombreJourDedie;
            }
            public void setNombreJourDedie(BigDecimal nombreJourDedie){
            this.nombreJourDedie = nombreJourDedie;
            }
            public Date getDateFin(){
            return this.dateFin;
            }
            public void setDateFin(Date dateFin){
            this.dateFin = dateFin;
            }
            public List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> getDisciplineScientifiqueConsultanceScientifiquePonctuelles(){
            return this.disciplineScientifiqueConsultanceScientifiquePonctuelles;
            }
            public void setDisciplineScientifiqueConsultanceScientifiquePonctuelles(List<DisciplineScientifiqueConsultanceScientifiquePonctuelle> disciplineScientifiqueConsultanceScientifiquePonctuelles){
            this.disciplineScientifiqueConsultanceScientifiquePonctuelles = disciplineScientifiqueConsultanceScientifiquePonctuelles;
            }
            public List<EnjeuxIrdConsultanceScientifiquePonctuelle> getEnjeuxIrdConsultanceScientifiquePonctuelles(){
            return this.enjeuxIrdConsultanceScientifiquePonctuelles;
            }
            public void setEnjeuxIrdConsultanceScientifiquePonctuelles(List<EnjeuxIrdConsultanceScientifiquePonctuelle> enjeuxIrdConsultanceScientifiquePonctuelles){
            this.enjeuxIrdConsultanceScientifiquePonctuelles = enjeuxIrdConsultanceScientifiquePonctuelles;
            }
        public Boolean  getRelieeInstrumentsIrd(){
        return this.relieeInstrumentsIrd;
        }
        public void setRelieeInstrumentsIrd(Boolean relieeInstrumentsIrd){
        this.relieeInstrumentsIrd = relieeInstrumentsIrd;
        }
            public List<InstrumentIrdConsultanceScientifiquePonctuelle> getInstrumentIrdConsultanceScientifiquePonctuelles(){
            return this.instrumentIrdConsultanceScientifiquePonctuelles;
            }
            public void setInstrumentIrdConsultanceScientifiquePonctuelles(List<InstrumentIrdConsultanceScientifiquePonctuelle> instrumentIrdConsultanceScientifiquePonctuelles){
            this.instrumentIrdConsultanceScientifiquePonctuelles = instrumentIrdConsultanceScientifiquePonctuelles;
            }
            public List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> getTypeInstrumentIrdConsultanceScientifiquePonctuelles(){
            return this.typeInstrumentIrdConsultanceScientifiquePonctuelles;
            }
            public void setTypeInstrumentIrdConsultanceScientifiquePonctuelles(List<TypeInstrumentIrdConsultanceScientifiquePonctuelle> typeInstrumentIrdConsultanceScientifiquePonctuelles){
            this.typeInstrumentIrdConsultanceScientifiquePonctuelles = typeInstrumentIrdConsultanceScientifiquePonctuelles;
            }
            public String getCommentaire(){
            return this.commentaire;
            }
            public void setCommentaire(String commentaire){
            this.commentaire = commentaire;
            }
            public Expertise getExpertise(){
            return this.expertise;
            }
            public void setExpertise(Expertise expertise){
            this.expertise = expertise;
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
        ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle = (ConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(consultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

