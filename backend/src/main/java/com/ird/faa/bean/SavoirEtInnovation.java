package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "savoir_et_innovation")
public class SavoirEtInnovation   {

@Id
    @SequenceGenerator(name="savoir_et_innovation_seq",sequenceName="savoir_et_innovation_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="savoir_et_innovation_seq")
private Long id;

            private Long annee ;
            private BigDecimal tempsEstimePourCetteAnnne ;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "savoirEtInnovation")
            private List<ContratEtConventionIrd> contratEtConventionIrds ;
                @OneToMany(mappedBy = "savoirEtInnovation")
            private List<EvenementColloqueScienntifique> evenementColloqueScienntifiques ;
                @OneToMany(mappedBy = "savoirEtInnovation")
            private List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques ;

public SavoirEtInnovation(){
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
            public Campagne getCampagne(){
            return this.campagne;
            }
            public void setCampagne(Campagne campagne){
            this.campagne = campagne;
            }
            public Chercheur getChercheur(){
            return this.chercheur;
            }
            public void setChercheur(Chercheur chercheur){
            this.chercheur = chercheur;
            }
            public EtatEtapeCampagne getEtatEtapeCampagne(){
            return this.etatEtapeCampagne;
            }
            public void setEtatEtapeCampagne(EtatEtapeCampagne etatEtapeCampagne){
            this.etatEtapeCampagne = etatEtapeCampagne;
            }
            public List<ContratEtConventionIrd> getContratEtConventionIrds(){
            return this.contratEtConventionIrds;
            }
            public void setContratEtConventionIrds(List<ContratEtConventionIrd> contratEtConventionIrds){
            this.contratEtConventionIrds = contratEtConventionIrds;
            }
            public List<EvenementColloqueScienntifique> getEvenementColloqueScienntifiques(){
            return this.evenementColloqueScienntifiques;
            }
            public void setEvenementColloqueScienntifiques(List<EvenementColloqueScienntifique> evenementColloqueScienntifiques){
            this.evenementColloqueScienntifiques = evenementColloqueScienntifiques;
            }
            public List<DeveloppementDeSavoirEtInnovationScientifique> getDeveloppementDeSavoirEtInnovationScientifiques(){
            return this.developpementDeSavoirEtInnovationScientifiques;
            }
            public void setDeveloppementDeSavoirEtInnovationScientifiques(List<DeveloppementDeSavoirEtInnovationScientifique> developpementDeSavoirEtInnovationScientifiques){
            this.developpementDeSavoirEtInnovationScientifiques = developpementDeSavoirEtInnovationScientifiques;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SavoirEtInnovation savoirEtInnovation = (SavoirEtInnovation) o;
        return id != null && id.equals(savoirEtInnovation.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

