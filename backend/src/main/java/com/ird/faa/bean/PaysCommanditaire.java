package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "pays_commanditaire")
public class PaysCommanditaire   {

@Id
    @SequenceGenerator(name="pays_commanditaire_seq",sequenceName="pays_commanditaire_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="pays_commanditaire_seq")
private Long id;


    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;
    @ManyToOne
    private Pays pays ;


public PaysCommanditaire(){
super();
}


            public Long getId(){
            return this.id;
            }
            public void setId(Long id){
            this.id = id;
            }
            public ConsultanceScientifiquePonctuelle getConsultanceScientifiquePonctuelle(){
            return this.consultanceScientifiquePonctuelle;
            }
            public void setConsultanceScientifiquePonctuelle(ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle){
            this.consultanceScientifiquePonctuelle = consultanceScientifiquePonctuelle;
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
        PaysCommanditaire paysCommanditaire = (PaysCommanditaire) o;
        return id != null && id.equals(paysCommanditaire.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

