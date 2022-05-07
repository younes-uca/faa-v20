package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "communaute_savoir_evenement_colloque_scientifique")
public class CommunauteSavoirEvenementColloqueScientifique   {

@Id
    @SequenceGenerator(name="communaute_savoir_evenement_colloque_scientifique_seq",sequenceName="communaute_savoir_evenement_colloque_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="communaute_savoir_evenement_colloque_scientifique_seq")
private Long id;


    @ManyToOne
    private EvenementColloqueScienntifique evenementColloqueScienntifique ;
    @ManyToOne
    private CommunauteSavoir communauteSavoir ;


public CommunauteSavoirEvenementColloqueScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EvenementColloqueScienntifique getEvenementColloqueScienntifique(){
            return this.evenementColloqueScienntifique;
            }
            public void setEvenementColloqueScienntifique(EvenementColloqueScienntifique evenementColloqueScienntifique){
            this.evenementColloqueScienntifique = evenementColloqueScienntifique;
            }
            public CommunauteSavoir getCommunauteSavoir(){
            return this.communauteSavoir;
            }
            public void setCommunauteSavoir(CommunauteSavoir communauteSavoir){
            this.communauteSavoir = communauteSavoir;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommunauteSavoirEvenementColloqueScientifique communauteSavoirEvenementColloqueScientifique = (CommunauteSavoirEvenementColloqueScientifique) o;
        return id != null && id.equals(communauteSavoirEvenementColloqueScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

