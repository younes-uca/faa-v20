package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "expertise_scientifique")
public class ExpertiseScientifique   {

@Id
    @SequenceGenerator(name="expertise_scientifique_seq",sequenceName="expertise_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="expertise_scientifique_seq")
private Long id;

            private Long annee ;
            @Column(length = 500)
            private String intitule;
            private BigDecimal nombreJourConsacrePourCetteAnnee ;
            private Integer periodeRemiseRapportMois;
            private Integer periodeRemiseRapportAnnee;
            @Lob
            @Column(columnDefinition="TEXT")
            private String commentairesEventuels;

    @ManyToOne
    private TypeExpertise typeExpertise ;
    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;

                @OneToMany(mappedBy = "expertiseScientifique")
            private List<CommunauteSavoirExpertiseScientifique> communauteSavoirExpertiseScientifiques ;
                @OneToMany(mappedBy = "expertiseScientifique")
            private List<DisciplineScientifiqueExpertiseScientifique> disciplineScientifiqueExpertiseScientifiques ;

public ExpertiseScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Long getAnnee(){
            return this.annee;
            }
            public void setAnnee(Long annee){
            this.annee = annee;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
            }
            public TypeExpertise getTypeExpertise(){
            return this.typeExpertise;
            }
            public void setTypeExpertise(TypeExpertise typeExpertise){
            this.typeExpertise = typeExpertise;
            }
            public BigDecimal getNombreJourConsacrePourCetteAnnee(){
            return this.nombreJourConsacrePourCetteAnnee;
            }
            public void setNombreJourConsacrePourCetteAnnee(BigDecimal nombreJourConsacrePourCetteAnnee){
            this.nombreJourConsacrePourCetteAnnee = nombreJourConsacrePourCetteAnnee;
            }
            public Integer getPeriodeRemiseRapportMois(){
            return this.periodeRemiseRapportMois;
            }
            public void setPeriodeRemiseRapportMois(Integer periodeRemiseRapportMois){
            this.periodeRemiseRapportMois = periodeRemiseRapportMois;
            }
            public Integer getPeriodeRemiseRapportAnnee(){
            return this.periodeRemiseRapportAnnee;
            }
            public void setPeriodeRemiseRapportAnnee(Integer periodeRemiseRapportAnnee){
            this.periodeRemiseRapportAnnee = periodeRemiseRapportAnnee;
            }
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
            }
            public List<CommunauteSavoirExpertiseScientifique> getCommunauteSavoirExpertiseScientifiques(){
            return this.communauteSavoirExpertiseScientifiques;
            }
            public void setCommunauteSavoirExpertiseScientifiques(List<CommunauteSavoirExpertiseScientifique> communauteSavoirExpertiseScientifiques){
            this.communauteSavoirExpertiseScientifiques = communauteSavoirExpertiseScientifiques;
            }
            public List<DisciplineScientifiqueExpertiseScientifique> getDisciplineScientifiqueExpertiseScientifiques(){
            return this.disciplineScientifiqueExpertiseScientifiques;
            }
            public void setDisciplineScientifiqueExpertiseScientifiques(List<DisciplineScientifiqueExpertiseScientifique> disciplineScientifiqueExpertiseScientifiques){
            this.disciplineScientifiqueExpertiseScientifiques = disciplineScientifiqueExpertiseScientifiques;
            }
            public String getCommentairesEventuels(){
            return this.commentairesEventuels;
            }
            public void setCommentairesEventuels(String commentairesEventuels){
            this.commentairesEventuels = commentairesEventuels;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public Campagne getCampagne(){
            return this.campagne;
            }
            public void setCampagne(Campagne campagne){
            this.campagne = campagne;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExpertiseScientifique expertiseScientifique = (ExpertiseScientifique) o;
        return id != null && id.equals(expertiseScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

