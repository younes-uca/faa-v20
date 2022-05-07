package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "enseignement_et_formation")
public class EnseignementEtFormation   {

@Id
    @SequenceGenerator(name="enseignement_et_formation_seq",sequenceName="enseignement_et_formation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enseignement_et_formation_seq")
private Long id;

            private Long annee ;
            private BigDecimal tempsEstimePourCetteAnnne ;

    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;

                @OneToMany(mappedBy = "enseignementEtFormation")
            private List<Enseignement> enseignements ;
                @OneToMany(mappedBy = "enseignementEtFormation")
            private List<FormationContinue> formationContinues ;
                @OneToMany(mappedBy = "enseignementEtFormation")
            private List<ResponsabilitePedagogique> responsabilitePedagogiques ;

public EnseignementEtFormation(){
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
            public BigDecimal getTempsEstimePourCetteAnnne(){
            return this.tempsEstimePourCetteAnnne;
            }
            public void setTempsEstimePourCetteAnnne(BigDecimal tempsEstimePourCetteAnnne){
            this.tempsEstimePourCetteAnnne = tempsEstimePourCetteAnnne;
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
            public List<Enseignement> getEnseignements(){
            return this.enseignements;
            }
            public void setEnseignements(List<Enseignement> enseignements){
            this.enseignements = enseignements;
            }
            public List<FormationContinue> getFormationContinues(){
            return this.formationContinues;
            }
            public void setFormationContinues(List<FormationContinue> formationContinues){
            this.formationContinues = formationContinues;
            }
            public List<ResponsabilitePedagogique> getResponsabilitePedagogiques(){
            return this.responsabilitePedagogiques;
            }
            public void setResponsabilitePedagogiques(List<ResponsabilitePedagogique> responsabilitePedagogiques){
            this.responsabilitePedagogiques = responsabilitePedagogiques;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnseignementEtFormation enseignementEtFormation = (EnseignementEtFormation) o;
        return id != null && id.equals(enseignementEtFormation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

