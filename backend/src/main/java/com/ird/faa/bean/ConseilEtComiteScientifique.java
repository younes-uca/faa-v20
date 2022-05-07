package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "conseil_et_comite_scientifique")
public class ConseilEtComiteScientifique   {

@Id
    @SequenceGenerator(name="conseil_et_comite_scientifique_seq",sequenceName="conseil_et_comite_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="conseil_et_comite_scientifique_seq")
private Long id;

            private BigDecimal tempsEstimePourCetteAnnne ;
            @Column(length = 500)
            private String intitule;
            private BigDecimal nombreJoursParAnnee ;

    @ManyToOne
    private Pays pays ;
    @ManyToOne
    private Etablissement etablissement ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "conseilEtComiteScientifique")
            private List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques ;
                @OneToMany(mappedBy = "conseilEtComiteScientifique")
            private List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques ;

public ConseilEtComiteScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public BigDecimal getTempsEstimePourCetteAnnne(){
            return this.tempsEstimePourCetteAnnne;
            }
            public void setTempsEstimePourCetteAnnne(BigDecimal tempsEstimePourCetteAnnne){
            this.tempsEstimePourCetteAnnne = tempsEstimePourCetteAnnne;
            }
            public String getIntitule(){
            return this.intitule;
            }
            public void setIntitule(String intitule){
            this.intitule = intitule;
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
            public BigDecimal getNombreJoursParAnnee(){
            return this.nombreJoursParAnnee;
            }
            public void setNombreJoursParAnnee(BigDecimal nombreJoursParAnnee){
            this.nombreJoursParAnnee = nombreJoursParAnnee;
            }
            public List<CommunauteSavoirConseilEtComiteScientifique> getCommunauteSavoirConseilEtComiteScientifiques(){
            return this.communauteSavoirConseilEtComiteScientifiques;
            }
            public void setCommunauteSavoirConseilEtComiteScientifiques(List<CommunauteSavoirConseilEtComiteScientifique> communauteSavoirConseilEtComiteScientifiques){
            this.communauteSavoirConseilEtComiteScientifiques = communauteSavoirConseilEtComiteScientifiques;
            }
            public List<DisciplineScientifiqueConseilEtComiteScientifique> getDisciplineScientifiqueConseilEtComiteScientifiques(){
            return this.disciplineScientifiqueConseilEtComiteScientifiques;
            }
            public void setDisciplineScientifiqueConseilEtComiteScientifiques(List<DisciplineScientifiqueConseilEtComiteScientifique> disciplineScientifiqueConseilEtComiteScientifiques){
            this.disciplineScientifiqueConseilEtComiteScientifiques = disciplineScientifiqueConseilEtComiteScientifiques;
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
        ConseilEtComiteScientifique conseilEtComiteScientifique = (ConseilEtComiteScientifique) o;
        return id != null && id.equals(conseilEtComiteScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

