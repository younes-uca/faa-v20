package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "projet_activite_recherche")
public class ProjetActiviteRecherche   {

@Id
    @SequenceGenerator(name="projet_activite_recherche_seq",sequenceName="projet_activite_recherche_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="projet_activite_recherche_seq")
private Long id;

            private BigDecimal tempsEstimePourCetteAnnne ;
            private Long annee ;

    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;

                @OneToMany(mappedBy = "projetActiviteRecherche")
            private List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetails ;

public ProjetActiviteRecherche(){
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
            public Long getAnnee(){
            return this.annee;
            }
            public void setAnnee(Long annee){
            this.annee = annee;
            }
            public List<ProjetActiviteRechercheDetail> getProjetActiviteRechercheDetails(){
            return this.projetActiviteRechercheDetails;
            }
            public void setProjetActiviteRechercheDetails(List<ProjetActiviteRechercheDetail> projetActiviteRechercheDetails){
            this.projetActiviteRechercheDetails = projetActiviteRechercheDetails;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProjetActiviteRecherche projetActiviteRecherche = (ProjetActiviteRecherche) o;
        return id != null && id.equals(projetActiviteRecherche.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

