package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enjeux_ird_conseils_scientifique")
public class EnjeuxIrdConseilsScientifique   {

@Id
    @SequenceGenerator(name="enjeux_ird_conseils_scientifique_seq",sequenceName="enjeux_ird_conseils_scientifique_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enjeux_ird_conseils_scientifique_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private ConseilsScientifique conseilsScientifique ;


public EnjeuxIrdConseilsScientifique(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public EnjeuxIrd getEnjeuxIrd(){
            return this.enjeuxIrd;
            }
            public void setEnjeuxIrd(EnjeuxIrd enjeuxIrd){
            this.enjeuxIrd = enjeuxIrd;
            }
            public ConseilsScientifique getConseilsScientifique(){
            return this.conseilsScientifique;
            }
            public void setConseilsScientifique(ConseilsScientifique conseilsScientifique){
            this.conseilsScientifique = conseilsScientifique;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnjeuxIrdConseilsScientifique enjeuxIrdConseilsScientifique = (EnjeuxIrdConseilsScientifique) o;
        return id != null && id.equals(enjeuxIrdConseilsScientifique.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

