package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "gestion_equipe")
public class GestionEquipe   {

@Id
    @SequenceGenerator(name="gestion_equipe_seq",sequenceName="gestion_equipe_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="gestion_equipe_seq")
private Long id;

            private BigDecimal tempsEstimePourCetteAnnne ;

    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "gestionEquipe")
            private List<GestionEquipeDetail> gestionEquipeDetails ;

public GestionEquipe(){
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
            public List<GestionEquipeDetail> getGestionEquipeDetails(){
            return this.gestionEquipeDetails;
            }
            public void setGestionEquipeDetails(List<GestionEquipeDetail> gestionEquipeDetails){
            this.gestionEquipeDetails = gestionEquipeDetails;
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
        GestionEquipe gestionEquipe = (GestionEquipe) o;
        return id != null && id.equals(gestionEquipe.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

