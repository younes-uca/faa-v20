package com.ird.faa.bean;

import java.util.Objects;



import javax.persistence.*;



@Entity
@Table(name = "etablissement_consultance_scientifique_ponctuelle")
public class EtablissementConsultanceScientifiquePonctuelle   {

@Id
    @SequenceGenerator(name="etablissement_consultance_scientifique_ponctuelle_seq",sequenceName="etablissement_consultance_scientifique_ponctuelle_seq",
    allocationSize=1, initialValue = 10000)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="etablissement_consultance_scientifique_ponctuelle_seq")
private Long id;


    @ManyToOne
    private ConsultanceScientifiquePonctuelle consultanceScientifiquePonctuelle ;
    @ManyToOne
    private Etablissement etablissement ;


public EtablissementConsultanceScientifiquePonctuelle(){
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
            public Etablissement getEtablissement(){
            return this.etablissement;
            }
            public void setEtablissement(Etablissement etablissement){
            this.etablissement = etablissement;
            }

        @Override
        public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtablissementConsultanceScientifiquePonctuelle etablissementConsultanceScientifiquePonctuelle = (EtablissementConsultanceScientifiquePonctuelle) o;
        return id != null && id.equals(etablissementConsultanceScientifiquePonctuelle.id);
        }

        @Override
        public int hashCode() {
        return Objects.hash(id);
        }

}

