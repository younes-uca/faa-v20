package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "vie_institutionnelle")
public class VieInstitutionnelle   {

@Id
    @SequenceGenerator(name="vie_institutionnelle_seq",sequenceName="vie_institutionnelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="vie_institutionnelle_seq")
private Long id;

            private BigDecimal tempsEstime ;
            private Long annee ;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;

                @OneToMany(mappedBy = "vieInstitutionnelle")
            private List<VieInstitutionnelleDetail> vieInstitutionnelleDetails ;

public VieInstitutionnelle(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public BigDecimal getTempsEstime(){
            return this.tempsEstime;
            }
            public void setTempsEstime(BigDecimal tempsEstime){
            this.tempsEstime = tempsEstime;
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
            public Long getAnnee(){
            return this.annee;
            }
            public void setAnnee(Long annee){
            this.annee = annee;
            }
            public List<VieInstitutionnelleDetail> getVieInstitutionnelleDetails(){
            return this.vieInstitutionnelleDetails;
            }
            public void setVieInstitutionnelleDetails(List<VieInstitutionnelleDetail> vieInstitutionnelleDetails){
            this.vieInstitutionnelleDetails = vieInstitutionnelleDetails;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VieInstitutionnelle vieInstitutionnelle = (VieInstitutionnelle) o;
        return id != null && id.equals(vieInstitutionnelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

