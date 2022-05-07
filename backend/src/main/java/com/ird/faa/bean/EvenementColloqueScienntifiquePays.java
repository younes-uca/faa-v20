package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "evenement_colloque_scienntifique_pays")
public class EvenementColloqueScienntifiquePays   {

@Id
    @SequenceGenerator(name="evenement_colloque_scienntifique_pays_seq",sequenceName="evenement_colloque_scienntifique_pays_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="evenement_colloque_scienntifique_pays_seq")
private Long id;


    @ManyToOne
    private EvenementColloqueScienntifique evenementColloqueScienntifique ;
    @ManyToOne
    private Pays pays ;


public EvenementColloqueScienntifiquePays(){
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
            public Pays getPays(){
            return this.pays;
            }
            public void setPays(Pays pays){
            this.pays = pays;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenementColloqueScienntifiquePays evenementColloqueScienntifiquePays = (EvenementColloqueScienntifiquePays) o;
        return id != null && id.equals(evenementColloqueScienntifiquePays.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

