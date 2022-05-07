package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "enjeux_ird_consultance_scientifique_ponctuelle")
public class EnjeuxIrdConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="enjeux_ird_consultance_scientifique_ponctuelle_seq",sequenceName="enjeux_ird_consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="enjeux_ird_consultance_scientifique_ponctuelle_seq")
private Long id;


    @ManyToOne
    private EnjeuxIrd enjeuxIrd ;
    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;


public EnjeuxIrdConsultanceScientifiquePonctuelle(){
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
            public ConsultanceScientifiquePonctuelle getConsultanceScientifiquePonctuelle(){
            return this.consultanceScientifiquePonctuelle;
            }
            public void setConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
            this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnjeuxIrdConsultanceScientifiquePonctuelle enjeuxIrdConsultanceScientifiquePonctuelle = (EnjeuxIrdConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(enjeuxIrdConsultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

