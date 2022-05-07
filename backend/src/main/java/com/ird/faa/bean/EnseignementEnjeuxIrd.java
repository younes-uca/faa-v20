package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enseignement_enjeux_ird")
public class EnseignementEnjeuxIrd   {

@Id
    @SequenceGenerator(name="enseignement_enjeux_ird_seq",sequenceName="enseignement_enjeux_ird_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enseignement_enjeux_ird_seq")
private Long id;


    @ManyToOne
    private Enseignement enseignement ;
    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;


public EnseignementEnjeuxIrd(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public Enseignement getEnseignement(){
            return this.enseignement;
            }
            public void setEnseignement(Enseignement enseignement){
            this.enseignement = enseignement;
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
        EnseignementEnjeuxIrd enseignementEnjeuxIrd = (EnseignementEnjeuxIrd) o;
        return id != null && id.equals(enseignementEnjeuxIrd.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

