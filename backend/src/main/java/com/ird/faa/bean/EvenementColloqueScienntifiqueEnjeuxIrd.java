package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "evenement_colloque_scienntifique_enjeux_ird")
public class EvenementColloqueScienntifiqueEnjeuxIrd   {

@Id
    @SequenceGenerator(name="evenement_colloque_scienntifique_enjeux_ird_seq",sequenceName="evenement_colloque_scienntifique_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="evenement_colloque_scienntifique_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private EvenementColloqueScienntifique evenementColloqueScienntifique ;
    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;


public EvenementColloqueScienntifiqueEnjeuxIrd(){
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
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EvenementColloqueScienntifiqueEnjeuxIrd evenementColloqueScienntifiqueEnjeuxIrd = (EvenementColloqueScienntifiqueEnjeuxIrd) o;
        return id != null && id.equals(evenementColloqueScienntifiqueEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

