package com.ird.faa.bean;

import java.util.Objects;
import java.util.List;



    import java.math.BigDecimal;
import javax.persistence.*;



@Entity
@Table(name = "culture_scientifique")
public class CultureScientifique   {

@Id
    @SequenceGenerator(name="culture_scientifique_seq",sequenceName="culture_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="culture_scientifique_seq")
private Long id;

            private Long annee ;
            private BigDecimal tempsEstimePourCetteAnnne ;

    @ManyToOne
    private Campagne campagne ;
    @ManyToOne
    private Chercheur chercheur ;
    @ManyToOne
    private EtatEtapeCampagne etatEtapeCampagne ;
    @ManyToOne
    private NatureActiviteGrandPublique natureActiviteGrandPublique ;

                @OneToMany(mappedBy = "cultureScientifique")
            private List<RencontreGrandPubliqueJeunePublique> rencontreGrandPubliqueJeunePubliques ;
                @OneToMany(mappedBy = "cultureScientifique")
            private List<RencontreMedia> rencontreMedias ;
                @OneToMany(mappedBy = "cultureScientifique")
            private List<OutilPedagogique> outilPedagogiques ;

public CultureScientifique(){
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
            public NatureActiviteGrandPublique getNatureActiviteGrandPublique(){
            return this.natureActiviteGrandPublique;
            }
            public void setNatureActiviteGrandPublique(NatureActiviteGrandPublique natureActiviteGrandPublique){
            this.natureActiviteGrandPublique = natureActiviteGrandPublique;
            }
            public List<RencontreGrandPubliqueJeunePublique> getRencontreGrandPubliqueJeunePubliques(){
            return this.rencontreGrandPubliqueJeunePubliques;
            }
            public void setRencontreGrandPubliqueJeunePubliques(List<RencontreGrandPubliqueJeunePublique> rencontreGrandPubliqueJeunePubliques){
            this.rencontreGrandPubliqueJeunePubliques = rencontreGrandPubliqueJeunePubliques;
            }
            public List<RencontreMedia> getRencontreMedias(){
            return this.rencontreMedias;
            }
            public void setRencontreMedias(List<RencontreMedia> rencontreMedias){
            this.rencontreMedias = rencontreMedias;
            }
            public List<OutilPedagogique> getOutilPedagogiques(){
            return this.outilPedagogiques;
            }
            public void setOutilPedagogiques(List<OutilPedagogique> outilPedagogiques){
            this.outilPedagogiques = outilPedagogiques;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CultureScientifique cultureScientifique = (CultureScientifique) o;
        return id != null && id.equals(cultureScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

