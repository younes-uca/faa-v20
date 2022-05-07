package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "encadrement")
public class Encadrement   {

@Id
    @SequenceGenerator(name="encadrement_seq",sequenceName="encadrement_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="encadrement_seq")
private Long id;

            private Long annee ;
            private BigDecimal tempsEstimePourCetteAnnne ;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "encadrement")
            private List<EncadrementEtudiant> encadrementEtudiants ;
                @OneToMany(mappedBy = "encadrement")
            private List<EncadrementDoctorant> encadrementDoctorants ;

public Encadrement(){
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
            public List<EncadrementEtudiant> getEncadrementEtudiants(){
            return this.encadrementEtudiants;
            }
            public void setEncadrementEtudiants(List<EncadrementEtudiant> encadrementEtudiants){
            this.encadrementEtudiants = encadrementEtudiants;
            }
            public List<EncadrementDoctorant> getEncadrementDoctorants(){
            return this.encadrementDoctorants;
            }
            public void setEncadrementDoctorants(List<EncadrementDoctorant> encadrementDoctorants){
            this.encadrementDoctorants = encadrementDoctorants;
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
        Encadrement encadrement = (Encadrement) o;
        return id != null && id.equals(encadrement.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

